package Class5;

import java.util.Scanner;

public class E3IfElse {
    public static void main(String[] args) {

        /*
        ask the user for their age and based on the value of age
        write if-else condition if age is <18 print you cant't
        drive otherwise we have to print you can drive
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your age");
        int age=scanner.nextInt();

        if(age<18){
            System.out.println("You can't drive");
        }else {
            System.out.println("You can drive");
        }
    }
}
