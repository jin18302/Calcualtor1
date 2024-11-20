package Calcuatorpackge.CalculatorLevel1;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {

        int Num1;
        int Num2;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("첫번째 값을 입력해주세요 >>");

            try{
                Num1 = scanner.nextInt();
            } catch (Exception e) {
                throw new RuntimeException("유효하지 않은 값입니다");
            }finally {
                scanner.nextLine();//nextInt뒤에 공백을 연산자로 받지 않게하기 위해
            }



            System.out.println("연산자를 입력해주세요 >>");
            String op = scanner.nextLine();
            if(!(op.length()==1&&"+-*/".contains(op))){//길이가 1이 아니고, 유효한 연산자가 아니면 예외 생성
                throw new UnsupportedOperationException("지원하지 않는 기능입니다");
            }

            System.out.println("두번째 값을 입력해주세요>>");
            try{
                Num2 = scanner.nextInt();
            } catch (Exception e) {
                throw new RuntimeException("유효하지 않은 값입니다");
            }




            if (op.equals("+")) {//op타입에 따라서 연산
                System.out.println("결과값="+(Num1 + Num2));
            } else if (op.equals("-")) {
                System.out.println("결과값="+(Num1 - Num2));
            } else if (op.equals("*")) {
                System.out.println("결과값="+(Num1 * Num2));
            } else if (op.equals("/")) {
                if (Num2 == 0) {
                    System.out.println(Num1 + "을 0으로 나눌 수없습니다");
                } else {
                    System.out.println("결과값" + (Num1 / Num2));
                }
            }


                System.out.println("계산을 계속하시려면 0, 종료하시려면 exit를 입력해주세요");
                scanner.nextLine();
                String input = scanner.nextLine();
                if(input.equals("exit")){
                    System.out.println("시스템이 종료됩니다");
                    System.exit(0);
                }
                else if(input.equals("0")) continue;
                }
            }
        }

