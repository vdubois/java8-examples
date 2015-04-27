package io.github.vdubois.streams.find;

import io.github.vdubois.streams.filter.Apple;

import java.util.Arrays;
import java.util.List;

/**
 * Created by vdubois on 26/04/15.
 */
public class StreamsFindExample {
    public static void main(String[] args) {
        Apple grannySmith = new Apple("Granny Smith", 200, "green");
        Apple golden = new Apple("Golden", 150, "yellow");
        Apple royalGala = new Apple("Royal Gala", 210, "red");
        Apple pinkLady = new Apple("Pink Lady", 200, "pink");
        Apple canada = new Apple("Canada", 300, "grey");
        List<Apple> apples = Arrays.asList(grannySmith, golden, pinkLady, royalGala, canada);

        apples.stream()
                .map(Apple::getName)
                .filter("Golden"::equals)
                .findAny()
                .ifPresent(System.out::println);
    }
}
