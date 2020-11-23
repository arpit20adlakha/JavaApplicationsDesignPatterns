import java.util.ArrayList;
import java.util.List;

public class PermutationsOfString {
    // ab , abc -- abc,  acb and abc , bac ...
    // ab , ba
    public static void permutations(String str, int left, int right, List<String> arrayList) {
        if (left == right) {
            arrayList.add(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permutations(str, left + 1, right, arrayList);
                str = swap(str, left, i);
            }
        }
    }

    private static String swap(String str, int x, int y) {
        char[] arr = str.toCharArray();
        char temp;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String str = "abcdefghijklm";
        int length = str.length();
        List<String> list = new ArrayList<>();
        permutations(str, 0, length - 1, list);
    }

//    private responseCreation (List<String> ) {
//
//    }
}
