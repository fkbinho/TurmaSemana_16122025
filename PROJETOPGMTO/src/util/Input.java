package util;

import java.util.Scanner;

public class Input {
	private static final Scanner scan = new Scanner(System.in);

    public static int lerInt(String msg) {
        System.out.print(msg);
        while (!scan.hasNextInt()) {
            System.out.print("Digite um número válido: ");
            scan.next();
        }
        int v = scan.nextInt();
        scan.nextLine();
        return v;
    }

    public static double lerDouble(String msg) {
        System.out.print(msg);
        while (!scan.hasNextDouble()) {
            System.out.print("Digite um número válido: ");
            scan.next();
        }
        double v = scan.nextDouble();
        scan.nextLine();
        return v;
    }

    public static String lerString(String msg) {
        System.out.print(msg);
        return scan.nextLine();
    }
}
