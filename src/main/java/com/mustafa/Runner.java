package com.mustafa;


import static com.mustafa.repository.CommentRepositoryImpl.*;
import static com.mustafa.repository.LikeRepositoryImpl.*;
import static com.mustafa.repository.LocationRepositoryImpl.*;
import static com.mustafa.repository.UserRepositoryImpl.*;
import static com.mustafa.repository.PostRepositoryImpl.*;

public class Runner {
    public static void main(String[] args) {


        System.out.println(getComment());
        System.out.println(getComment());
        System.out.println(getComment());
        System.out.println(getComment());
        System.out.println(createLike());
        System.out.println(createLocation());
        System.out.println(createLocation());
        System.out.println(createLoc2());
        System.out.println(createLoc2());
        System.out.println(createLoc2());

        System.out.println();
        System.out.println(getUser());
        System.out.println(getUser());
        System.out.println(getUser());

        System.out.println();
        System.out.println(getPost());
        System.out.println(getPost());


    }
}