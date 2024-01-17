package com.mustafa.repository;

import com.mustafa.entity.Like;
import static com.mustafa.utility.DefaultValues.*;

import java.util.Random;

public class LikeRepositoryImpl {

    public static Like createLike(){
        Random random = new Random();
        Long postId = postIdList[random.nextInt(postIdList.length-1)];
        Long userId = postIdList[random.nextInt(postIdList.length-1)];
        return Like.builder()
                .id(random.nextLong(90_000))
                .likeDate(System.currentTimeMillis()-(1000L*60* random.nextLong(1500)))
                .postId(postId)
                .userId(userId)
                .build();
    }
}
