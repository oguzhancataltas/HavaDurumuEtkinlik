import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int heat;

        System.out.print("Bugün Sıcaklık Kaç Derece ? : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Bugün Kayak Yapabilirsin!");
        } else if (heat < 10) {
            System.out.println("Bugün Sinemaya Gidebilirsin!");
        } else if (heat < 15) {
            System.out.println("Bugün Sinemaya veya Pikniğe Gidebilirsin!");
        } else if (heat < 25) {
            System.out.println("Bugün Pikniğe Gidebilirsin!");
        } else {
            System.out.println("Bugün Yüzmeye Gidebilirsin!");
        }
    }
}
