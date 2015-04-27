package io.github.vdubois.streams.map;

import io.github.vdubois.streams.filter.Apple;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by vdubois on 26/04/15.
 */
public class StreamsMapExample {
    public static void main(String[] args) {
        Apple grannySmith = new Apple("Granny Smith", 200, "green");
        Apple golden = new Apple("Golden", 150, "yellow");
        Apple royalGala = new Apple("Royal Gala", 210, "red");
        Apple pinkLady = new Apple("Pink Lady", 200, "pink");
        Apple canada = new Apple("Canada", 300, "grey");
        List<Apple> apples = Arrays.asList(grannySmith, golden, pinkLady, royalGala, canada);

        List<String> mappedApples = apples.stream()
                .map(Apple::getName)
                .map(String::toUpperCase)
                .collect(toList());
        System.out.println(mappedApples);
    }
}
