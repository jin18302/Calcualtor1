package Calcuatorpackge.CalculatorLevel3;

public enum OperatorType {
    ADD("+"),
    SUBTRACT("-"),
    MULTI("*"),
    DIVIDE("/");

    final String op;

    OperatorType(String op) {
        this.op = op;
    }

    public static OperatorType getSymbol(String op){//입력받은 op에 따라 symbol을 반환
        return switch (op) {
            case "+" -> ADD;
            case "-" -> SUBTRACT;
            case "*" -> MULTI;
            case "/" -> DIVIDE;
            default -> throw new UnsupportedOperationException("지원하지 않는 연산자입니다");
        };
    }
}