package Calcuatorpackge.CalculatorLevel3;

import java.util.LinkedList;


public class History {
   private LinkedList<Number> list = new LinkedList<>();

    void setHistory(Number value){
        list.add(value);
    }

    void getHistory(){
        System.out.println(list.toString());
    }

    void deleteHistory(){
        list.remove(0);
    }

    void findValuesGreaterThan(Number value){//value보다 큰값을 조회
        list.stream().filter(i->value.doubleValue()<i.doubleValue())
                                             .forEach(System.out::println);
    }
}

