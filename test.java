import java.util.Scanner;

public class test {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nập tháng: ");
        int month = sc.nextInt();
        int year = sc.nextInt();
        String daysMonth;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysMonth = "30";
                break;
            case 2:
                if ( year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
                    daysMonth = "29";
                } else {
                    daysMonth  = "28";
                }
            break;
            default:
                daysMonth = " ";
        }
        if (daysMonth != " "){
            System.out.println(daysMonth);
        }

    }

}