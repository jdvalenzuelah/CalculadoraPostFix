

public class CalculadoraStacks implements Calculadora{

	StackVector<Integer> stack = new StackVector<Integer>();
	
	@Override
	public String calcular(String operacion) {
		String[] splitOperacion = operacion.split(" ");
		for( String charOperacion : splitOperacion) {
			try {
				stack.push(Integer.parseInt(charOperacion));
			}catch(Exception e){
				if(charOperacion.equals("+")) {
					Integer resul = this.stack.pop();
					resul += this.stack.pop();
					this.stack.push(resul);
				}else if(charOperacion.equals("-")) {
					Integer resul = this.stack.pop();
					resul -= this.stack.pop();
					this.stack.push(resul);
				}else if(charOperacion.equals("*")) {
					Integer resul = this.stack.pop();
					resul *= this.stack.pop();
					this.stack.push(resul);
				}else if(charOperacion.equals("/")) {
					try{
						Integer resul = this.stack.pop();
						resul /= this.stack.pop();
						this.stack.push(resul);
					}catch(ArithmeticException er){
						return("Error: "+ er.getMessage());
					}
				}else{
					return "Error: Caracter incorrecto";
				}
			}
		
		}
			
		return this.stack.peek().toString();
	}
	
}