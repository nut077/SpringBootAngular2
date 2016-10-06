package com.nutfreedom.service;

import com.nutfreedom.model.Photo;
import com.nutfreedom.model.User;

import java.util.List;

public interface PhotoService {
    Photo save(Photo photo);
    List<Photo> findByUser(User user);
    Photo findByPhotoId(Long photoId);
}
