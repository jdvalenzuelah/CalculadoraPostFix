//Universidad del Valle de Guatemala
//Algoritmos y Estructura de Datos
//David Valenzuela		171001
//Fernando Hengstenberg 17699	
//Calculadora 1.0

public class CalculadoraStacks implements Calculadora{

	StackVector<Integer> stack = new StackVector<Integer>();
	
	@Override
	public String calcular(String operacion) {
		String[] splitOperacion = operacion.split(" ");
		for( String charOperacion : splitOperacion) {
			try {
				stack.push(Integer.parseInt(charOperacion));
			}catch(Exception e){
				if(charOperacion.equals("+")) {//condicion 1
					Integer resul = this.stack.pop();
					resul += this.stack.pop();
					this.stack.push(resul);
				}else if(charOperacion.equals("-")) {//condicion 2
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