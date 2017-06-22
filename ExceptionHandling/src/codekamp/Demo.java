package codekamp;

/**
 * Created by cerebro on 21/06/17.
 */
public class Demo {

    public static boolean balanceKhatam = false;
    public static boolean outOfReach = true;

    public static void main(String[] args) {

        try {
            Demo.sendSms("", "");

        } catch (OutOfReachException e) {

        } catch (BalanceKhatamException e) {

        } finally {

        }

        System.out.println("Hello world!");
    }


    public static void sendSms(String number, String message) throws OutOfReachException, BalanceKhatamException {


        if (balanceKhatam) {
            throw new BalanceKhatamException();
        }

        if (outOfReach) {
            throw new OutOfReachException();
        }


        System.out.println("sent sms to " + number);

    }

    public static void tranferMoney(int fromAccount, int toAccount, int amount) throws OutOfReachException {

        //Fetch mobile numer from database
        // Generate OTP

        try {
            Demo.sendSms("9988776655", "Your OTP is 001133");
        } catch (BalanceKhatamException e) {
            System.out.println("use IVRS");
        }


        System.out.println("Money transfered succesfully");
        //code to transfer money
    }

    public static void sendDebitCreditInfo(int accountNum, int amout) {
        //Fetch mobile numer from database

        try {
            Demo.sendSms("9933887766", "Rs 12000 credited to your account");
        } catch (Exception e) {
            System.out.println("send credit/debit email");
        }
    }
}
