//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class MiniProjeAsalSayi {
    public static void main(String[] args) {
       /* int number = 2;
        int remainder = number%2;
        System.out.println(remainder);
        boolean isPrime=true;

        if(number==1){
            System.out.println("En küçük asal sayı '2' dir.");
            return;
        }
        if(number<1){
            System.out.println("En küçük asal sayı '2' dir.");
            return;
        }
        for (int i=2;i<number;i++){
            if(number%i==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("Sayı asaldır.");
        }
        else {
            System.out.println("Sayı asal değildir.");
        }*/
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayının asallığını kontrol edebilirsiniz. Bir Sayı giriniz: ");
        int thisNum = scan.nextInt();

        boolean asalMi = true;
        if (thisNum < 2) {
            System.out.println("En küçük asal sayı 2'dir.");
        } else {
            for (int i = 2; i < thisNum; i++) {
                if (thisNum % i == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {
                System.out.println(thisNum + " Sayısı asaldır.");
            } else {
                System.out.println(thisNum + " Sayısı asal değildir.");
            }

        }

        scan.close();



    }
}