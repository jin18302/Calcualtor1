package Calcuatorpackge.CalculatorLevel2;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    int inputValue() {
        System.out.println("값을 입력해주세요 >>");
        int Num1=0;
        try{
            Num1 = Integer.parseInt(scanner.nextLine());
        }catch (Exception e){
            throw new RuntimeException("유효하지 않은값입니다");
        }
        return Num1;

    }


    String InputOperate() {
            System.out.println("연산자를 입력해주세요 >>");
            String op = scanner.nextLine();
            return op;

    }



    String Menu() {
        System.out.println("0-계산계속");
        System.out.println("off-종료");
        System.out.println("history-이전 계산결과보기");
        String input = scanner.nextLine();
        return input;
    }



    String reMenu(){
        System.out.println("계산을 계속하시려면 0, 종료하시려면 off를 입력해주세요");
        String input = scanner.nextLine();
        return input;
    }
}


