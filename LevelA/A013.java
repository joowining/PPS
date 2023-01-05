//leatcode countPrime A013
//  Time Exceeded 가 결과값으로 나옴
class Solution {
    public int countPrimes(int n) {
 		int result=0;  
        for(int i=1; i<n; i++){
        	int count=0;
            for(int j=1; j<=i; j++){             
                if(i%j==0){               	
                    count++;
                } 
            }
            if(count==2){
                result++;
            }
        }
        return result;
    }
}
