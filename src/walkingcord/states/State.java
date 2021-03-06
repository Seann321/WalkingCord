package walkingcord.states;

import java.awt.Graphics;
import walkingcord.gfx.GUI;
import walkingcord.gfx.UIObject;


public abstract class State {

    public static State currentState = null;
    protected Handler handler;

    public State(Handler handler) {
        this.handler = handler;
    }

    public abstract void tick();

    public abstract void render(Graphics g);

    public void addText(GUI gui, UIObject x) {
        x.handler = handler;
        gui.addText(x);
    }
}
