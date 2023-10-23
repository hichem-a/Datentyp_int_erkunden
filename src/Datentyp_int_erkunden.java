import java.util.Scanner;
public class Datentyp_int_erkunden {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Geben Sie den Wert für a (ganze Zahl) ein: ");
        a = input.nextInt();
        System.out.print("Geben Sie den Wert für b (ganze Zahl) ein: ");
        b = input.nextInt();
        int addition = a + b;
        int subtraktion = a - b;
        int multiplikation = a * b;
        int division = 0;
        int modulo = 0;
        if (b != 0) {
            division = a / b;
            modulo = a % b;
        } else {
            System.out.println("Division durch Null ist nicht erlaubt.");
        }
        System.out.println("a + b = " + addition);
        System.out.println("a - b = " + subtraktion);
        System.out.println("a * b = " + multiplikation);

        if (b != 0) {
            System.out.println("a / b = " + division);
            System.out.println("a % b = " + modulo);
        }
input.close();
    }

}
