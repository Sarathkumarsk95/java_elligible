import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int age;
        int education;
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter The Age");
        age = sk.nextInt();
        System.out.println("Enter the education");
        education = sk.nextInt();
        if (age>=19 && age<=23) {
            System.out.println("ELLIGIBLE");
        } else {
            System.out.println("NOT Eligible");
        }
        if (education > 10) {
            System.out.println(" Elligible");
        } else {
            System.out.println("NOT Elligible");

        }

    }
}

