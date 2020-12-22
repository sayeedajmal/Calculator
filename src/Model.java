package src;

public class Model {
        public double calculate(Double number1, Double number2, String operator) {
                switch (operator) {
                        case "+":
                                return number1 + number2;
                        case "-":
                                return number1 - number2;
                        case "*":
                                return number1 * number2;
                        case "/":
                                if (number2 == 0)
                                        return 0;

                                return number1 / number2;
                        case "%":
                                return number1 % number2;
                }
                return 0;

        }

}
