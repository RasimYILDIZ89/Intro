//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class sesliHarfler {
    public static void main(String[] args) {
        char letter = 'İ';

        switch (letter) {
            case 'A':
            case 'O':
            case 'I':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }

    }
}