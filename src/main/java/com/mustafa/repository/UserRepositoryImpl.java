package com.mustafa.repository;

import com.mustafa.entity.User;
import com.mustafa.entity.enums.UserState;

import static com.mustafa.utility.DefaultValues.*;

import java.util.Objects;
import java.util.Random;

public class UserRepositoryImpl {

    private static Object[][] list = new Object[][]{
            {
                    "Beatrice",
            "blubbock0@freewebs.com",
            "835-688-3899",
            "https://robohash.org/atmolestiaererum.png?size=50x50&set=set1",
            "http://dummyimage.com/109x100.png/dddddd/000000",
            "bmenear0",
            "12345",
            4
},{
        "Casandra",
        "crichardes1@macromedia.com",
        "547-754-1027",
        "https://robohash.org/odioporroqui.png?size=50x50&set=set1",
        "http://dummyimage.com/234x100.png/dddddd/000000",
        "cmoulds1",
        "12345",
        3
        },{
        "Suzann",
        "snappin2@house.gov",
        "827-306-8038",
        "https://robohash.org/eaqueconsectetursunt.png?size=50x50&set=set1",
        "http://dummyimage.com/223x100.png/dddddd/000000",
        "sseery2",
        "123",
        5
        },{
        "Terri",
        "tkorba3@i2i.jp",
        "784-749-4511",
        "https://robohash.org/eanamrecusandae.png?size=50x50&set=set1",
        "http://dummyimage.com/221x100.png/dddddd/000000",
        "tbernaert3",
        "rN8{(#ig,)F@6",
        3
        },{
        "Giorgia",
        "gknutsen4@networksolutions.com",
        "526-621-0004",
        "https://robohash.org/placeatabea.png?size=50x50&set=set1",
        "http://dummyimage.com/133x100.png/cc0000/ffffff",
        "gmcian4",
        "cA3}Q}&@'F",
        3
        }
        };

    public static User getUser(){
        Random random = new Random();
        Object[] user = list[random.nextInt(list.length-1)];
        return User.builder()
                .id(userIdList[random.nextInt(userIdList.length-1)])
                .ad((String) user[0])
                .email((String) user[1])
                .phone((String) user[2])
                .avatar((String) user[3])
                .image((String) user[4])
                .username((String) user[5])
                .password((String) user[6])
                .userState(UserState.values()[(int)user[7]])
                .build();
    }

        }

