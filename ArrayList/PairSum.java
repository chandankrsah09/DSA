import java.util.ArrayList;

public class PairSum {

    // Find if any pair in a sorted ArrayList has a target sum.-------->


    // public static boolean pairSum1(ArrayList<Integer> list, int target) {
    //     // Brute Force Approach
    //     for (int i = 0; i < list.size(); i++) {
    //         for (int j = i + 1; j < list.size(); j++) {
    //             if (list.get(i) + list.get(j) == target) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    // Optimized Approach
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size()-1;

        while(lp < rp) {
            // Case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } 
            // Case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else { 
                // Case 3
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;
        System.out.println(pairSum1(list, target));
    }
}
