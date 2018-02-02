
/**
  * @author David Valenzuela 171001
 * @author Fernando Hengstenberg 17699
 */
public interface Calculadora {

	/**
	 * Operacion de string postfix
	 * @param operacionString de operacion
	 * @return Valor de la operacion, o en caso de erro, retorna el error
	 */
	public String calcular(String operacion);
}
