//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class switchDemo {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel: Geçtiniz.");
                break;
            case 'B':
            case 'C':
                System.out.println("İyi: Geçtiniz.");
                break;
            case 'D':
                System.out.println("Fena Değil: Geçtiniz.");
                break;
            case 'F':
                System.out.println("Malesef Kaldınız.");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz.");
        }
    }
}