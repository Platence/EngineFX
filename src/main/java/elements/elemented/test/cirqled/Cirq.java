package elements.elemented.test.cirqled;

import elements.EleFX;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

public class Cirq extends EleFX {

    private final Circle circle;
    private int lastSideMove;        // 1 2 3 4
    private int pointedR;           // move pixel
    private final DoingMove dm;    // moveMethod (TEST)

    public Cirq() {
        this.circle = new Circle();
        super.setPositionX(500);
        super.setPositionY(500);
        dm = new DoingMove();
    }

    @Override
    public void setMaths() {
        if (lastSideMove == 0) {
            try {
                SecureRandom sr = SecureRandom.getInstance("SHA1PRNG", "SUN");
                lastSideMove = sr.nextInt(9);
                pointedR     = sr.nextInt(4);
                pointedR+=1;
            } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
                e.printStackTrace();
            }
            setMaths();
        }

        dm.mova(this,lastSideMove,this);
    }

    @Override
    public void setXYEle() {
        circle.setLayoutX(super.getPositionX());
        circle.setLayoutY(super.getPositionY());
    }

    @Override
    public Node getNode() {
        return circle;
    }

    public void setStartParam() {
        circle.setRadius(20);
        circle.setLayoutX(super.getPositionX());
        circle.setLayoutY(super.getPositionY());
        circle.setFill(Color.RED);
    }

    public Circle getCircle() {
        return circle;
    }

    public void setLastSideMove(int lastSideMove) {
        this.lastSideMove = lastSideMove;
    }

    public int getPointedR() {
        return pointedR;
    }
}
