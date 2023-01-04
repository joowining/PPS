//programmers A009 solution
class Solution {
    public boolean solution(String s) {
       int check=0;
       char[] arr = s.toCharArray();
       if(s.length()==4 || s.length()==6){
            for(int i=0; i<arr.length; i++){
               if(!Character.isDigit(arr[i])){
                   check++;
               }
           }
       } else {
           check++;
       }
        if(check>0){
            return false;
        } else{
            return true;
        }
    }
}
