

public class LC_860_Lemonade_change {
    public static boolean lemonadeChange(int[] bills) {

        int a =0;
        int n = bills.length;
        int five=0;
        int ten =0;

        for(int i=0;i<n;i++){
            if(bills[i]==5){
                five++;
            }
            else if (bills[i]==10){
                if(five>0){
                ten++;
                five--;
            }
            else{
                return false;
            }
            }

            else if(bills[i]==20){
                if((five>0)&& (ten>0)){
                    five--;
                    ten--;
                }
            
                else if(five>2){
                    five-=3;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}


// Time Complexity: O(n), where n is the number of bills. We iterate through the bills array once.
// Space Complexity: O(1). We only use a constant amount of extra space to store the counts of $5 and $10 bills.