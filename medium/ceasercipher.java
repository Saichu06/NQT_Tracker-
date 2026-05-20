import java.util.*;

class ceasercipher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = "";

        int key = 0;

        System.out.print("Enter your plain text : ");

        str = scanner.nextLine();

        System.out.print("Enter the key : ");

        if (scanner.hasNextInt()) {

            key = scanner.nextInt();

            if (key == 0) {

                System.out.println("INVALID INPUT");

                return;
            }

        } else {

            System.out.println("INVALID INPUT");

            return;
        }

        char[] nonencrypt = str.toCharArray();

        char[] encrypted = new char[nonencrypt.length];

        for (int i = 0; i < nonencrypt.length; i++) {

            char c = nonencrypt[i];

            // Uppercase
            if (c >= 'A' && c <= 'Z') {

                encrypted[i] =
                        (char)((c - 'A' + key) % 26 + 'A');
            }

            // Lowercase
            else if (c >= 'a' && c <= 'z') {

                encrypted[i] =
                        (char)((c - 'a' + key) % 26 + 'a');
            }

            // Digits
            else if (c >= '0' && c <= '9') {

                encrypted[i] =
                        (char)((c - '0' + key) % 10 + '0');
            }

            // Special characters
            else {

                encrypted[i] = c;
            }
        }

        System.out.println("Encrypted text : "
                + new String(encrypted));
    }
}