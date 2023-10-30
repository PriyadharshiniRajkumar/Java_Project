import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Hello {
    public static void main(String[] args) throws InterruptedException {

        /*
         * // Basic Java Fundamentals
         * Basic_java_concepts bc = new Basic_java_concepts();
         * bc.basic_con();
         */

        // Basic Object creation ex.
        /*
         * int obj_num1 = 5;
         * int obj_num2 = 9;
         * Oopl op = new Oopl();
         * op.add_num(obj_num1, obj_num2);
         */

        // Method Overloading concept
        /*
         * Oopl op = new Oopl();
         * System.out.println("Topic : Method Overloading ----------------------------"
         * );
         * System.out.println(op.methodOverloading(10, 10));
         * System.out.println(op.methodOverloading(10, 10, 10));
         * System.out.println(op.methodOverloading(13.5, 10));
         */

        // Array Example
        /*
         * Array_concept arr = new Array_concept();
         * arr.arr_eg();
         */

        // String Concepts
        /*
         * System.out.println("Topic : String Concepts ----------------------");
         * String_concepts sc = new String_concepts();
         * sc.str_eg();
         */

        /*
         * // Static keyword
         * System.out.println("Topic : Static Keyword ----------------------");
         * Static_keyword sk = new Static_keyword();
         * sk.brand = "Apple";
         * sk.price = 1500;
         * // Static_keyword.name = "Smartphone";
         * 
         * Static_keyword sk1 = new Static_keyword();
         * sk1.brand = "Sumsung";
         * sk1.price = 1200;
         * Static_keyword.name = "Smartphone";
         * 
         * Static_keyword.name = "phone"; // Static variable update will be reflect in
         * both obj sk
         * // and sk1 of the class
         * Static_keyword sk2 = new Static_keyword();
         * 
         * sk.show();
         * sk1.show();
         * sk2.show();// this now def for this obj, this will have price value from
         * constructor and
         * // name value from static block
         * // Static methods should reffered by Class name
         * Static_keyword.show1(sk);
         * 
         */
        /*
         * //Enacapsulation
         * System.out.println("Enacapsulation------------------");
         * Encapsulation_const enc = new Encapsulation_const();
         * Encapsulation_const enc1 = new Encapsulation_const(4, "Amulu");
         * 
         * System.out.println(enc.getName() + " : " + enc.getAge());
         * System.out.println(enc1.getName() + " : " + enc1.getAge());
         */

        /*
         * //This and Super Keywords
         * System.out.println("This and Super Keywords------------------");
         * 
         * B b = new B(5);
         */

        /*
         * Inheritance
         * System.out.println("Inheritance------------------");
         * Inheritance ad = new Inheritance();
         * int r1 = ad.add(5, 5);
         * int r2 = ad.sub(10, 5);
         * int r3 = ad.multi(7, 2);
         * int r4 = ad.div(10, 2);
         * double r5 = ad.squre_num(4, 2);
         * System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4 + " : " + r5);
         */
        /*
         * Method Override
         * System.out.println("Method Override------------------");
         * Method_override mo = new Method_override();
         * int add_res = mo.add(5, 5);
         * System.out.println(add_res);
         */

        /*
         * Polymorphism
         * 
         * Polymorphism obj = new Polymorphism();
         * System.out.
         * println("Dynamic Method dispatch - Runtime Polymorphism------------------");
         * 
         * obj.print_fn();
         * obj = new A1(); // creating new obj on parent's ref variable is called
         * Dynamic Menthod Dispatch
         * obj.print_fn();
         * obj = new B1();// creating new obj on parent's ref variable is called Dynamic
         * Menthod Dispatch
         * obj.print_fn();
         * // Ex. for Hashcode
         * System.out.println(obj.toString());
         */

        /*
         * Wrapper Class
         * System.out.println("Wrapper Class------------------");
         * WrapperClass wc = new WrapperClass();
         * System.out.println(wc.num1);
         * System.out.println(wc.num2);
         * System.out.println(wc.num3 * 2);
         * System.out.println("Abstract Class-----------");
         * Car hc = new updatedcar();
         * hc.drive();
         */

        /*
         * Interface Concept
         * System.out.println("Interface Concept-----------------");
         * A_ex in = new InterfaceCode();
         * in.config();
         * in.show();
         * System.out.println(InterfaceCode.name); // accessing of interface variable
         * can be done using
         * // Interfacename.variable, as it is Static
         * X x_in = new InterfaceCode();
         * x_in.running();
         */
        /*
         * Enumerration Example
         * System.out.println("Enumeration ------------------------------");
         * Enumeration em = new Enumeration();
         * em.finding_status();
         * em.getLaptopPrice();
         */
        /*
         * Lambda Expression
         * // Interface attacted in current java file "Lamba"
         * Lambda lm = new Lambda() {
         * public void showing(int i, int j) {
         * System.out.println("Ex. for Funcational Interface :" + (i + j) +
         * "..............");
         * }
         * };
         * lm.showing(5, 5);
         * 
         * // The above functionalities converting into Lamba expresion as
         * lm = (int i, int j) -> System.out.println("Ex. for Lamba expression - " + (i
         * + j) + " ..............");
         * lm.showing(10, 10);
         * }
         */

        /*
         * Exception Handling
         * System.out.println("Exception Handling----------------");
         * ExceptionHandling eh = new ExceptionHandling();
         * eh.excp_handle();
         */

        /*
         * Buffered Reader and Scanner
         * Buffered_Read br_obj = new Buffered_Read();
         * 
         * try {
         * br_obj.getInputFromUser();
         * } catch (IOException e) {
         * e.printStackTrace();
         * }
         * 
         */

        /*
         * Thread concepts
         * System.out.println("Threads ---------------------");
         * /*
         * //Implementation using Thread class
         * ThreadConcept tc = new ThreadConcept();
         * tc.start();
         * Simple_Thread st = new Simple_Thread();
         * st.start();
         * st.setPriority(Thread.MAX_PRIORITY); // Suggesting the scheduler to take this
         * thread as Max, but based on
         * // Scheduler availablity only Thread will run
         * 
         * // Implementation using Runnable Interface
         * // ThreadConcept tc = new ThreadConcept();
         * // Simple_Thread st = new Simple_Thread();
         * // Thread t1 = new Thread(tc);
         * // Thread t2 = new Thread(st);
         * // t1.start();
         * // t2.start();
         * 
         * // Implementation of Labmda expression on above Runnable Interface as it
         * // Functional Interface
         * 
         * // Ex for Race condtion and Thread safe implementation
         * Counter c = new Counter();
         * 
         * Runnable tc = () -> {
         * // Ex for Race Condtion
         * for (int i = 1; i <= 1000; i++) {
         * c.increment();
         * }
         * 
         * // Ex for Sleep
         * // for (int i = 0; i <= 10; i++) {
         * // System.out.println("Hi");
         * // try {
         * // Thread.sleep(10);// Thread going for waiting state
         * // // checked Exception, so throws a Excetion class or use try catch block
         * // } catch (InterruptedException e) {
         * // e.printStackTrace();
         * // }
         * // }
         * 
         * };
         * 
         * Runnable st = () -> {
         * // Ex for Race Condtion
         * for (int i = 1; i <= 1000; i++) {
         * c.increment();
         * }
         * 
         * // Ex for Sleep
         * // for (int i = 0; i <= 10; i++) {
         * // System.out.println("Hello");
         * // try {
         * // Thread.sleep(10);// Thread going for waiting state
         * // // checked Exception, so throws a Excetion class or use try catch block
         * // } catch (InterruptedException e) {
         * // e.printStackTrace();
         * // }
         * // }
         * };
         * 
         * Thread t1 = new Thread(tc);
         * Thread t2 = new Thread(st);
         * t1.start();
         * t2.start();
         * // As threads are accessing increment() at same time leads to inconsitent
         * // result, so we are making both threads to complete the action and come back
         * // using join. ie., combained results of bth t1 and t2
         * t1.join();
         * t2.join();
         * System.out.println("Race Condition Counter : " + c.count);
         */

        /*
         * collection Concepts
         * System.out.println("Arrayist ------------------");
         * CollectionConcept cc = new CollectionConcept();
         * cc.ArryList_fn();
         * cc.Set_fn();
         * cc.map_implementation();
         * cc.compatator_comparable();
         * 
         * // Comparable example - used class student in this java file
         * List<Student> lt = new ArrayList<>();
         * lt.add(new Student(33, "Raj"));
         * lt.add(new Student(3, "Amulu"));
         * lt.add(new Student(29, "Priya"));
         * Collections.sort(lt);
         * System.out.println("Comparable Example : " + lt);
         */

        /*
         * Stream API in java
         * System.out.println("Stream API ------------------");
         * // Stream restuls on getting sum and dubling of even nos on arraylist
         * List<Integer> al = Arrays.asList(3, 5, 6, 2, 8);
         * // Stream<Integer> s1 = al.stream();
         * // // Filtering even nums
         * // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
         * // // doubling even nums
         * // Stream<Integer> s3 = s2.map(n -> n * 2);
         * // // We can use only s3, becoz s1 and s2 are used, Stream cannot be reused
         * // // s3.forEach(n -> System.out.println(n));
         * // Reducing the no of element into one value
         * // int res = s3.reduce(0, (c, e) -> c + e);
         * 
         * // Simplified code for above ex
         * int res = al.stream()
         * .filter(n -> n % 2 == 0) // Filter is used Predicates (is an interface) when
         * to pass or not the value
         * // returns boolean value
         * .map(n -> n * 2)
         * .reduce(0, (c, e) -> c + e); // 0 is te initial value, operation takes bw two
         * variables and operation is
         * // addition
         * 
         * System.out.
         * println("Stream restuls on getting sum and dubling of even nos on arraylist  = "
         * + res);
         * 
         * // Sorting for even numbers of arraylist in Stream
         * Stream<Integer> s_value = al.stream()
         * .filter(n -> n % 2 == 0)
         * .sorted();
         * s_value.forEach(n -> System.out.println("Sorted Stream :" + n));
         */

        /* Serialization and Deserialization */

        System.out.println("Serialization and Deserialization topic ========================================");
        Serialization_Deserialization sd = new Serialization_Deserialization();

        try {
            // Input and Out file Streams Ex..,
            sd.InputOutputStream_method();

            // Serialization and Deserialzation Ex.,
            sd.Serial_Deserial_function();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

/* Comparable Implementation */
class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;
    }

}

/* Race Condition Ex. */
class Counter {
    int count;
    // As threads are accessing increment() at same time leads to inconsitent
    // result, so we are making one thread to wait for other's to increment action
    // be get completed using synchronized.

    public synchronized void increment() {
        count++;
    }
}

/* Lambda Expression */
@FunctionalInterface
interface Lambda {
    void showing(int i, int j);
}