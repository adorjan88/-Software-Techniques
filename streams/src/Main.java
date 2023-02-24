import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Dog","Cat","Mouse");
        Stream<String> stringStream1 =Stream.of(list.toString());

        Stream.Builder<String> stringBuilder = Stream.builder();
        stringBuilder.add("Dog")
                .add("Cat")
                .add("Horse");

        Stream<String> stream = stringBuilder.build();

        Stream.of(stream)
                .count();

        Arrays.stream(new int[] {1,2,3})
                .average()
                .ifPresent(System.out::println); //print out average

        Stream<Double> doubleStream = Stream.empty();

        Stream<String> stringStream = Stream.concat(stream,stringStream1);

    }
}