package recursion;

public class Main {

    public static void main(String[] args) {
        var arr = new int[]{1, 2, 3, 4, 5};
        var target = 3;
        System.out.println(binaryRecursion(arr, 0, arr.length - 1, target));
    }

    private static int binaryRecursion(int[] arr, int left, int right, int target) {
        if (left <= right) {
            var mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                return binaryRecursion(arr, left, mid - 1, target);
            } else {
                return binaryRecursion(arr, mid + 1, right, target);
            }
        } else {
            return -1;
        }
    }

}
