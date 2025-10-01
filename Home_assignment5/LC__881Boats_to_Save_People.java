import java.util.*;

public class LC__881Boats_to_Save_People {


    public int numRescueBoats(int[] people, int limit) {

if(people.length==0){
    return 0;
}
        Arrays.sort(people);
        int r = people.length-1;

        int boats=0;
int l=0;
      while(l<=r){
        if((people[l]+people[r])<=limit){
            l++;
            r--;
            boats++;
        }
        else{
boats++;
r--;
        }
      }
       return boats; 
    }
}
    

