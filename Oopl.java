public class Oopl {
    // Basic class and object
    public int add_num(int n1, int n2) {
        System.out.println("Topic : Class and Object -----------------");
        System.out.println("Basic Class creation ex. add of nums  : " + (n1 + n2));
        return 0;
    }

    // Method Overloading
    public int methodOverloading(int n1, int n2) {
        return n1 + n2;
    }

    public int methodOverloading(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double methodOverloading(double n1, int n2) {
        return n1 + n2;
    }
}
