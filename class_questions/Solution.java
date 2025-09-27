package class_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     
        HashMap<String, List<String>> map = new HashMap<>();

for(String str : strs){
    char[] charArray = str.toCharArray();

    Arrays.sort(charArray);

    String sortedone =new String(charArray);

    if(!map.containsKey(sortedone)){
        map.put(sortedone,new ArrayList<>());
    }

    map.get(sortedone).add(str);
}


        return new ArrayList<>(map.values());
    }
} {
    
}
