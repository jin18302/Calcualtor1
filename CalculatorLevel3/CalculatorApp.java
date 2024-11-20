package Calcuatorpackge.CalculatorLevel3;


public class CalculatorApp {
    Calculator calculator = new Calculator();
    Input input = new Input();

    int Num1;
    int Num2;
    Number value;

    void on() {
        while (true) {
            Num1 = input.inputNum();

            OperatorType op = OperatorType.getSymbol(input.InputOperate());//입력받은 값으로부터 simbol을 받아옴
            Num2 = input.inputNum();

            switch (op) {
                case ADD -> value = calculator.add(Num1, Num2);
                case SUBTRACT -> value = calculator.SubStract(Num1, Num2);
                case MULTI -> value = calculator.Multiply(Num1, Num2);
                case DIVIDE -> value = calculator.Divide(Num1, Num2);
            }

            System.out.println("결과:" + value);


            String in = input.Menu();
            if (in.equals("history")) {
                calculator.history.getHistory();
                in = input.reMenu();
            } else if (in.equals("n")) {
                int n = input.inputNum();
                System.out.println(n);
                calculator.history.findValuesGreaterThan(n);
                in = input.reMenu();
            }


            if (in.equals("off")) {
                System.exit(0);
            } else if (in.equals("0")) continue;


        }
    }
}
