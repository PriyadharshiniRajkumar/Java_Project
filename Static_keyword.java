public class Static_keyword {
    String brand;
    int price;
    static String name;
    static {
        System.out.println("in static block");
        name = "A phone";
    }

    Static_keyword() {
        System.out.println("In consturctor");
        brand = "";
        price = 200;
    }

    public void show() {
        System.out.println("The name of the Mobile is : " + brand + " price : " + price + " name: " + name);
    }

    // Static Method -> Non static variables cannot directly accessed in static
    // method, but through objects
    public static void show1(Static_keyword obj) {
        System.out.println("Static Method example");
        System.out.println("The name of the Mobile is : " + obj.brand + " price : " + obj.price + " name: " + name);
    }
}
