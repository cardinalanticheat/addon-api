package me.clientastisch.events.event.impl.player.movement;

import me.clientastisch.events.event.Event;
import org.bukkit.Location;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketMoveEvent implements Event<PacketMoveEvent> {

    public abstract Location getTo();

    public abstract Location getFrom();

    public abstract double getDeltaXZ();

    public abstract double getDeltaY();

    public abstract double getDeltaXYZ();

    public abstract double getDeltaX();

    public abstract double getDeltaZ();

    public abstract boolean isOnground();

    public abstract boolean isOptifine();

}
