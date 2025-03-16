/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

//import java.util.Scanner;

/**
 *
 * @author DH-PC
 */
public class palindrome {
    public static void main(String[] args) {
   
  //      Scanner in = new Scanner(System.in);
    //    System.out.print("Enter The Word: ");
      //  String input = in.nextLine().toUpperCase();
        //
        //String reversed="";
        
        //for(int i= input.length()-1; i>=0; i--){
        //reversed += input.charAt(i);
        //}
        //if(input.equals(reversed)){
          //  System.out.print(input+ " is a palindrome ");
        //} else {
          //  System.out.print(input+ " is not a palindrome ");
 //   }
   // }

        int numbers[][] = {
            {1, 2, 3, 4,},
            {5, 6, 7, 8,},
            {9, 10, 11, 12}
        };

        //System.out.println("The elements in row 1: ");
        //System.out.println("The elements in row 2: ");
        //System.out.println("The elements in row 3: ");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.print(i);
        }
    }
}
