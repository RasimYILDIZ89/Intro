//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Pair1 {
    public static void main(String[] args) {
        int[] students= {1,3,9,7,5};
        Scanner scan= new Scanner(System.in);
        System.out.println("Sayı Bulmaca: ");
        System.out.println("Lütfen 0-10 arasında bir sayı giriniz: ");
        int number = scan.nextInt();
        boolean check=false;

        if (!(number>0 & number<10)){
            System.out.println("Geçersiz sayı girdiniz");
            return;
        }
        for(int student:students){
            if (student==number){
                check=true;
                break;
            }
            else {
                check=false;
            }
        }
        if (check){
            System.out.println("Mükemmel doğru tahmin ettiniz");
        }
        else {
            System.out.println("Üzgünüm tahminin yanlış");
        }

        scan.close();

    }
}