class A {
    public A() {
        System.out.println("In A default constructor");
    }

    public A(int n) {
        System.out.println("In A Paramaterised constructor");
    }
}

public class B extends A {
    public B() {
        // super(); Implicitly call the parent default constructor
        System.out.println("In B default constructor");
    }

    public B(int n) {
        this();
        System.out.println("In B Paramaterised constructor");
    }
}