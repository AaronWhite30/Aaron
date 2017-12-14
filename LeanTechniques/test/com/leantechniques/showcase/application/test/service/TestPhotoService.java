package com.leantechniques.showcase.application.test.service;

import com.leantechniques.showcase.application.domain.Photo;
import com.leantechniques.showcase.application.service.PhotoService;
import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

@RunWith(EasyMockRunner.class)
public class TestPhotoService {

    @Test
    public void testGetPhotos() {

        PhotoService photoService = EasyMock.createMock(PhotoService.class);

        List<Photo> photos = new ArrayList<Photo>();

        Photo photo1 = new Photo();
        photo1.setAlbumId(1);
        photo1.setTitle("Title 1");

        Photo photo2 = new Photo();
        photo2.setAlbumId(1);
        photo2.setTitle("Title 2");

        photos.add(photo1);
        photos.add(photo2);

        EasyMock.expect(photoService.getPhotos(1)).andReturn(photos);

        EasyMock.replay(photoService);

        Assert.assertEquals(photos.get(0).getAlbumId(),new Integer(1));
        Assert.assertEquals(photos.get(0).getTitle(),"Title 1");

        Assert.assertEquals(photos.get(1).getAlbumId(),new Integer(1));
        Assert.assertEquals(photos.get(1).getTitle(),"Title 2");

    }
}
