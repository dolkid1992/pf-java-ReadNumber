package baitap;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height,weigh,bmi;
        System.out.print("Your weigh(in kilogram): ");
        weigh=sc.nextDouble();
        System.out.print("Your height(in metter): ");
       height=sc.nextDouble();
       bmi=weigh/Math.pow(height,2);
        System.out.printf("%-20s%s","bmi","Interpretation");
        if(bmi<18)
            System.out.printf("%-20.2f%s",bmi,"Underweight");
        else if (bmi<25.0)
            System.out.printf("%-20.2f%s",bmi,"Normal");
        else if (bmi<30.0)
            System.out.printf("%-20.2f%s",bmi,"Overweight");
        else
            System.out.printf("%-20.2f%s",bmi,"Obese");
   }
}
