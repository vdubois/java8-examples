package io.github.vdubois.streams.practice;

import lombok.Data;

/**
 * Created by vdubois on 27/04/15.
 */
@Data
public class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }
}
