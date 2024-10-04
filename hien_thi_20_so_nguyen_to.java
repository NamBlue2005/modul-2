public class hien_thi_20_so_nguyen_to {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        boolean isPrime = true;
        while (count < 20){
            isPrime = true;
            for (int i = 2; i< Math.sqrt(num); i++){
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
