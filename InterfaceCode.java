interface A_ex {

    // Variables of Inerfaces are static and final which cannot be changed
    // Becoz these varibles is not having area in Heap memory..

    int age = 30;
    String name = "Priya";

    void show();

    void config();
}

interface X {
    void running();
}

interface Y extends X {

}

public class InterfaceCode implements A_ex, X {

    public void show() {
        System.out.println("Showing....");
    }

    public void config() {
        System.out.println("configuring.....");
    }

    public void running() {
        System.out.println("Running.....");
    }

}
