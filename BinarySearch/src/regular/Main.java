package regular;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        var arr = new int[]{1, 2, 3, 4, 5};
        var target = 30;

        var result = binaryFindTarget(arr, target);
        System.out.println(Arrays.toString(arr));
        System.out.println("Jumlah iterasi: " + result.get("iterate"));
        System.out.println("Index ke: " + result.get("result"));
    }

    private static Map<String, Integer> binaryFindTarget(int[] arr, int target) {
        var resultMap = new HashMap<String, Integer>();
        var start = 0;
        var end = arr.length - 1;
        var num = 0;

        while (start <= end) {
            var mid = (start + end) / 2;

            resultMap.put("iterate", num += 1);

            if (arr[mid] == target) {
                resultMap.put("result", mid);
                return resultMap;
            }

            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        resultMap.put("result", -1);
        return resultMap;
    }

    private static Map<String, Integer> simpleFindTarget(int[] arr, int target) {
        var resultMap = new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            resultMap.put("iterate", i + 1);
            if (arr[i] == target) {
                resultMap.put("result", i);
                return resultMap;
            }
        }

        resultMap.put("result", -1);
        return resultMap;
    }

    // Solution
    private static int findTarget(int[] arr, int target) {
        if (arr.length == 0) return -1;
        int start = 0, end = arr.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (arr[start] == target) {
            return start;
        }
        if (arr[end] == target) {
            return end;
        }
        return -1;
    }

}
