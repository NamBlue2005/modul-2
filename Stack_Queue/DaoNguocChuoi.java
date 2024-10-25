package Stack_Queue;

import java.util.Stack;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        String input = "Hello world this is Java";
        String[] words = input.split(" ");
        Stack<String> wordStack = new Stack<>();
        for (String word : words) {
            wordStack.push(word);
        }
        StringBuilder reversedString = new StringBuilder();

        while (!wordStack.isEmpty()) {
            reversedString.append(wordStack.pop()).append(" ");
        }
        System.out.println("Chuỗi sau khi đảo ngược: " + reversedString.toString().trim());
    }
}