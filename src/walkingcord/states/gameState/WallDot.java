package walkingcord.states.gameState;

import java.awt.Color;

public class WallDot extends Dot {

    public WallDot(int x, int y) {
        super(x, y, Color.white);
        type = Type.WALL;
    }

    @Override
    public void tick() {
        updateBounds();
    }

}
