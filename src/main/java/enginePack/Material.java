package enginePack;

import elements.AllElements;
import elements.EleFX;

public class Material {

    public void calculateElem(AllElements allElements){
        setmathes(allElements);
        setMAStrike(allElements);
    }

    // Обработчик перемещений объектов (без отрисовки)
    private void setmathes(AllElements allElements) {
        for (EleFX x : allElements.getListElements()) {
            x.setMaths();
        }
    }

    // Обработчик столкновений
    private void setMAStrike(AllElements allElements){
        // NONE
    }
}
