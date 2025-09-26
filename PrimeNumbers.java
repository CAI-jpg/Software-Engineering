public class PrimeNumbers {

    public static void main(String[] args) {
        int count = 0; // 用于统计每行打印的素数个数

        for (int i = 2; i <= 20000; i++) {
            if (isPrime(i)) {
                System.out.print(i + "\t");
                count++;
                if (count % 5 == 0) {
                    System.out.println(); // 每打印5个素数后换行
                }
            }
        }
    }

    // 判断一个数是否为素数
    public static boolean isPrime(int num) {
        if (num <= 1) 
return false;
        if (num == 2) 
return true;
        if (num % 2 == 0) 
return false;

        int sqrt = (int) Math.sqrt(num);
        for (int i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) 
return false;
        }
        return true;
    }
}