import java.util.Scanner;

public class Dem_so_lan_xuat_hien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Hello World!";
        System.out.print("Nhập ký tự cần đếm: ");
        char characterToCount = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == characterToCount) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự '" + characterToCount + "' trong chuỗi là: " + count);

        scanner.close();
    }
}