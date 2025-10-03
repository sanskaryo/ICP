import java.util.*;

public class LC_77_combinations {


public static void main(String[] args) {

    int n = 4;
    int k = 2;
    List<List<Integer>> ans = combine(n, k);
    System.out.println(ans);
    
}


    

    public static List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> ans = new ArrayList<>();
        solve(n, k, new ArrayList<>(), ans);
        return ans;

    }

    public static void solve(int n, int k, List<Integer> curr, List<List<Integer>> ans) {

        if (k == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if (n == 0) {
            return;
        }

        curr.add(n);
        solve(n - 1, k - 1, curr, ans);

        curr.remove(curr.size() - 1);
        solve(n - 1, k, curr, ans);
    }
}
    

