package com.nutfreedom.repository;

import com.nutfreedom.model.Photo;
import com.nutfreedom.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhotoRepository extends CrudRepository<Photo, Long>{
    Photo save(Photo photo);
    List<Photo> findByUser(User user);
    Photo findByPhotoId(Long photoId);
}
