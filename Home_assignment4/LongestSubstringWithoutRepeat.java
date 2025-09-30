

import java.util.*;

public class LongestSubstringWithoutRepeat {


    public static void main(String[] args) {
        
        String s = "Sankhuzzabcdd";

        System.out.println(LongestSubstring(s));
    }
    
    public static int  LongestSubstring(String s) {
        int l = s.length();

        int max=0;
        for (int start = 0; start < l; start++) {
            List<Character> x = new ArrayList<Character>();

            x.add(s.charAt(start));
            if (start < (l - 1)) {

                for (int end = start + 1; end < l; end++) {

                    if (x.contains(s.charAt(end)) == true) {
                        break;

                    }
                    x.add(s.charAt(end));
                }
            }
            max=Math.max(x.size(),max);
        }
        return max;
    }
}
    
