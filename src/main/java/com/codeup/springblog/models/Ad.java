package com.codeup.springblog.models;
//
//import org.springframework.boot.autoconfigure.domain.EntityScan;


import javax.persistence.*;


@Entity
@Table(name = "ads")
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//
    @Column(nullable = false)
    private String title;
//
    @Column(nullable = false, length = 100000)
    private String description;

    public Ad(){

    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Ad(long id, String title, String description){
//        this.id = id;
//        this.title = title;
//        this.description = description;
//    }
//    public Ad(String title, String description){
//
//        this.title = title;
//        this.description = description;
//    }
}
