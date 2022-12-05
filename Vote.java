/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vote;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class Vote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age;
        Scanner sk=new Scanner(System.in);
        System.out.println("enter your age");
        age=sk.nextInt();
        if(age<18)
        {
            System.out.println("not eligible");
        }
        else if (age>18&&age<20)
        {
            System.out.println("wait");
        }
        else if (age>20&&age<45)
        {
            System.out.println("ok");
        }
    }
    
}
