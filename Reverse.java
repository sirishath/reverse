import java.util.Arrays;
public class Reverse {
        public int[] rotateLeft3(int[] nums) {
            int value = 0;
            int[] newList;
            newList = new int[nums.length];
            for (int i = nums.length - 1; i >= 0; i--) {
                newList[value] = nums[i];
                value++;

            }
            return newList;
        }
    public static void main(String[] args){
        int[] list = {1,2,3};
        Reverse reverse = new Reverse();
        int[] newList = reverse.rotateLeft3(list);
        System.out.print(Arrays.toString(newList));
    }
}
