abstract class Car {
    public abstract void drive(); // abstract method should place in abstract class

    public abstract void flying();

    public void playmusic() {
        System.out.println("Playing music");
    }

}

abstract class HondaCity extends Car {
    public void drive() {
        System.out.println("Driving implmentation..");
    }

}

class updatedcar extends HondaCity { // Concrete Class - A concrete class is a class that has an implementation for
                                     // all of its methods.
    // They cannot have any unimplemented methods. It can also extend an abstract
    // class or implement an interface as long as it implements all their methods.

    public void flying() {
        System.out.println("Flying....");
    }

}

public class WrapperClass {
    int num = 9;

    Integer num1 = num; // AutoBoxing - taking Primitive value and storing in Wrapper obj
    int num2 = num1; // AutoUnboxing - Autoconvertion of Wrapper classobj to primitive datatype

    String str = "12";
    int num3 = Integer.parseInt(str);

}
