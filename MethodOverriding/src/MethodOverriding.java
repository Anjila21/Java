class Animal {
    void makeSound() {
        System.out.println("Generic Animal Sound");
    }
}

class Cat1 extends Animal {
    void makesound() {
        System.out.println("Meow");
    }
}
class Cat2 extends Animal {
    void makesound() {
        System.out.println("Meow");
    }
}

class Cat3 extends Animal {
    void makesound() {
        System.out.println("Meow");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat1 cat1 = new Cat1();
         Cat2 cat2 = new Cat2();
          Cat3 cat3 = new Cat3();
        
        animal.makeSound(); // Output: Generic Animal Sound
       cat1.makeSound(); // Output: Generic Animal Sound
        
       cat2.makeSound(); // Output: Generic Animal Sound
       cat3.makeSound(); // Output: Generic Animal Sound
       
    }
}
