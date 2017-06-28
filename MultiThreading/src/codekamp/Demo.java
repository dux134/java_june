package codekamp;

/**
 * Created by cerebro on 27/06/17.
 */
public class Demo implements Runnable {

    public static void main(String[] args) {

        Demo d1 = new Demo();
        Thread t1 = new Thread(d1);
        t1.setName("codekamp");
        t1.start();

        Demo.countStudents();

    }

    public static void countStudents() {
        for (int i = 1; i <= 50; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Student number " + i + " on " + Thread.currentThread().getName());
        }
    }

    public static void countTeachers() {
        for (int i = 1; i <= 30; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Teacher number " + i + " on " + Thread.currentThread().getName());
        }
    }

    @Override
    public void run() {
        Demo.countTeachers();
    }
}
