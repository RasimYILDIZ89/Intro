import java.util.Scanner;
public class arkadasSayilar {
    public static void main(String[] args) {

       try(Scanner scan = new Scanner(System.in)) {
           System.out.println(" Birinci sayıyı giriniz = ");
           int number = scan.nextInt();
           System.out.print(" İkinci sayıyı giriniz = ");
           int number1 = scan.nextInt();

           int total = 0;
           int total1 = 0;

           for (int i = 1; i < number; i++) {
               if (number % i == 0) {
                   total += i;

               }
           }

           for (int j = 1; j < number1; j++) {
               if (number1 % j == 0) {
                   total1 += j;

               }
           }
           if (total == number1 & total1 == number) {
               System.out.println("Sayılarımız Arkadaştır.");
           } else {
               System.out.println("Sayılarımız Arkadaş Değildir.");
           }

       }

        }
    }