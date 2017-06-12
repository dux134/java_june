package codekamp;

public class Student {

    public String name;
    public String email;
    public int age;
    public float percentage;

    public static String occupation;

    // this ek local variable hota hai jo non static functions mein magically
    // khud se define ho jata hai. It stores the variable on which the function was called.

    public void defineYourself() {
        this.showYourPercentage();
        System.out.println("Hi, my name is " + this.name + " and my age is " + this.age);
    }

    public static void defineYourWork() {
        System.out.println("Hi, I am a student and hence my job is to work hard and party harder");
    }

    public void showYourPercentage() {
        System.out.println("My Percentage is " + this.percentage);
    }
}
