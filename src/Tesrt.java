public class Tesrt {

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2,3,1,1,4}));
    }

    public static boolean canJump(int[] nums) {
        boolean[] arr = new boolean[nums.length];
        if (nums.length == 1) {
            return true;
        }
        arr[0] = true;

        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            while (j >= 0) {
                if (arr[j]) {
                    if (j + nums[j] >= i) {
                        arr[i] = true;
                        break;
                    }
                }
                j--;
            }
        }
        return arr[nums.length -1];
    }
}
