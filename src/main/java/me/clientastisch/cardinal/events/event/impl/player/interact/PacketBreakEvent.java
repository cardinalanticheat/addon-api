package me.clientastisch.cardinal.events.event.impl.player.interact;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PacketBreakEvent extends Event<PacketBreakEvent> {

    /**
     *
     */
    public Object getPacket() {
        return null;
    }

    /**
     *
     */
    public Player getPlayer() {
        return null;
    }

    /**
     *
     */
    public EnumPlayerDigType getAction() {
        return null;
    }

    /**
     *
     */
    public EnumDirection getDirection() {
        return null;
    }

    /**
     *
     */
    public Location getBlockLocation() {
        return null;
    }

    public enum EnumPlayerDigType {

        START_DIGGING,
        CANCELLED_DIGGING,
        FINISHED_DIGGING,
        DROP_ITEM_STACK,
        DROP_ITEM,
        RELEASE_USE_ITEM,
        SWAP_ITEM_WITH_OFFHAND,
        NULL;

    }

    public enum EnumDirection {

        UP,
        DOWN,
        NORTH,
        SOUTH,
        WEST,
        EAST,
        NULL;

    }

}