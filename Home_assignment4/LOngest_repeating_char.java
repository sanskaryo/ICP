public class LOngest_repeating_char {


    public static void main(String[] args) {

        String s = "ABSDAB";
int k=2;
        System.out.println(characterReplacement(s,k));
        
    }

    public static int characterReplacement(String s, int k) {

        int[] freq = new int[26];


        int left = 0, maxCount = 0, ans = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq[c - 'A']++;


            maxCount = Math.max(maxCount, freq[c - 'A']);

            while ((right - left + 1) - maxCount > k) {
                
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }


    
}
