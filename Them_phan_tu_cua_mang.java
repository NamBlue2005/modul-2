import java.util.Scanner;

public class Them_phan_tu_cua_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = 10;
        int[] array = new int[N];

        System.out.print("Index: ");
        for (int i = 0; i < N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Value: ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Nhập số cần chèn vào mảng: ");
        int X = scanner.nextInt();

        System.out.print("Nhập vị trí cần chèn số " + X + ": ");
        int index = scanner.nextInt();
        if (index < 0 || index >= N) {
            System.out.println("Không chèn được phần tử vào mảng.");
        } else {
            int[] newArray = new int[N + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = X;
            for (int i = index; i < N; i++) {
                newArray[i + 1] = array[i];
            }
            System.out.println("Mảng sau khi chèn: ");
            System.out.print("Index: ");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.print("Value: ");
            for (int value : newArray) {
                System.out.print(value + " ");
            }
        }

        scanner.close();
    }
}