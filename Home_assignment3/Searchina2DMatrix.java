import java.util.*;
public  class Searchina2DMatrix  {
    

    public static void main(String[] args) {

      int[][]  matrix = {   
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12}
    };
    int target=3;

    System.out.println(searchMatrix(matrix,target));
        
    }


 public static  boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

if(target>matrix[n-1][m-1] || target<matrix[0][0]){
    return false;
}

int r = whicjrow(matrix,target);
int[] ch= matrix[r];
int low=0;
int high = ch.length-1;

while(low<=high){
    int mid =low+(high-low)/2;

    if(ch[mid]==target){
        return true;
    }
    else if(ch[mid]<target){
        low=mid+1;
    }
    else{
        high=mid-1;
    }
  
}
  return false;
    }


public static int whicjrow(int[][] matrix ,int target){

int low=0;
int high= matrix.length-1;
int ans =0;
while(low<=high){
    int mid = low+(high-low)/2;
    if(matrix[mid][0]<=target){
        ans=mid;
        low=mid+1;
    }else{
    high =mid-1;
    }
}
return ans;

}


        
    }


