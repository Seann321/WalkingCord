package walkingcord.states;

import walkingcord.Display;
import walkingcord.Main;
import walkingcord.gfx.GUI;

public class Handler {

    private Main main;

    public Handler(Main main) {
        this.main = main;
    }

    public void switchToGameState() {
        State.currentState = main.getGameState();
        GUI.currentGUI = main.getGameState().gui;
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
