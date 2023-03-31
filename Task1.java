import java.util.Scanner;

class Task1 {
    public static String encrypt(String s, int key) {
        String done = "";
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (c == ' ') {
                done += (char) c;
                continue;
            }
            c += key % 26;
            done += c > 122 || (c < 97 && c > 90) ? (char) (c - 26) : (char) (c);
        }
        return done;
    }

    public static String decrypt(String s, int key) {
        String done = "";
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (c == ' ') {
                done += (char) c;
                continue;
            }
            c -= key % 26;
            done += c < 65 || (c > 90 && c < 97) ? (char) (c + 26) : (char) (c);
        }
        return done;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Message: ");
        String msg = sc.nextLine();
        System.out.print("Enter Key: ");
        int key = sc.nextInt();
        String encrypted_msg = encrypt(msg, key);
        System.out.println("Encrypted Message = " + encrypted_msg);
        String decrypted_msg = decrypt(encrypted_msg, key);
        System.out.println("Decrypted Message = " + decrypted_msg);
        sc.close();
    }
}
