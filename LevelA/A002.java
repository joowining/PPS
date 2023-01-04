import java.util.*;
//leat code A009 solution
public class Pascal {
		
	public List<List<Integer>> generate(int numRows){
		List<List<Integer>> pascal = new ArrayList<>();
		List<Integer> before = new ArrayList<>();
		for(int i=0; i<numRows;i++ ) {
			List<Integer> expression = new ArrayList<>();
			if(i==0) {expression.add(1);}	
			
			if(i==1) {expression.add(1);expression.add(1);}

			if(i>1) {
				expression.add(1);
				for(int j=0;j<before.size()-1;j++){
					expression.add(before.get(j)+before.get(j+1));
				}
				expression.add(1);
			}
			pascal.add(expression);
			before = expression;
		}
		return pascal;
	}
}

