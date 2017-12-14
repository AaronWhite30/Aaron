package com.leantechniques.showcase.application;

import com.leantechniques.showcase.application.domain.Photo;
import com.leantechniques.showcase.application.service.PhotoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Showcase {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        PhotoService photoService = (PhotoService)context.getBean("photoService");
        List<Photo> photoList = photoService.getPhotos(new Integer(args[0]));
        for (Photo photo : photoList) {
            System.out.println("["+photo.getId()+"] "+photo.getTitle());
        }
    }
}
