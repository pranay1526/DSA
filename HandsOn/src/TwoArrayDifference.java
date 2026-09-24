import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TwoArrayDifference {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,3};
        int[] num2 = {1,1,2,2};

        List<List<Integer>> result = findDifference(num1, num2);
        System.out.println(result);
    }

    private static List<List<Integer>> findDifference(int[] num1, int[] num2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int i : num1)
            set1.add(i);
        HashSet<Integer> set2 = new HashSet<>();
        for(int i : num2)
            set2.add(i);

        HashSet<Integer> onlyInSet1 = new HashSet<>(set1);
        onlyInSet1.removeAll(set2);

        HashSet<Integer> onlyInSet2 = new HashSet<>(set2);
        onlyInSet2.removeAll(set1);

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(onlyInSet1));
        result.add(new ArrayList<>(onlyInSet2));

        return result;
    }
}
