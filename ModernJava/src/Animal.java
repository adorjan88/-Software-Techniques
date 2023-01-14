public class Animal implements Comparable<Animal> {

    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Animal(String name, String type){
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name+" "+type;
    }

    @Override
    public int compareTo(Animal o) {
        return this.getName().compareTo(o.getName());
    }
}
