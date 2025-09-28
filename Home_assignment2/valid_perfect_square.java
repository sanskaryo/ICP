public class valid_perfect_square {
public static void main(String[] args) {
    
int num=16;

System.out.print(validcheck(num));

}

public static boolean validcheck(int num){
long n = num;
long l=0;
long r = n-1;
if(num==1){
    return true;
}
while(l<=r){
    long mid = l+(r-l)/2;
    long sq = mid*mid;

    if(sq==num){
        return true;
    }
    else if(sq<num){
        l=mid+1;
    }
    else{
        r=mid-1;
    }
}
return false;
        
    }
}
    
