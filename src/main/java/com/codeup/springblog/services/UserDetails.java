package com.codeup.springblog.services;

import com.codeup.springblog.models.User;
import com.codeup.springblog.models.UserWithRoles;
import com.codeup.springblog.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetails implements UserDetailsService {

    public UserDetails(UserRepository userDao) {
        this.userDao = userDao;
    }

    private final UserRepository userDao;

    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("No user found for username: " + username);
        }
        UserDetails enhancedUser = new UserDetails((UserRepository) user);
        return (org.springframework.security.core.userdetails.UserDetails) enhancedUser;
    }
}
