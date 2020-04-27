package IsItHalloween;

import java.util.Scanner;

public class IsItHalloween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        if (txt.equals("OCT 31") || txt.equals("DEC 25")) System.out.println("yup");
        else System.out.println("nope");
    }
}
