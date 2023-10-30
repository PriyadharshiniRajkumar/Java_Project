public class Polymorphism {
    public void print_fn() {
        System.out.println("In Polymorphism class");
    }
}

class A1 extends Polymorphism {
    public void print_fn() {
        System.out.println("In A");
    }
}

class B1 extends Polymorphism {
    public void print_fn() {
        System.out.println("In B");
    }

}