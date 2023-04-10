package me.clientastisch.events.event.impl.player.movement;

import me.clientastisch.events.event.Event;
import org.bukkit.Location;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PlayerMoveEvent implements Event<PlayerMoveEvent> {

    public abstract Location getFrom();

    public abstract Location getTo();

    public abstract double getDeltaXZ();

    public abstract double getDeltaY();

    public abstract double getDeltaXYZ();

    public abstract double getDeltaX();

    public abstract double getDeltaZ();

}
