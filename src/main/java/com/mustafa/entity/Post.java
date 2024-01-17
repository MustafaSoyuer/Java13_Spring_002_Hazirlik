package com.mustafa.entity;

import com.mustafa.entity.enums.MediaType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    Long id;
    String comment;
    Long userId;
    Integer likeCount;
    Integer commentCount;
    /**
     *  Paylaşılan media lar
     */
    List<Media> mediaList;
    Location location;
    @Data
    public static class Media{
        String url;
        Integer width;
        Integer height;
        MediaType mediaType;
        List<UserPosition> userPositions;

        @Data
        public static class UserPosition{
            String userName;
            Integer positionX;
            Integer positionY;
        }

    }
}
