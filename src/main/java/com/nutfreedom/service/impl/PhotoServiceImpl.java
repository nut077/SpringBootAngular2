package com.nutfreedom.service.impl;

import com.nutfreedom.model.Photo;
import com.nutfreedom.model.User;
import com.nutfreedom.repository.PhotoRepository;
import com.nutfreedom.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private PhotoRepository photoRepository;

    @Override
    public Photo save(Photo photo) {
        return photoRepository.save(photo);
    }

    @Override
    public List<Photo> findByUser(User user) {
        return photoRepository.findByUser(user);
    }

}
