import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Properties;

public class Serialization_Deserialization {
    // Writing and Reading data to a file and from a file using I/O Streams
    public void InputOutputStream_method() throws IOException {
        Properties po = new Properties();
        // Creating and Writing new Properties file
        OutputStream os = new FileOutputStream("config.properties"); // Properties file will be created @ current
                                                                     // directory
        po.setProperty("c", "30");
        po.store(os, "This is Configuration File");

        // Reading from created Properties file
        InputStream is = new FileInputStream("config.properties");
        po.load(is);

        System.out.println(po.getProperty("c", null));
    }

    // Serailazation is coverting Object into text format ie., storing in a file in
    // Byte Stream format and
    // Derailazation is reverse of Serialization Stored Byte Stream again convert
    // intoObject form Text file, Text file can be XML, JSON,etc.,
    public void Serial_Deserial_function() throws IOException, ClassNotFoundException {
        ObjectValue ov = new ObjectValue();
        ov.a = 10;
        // Creating a file and Writing Object in it.
        FileOutputStream fs = new FileOutputStream("object.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(fs)) {
            oos.writeObject(ov.toString());
        }
        // Reading Object from a file
        FileInputStream fis = new FileInputStream("object.txt");
        try (ObjectInputStream ois = new ObjectInputStream(fis)) {
            System.out.println(ois.readObject());
        }

    }
}

class ObjectValue implements Serializable {
    int a;

    @Override
    public String toString() {
        return "ObjectValue [a=" + a + "]";
    }

}
