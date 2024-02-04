
public class CalculadoraReturn {
    private double num1;
    private double num2;

    public CalculadoraReturn(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    
    public double sumar() {
        return num1 + num2;
    }

    public double restar() {
        return num1 - num2;
    }

    public double multiplicar() {
        return num1 * num2;
    }

    @Override
    public String toString() {
        return "CalculadoraReturn [num1=" + num1 + ", num2=" + num2 + "]";
    }

    public double dividir() throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("No es posible dividir entre cero.");
        }
        return num1 / num2;
    }

    public double raizCuadrada() throws ArithmeticException {
        if (num1 < 0) {
            throw new ArithmeticException("No es posible calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(num1);
    }

    public double potencia() throws ArithmeticException {
        if (num1 == 0 && num2 < 0) {
            throw new ArithmeticException("No es posible calcular la potencia con base cero y exponente negativo.");
        }
        return Math.pow(num1, num2);
    }

    public double factorial() throws ArithmeticException {
        if (num1 < 0 || num1 != (int) num1) {
            throw new ArithmeticException("No es posible calcular el factorial de un número negativo o no entero.");
        }
        double result = 1;
        for (int i = 1; i <= num1; i++) {
            result *= i;
        }
        return result;
    }

    public double logaritmo() throws ArithmeticException {
        if (num1 <= 0 || num2 <= 0 || num1 == 1) {
            throw new ArithmeticException("No es posible calcular el logaritmo con base negativa o igual a 1.");
        }
        return Math.log(num2) / Math.log(num1);
    }
}
