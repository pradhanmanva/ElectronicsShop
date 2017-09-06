import java.util.Scanner;

public class ElectronicsShop {
    public static void main(String args[]) {
        //declaring variables
        int n[];
        int m[];
        int total;
        int canSpend[][];
        int size_n;
        int size_m;

        //input
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();

        //processing
        String totalspend = "";
        for (int i = 0; i < line1.length(); i++) {
            if (line1.charAt(i) == ' ') {
                break;
            }
            totalspend += line1.charAt(i);
        }
        total = Integer.parseInt(totalspend);
        System.out.println(total);
    }
}
