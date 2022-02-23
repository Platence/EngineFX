package enginePack;

import elements.AllElements;
import elements.EleFX;

public class PictureMA {

    // Обработчик отрисовки объектов
    public void setViewS(AllElements allElements) {
        for (EleFX x : allElements.getListElements()) {
            x.setXYEle();
        }
    }
}
