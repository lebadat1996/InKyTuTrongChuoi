import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char kyTu;
        int count = 0;
        System.out.print("Enter String: ");
        String name = scanner.nextLine();
        System.out.print("Cac ky tu trong chuoi la: " + "\n");
        for (int i = 0; i < name.length(); i++) {
            kyTu = name.charAt(i);
            System.out.print(kyTu + "  ");
            count++;
        }
        System.out.print("\nCount = ");
        System.out.println(count + " KyTu");
    }
}
