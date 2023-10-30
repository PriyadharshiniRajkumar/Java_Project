import java.lang.Math;

class Clac {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

class Advcalc extends Clac {

    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

class Inheritance extends Advcalc {
    public double squre_num(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}