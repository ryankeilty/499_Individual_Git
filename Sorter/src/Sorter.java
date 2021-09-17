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
        if(inType == 1){
            int[] ints = new int[4];
            System.out.println("Please enter 4 numbers");
            for(int i = 0; i<4; i++){
                ints[i] = read.nextInt();
            }
            ints = sort(ints);
            System.out.println("Sorted array is: ");
            for (int num : ints)
                System.out.print(num+" ");
        }
    }
    public static int[] sort(int[] a){
        int[] b = new int[4];
        int max = 0;
        int k = 0;
        for(int i=3; i>=0; i--){
            for(int j=0; j<4; j++) {
                if(a[j]>max){
                    max = a[j];
                    k = j;
                }
            }
            b[i] = max;
            a[k] = 0;
            max = 0;
        }

        return b;
    }
}




