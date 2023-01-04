//백준 A036 화성수학 
import java.util.*;

public class MarsMath {
	private ArrayList<ArrayList<String>> expressionArr;
	
	public MarsMath(int number) {
		expressionArr = new ArrayList<ArrayList<String>>(number);
	}
	
	public ArrayList<String> setExpression(String sentence) {
		StringTokenizer st = new StringTokenizer(sentence, " ");
		ArrayList<String> expression = new ArrayList<String>(st.countTokens());
	    while(st.hasMoreTokens()){
	        expression.add(st.nextToken());
	    }
	    return expression;
	}
	
	public ArrayList<ArrayList<String>> getExpressionArr(){
		return this.expressionArr;
	}
	
	public double calculateMars(ArrayList<String> expression) {
		double result;
		result = Double.parseDouble(expression.get(0));
		for(int i=1; i<expression.size(); i++) {
			if(expression.get(i).equals("@")) {
				result *=3;
			} else if(expression.get(i).equals("%")) {
				result +=5;
			} else if(expression.get(i).equals("#")) {
				result -=7;
			} else {
				System.out.println("Invaild operator");
				System.out.println(expression.get(i));
			}	
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfSize = Integer.parseInt(sc.nextLine());
		MarsMath t = new MarsMath(numberOfSize);
		for(int i=0; i<numberOfSize; i++) {
			String expression = sc.nextLine();
			t.getExpressionArr().add(t.setExpression(expression));
		}
		for(int i=0; i<numberOfSize; i++) {
			System.out.printf("%.2f",t.calculateMars(t.getExpressionArr().get(i)));
			System.out.println();
		}
	}	
}

