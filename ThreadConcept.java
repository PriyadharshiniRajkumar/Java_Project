class Simple_Thread implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);// Thread going for waiting state
                // checked Exception, so throws a Excetion class or use try catch block
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadConcept implements Runnable {

    public void run() { // Both run() are running parallely
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello");

            try {
                Thread.sleep(10);// Thread going for waiting state
                                 // checked Exception, so throws a Excetion class
                                 // or use try catch block
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
