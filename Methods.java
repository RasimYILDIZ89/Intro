//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Methods {
    public static void main(String[] args) {
    sayiBulmaca();
    }

    public static void sayiBulmaca(){
        int[] numbers = {1, 2, 5, 7, 9, 0};
        int aranacak = 9;
        boolean sayi = false;

        for (int i = 0; i < numbers.length; i++) {
            if (aranacak == numbers[i]) {
                sayi = true;
                break;
            }
        }
        if (sayi) {
            mesajVer("Sayımız listede var."+aranacak);
        } else {
            mesajVer("Sayımız listede YOK."+aranacak);
        }
    }
    public static void mesajVer (String mesaj){
        System.out.println(mesaj);
    }
}