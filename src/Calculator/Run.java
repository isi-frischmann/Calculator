package Calculator;

public class Run {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		Calculator c2 = new Calculator(10, 1, "*");
		Calculator c3 = new Calculator(10, 20, "+");
		
		c2.performOperation();
		c2.getResult();
		
		c3.performOperation();
		c3.getResult();	
		}
}
