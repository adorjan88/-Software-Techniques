import java.util.ArrayList;
import java.util.Collections;
//import java.util.Iterator;

interface Lambda{
    double operation(double x, double y);
}

public class Main {

    public static void main(String[] args) {

        Person person = new Person("John","Doe",35);
        System.out.println(person);

        String s = """
                <p>HTML paragraph</p>
                """;

        System.out.println(s);

        enum days{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}

        days day = days.Friday;

        String s2 = switch(day){
            case Monday -> ":'( ";
            case Tuesday, Wednesday, Thursday -> ":/ ";
            case Friday -> ":) ";
            case Saturday, Sunday -> ":D ";
        };

        System.out.println(s2);

        //var a = "Variable with unspecified datatype";

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1; i<11; i++) numbers.add(i);
        //Iterator<Integer> iterator = numbers.iterator();
        for (Integer it : numbers) {
            System.out.print(it+" ");
        }

        System.out.println();

        //sort by name
        Animal animal1 = new Animal("Johnny","Dog");
        Animal animal2 = new Animal("Paw","Cat");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal1); animals.add(animal2);
        Collections.sort(animals);
        for(Animal animalIterator: animals) System.out.println(animalIterator);

        Lambda lambdaDivider = ((x, y) -> x/y);
        System.out.println("11.25 / 5.75 = " + lambdaDivider.operation(11.25,5.75));



    }
}