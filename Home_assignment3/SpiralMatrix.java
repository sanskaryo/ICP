import java.util.*;

public class SpiralMatrix {

    static int[][] matrix = {   //  static banane k liye taki call ho sake
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12}
    };

    public static void main(String[] args) {
        System.out.println(spiralOrder(matrix)); 
    }

    public static List<Integer> spiralOrder(int[][] matrix) {





        
 if(matrix.length == 0){
            return new ArrayList<>();
 }
        int m = matrix.length; // row
        int n = matrix[0].length;//cols

       List<Integer>result = new ArrayList<>();
        int top   = 0;
        int down  = m-1;

        int left  = 0;
        int right = n-1;
        
        int id = 0;

        while(top <= down && left <= right) {

            //left to right
            if(id == 0) {

                for(int i = left; i<=right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
            }
            
            //top to down
            else if(id == 1) {
                for(int i = top; i<=down; i++) {

                    result.add(matrix[i][right]);
                }
                right--;
            }
            
            //right to left
          else if(id == 2) {
                for(int i = right; i>=left; i--) {

                    result.add(matrix[down][i]);
                }
                down--;
            }
            
            //down to top
           else if(id == 3) {
                for(int i = down; i>=top; i--) {
                    
                    result.add(matrix[i][left]);
                }
                left++;
            }
            
            id = (id+1)%4;
        }
        return result;
    }

}