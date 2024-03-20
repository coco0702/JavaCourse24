package ch4;

public class MethodParameters {
    public static void main(String[] args) {
        //Person p1 = new Person("Tom");
        //Person p2 = new Person("Tom",22);
        //Persion p3 = new Person(21,"Jerry");
    }
}
class Person{
    private String name;
    private int age;
    public Person(String pName,int pAge){
        name = pName;
        age = pAge;
    }
}
