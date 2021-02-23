package com.codeup.springblog.models;

//This asterisk marks the Generated Value and the GeneratedType
import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 24)
    private String username;
    @Column(nullable = false, length = 24, unique = true)
    private String password;
    @Column(nullable = false, length = 100)
    private String firstName;
    @Column(nullable = false, length = 100)
    private String lastName;
    @Column(nullable = false, length = 255, unique = true)
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    public User() {
    }


    public User(long id, String username, String password, String firstName, String lastName, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}

