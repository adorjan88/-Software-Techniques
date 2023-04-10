public class Main {
    public static void main(String[] args) {

        PersonBuilder person = new PersonBuilder().build()
                .setName("Tommy")
                .setAge(20)
                .setHeight(185)
                .setWeight(50)
                .build();

        System.out.println(person.toString());
    }
}