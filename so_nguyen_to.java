public class so_nguyen_to {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Các số nguyên tố từ 2 đến 100 là:");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}