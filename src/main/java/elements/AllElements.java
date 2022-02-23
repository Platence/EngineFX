package elements;

import elements.elemented.test.cirqled.Cirq;

import java.util.ArrayList;

public class AllElements {
    private final ArrayList<EleFX> listElements = new ArrayList<>();

    public AllElements() {
        initAllElements();
    }

    public ArrayList<EleFX> getListElements() {
        return listElements;
    }

    private void initAllElements(){
        // TEST INIT
        for (int i = 0 ; i < 100; i++){
            Cirq cirq = new Cirq();
            cirq.setStartParam();
            listElements.add(cirq);
        }
    }
}
