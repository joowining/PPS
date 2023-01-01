//A022문제 - 백준
import java.util.*;
import java.io.IOException;


public class Main {
	int[] phoneRecord;
	
	public Main(int[] args) {
		this.phoneRecord = args;
	}
	
	class Yphone{
		int fee=0;
		int[] phoneRecord;
		String name ="Y";
		
		public Yphone(int[] args) {
			this.phoneRecord=args;
		}
		
		public void calY() {
			for(int i=0; i<phoneRecord.length; i++) {
				int check=phoneRecord[i];
				int monthFee=0;
				if(check==0) {
					check=-1;
				}
				while(check>=0) {
					monthFee+=10;
					check-=30;
				}
				fee +=monthFee;
			}
		}
	}
	
	class Mphone{
		int fee=0;
		int[] phoneRecord;
		String name ="M";
		
		public Mphone(int[] args) {
			this.phoneRecord = args;
		}
		
		public void calM() {
			for(int i=0; i<phoneRecord.length; i++) {
				int check=phoneRecord[i];
				int monthFee=0;
				if(check==0) {
					check=-1;
				}
				while(check>=0) {
					monthFee+=15;
					check-=60;
				}
				fee+=monthFee;
			}
		}
	}
	
	public void testFee() {
		Yphone y = new Yphone(phoneRecord);
		Mphone m = new Mphone(phoneRecord);
		y.calY();
		m.calM();
		if( y.fee > m.fee) {
			System.out.println("M "+m.fee);
		} else if (y.fee < m.fee) {
			System.out.println("Y "+y.fee);
		} else {
			System.out.println("Y M "+y.fee);
		}
		
	}

public static void main(String[] args) throws IOException{
        int[] num;
	    Scanner sc = new Scanner(System.in);
        String numberOfSize = sc.nextLine();
	    String timeUseage = sc.nextLine();
	    StringTokenizer st = new StringTokenizer(timeUseage, " ");
	    num = new int[st.countTokens()];
	    int i=0;
	    while(st.hasMoreTokens()){
	        num[i]=Integer.parseInt(st.nextToken());
	        i++;
	    }
    Main t = new Main(num);
    t.testFee();

    }
}

