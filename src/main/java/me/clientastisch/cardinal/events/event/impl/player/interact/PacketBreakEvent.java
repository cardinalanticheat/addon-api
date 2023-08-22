package me.clientastisch.cardinal.events.event.impl.player.interact;


import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.Location;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketBreakEvent implements Event<PacketBreakEvent> {

    public abstract Location getBlockLocation();

    public abstract EnumPlayerDigType getAction();

    public abstract EnumDirection getDirection();

    public static enum EnumPlayerDigType {
        START_DESTROY_BLOCK, ABORT_DESTROY_BLOCK, STOP_DESTROY_BLOCK, DROP_ALL_ITEMS, DROP_ITEM, RELEASE_USE_ITEM, NULL
    }

    public static enum EnumDirection {
        UP, DOWN, NORTH, SOUTH, WEST, EAST, NULL
    }
}
