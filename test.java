import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số cần đọc (0-999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999){
            System.out.println("Out of ability");
        } else {
            System.out.println("Số đã đọc: "+ readNumber(number));
        }
    }
    public static String readNumber(int number){
        if (number < 10){
            return  readSingLeDigit(number);
        } else if (number < 20){
            return readTeens(number);
        } else if (number < 30) {
            return readTens(number);
        } else {
            return readHundreds(number);
        }
    }
    public static String readSingLeDigit(int number){
        switch (number){
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            case 10: return "ten";
            default: return "out of ability";
        }
    }

    public static String readTeens(int number){
        switch (number){
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "out of ability";
        }
    }

    public static String readTens(int number){
        int tens = number / 10;
        int ones = number % 10;

        String tenStr = "";
        switch (tens){
            case 2: tenStr = "twenty";break;
            case 3: tenStr = "thirty";break;
            case 4: tenStr = "fourty";break;
            case 5: tenStr = "fifty";break;
            case 6: tenStr = "sixty";break;
            case 7: tenStr = "seventy";break;
            case 8: tenStr = "eighty";break;
            case 9: tenStr = "ninety";break;
        }
        if (ones != 0){
            return tenStr + " " + readSingLeDigit(ones);
        } else {
            return tenStr;
        }
    }

    public static String readHundreds(int number){
        int hundreds = number / 100;
        int remainder = number % 100;

        String result = readSingLeDigit(hundreds) + " hundred";

        if (remainder != 0){
            result += " and " + readNumber(remainder);
        }
        return result;
    }
}
