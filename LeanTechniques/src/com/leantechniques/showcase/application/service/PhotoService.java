package com.leantechniques.showcase.application.service;

import com.leantechniques.showcase.application.domain.Photo;

import java.util.List;

public interface PhotoService {
    public List<Photo> getPhotos(Integer albumId);
}
