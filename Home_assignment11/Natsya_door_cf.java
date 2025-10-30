import java.util.*;


public class Natsya_door_cf {

    public static void main(String[] args) {
        
    

    Scanner sc = new Scanner(System.in);
    int t= sc.nextInt();

    while(t-->0){
    int n = sc.nextInt();

    int k = sc.nextInt();

    int[] a = new int[n];

    for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
    }

    int[] peek = new int[n];

    for(int i=1;i<n-1;i++){
        if(a[i-1]<a[i] && a[i] >a[i+1]){
            peek[i]=1;
        }

    }

    int[] prefix = new int[n];
  

        for(int i=1;i<n;i++){

            prefix[i]=prefix[i-1]+peek[i];
        }

        int maxpeak=0;
        int bestl=0;

        for(int l=0;l+k-1<n;l++){
            int r=l+k-1;

            int peakwindow=prefix[r-1]-prefix[l];

            if(peakwindow >maxpeak){

                maxpeak=peakwindow;
                bestl =l;
            }
        }
    System.out.println((maxpeak+1)+" "+(bestl+1));

}
}
}