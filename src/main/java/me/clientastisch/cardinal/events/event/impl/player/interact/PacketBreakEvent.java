package me.clientastisch.cardinal.events.event.impl.player.interact;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketBreakEvent implements Event<PacketBreakEvent> {

    /**
     *
     */
    public abstract Object getPacket();

    /**
     *
     */
    public abstract Player getPlayer();

    /**
     *
     */
    public abstract EnumPlayerDigType getAction();

    /**
     *
     */
    public abstract EnumDirection getDirection();

    /**
     *
     */
    public abstract Location getBlockLocation();

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