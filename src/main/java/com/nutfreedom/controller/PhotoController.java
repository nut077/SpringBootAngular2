package com.nutfreedom.controller;

import com.nutfreedom.model.Photo;
import com.nutfreedom.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/photo")
public class PhotoController {

    @Autowired
    private PhotoService photoService;

    @RequestMapping("all-photos")
    public List<Photo> getAllPhotos() {
        return photoService.findAll();
    }
}
