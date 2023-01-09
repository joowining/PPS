//programmers A004.java 나누어떨어지는 숫자배열
import java.util.*;


class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        //배열 정렬하기
        selectionSort(arr);

        //동적 자료구조 활용해서 조건에 맞는 값들 찾기
        List<Integer>  a = new ArrayList<>();
        int count = 0; // 나누기가 안되는 경우 
        for(int i=0; i< arr.length; i++){
            if((arr[i]%divisor)==0){
                a.add(arr[i]);
                count++;
            }
        }
        if(count==0){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        answer = new int[a.size()];
        for(int i=0; i<a.size(); i++){
            answer[i] = a.get(i);
        }

        return answer;
    }


    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int lowestIndex(int[] arr, int start){
        int lowestIndex = start;
        for(int i = lowestIndex; i<arr.length; i++){
            if(arr[i] < arr[lowestIndex]){
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }

    public void selectionSort(int[] arr){
        for(int i=0; i< arr.length; i++){
            int lowest;
            lowest = lowestIndex(arr,i);
            if(i != lowest){
                swap(arr,i,lowest);
            }
        }
    }
}
