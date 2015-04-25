package io.github.vdubois.firstexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by vdubois on 19/04/15.
 */
public class FirstExampleAfterJava8 {
    
    public static void main(String[] args) {
        List<String> values = Arrays.asList("one", "two", "three");
        log(values, (String value) -> "one".equals(value));
    }

    public static void log(List<String> values, Predicate<String> predicate) {
        for (String value : values) {
            if (predicate.test(value)) {
                System.out.println("trouvé !");
            }
        }
    }
}
