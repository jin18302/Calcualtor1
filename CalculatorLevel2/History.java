package Calcuatorpackge.CalculatorLevel2;

import java.util.LinkedList;

public class History {

    LinkedList<Integer> list = new LinkedList<>();
    int size = list.size();

    void setHistory(int value){
        list.add(value);
    }

    void getHistory(){
        System.out.println(list.toString());
    }

    void deleteHistory(){
        list.remove(0);
    }
}
