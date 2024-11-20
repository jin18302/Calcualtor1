package Calcuatorpackge.CalculatorLevel3;

public class Calculator<T extends Number> {
    History history = new History();


    T add(T n1, T n2) {
        Double result = n1.doubleValue() + n2.doubleValue();
        T value = (T) result;
        history.setHistory(value);
        return value;
    }

    T SubStract(T n1, T n2) {
        Double result = n1.doubleValue() - n2.doubleValue();
        T value = (T) result;
        history.setHistory(value);
        return value;
    }

    T Multiply(T n1, T n2) {
        Double result = n1.doubleValue() * n2.doubleValue();
        T value = (T) result;
        history.setHistory(value);
        return value;
    }

    T Divide(T n1, T n2) {
        Double result = n1.doubleValue() / n2.doubleValue();
        T value = (T) result;
        history.setHistory(value);
        return value;
    }
}
