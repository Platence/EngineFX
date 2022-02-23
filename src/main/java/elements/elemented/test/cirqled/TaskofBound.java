package elements.elemented.test.cirqled;

import elements.EleFX;
import start.StartEngine;

public class TaskofBound {

    private static final int boundsC = 30; // R Shape + 10


    // В случае столкновения с краями, оттолкнуть обратно
    public int getBoundCount(EleFX fx, int count){
        if(fx.getPositionX()<=boundsC){
             count = count == DoingMove.LEFT_AND_DOWN ? DoingMove.RIGHT_AND_UP : count ;
             count = count == DoingMove.ONLY_LEFT ? DoingMove.ONLY_RIGTH : count;
             count = count == DoingMove.LEFT_AND_UP ? DoingMove.RIGHT_AND_DOWN : count;
            return count;
        }
        if(fx.getPositionX()>=StartEngine.MAXSIZEXY-boundsC){
            count = count == DoingMove.RIGHT_AND_DOWN ? DoingMove.LEFT_AND_UP : count ;
            count = count == DoingMove.ONLY_RIGTH ? DoingMove.ONLY_LEFT : count;
            count = count == DoingMove.RIGHT_AND_UP ? DoingMove.LEFT_AND_DOWN : count;
            return count;
        }

        if(fx.getPositionY()<=boundsC){
            count = count == DoingMove.ONLY_UP ? DoingMove.ONLY_DOWN : count ;
            count = count == DoingMove.LEFT_AND_UP ? DoingMove.RIGHT_AND_DOWN : count;
            count = count == DoingMove.RIGHT_AND_UP ? DoingMove.LEFT_AND_UP : count;
            return count;
        }
        if(fx.getPositionY()>=StartEngine.MAXSIZEXY-boundsC){
            count = count == DoingMove.RIGHT_AND_DOWN ? DoingMove.LEFT_AND_UP : count ;
            count = count == DoingMove.ONLY_DOWN ? DoingMove.ONLY_UP : count;
            count = count == DoingMove.LEFT_AND_DOWN ? DoingMove.RIGHT_AND_UP : count;
            return count;
        }
        return count;
    }

}
