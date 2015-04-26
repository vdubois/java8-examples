package io.github.vdubois.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

/**
 * Created by vdubois on 26/04/15.
 */
public class StreamsFilterExample {
    public static void main(String[] args) {
        Apple grannySmith = new Apple("Granny Smith", 200, "green");
        Apple golden = new Apple("Golden", 150, "yellow");
        Apple royalGala = new Apple("Royal Gala", 210, "red");
        Apple pinkLady = new Apple("Pink Lady", 200, "pink");
        Apple canada = new Apple("Canada", 300, "grey");
        List<Apple> apples = Arrays.asList(grannySmith, golden, pinkLady, royalGala, canada);
        
        // filter first 3 with weight >= 200
        List<Apple> firstThreeWithWeightOver200 =
                apples.stream()
                        .filter(apple -> apple.getWeight() >= 200)
                        .sorted(comparing(Apple::getWeight).reversed())
                        .limit(3)
                        .collect(Collectors.toList());
        System.out.println(firstThreeWithWeightOver200);
    }
}
