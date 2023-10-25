import java.util.*;
class Solution{


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= maxCandies) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int xyz[] ={5,7,9,10,3};
        int ross = 5;
        System.out.println(kidsWithCandies(xyz,ross));

    }


}
