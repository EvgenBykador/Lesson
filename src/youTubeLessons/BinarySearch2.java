package youTubeLessons;

import java.util.Arrays;

public class BinarySearch2 {
    public static void main(String[] args) {
        int [] array = {-3,8,12,-8,0,5,10,1,150,-30,19};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int  index3 = Arrays.binarySearch(array, 150);
        System.out.println(index3);
    }
}
