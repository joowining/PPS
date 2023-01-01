public class Test {
	int[] phoneRecord;
	
	public Test(int[] args) {
		this.phoneRecord = args;
	}
	
	public class Yphone{
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
	
	public class Mphone{
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
	
	public static void main(String[] args) {
		int[] sample1 = {40,40,40};
		int[] sample2 = {61,61,61};
		int[] sample3 = {61,10};
		int[] sample4 = {60,65};
		System.out.println("sample1");
		Test t1 = new Test(sample1);
		t1.testFee();
		System.out.println("sample2");
		Test t2 = new Test(sample2);
		t2.testFee();
		System.out.println("sample3");
		Test t3 = new Test(sample3);
		t3.testFee();
		System.out.println("sample4");
		Test t4 = new Test(sample4);
		t4.testFee();
	}

}
