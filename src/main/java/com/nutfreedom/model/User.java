package com.nutfreedom.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class User {

    @Id
    private Long userId;

    private String firstName;
    private String lastName;
    private String username;
    private String password;

    @CreationTimestamp
    private Date created;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Photo> photoList;

    @ManyToMany
    private List<Photo> likePhotoList;
}
