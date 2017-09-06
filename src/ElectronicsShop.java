import java.util.Scanner;

import static java.lang.System.exit;

public class ElectronicsShop {
    public static void main(String args[]) {
        //declaring variables
        int n[];
        int m[];
        int s;
        int size_n;
        int size_m;

        //input
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();

        //processing
        String line_1[] = line1.split(" ");
        String line_2[] = line2.split(" ");
        String line_3[] = line3.split(" ");
        try {
            s = Integer.parseInt(line_1[0]); // the value of s
            size_n = Integer.parseInt(line_1[1]);
            size_m = Integer.parseInt(line_1[2]);
            n = new int[size_n];
            m = new int[size_m];

            if (n.length != line_2.length)
                exit(400);
            if (m.length != line_3.length)
                exit(500);

            for (int i = 0; i < n.length; i++) {
                n[i] = Integer.parseInt(line_2[i]);
                //System.out.print(n[i]+ " ");
            }
            for (int i = 0; i < m.length; i++) {
                m[i] = Integer.parseInt(line_3[i]);
                //System.out.print(m[i]+" ");
            }

            boolean status = checkConstraints(s, n, m);
            if (!status) {
                exit(600);
            }
            //working on the problem
            int amt = -1;
            for (int i = 0; i < n.length; i++) {
                for (int j = 0; j < m.length; j++) {
                    if (n[i] + m[j] <= s) {
                        amt = n[i] + m[j];
                        continue;
                    } else break;
                }
            }
            System.out.print(amt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean checkConstraints(int s, int[] n, int[] m) {
        boolean result = true;
        if (n.length > 1000 || n.length < 1) {
            result = false;
        }
        if (m.length > 1000 || m.length < 1) {
            result = false;
        }
        if (s < 1 || s > 1000000) {
            result = false;
        }
        for (int aN : m) {
            if (aN < 1 || aN > 1000000) {
                result = false;
            }
        }
        for (int aN : n) {
            if (aN < 1 || aN > 1000000) {
                result = false;
            }
        }
        return result;
    }
}
