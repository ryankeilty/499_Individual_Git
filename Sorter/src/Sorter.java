import java.util.InputMismatchException;
import java.util.Scanner;
public class Sorter{

    public static void main(String[]args){
        Scanner read = new Scanner(System.in);

        Boolean correct = false;
        int inType = 0;

        System.out.println("Hello, please indicate 1 for numbers and 2 for words\n");

        while(!correct) {
           try{
               inType = read.nextInt();
               correct = true;
           } catch(InputMismatchException e) {
               System.out.println("Please enter 1 for numbers or 2 for words");
               read.next();
           }
        }
        
    }

}




