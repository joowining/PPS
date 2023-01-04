//leatcode A038
class Solution {
    public int mySqrt(int x) {
        int result=0;
        for(int divNum=1; divNum<=x; divNum++){
            int head;
            head = x/divNum;
            if(head == divNum){
                result = divNum;
                break;
            } else{
                if(head<divNum){
                    result = divNum-1;
                    break;
                }
            }
        }
        return result;
    }
}
