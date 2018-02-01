

public class CalculadoraStacks implements Calculadora{

	StackVector<Integer> stack = new StackVector<Integer>();
	
	@Override
	public String calcular(String operacion) {
		String[] splitOperacion = operacion.split(" ");
		Integer resul = 0;
		Integer temp1, temp2;
		for( String charOperacion : splitOperacion) {
			
			switch(charOperacion) {
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
			case "0":
				this.stack.push(Integer.parseInt(charOperacion));
				break;
			case "+":
				int sizeSum = this.stack.size();
				for(int i = 0; i < sizeSum; i++) {
					resul = resul + this.stack.pop();
				}
				this.stack.push(resul);
				break;
			case "*":
				resul = 1;
				int sizeMul = this.stack.size();
				for(int i = 0; i < sizeMul; i++) {
					resul = resul * this.stack.pop();
				}
				System.out.println(resul);
				this.stack.push(resul);
				
				break;
			}
		
		}
			
		return resul.toString();
	}
	
}
