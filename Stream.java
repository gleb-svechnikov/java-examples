import java.util.*;
import java.util.stream.*;

public class StreamStar {
    public static void main(String[] args) {
        List<String> books = Arrays.asList(
            "Java", "Python", "Java", "C++", "Python",
            "Java", "Ruby", "Python", "C++", "Java"
        );

        System.out.println("📚 Top 3 most popular books:");

        books.stream()
            .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
            .entrySet().stream()
            .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
            .limit(3)
            .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));
    }
}
