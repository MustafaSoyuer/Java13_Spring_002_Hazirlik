package com.mustafa.repository;

import com.mustafa.entity.Comment;
import static com.mustafa.utility.DefaultValues.*;

import java.util.Random;

public class CommentRepositoryImpl {
    private static String[] yorumListesi = {
            "bugun hava kapali, sen ne ariyorsun orada?",
            "ooooo guzel ceket nereden aldin?",
            "merhaba!",
            "yasiyorsun :)",
            "bizde gidemedik kaldik burada",
            "ney? Javaya mi basladin?",
            "hic keyfim yok :("
    };
    public static Comment getComment(){
        Random random = new Random();
        Long postId = postIdList[random.nextInt(postIdList.length-1)];
        Long userId = userIdList[random.nextInt(userIdList.length-1)];
        return Comment.builder()
                .comment(yorumListesi[random.nextInt(5)])
                .commentDate(System.currentTimeMillis()-(1000L*60* random.nextInt(1500)))
                .id(random.nextLong(2000))
                .postId(postId)
                .userId(userId)
                .build();
    }
}
