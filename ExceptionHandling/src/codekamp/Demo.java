package codekamp;

/**
 * Created by cerebro on 21/06/17.
 */
public class Demo {

    public static boolean balanceKhatam = false;
    public static boolean outOfReach = true;

    public static void main(String[] args) {

        try {
            Demo.sendSms("+919988776655", "Your OTP is 0011");
        } catch (OutOfReachException xyz) {
            System.out.println("Please use your debit card number and pin");
        } catch (BalanceKhatamException e) {
            System.out.println("Use IVRS");
            System.out.println("Inform Executives about the situation");
        }


        try {
            Demo.sendSms("+9900110011", "We have credited 1000000000000 to your account");
        } catch (OutOfReachException e) {
            // Do anything
        } catch (BalanceKhatamException e) {
            System.out.println("Inform Executives about the situation");
        }

        try {
            Demo.sendSms("+91999888", "Your OTP is 0011");
        } catch (OutOfReachException e) {
            System.out.println("Your number is out of reach. Please try again.");
        } catch (BalanceKhatamException e) {
            
        }

        try {
            Demo.saveToDatabase();
        } catch (DataInconsistantException a) {
            System.out.println(a.message);
        } catch (EmailUniqueException b) {
        }


        System.out.println("Hello world!");



    }


    public static void sendSms(String number, String message) throws OutOfReachException, BalanceKhatamException {


        if(balanceKhatam) {
            throw new BalanceKhatamException();
        }

        if(outOfReach) {
            throw new OutOfReachException();
        }


        System.out.println("sent sms to " + number);

    }

    public static void saveToDatabase() throws DataInconsistantException, EmailUniqueException {

        DataInconsistantException e1 = new DataInconsistantException("Name should be String");
        DataInconsistantException e2 = new DataInconsistantException("Age should be integer");

        throw e1;
    }
}
