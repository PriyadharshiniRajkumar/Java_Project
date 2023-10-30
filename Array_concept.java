class Students {
    int rollno;
    String name;
    int marks;
}

public class Array_concept {
    public void arr_eg() {
        System.out.println("Topic -  Array Concepts-------------------------");

        int arr[] = { 1, 2, 3 };
        System.out.println("Simple Array Creation ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // Multi Dimension ex.,
        int m_arr[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                m_arr[i][j] = (int) (Math.random() * 100); // as math.random() returns double, we are Type casting it
            }
        }
        System.out.println("Multi Dimension Example");
        // using enhanced for loop
        for (int n[] : m_arr) {
            System.out.println();
            for (int m : n) {
                System.out.print(m + "  ");
            }
        }

        // Jagged Array
        int[][] j_arr = new int[3][];
        j_arr[0] = new int[3];
        j_arr[1] = new int[4];
        j_arr[2] = new int[2];

        for (int i = 0; i < j_arr.length; i++) {
            for (int j = 0; j < j_arr[i].length; j++) {
                j_arr[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println("\nJagged Array Example");
        for (int n[] : j_arr) {
            System.out.println();
            for (int m : n) {
                System.out.print(m + "  ");
            }
        }

        // Array of Objects
        Students s1 = new Students();
        s1.rollno = 101;
        s1.name = "Priya";
        s1.marks = 97;

        Students s2 = new Students();
        s2.name = "Shyam";
        s2.rollno = 102;
        s2.marks = 96;

        Students s3 = new Students();
        s3.rollno = 103;
        s3.name = "Ruby";
        s3.marks = 98;

        // Array of Objects - an array Holds objects
        Students stud[] = new Students[3];
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;
        System.out.println("\nArray of Objects");
        for (int i = 0; i < stud.length; i++) {
            System.out.println("Studnet name : " + stud[i].name + "  marks  : " + stud[i].marks);
        }
        for (Students s : stud) {
            System.out.println("Studnet name : " + s.name + "  marks  : " + s.marks);
        }

    }
}
