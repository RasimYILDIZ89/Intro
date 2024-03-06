//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class loopDemo {
    public static void main(String[] args) {
        //For
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti...");
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti...");
        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti...");

        //While
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("While Döngüsü Bitti...");
        int e = 1;
        while (e < 10) {
            System.out.println(e);
            e += 2;
        }
        System.out.println("While Döngüsü Bitti...");

        int k = 2;
        while (k < 10) {
            System.out.println(k);
            k += 2;
        }
        System.out.println("While Döngüsü Bitti...");

        //Do-While Döngüsü
        int j=1;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);


        System.out.println("Do-While Döngüsü Bitti...");

        int a=100;
        do {
            System.out.println(a);
            a++;
        } while (a < 10);


        System.out.println("Do-While Döngüsü Bitti...");

    }
}