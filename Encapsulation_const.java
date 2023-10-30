class Encapsulation_const {
    private int age;
    private String name;

    // default constructor
    public Encapsulation_const() {
        age = 30;
        name = "Priya";
    }

    // parameterised constructor

    public Encapsulation_const(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // setters and getters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}