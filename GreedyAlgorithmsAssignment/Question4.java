
/*
 * Question :  You have a long flowerbed in which some of the plots are planted, and some are not.
However, flowers cannot be planted in adjacent plots.Given an integer array flowerbed
containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n
new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
Input : flowerBed = [1,0,0,1],n=1
Output : true
 */

public class Question4 {

    public static boolean canPlaceFlower(int[] flowerBed, int n) {
        if (flowerBed == null || flowerBed.length == 0)
            return false;

        int count = 0;
        for (int i = 0; i < flowerBed.length && count < n; i++) {
            if (flowerBed[i] == 0) {
                boolean leftEmpty = (i == 0) || (flowerBed[i - 1] == 0);
                boolean rightEmpty = (i == flowerBed.length - 1) || (flowerBed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    flowerBed[i] = 1;
                    count++;
                }
            }
        }

        return count >= n;
    }

    public static void main(String[] args) {
        int[] flowerBed = { 1, 0, 0, 1 };
        int n = 2;

        boolean res = canPlaceFlower(flowerBed, n);
        System.out.println(res);
    }
}
