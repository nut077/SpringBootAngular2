package com.nutfreedom.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Photo {

    @Id
    @GeneratedValue
    private Long photoId;

    private String photoName;
    private String title;
    private String description;
    private String imageName;

    @CreationTimestamp
    private Date created;

    @ManyToOne
    @JsonBackReference
    private User user;

    private int likes;

    @OneToMany(mappedBy = "photo", fetch = FetchType.EAGER)
    private List<Comment> commentList;

}
