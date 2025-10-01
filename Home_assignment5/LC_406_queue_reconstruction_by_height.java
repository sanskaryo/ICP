 import java.util.*;


public class LC_406_queue_reconstruction_by_height {

   
public static void main(String[] args) {

    int[][] people = { {7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2} };

    int[][] result = reconstructqueue(people);
    for (int[] person : result) {
        
        System.out.println(Arrays.toString(person));
    }
    

}

    public static  int[][] reconstructqueue(int[][] people) {

        
      

        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1]; 
            }
            return b[0] - a[0]; 
        });

        List<int[]> result = new LinkedList<>();
        for (int[] p : people) {
            result.add(p[1], p); 
        }

        return result.toArray(new int[people.length][2]);
    }
}

    
