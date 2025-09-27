import java.util.*;

public class kth_largest_element_array {

    public static void main(String[] args) {
        
        int [] arr = {3,2,1,5,6,4};
  
        System.out.println(findKthLargest(arr,2));

        
    }
    
     public static int findKthLargest(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        for(int i=0;i<k;i++){

            pq.add(arr[i]);}
        for(int i=k;i<arr.length;i++){

            if(arr[i]>pq.peek()){

                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}
