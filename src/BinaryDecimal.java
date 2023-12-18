import java.util.Scanner;

public class BinaryDecimal {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una stringa binaria:");
        String binaryString = scanner.nextLine();
        int decimalValue = 0;
        //int decimalValue = BinaryDecimal(binaryString);
        System.out.println("Valore decimale:" + decimalValue);
        scanner.close();
    }
}
