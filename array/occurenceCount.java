//https://practice.geeksforgeeks.org/problems/count-the-specials-java/1/?track=module-2-arrays-and-strings-java

class Geeks{
    static void countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);
        // your code here
        int flag[] = new int[n];
        for(int i = 0; i<n; i++){
            flag[i] = 1;
        }
        int count = 0;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(a[i] == a[j]){
                flag[i]++;
                flag [j] --;
                }
            }
        }
        for(int i =0; i<n; i++){
            if(flag[i] == f)
                count++;
        }
        
        System.out.println(count);
    }
}
