package Calcuatorpackge.CalculatorLevel2;

public class Calculator {

    History history = new History();

    int add(int n1,int n2){
        int value = n1+n2;;
        history.setHistory(value);//연산 결과값을 바로 history에 저장
        return value;
    }

    int SubStract(int n1, int n2){
        int value = n1-n2;;
        history.setHistory(value);
        return value;
    }

    int Multiply(int n1, int n2){
        int value = n1*n2;;
        history.setHistory(value);
        return value;
    }

    int Divide(int n1, int n2){
        try{
            int value = n1/n2;
            history.setHistory(value);
            return value;
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
    }
}




