//https://practice.geeksforgeeks.org/problems/matrix-interchange-java/1/?track=module-2-arrays-and-strings-java&batchId=114

class Geeks{
    
    static void interchange(int a[][],int r, int c){
        
        // Your code here
        for(int i = 0;i<r;i++){
            int j= 0;
            int temp = a[i][j];
            a[i][j] = a[i][j+c-1];
            a[i][j+c-1] = temp;
            
        }
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        } 
    }
}
