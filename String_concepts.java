public class String_concepts {
    public void str_eg() {

        System.out.println("Basic String Example");
        // String name = new String("Priya");
        String name = "Priya"; // no need of prev line everytime, Java will create an obj in Heap mem, with new
                               // keyword, inbulit functionality
        name = name + "dharshini";
        System.out.println("My name is " + name);

        String s1 = "Amulu";
        String s2 = "Amulu";
        System.out.println("Checking immutable nature of String " + s1.hashCode() + " " + s2.hashCode()
                + " Is Same or not by s1==s2 " + (s1 == s2));

        StringBuffer sb = new StringBuffer("Hi");
        sb.append(" Hello ");
        System.out.println("StringBuffer Example : " + sb);
        System.out.println("Capacity of String Buffer size of 16 bytes :" + sb.capacity());

        StringBuilder sbd = new StringBuilder("Hello ");
        sbd.append(" World ");
        System.out.println("StringBuilder Example : " + sbd);
    }
}
