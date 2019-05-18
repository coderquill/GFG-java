class Geeks{
    
    static int columnWithMaxZero(int a[][],int n){
        int answer = 0, count1 = 0; //j = 0, k = 0;
        for(int i = 0; i<n; i++){
            int count2 = 0;
            for(int j = 0; j<n; j++){
                if(a[j][i] == 0)
                    count2++;
            }
            if(count2>count1){
                count1 = count2;
                answer = i;
            }
           
        }
        return answer;
    }
}
