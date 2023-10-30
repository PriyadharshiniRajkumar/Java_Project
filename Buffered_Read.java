import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Buffered_Read {
    public void getInputFromUser() throws IOException {
        System.out.println("Enter a number");
        int num = 0;
        // Any one method need to executed at one time, others should be commented
        // Functionality same - Method 1
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        try {

            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } finally {
            br.close();
        }

        // Functionality same - Method 2
        // try with Resource
        try (BufferedReader buf = new BufferedReader(new InputStreamReader(System.in))) {
            num = Integer.parseInt(buf.readLine());
        }

        // Functionality same - Method 3
        // Scanner @using since from 1.5 version

        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println(input1);
    }

}
