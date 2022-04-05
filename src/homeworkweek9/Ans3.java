package homeworkweek9;

import java.util.Scanner;

public class Ans3 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);//Scanner code
        System.out.println("Enter array's 1st value: ");
        int value=input.nextInt();
        System.out.println("Enter array's 2nd value: ");
        int value1=input.nextInt();
       System.out.println("Enter array's 3rd value: ");
        int value2=input.nextInt();
       System.out.println("Enter array's 4th value: ");
        int value3=input.nextInt();

        int [] a= new int []{value,value1,value2,value3};//defining  integer array

        System.out.print("Original Array: ");
        for (int i=0; i<a.length; i++){  //loop to iterate array elements
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("Reverse Array: ");
        for (int i=a.length-1; i>=0;i--){
            System.out.print(a[i]+" ");

        }

    }
}
