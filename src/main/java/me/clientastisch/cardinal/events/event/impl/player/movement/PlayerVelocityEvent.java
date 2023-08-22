package me.clientastisch.cardinal.events.event.impl.player.movement;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.util.Vector;

public abstract class PlayerVelocityEvent implements Event<PlayerVelocityEvent> {

    public abstract void setVector(Vector vector);

    public abstract double getHorizontal();

    public abstract double getVertical();

    public abstract Vector getVector();

}
