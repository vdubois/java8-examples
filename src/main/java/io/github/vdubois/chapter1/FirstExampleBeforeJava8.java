package io.github.vdubois.chapter1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by vdubois on 19/04/15.
 */
public class FirstExampleBeforeJava8 {
    
    public static void main(String[] args) {
        List<String> values = Arrays.asList("one", "two", "three");
        logOne(values);
    }

    public static void logOne(List<String> values) {
        for (String value : values) {
            if ("one".equals(value)) {
                System.out.println("trouvé !");
            }
        }
    }
}
