public class HienThiCacSoNguyenNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Cac so nguyen nho hon 100: ");
        for (int i = 2 ; i <= 100 ; i++) {
            if (isPrime(i)){
                System.out.println(i+ " ");
            }
        }
    }
    public static boolean isPrime(int n){
        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
