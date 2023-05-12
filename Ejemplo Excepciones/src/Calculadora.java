public class Calculadora {
    public double dividir(int numerador,int divisor) throws DividirPorCeroException {
        if(divisor == 0){
            throw new DividirPorCeroException("No se puede dividir por 0");
        }
        return numerador/(double)divisor;
    }
}
