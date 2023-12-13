
abstract class Person {

    public String name;
    public int age;
    public String address;

    public abstract void display();
    
    public void show()
    {
        
    }
}

class Student extends Person {

    @Override
    public void display() {
        System.out.print("Student Name:"+name);
        System.out.print("Student Age:"+age);
        System.out.print("Student Address"+address);

    }
}


class Faculty extends Person {

    @Override
    public void display() {
        System.out.print("Faculty Name:"+name);
        System.out.print("Faculty Age:"+age);
        System.out.print("Faculty Address"+address);

    }
}

public class Abstract {

    public static void main(String[] args)
    {
        Student student = new Student();
        student.name="anjila";
        student.age=22;
        student.address="kalanki";
        
        Faculty fact = new Faculty();
        fact.name="Navnit";
        fact.age=40;
        fact.address="Janakpur";
        
        student.display();
        fact.display();
                
                

    }
}
