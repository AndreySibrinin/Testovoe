package company;

public class Calculator {

    private int maxValue;
    private int minValue;

    public Calculator(int minValue, int maxValue) {
        this.maxValue = maxValue;
        this.minValue = minValue;
    }


    public String calculate(String expression) {
        boolean isRomeNumber = false;
        String[] expressionMembers = expression.split(" ");


        int a = 0;
        int b = 0;


        int result = 0;

        if (expressionMembers.length != 3)
            return "Неверный формат выражения";

        String operation = expressionMembers[1];

        try {

            a = Integer.parseInt(expressionMembers[0]);
            b = Integer.parseInt(expressionMembers[2]);
        } catch (Exception e) {
            try {

                a = Convertor.RomanToArabic(expressionMembers[0]);
                b = Convertor.RomanToArabic(expressionMembers[2]);
                isRomeNumber = true;
            } catch (Exception e1) {
                return "Неверное выражение. Калькулятор умеет работать только с арабскими или римскими цифрами одновременно";
            }
        }


        if (a < this.minValue || a > this.maxValue || b < this.minValue || b > this.maxValue) {
            return "Числа могут быть от 1 до 10  или от I до X включительно";
        }


        switch (operation) {
            case "+":
                result = Operation.addition(a, b);
                break;
            case "-":
                result = Operation.substraction(a, b);
                break;
            case "*":
                result = Operation.multiplication(a, b);
                break;
            case "/":
                result = Operation.division(a, b);
                break;
            default:
                return "Неверный оператор";
        }

        if (isRomeNumber)
            return Convertor.ArabicToRoman(result);
        else
            return String.valueOf(result);

    }
}

