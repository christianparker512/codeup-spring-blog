package com.codeup.springblog.repository;

import com.codeup.springblog.models.Post;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    Post findPostByTitle(String title);
    Post findFirstByTitle(String title);
    Post getPostBy(long id);
    Post deleteById(long id);
    Post deleteByTitle(String title);
    List<Post> findAllByTitleIsLike (String term);
    List<Post> findAllByUser(User user);
//    /delete * from posts where user_id = ?
    List<Post> deleteAllByUserId(Long id);
    }

