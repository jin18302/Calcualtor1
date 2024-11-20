package Calcuatorpackge.CalculatorLevel2;

import java.util.Scanner;

public class CalculatorApp {
    Calculator calculator = new Calculator();
    Input input = new Input();//입력받는 기능을 하는 클래스

    int Num1;
    int Num2;
    int value;

    void on() {
        while (true) {
            Num1 = input.inputValue();
            Num2 = input.inputValue();
            String op = input.InputOperate();


            if (op.equals("+")) {
                value = calculator.add(Num1, Num2);
            } else if (op.equals("-")) {
                value = calculator.SubStract(Num1, Num2);
            } else if (op.equals("*")) {
                value = calculator.Multiply(Num1, Num2);
            } else if (op.equals("/")) {
                value = calculator.Divide(Num1, Num2);
            } else {
                throw new UnsupportedOperationException("지원하지 않는 기능입니다");
            }
            System.out.println(value);

            if (calculator.history.size > 5) {//연산내역에 개수가 5개가 넘으면 삭제되도록
                calculator.history.deleteHistory();
            }


            String in = input.Menu();
            if (in.equals("history")) {
                calculator.history.getHistory();
                in = input.reMenu();//history를 보고 다시 연산을 계속 할 것인지, 종료할 것인지 선택
            }
            if (in.equals("off")) {
                System.exit(0);
            } else if (in.equals("0")) {
                continue;
            }
        }
    }
}
