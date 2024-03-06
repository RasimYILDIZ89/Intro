//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RecapDemo2 {
    public static void main(String[] args) {
        double[] myList= {1.2,2.3,3.6,4.5};

        for (double number:myList){
            System.out.println(number);
        }
        double total=0;
        double max=myList[0];
        for (double number:myList){
            if (max<number){
                max=number;
            }
            total=total+number;

        }
        System.out.println("Toplam = "+total);
        System.out.println("En Büyük Sayı = "+max);

    }
}