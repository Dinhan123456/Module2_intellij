public class Bai5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = minValue(arr);
        System.out.println("The minimum value is: " + arr[index]);
        }
        public static int minValue(int[] arr) {
            int min = arr[0];
            int index = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    index = i;
                }
            }
            return index;
    }
}
