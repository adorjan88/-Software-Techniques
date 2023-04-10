public class PersonBuilder {

    String name;
    int age;
    int height;
    int weight;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    public PersonBuilder setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public PersonBuilder build(){
        PersonBuilder person = new PersonBuilder();
        person.setName(name);
        person.setAge(age);
        person.setHeight(height);
        person.setWeight(weight);
        return person;
    }

    @Override
    public String toString() {
        return "PersonBuilder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
