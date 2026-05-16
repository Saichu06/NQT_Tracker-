import java.util.*;

class twofourwheelercount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int w = sc.nextInt();

        int twowheelers = ((4 * v) - w) / 2;
        int fourwheelers = v - twowheelers;

        if (w >= 2 * v && w <= 4 * v && w % 2 == 0) {

            System.out.println("Two Wheelers count : " + twowheelers);

            System.out.println("Four Wheelers count : " + fourwheelers);

        } else {

            System.out.println("Invalid Input");
        }
    }
}