import java.util.Scanner;

public class Xoa_phan_tu_cua_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int N = scanner.nextInt();
        int[] array = new int[N];

        System.out.println("Nhập các phần tử cho mảng:");
        for (int i = 0; i < N; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Nhập phần tử cần xoá: ");
        int X = scanner.nextInt();

        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                index_del = i;
                System.out.println("Phần tử " + X + " xuất hiện tại vị trí: " + index_del);
                break;
            }
        }

        if (index_del == -1) {
            System.out.println("Phần tử " + X + " không tồn tại trong mảng.");
        } else {
            for (int i = index_del; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            System.out.println("Mảng sau khi xoá phần tử " + X + ":");

            int[] newArray = new int[N - 1];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = array[i];
            }

            for (int num : newArray) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}