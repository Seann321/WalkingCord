package walkingcord.states.gameState;

import java.awt.Graphics;
import java.util.ArrayList;
import walkingcord.states.Handler;
import walkingcord.states.gameState.Dot.Type;

public class EntityManager {

    private final ArrayList<Dot> dots;
    private final ArrayList<Dot> newDots;

    private Handler handler;

    public EntityManager(Handler handler) {
        this.handler = handler;
        dots = new ArrayList<>();
        newDots = new ArrayList<>();
    }

    public void tick() {
        dots.clear();
        dots.addAll(newDots);
        for (Dot d : dots) {
            for (Dot t : dots) {
                if (d.bounds.intersects(t.bounds)) {
                    if ((d.type == Type.NORMAL && t.type == Type.NORMAL) || (d.type == Type.WALL && t.type == Type.WALL)) {
                        break;
                    } else {
                        if (d.type == Type.WALL) {
                            t.active = false;
                        } else {
                            d.active = false;
                        }
                    }
                }
            }
            if (!d.active) {
                newDots.remove(d);
            }
            if (d.x > handler.getWidth() || d.x < 0 || d.y > handler.getHeight() || d.y < 0) {
                d.active = false;
            }
            d.tick();
        }
    }

    public void render(Graphics g) {
        for (Dot d : dots) {
            d.render(g);
        }
    }

    public void addDot(Dot d) {
        newDots.add(d);
    }

}
