package Stack_Queue;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class WordCount {
    public static void main(String[] args) {
        TreeMap<String, Integer> wordMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập văn bản: ");
        String input = scanner.nextLine();
        String[] words = input.toLowerCase().split("\\s+");
        for (String word : words) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }
        System.out.println("Số lần xuất hiện của các từ: ");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}