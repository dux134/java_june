package codekamp;

/**
 * Created by cerebro on 21/06/17.
 */
public class Demo {

    public static boolean balanceNil = false;
    public static boolean notInReach = true;


    public static void main(String[] args) {

        try {
            Demo.sendSms("9900990099", "Your OTP is 0011");
        } catch (OutOfReach e) {
            System.out.println("Use your debit card numer and pin to verify yourelf");
        } catch (BalanceKhatam e) {
            System.out.println("Use IVRS");
            System.out.println("Email to executives that we are out of balance");
        } catch (Exception e) {

        }


        try {
            Demo.sendSms("9911111111", "We have credited $100000000000 to your account");
        } catch (Exception e) {
            System.out.println("Send credit info over email");
        }

        System.out.println("Welcome to CodeKamp");

        try {
            Demo.transferMoney(365499, 23476, 1000000);
        } catch (OutOfReach outOfReach) {
            System.out.println("Unable to send money");
        } catch (BalanceKhatam balanceKhatam) {
            balanceKhatam.printStackTrace();
        }

    }

    public static void sendSms(String number, String msg) throws OutOfReach, BalanceKhatam {

        if (Demo.balanceNil) {
            throw new BalanceKhatam();
        }

        if (Demo.notInReach) {
            throw new OutOfReach();
        }

        System.out.println("sms sent successfully to " + number);
    }

    public static void transferMoney(int fromAcc, int toAcc, int amount) throws OutOfReach, BalanceKhatam {
        // find mobile number attached to fromAcc
        // generate random OTP

        Demo.sendSms("9900887766", "Your OTP is 001135");
    }
}
