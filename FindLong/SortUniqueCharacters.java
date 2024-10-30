package FindLong;

import java.util.Scanner;
import java.util.TreeSet;

public class SortUniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();
        TreeSet<Character> sortedUniqueChars = new TreeSet<>();
        for (char c : input.toCharArray()) {
            sortedUniqueChars.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (char c : sortedUniqueChars) {
            result.append(c);
        }
        System.out.println("Chuỗi tăng dần lớn nhất là: " + result.toString());
    }
}