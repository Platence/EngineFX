package elements.elemented.test.cirqled;

import javafx.scene.paint.Color;

public class ChangeColor {


    public void changeColor(Cirq x, int d){
        switch (d){
            case 1: x.getCircle().setFill(Color.RED); break;
            case 2: x.getCircle().setFill(Color.BLACK); break;
            case 3: x.getCircle().setFill(Color.GREEN); break;
            case 4: x.getCircle().setFill(Color.BEIGE); break;
        }
    }
}
