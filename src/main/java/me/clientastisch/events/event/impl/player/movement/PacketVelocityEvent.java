package me.clientastisch.events.event.impl.player.movement;

import me.clientastisch.events.event.Event;
import org.bukkit.util.Vector;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketVelocityEvent implements Event<PacketVelocityEvent> {

    public abstract Vector getVector();

    public abstract double getVertical();

    public abstract double getHorizontal();

    public abstract int getEntityID();

}
