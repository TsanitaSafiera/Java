package Class8;

import java.util.Scanner;

public class E1WhileLoop1 {
    public static void main(String[] args) {
        //print all the numbers from starting point to an end
        //ask the user for starting and ending

        Scanner scanner=new Scanner(System.in);
        System.out.println("print a number to starting and the ending point");

        int start=scanner.nextInt();
        int end=scanner.nextInt();



        int counter=start;

        while (counter<=end){
            System.out.print(counter+" ");
            counter++;
        }
    }
}
