//baekjoon A028 solution
import java.util.*;
import java.io.IOException;
import java.math.BigInteger;

class Main{
    public static void main(String[] args){
        BigInteger[] num;
	    Scanner sc = new Scanner(System.in);
	    String number = sc.nextLine();
	    StringTokenizer numberSt = new StringTokenizer(number, " ");
	    num = new BigInteger[numberSt.countTokens()];
        int i=0;
	    while(numberSt.hasMoreTokens()){
	        num[i]=new BigInteger(numberSt.nextToken());
            i++;
	    }
	    sc.close();
        System.out.println(num[0].add(num[1]));

    }
}
