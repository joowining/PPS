//programmers A026.java 하샤드 수
class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String sX = String.valueOf(x);
        int[] arr = stringToArr(sX);
        int divisor=0;
        
        for(int i=0; i<arr.length; i++){
            divisor += arr[i];
        }
        if((x%divisor)==0){
            answer = true;
        }
        
        return answer;
    }
    
    public int[] stringToArr(String s){
        int[] arr = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            arr[i] = Character.getNumericValue(s.charAt(i));
        }
        return arr;
    }
	
}
