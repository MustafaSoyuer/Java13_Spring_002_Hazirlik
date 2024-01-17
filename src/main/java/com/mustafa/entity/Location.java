package com.mustafa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    Long id;
    String ad;
    Double lon;
    Double lat;
    String google_place_id;

}
