import java.util.*;

public class parkingfeecalculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            int h = Integer.parseInt(sc.nextLine());

            int fee = 0;

            // First 2 hours
            fee += Math.min(h, 2) * 100;

            // Hours 3 to 5
            fee += Math.max(0, Math.min(h, 5) - 2) * 50;

            // Beyond 5 hours
            fee += Math.max(0, h - 5) * 20;

            System.out.println(fee);

        }

        catch (Exception e) {

            System.out.println("ERROR");
        }
    }
}