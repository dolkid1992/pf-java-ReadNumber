package baitap;

import java.util.Scanner;

public class dayinmonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input your number: ");
        int number = sc.nextInt();
        String readNumber;
        int ones = number % 10;
        int tens = number / 10;

       if (number<10 && number >=0 ){
        switch (number) {
            case 0:
                System.out.println("Zero"); break;
            case 1:
                System.out.println("One");break;
            case 2:
                System.out.println("Two");break;
            case 3:
                System.out.println("Three");break;
            case 4:
                System.out.println("Four");break;
            case 5:
                System.out.println("Five");break;
            case 6:
                System.out.println("Six");break;
            case 7:
                System.out.println("Seven");break;
            case 8:
                System.out.println("Eight");break;
            case 9:
                System.out.println("Nice");
                break;

        }
       }
       else if (number<20 && number >=10){
           switch (number){
               case 11:
                   System.out.println("Eleven");break;
               case 12:
                   System.out.println("twelve");break;
               case 13:
                   System.out.println("thirteen");break;
               case 14:
                   System.out.println("fourteen");break;
               case 15:
                   System.out.println("fiveteen");break;
               case 16:
                   System.out.println("sixteen");break;
               case 17:
                   System.out.println("seventeen");break;
               case 18:
                   System.out.println("eighteen");break;
               case 19:
                   System.out.println("niceteen");break;
               default:
                   System.out.println("out of ability");
                   break;

           }
       }
    }
}
