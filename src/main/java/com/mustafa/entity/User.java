package com.mustafa.entity;

import com.mustafa.entity.enums.UserState;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    Long id;
    String ad;
    String email;
    String phone;
    String avatar;
    String image;
    String username;
    String password;
    UserState userState;
}
