


    public class setzeros{
    public void setZeroes(int[][] matrix) {

int n = matrix.length; //rows
int m = matrix[0].length;
  int MARKER = Integer.MIN_VALUE + 1;
int s =0;

for(int i=0;i<n;i++){

    for(int j=0;j<m;j++){
        if(matrix[i][j]==0){

for(int k=0;k<n;k++){
    if(matrix[k][j]!=0){
    matrix[k][j]= MARKER;
}}
for(int k=0;k<m;k++){
    if(matrix[i][k]!=0){
        matrix[i][k]=MARKER;
    }

}

        }
    }
}
for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if(matrix[i][j]==MARKER){
            matrix[i][j]=0;
        }
    }
}
 
    }
} 
