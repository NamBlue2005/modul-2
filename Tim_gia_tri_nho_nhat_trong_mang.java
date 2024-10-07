import java.util.Scanner;

public class Tim_gia_tri_nho_nhat_trong_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng: ");
        int SIZE = scanner.nextInt();
        int[] array = new int[SIZE];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int minValue = array[0];

        for (int i = 1; i < SIZE; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);

        scanner.close();
    }
}