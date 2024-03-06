//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class sayiBulma {
    public static void main(String[] args) {
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
            System.out.println("Sayımız listede var.");
        } else {
            System.out.println("Sayımız listede yok.");
        }
    }
}