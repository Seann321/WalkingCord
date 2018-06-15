package walkingcord.states;

import walkingcord.Display;
import walkingcord.Main;
import walkingcord.controls.KeyManager;
import walkingcord.controls.MouseManager;
import walkingcord.gfx.GUI;

public class Handler {

    private Main main;

    public Handler(Main main) {
        this.main = main;
    }

    public MouseManager getMM() {
        return main.getMouseManager();
    }
    
    public KeyManager getKM() {
        return main.getKeyManager();
    }

    public State getCurrentState() {
        return State.currentState;
    }

    public int getHeight() {
        return main.getHeight();
    }

    public int getWidth() {
        return main.getWidth();
    }

    public void setHeight(int x) {
        main.setHeight(x);
    }

    public void setWidth(int x) {
        main.setWidth(x);
    }

    public GUI getCurrentGUI() {
        return GUI.currentGUI;
    }

    public Display getDisplay() {
        return main.getDisplay();
    }

}
