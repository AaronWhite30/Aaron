package com.leantechniques.showcase.application.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leantechniques.showcase.application.domain.Photo;
import com.leantechniques.showcase.application.service.PhotoService;
import java.net.URL;
import java.util.List;
import org.springframework.stereotype.Service;

@Service ("photoService")
public class PhotoServiceImpl implements PhotoService {

    public List<Photo> getPhotos(Integer albumId){
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new URL("https://jsonplaceholder.typicode.com/photos?albumId="+albumId), new TypeReference<List<Photo>>(){});
        }catch(java.net.MalformedURLException e){
            throw new RuntimeException(e);
        }catch(java.io.IOException e){
            throw new RuntimeException(e);
        }
    }
}
