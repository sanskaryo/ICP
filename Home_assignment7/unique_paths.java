package Home_assignment7;

public class unique_paths {

    class Solution {
    public int uniquePaths(int m, int n) {
        long res = 1;
        for (int i = 1; i <= m - 1; i++) {
            res = res * (n - 1 + i) / i;
        }
        return (int) res;
    }
}
    
}







//  Time Complexity: O(m)
//  Space Complexity
// -Only a single long variable res is used.
// -No additional data structures or recursion.
//  Space Complexity: O(1
