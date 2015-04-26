package io.github.vdubois.streams.filter;

import lombok.Data;

/**
 * Created by vdubois on 26/04/15.
 */
@Data
public class Apple {
    private int weight;
    private String color;
    private String name;

    public Apple(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }
}
