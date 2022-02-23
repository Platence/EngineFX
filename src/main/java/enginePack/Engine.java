package enginePack;

import contr.ControllerRol;
import elements.AllElements;
import elements.EleFX;
import javafx.concurrent.Task;

public class Engine extends Task {

    private final ControllerRol ctr;                       // Main controller
    private final Material material = new Material();     // Math include
    private final PictureMA pictureMA = new PictureMA(); // View include

    public Engine(ControllerRol ctr) {
        this.ctr = ctr;
        Thread thread = new Thread(this);
        thread.start();
        System.out.println("Thread Engine was init");
    }


    protected Object call() throws Exception {

        AllElements allElements = new AllElements();
        // Init All Elements of your program
        new ElementListController(allElements,ctr);
        // add to main pane all NODES
        // IF You need add One New Element With NODE
        // Take construction :
        // new ElementListController(EleFx fx);
        // it was add automatically

        long xCurrentTrash = 0;
        long treshold = 30;    // ms (1000/30)

        while (true) {

            if (xCurrentTrash >= treshold) {
                material.calculateElem(allElements);
                pictureMA.setViewS(allElements);
                xCurrentTrash = 0;
            }

            xCurrentTrash++;
            Thread.sleep(1);
        } // engine ciq

    }


}
