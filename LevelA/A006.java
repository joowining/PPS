//A006 프로그래머스
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pNum=0;
        int yNum=0;
        char[] charArray = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            charArray[i] =  s.charAt(i);
        }
        
        
        for(char cha : charArray){
            if(cha=='p' || cha=='P'){
                pNum++;
            } else if (cha=='y' || cha=='Y'){
                yNum++;
            }
        }
        if(pNum==yNum){
            answer=true;
        } else {
            answer=false;
        }
        
        return answer;
    }
}
