enum Status { // enum is class
    Running, Failed, Pending, Success; // Each named constants are objects
}

enum Laptop {
    Macbook(2000), XPS(2200), Surface, HP(1800); // objects of enum

    private int price; // As it is private, we need to create setters and getters to get and update
                       // value

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Laptop() {// Contructors
        price = 500; // as there is one object without paramenter, we need to create default
                     // consturctor
    }

    private Laptop(int price) { // Creating constructor will get reflected to all objects of enum
        this.price = price;
    }

}

public class Enumeration {
    public void finding_status() {
        Status s = Status.Running;
        switch (s) {
            case Running:
                System.out.println("The Program is running....");
                break;
            case Failed:
                System.out.println("The Program is Failed....");
                break;
            case Pending:
                System.out.println("The Program is Pending....");
                break;
            default:
                System.out.println("The Program completed successfully....");
                break;
        }
    }

    public void getLaptopPrice() {
        for (Laptop lp : Laptop.values()) {
            System.out.println("Model Name : " + lp + " : Price : " + lp.getPrice());
        }

    }
}
