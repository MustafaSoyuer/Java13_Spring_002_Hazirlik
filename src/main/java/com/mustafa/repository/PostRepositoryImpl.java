package com.mustafa.repository;

import com.mustafa.entity.Location;
import com.mustafa.entity.Post;
import com.mustafa.entity.User;
import com.mustafa.entity.enums.MediaType;

import static com.mustafa.utility.DefaultValues.*;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PostRepositoryImpl {
    static Random random = new Random();
    public static Post getPost(){

        return
        Post.builder()
                .id(postIdList[random.nextInt(postIdList.length-1)])
                .comment(yorumListesi[random.nextInt(yorumListesi.length-1)])
                .userId(userIdList[random.nextInt(userIdList.length-1)])
                .likeCount(random.nextInt(50))
                .commentCount(random.nextInt(50))
                .mediaList(Collections.singletonList(getMedia()))
                .location(LocationRepositoryImpl.createLoc2())
                .build();
    }

    public static Post.Media getMedia(){
        Post.Media media = new Post.Media();
        media.setUrl(urlList[random.nextInt(urlList.length-1)]);
        media.setWidth(random.nextInt(100));
        media.setHeight(random.nextInt(100));
        media.setMediaType(MediaType.IMAGE);
        media.setUserPositions(Collections.singletonList(getUserPosition()));
        return media;
    }

    public static Post.Media.UserPosition getUserPosition(){
        Post.Media.UserPosition userPosition = new Post.Media.UserPosition();
        userPosition.setUserName(UserRepositoryImpl.getUser().getUsername());
        userPosition.setPositionX(random.nextInt(100));
        userPosition.setPositionY(random.nextInt(100));
        return userPosition;
    }

    private static String[] yorumListesi = {
            "bugun hava kapali, sen ne ariyorsun orada?",
            "ooooo guzel ceket nereden aldin?",
            "merhaba!",
            "yasiyorsun :)",
            "bizde gidemedik kaldik burada",
            "ney? Javaya mi basladin?",
            "hic keyfim yok :("
    };

    private static String[] urlList = {
      "http://abc",
      "http://xyz",
      "https://robohash.org/placeatabea.png?size=50x50&set=set1",
      "http://dummyimage.com/133x100.png/cc0000/ffffff",
    };

    public List<Post> createPostList(){
        return null;
    }
}
