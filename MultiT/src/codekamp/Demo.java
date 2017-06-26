package codekamp;

/**
 * Created by cerebro on 26/06/17.
 */
public class Demo implements Runnable {

    public static int totalCount = 0;

    public static void main(String[] args) {

        Demo d1 = new Demo();
        Thread t1 = new Thread(d1);
        t1.setName("CodeKamp");

        t1.start();

        Demo.countCows();
    }

    public static void countSheeps() {
        for (int i = 1; i <= 50; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Demo.incrementTotalCount();
            System.out.println("Sheep number " + i + " on " + Thread.currentThread().getName() + ", total: " + Demo.totalCount);
        }
    }

    public static void countCows() {
        for (int i = 1; i <= 30; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Demo.incrementTotalCount();
            System.out.println("Cow number " + i + " on " + Thread.currentThread().getName() + ", total: " + Demo.totalCount);
        }
    }

    synchronized public static void incrementTotalCount() {
        Demo.totalCount++;
    }

    @Override
    public void run() {
        Demo.countSheeps();
    }
}
