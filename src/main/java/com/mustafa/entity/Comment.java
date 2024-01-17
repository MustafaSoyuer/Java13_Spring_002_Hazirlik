package com.mustafa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    Long id;
    Long userId;
    Long postId;
    String comment;
    Long commentDate;
}
