

import java.util.*;

    public class grpanagram{
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
