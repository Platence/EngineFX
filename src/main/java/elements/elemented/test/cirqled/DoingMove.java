package elements.elemented.test.cirqled;

import elements.EleFX;

public class DoingMove {

    // Тест реализация

    public static int RIGHT_AND_DOWN = 1;
    public static int LEFT_AND_DOWN = 2;
    public static int ONLY_DOWN = 3;
    public static int ONLY_UP = 4;
    public static int LEFT_AND_UP = 5;
    public static int RIGHT_AND_UP = 6;
    public static int ONLY_LEFT = 7;
    public static int ONLY_RIGTH = 8;

    public void mova(EleFX eleFX, int count, Cirq current) {

        int temp = new TaskofBound().getBoundCount(eleFX, count);
        if (temp != count) {
            current.setLastSideMove(temp);
            count = temp;
        }
        switch (count) {
            case 1:
                eleFX.setPositionX(eleFX.getPositionX() + current.getPointedR());
                eleFX.setPositionY(eleFX.getPositionY() + current.getPointedR());
                // Вправо и вниз
                break;
            case 2:
                eleFX.setPositionX(eleFX.getPositionX() - current.getPointedR());
                eleFX.setPositionY(eleFX.getPositionY() + current.getPointedR());
                // Влево и вниз
                break;
            case 3:
                eleFX.setPositionX(eleFX.getPositionX());
                eleFX.setPositionY(eleFX.getPositionY() + current.getPointedR());
                // Только вниз
                break;
            case 4:
                eleFX.setPositionX(eleFX.getPositionX());
                eleFX.setPositionY(eleFX.getPositionY() - current.getPointedR());
                // Только вверх
                break;

            case 5:
                eleFX.setPositionX(eleFX.getPositionX() - current.getPointedR());
                eleFX.setPositionY(eleFX.getPositionY() - current.getPointedR());
                // влево вверх
                break;
            case 6:
                eleFX.setPositionX(eleFX.getPositionX() + current.getPointedR());
                eleFX.setPositionY(eleFX.getPositionY() - current.getPointedR());
                // вверх и вправо
                break;
            case 7:
                eleFX.setPositionX(eleFX.getPositionX() - current.getPointedR());
                eleFX.setPositionY(eleFX.getPositionY());
                // Только влево
                break;
            case 8:
                eleFX.setPositionX(eleFX.getPositionX() + current.getPointedR());
                eleFX.setPositionY(eleFX.getPositionY());
                // только вправо
                break;
            default:
        }

    }
}
