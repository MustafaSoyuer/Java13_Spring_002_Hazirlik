package com.mustafa.repository;

import com.mustafa.entity.Location;

import java.util.Objects;
import java.util.Random;

public class LocationRepositoryImpl {
    private static String[] locationListesi = {
            "ev",
            "okul",
            "is",
            "market",
            "avm"
    };

    public static Location createLocation(){
        Random random = new Random();
        return Location.builder()
                .id(random.nextLong(10L))
                .ad(locationListesi[random.nextInt(5)])
                .lon(random.nextDouble(1000))
                .lat(random.nextDouble(1000))
                .google_place_id("ChIJs5ydyTiuEmsR0fRSlU0C7k0")
                .build();
    }

    private static Object[][] list = new Object[][]{
            {
                    11.1869803,
                    -60.7301511,
                    "Scarborough"
            }, {
            53.9303755,
            22.192721,
            "Stare Juchy"
    }, {
            38.9458437,
            -8.9978149,
            "Vila Franca de Xira"
    }, {
            46.987383,
            123.769368,
            "Tangchi"
    }, {
            -19.894468,
            48.8070527,
            "Mahanoro"
    }
    };

    public static Location createLoc2(){
        Random random = new Random();
        Object[] lc = list[random.nextInt(list.length-1)];
        return Location.builder()
                .id(random.nextLong())
                .ad((String) lc[2])
                .lon((Double) lc[0])
                .lat((Double )lc[1])
                .build();

    }

}
