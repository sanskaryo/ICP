import java.util.*;

public class range_additions{

public static void main(String[] args) {

int [][] updaets = [[1,3,2],[2,4,3],[0,2,-2]];
int l =5;

System.out.println(getModifiedArray(l , updaets));

}

    public static  int[] getModifiedArray(int length, int[][] updates) {
        int[] arr = new int[length];

 
        for (int[] upd : updates) {
            int i = upd[0];
             j = upd[1];
              val = upd[2];

            arr[i] += val;

            if (j + 1 < length) {

                arr[j + 1] -= val;
            }
        }

  //cumulative sum wali array banane k liye
        for (int k = 1; k < length; k++) {
            arr[k] += arr[k - 1];
        }

        return arr;
    }
}
