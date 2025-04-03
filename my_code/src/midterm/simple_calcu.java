/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

import java.util.Scanner;

/**
 *
 * @author DH-PC
 */
public class simple_calcu {
    
    public static int addNum(int h, int j) {
        return h + j;
    }

    public static int mulNum(int h, int j) {
        return h * j;
    }

    public static int divNum(int h, int j) {
        return h / j;
    }
  public static void main(String[] args){
     Scanner in = new Scanner(System.in);
      System.out.println();
    
    int x = 200, y = 150;
    System.out.println("The sum of: " + addNum(x,y));
    System.out.println("The  product of: " + mulNum(x,y));
    System.out.println("The quotient of: " + divNum(x,y));
}
}  

       
