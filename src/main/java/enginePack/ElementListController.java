package enginePack;

import contr.ControllerRol;
import elements.AllElements;
import elements.EleFX;
import javafx.scene.Node;

public class ElementListController {

    private static AllElements allElements;
    private static ControllerRol ctrS;

    public ElementListController(EleFX fx){
        if (null!=fx.getNode()){
            addOneElement(fx);
        }
        else {
            System.out.println("Can't be add... cause your element is NULL");
        }
    }

    public ElementListController (AllElements allElementsT,ControllerRol ctr){
        allElements = allElementsT;      // link on final
        ctrS = ctr;                     //  link on final
        addToPaneElem(allElements,ctr);
    }

    private void addToPaneElem(AllElements allElements, ControllerRol ctr) {
        ctr.getMainPane().getChildren().clear();

        for (EleFX x : allElements.getListElements()) {
            ctr.getMainPane().getChildren().add(x.getNode());
        }
        System.out.println("All element was add  : ");
        System.out.println(ctr.getMainPane().getChildren().size() + " <- size list now");
    }

    private void addOneElement(EleFX fx){
        allElements.getListElements().add(fx);
        ctrS.getMainPane().getChildren().add(fx.getNode());
    }


}
