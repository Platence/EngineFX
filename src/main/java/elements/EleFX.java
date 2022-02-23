package elements;

import enginePack.interf.MathOS;
import enginePack.interf.ViewEle;
import javafx.scene.image.Image;

public abstract class EleFX implements MathOS, ViewEle {

    private Image image;
    private int positionX;
    private int positionY;


    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}
