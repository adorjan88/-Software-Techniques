public sealed class CustomClass permits SubClass
{

    protected int x,y;

}

record Person(String firstName, String lastName, int age)
{
    Person{ if(age<0) throw new IllegalArgumentException("Age can't be lower than 0"); }

    @Override
    public String toString() { return firstName+" "+lastName+" "+age; }

    @Override
    public int age(){ return age;}

}