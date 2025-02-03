public class demo {
    public static void main(String[] args) {
        // creating an array
        int arr[] = { 1, 2, 3, 4, 5 };
        // static array
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        // dynamic array
        int nums[] = new int[5]; // by deafult zero
        nums[0] = 100;
        nums[1] = 200;
        for (int i = 0; i < 5; i++) {
            System.out.println(nums[i]);
        }
    }
}
