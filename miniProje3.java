import java.util.Scanner;

public class miniProje3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("-----Girdiğiniz sayının mükemmel sayı olup olmadığına bakacağız-----");
        System.out.println("Bir sayı Giriniz: ");

        int number = scan.nextInt();
        int number2 = 0;

        if(number2<1){
            System.out.println("Geçersiz sayı girdiniz");
            return;
        }

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                number2 += i;
            }
        }
        if (number == number2) {
            System.out.println("Mükemmel Sayı.");
        } else {
            System.out.println("Mükemmel Sayı Değildir.");
        }

        scan.close();
    }
}