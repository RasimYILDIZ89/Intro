//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MultiDimansionalArrayDemo {
    public static void main(String[] args) {

        String[][] cities = new String[3][3];

        cities[0][0] = "İstanbul";
        cities[0][1] = "Bursa";
        cities[0][2] = "Bilecik";
        cities[1][0] = "Ankara";
        cities[1][1] = "Konya";
        cities[1][2] = "Kayseri";
        cities[2][0] = "Diyarbakır";
        cities[2][1] = "Konya";
        cities[2][2] = "Gaziantep";

        for (int i=0;i<=2;i++){
            System.out.println("------------------------");
            for (int j=0;j<=2;j++){
                System.out.println(cities[i][j]);
            }
        }
    }
}