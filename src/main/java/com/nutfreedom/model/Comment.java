package com.nutfreedom.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@ToString
@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Long commentId;
    private String content;

    @ManyToOne
    @JsonIgnore
    private Photo photo;

    private Long photoId;
    private String username;


}
