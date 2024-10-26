/*Question :  Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.
 * 
 */

package BacktrackingAssignment;

import java.util.*;

public class Question3 {
    public static List<List<Integer>> permuteUnique(int nums[]) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrack(res, new ArrayList<>(), nums, used);
        return res;

    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int nums[], boolean[] used) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;

            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;

            tempList.add(nums[i]);
            used[i] = true;

            backtrack(result, tempList, nums, used);

            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2 };
        List<List<Integer>> result = permuteUnique(nums);
        System.out.println("All unique permutations : " + result);
    }
}
