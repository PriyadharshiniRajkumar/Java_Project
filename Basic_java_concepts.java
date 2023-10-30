public class Basic_java_concepts {
    public void basic_con() {
        System.out.println("Fundamentals of Java -----------------");
        // Looping Concept
        System.out.println("Topic : Loops -----------------");
        System.out.println("For Loop Example");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
        }
        System.out.println("While Example");
        int while_int = 1;
        while (while_int <= 4) {
            System.out.println("Hi " + while_int);
            while_int++;
        }
        System.out.println("Bye : " + while_int);

        System.out.println("do - While Example");

        int do_w_int = 5;
        do {
            System.out.println("Hi : " + do_w_int);
        } while (do_w_int <= 4);

        // Conditional Statement
        System.out.println("Topic : Condtional Operator -----------");
        // IF-Else Statement
        int if_num = 8;
        if (if_num > 10 && if_num <= 20) {
            System.out.println("IF_Else : IF condition -  The range is between 11-20 : num is " + if_num);

        } else {
            System.out.println("IF_Else : Else condition -  The range is  not between 11-20: num is  " + if_num);
        }

        // If-Else IF - Else Example - find Largest num amaong 3 numbers

        int elseif_eg = 8;
        int elseif_eg1 = 17;
        int elseif_eg2 = 9;

        if (elseif_eg > elseif_eg1 && elseif_eg > elseif_eg2) {
            System.out.println("If-ElseIF-Else Example  " + elseif_eg);
        } else if (elseif_eg1 > elseif_eg && elseif_eg1 > elseif_eg2) {
            System.out.println("If-ElseIF-Else Example  " + elseif_eg1);
        } else {
            System.out.println("If-ElseIF-Else Example   " + elseif_eg2);

        }

        // Ternary Operator - Finding even or Odd
        int ternary_num = 40;
        String result_to = "";

        result_to = ternary_num % 2 == 0 ? "Even number" : "Odd number";
        System.out.println("Ternary Operator  - Finding even or Odd, The number is : " + result_to);

        // Switch Statement -- Finding Day of the week
        int switch_num = 1;
        System.out.println("The Week of the day using Swtich Statment : " + switch_num);

        switch (switch_num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter the valid number");
        }

        System.out.println("---------------------------------------------------------------------------------------");
        // Assignment operators ex. with +, we can do it with -,*,/,%
        int num1 = 5;
        num1 += 2; // addition using assignment operator
        int num = 8;

        // o/p is 9 for both, but will differ at fetching of data
        // num++; // post Increment
        // ++num; // pre Increment

        // int result1 = ++num; //increment and fetch data
        int result1 = num++; // Fetch the data and then increment
        System.out.println("Post Increment and Pre Increment " + result1);
        System.out.println("---------------------------------------------------------------------------------------");
        // Type Conversion , casting and Promotion
        byte b1 = 127;
        int i1 = 265;
        i1 = b1; // Implicit Type Conversion as int accepts byte due to byte's size is smaller
                 // than int

        b1 = (byte) i1; // Type Casting - Explicit conversion

        byte a = 10;
        byte b = 30;
        int c = a * b; // Type Promotion 2 byte to int type
        System.out.println("Type Casting " + c);
    }
}
