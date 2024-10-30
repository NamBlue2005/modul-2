package FindLong;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {

    public static int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (array[middle] == value) {
                return middle;
            }
            if (array[middle] < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));
        System.out.print("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt();
        int result = binarySearch(array, 0, n - 1, value);
        if (result == -1) {
            System.out.println("Giá trị " + value + " không tồn tại trong mảng.");
        } else {
            System.out.println("Giá trị " + value + " được tìm thấy tại chỉ số: " + result);
        }
        scanner.close();
    }
}