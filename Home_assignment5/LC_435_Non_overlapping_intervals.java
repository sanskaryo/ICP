package Home_assignment5;

import java.util.Arrays;

public class LC_435_Non_overlapping_intervals {

     public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;

Arrays.sort(intervals, (a,b) -> a[1] - b[1]); 
int c = 0; 
int prevEnd = intervals[0][1];  

for(int i=1;i<n;i++){  
    if(intervals[i][0] < prevEnd){  
     
        c++;  
    } else {  
        prevEnd = intervals[i][1];
    }  
}
  return c;
        }
    
}
