package me.clientastisch.cardinal.events.event.impl.player.interact;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * @author Clientastisch
 * @since CAC v. 0.9996
 */
public abstract class PacketPlaceEvent implements Event<PacketPlaceEvent> {

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
    public abstract Object getItemStack();

    /**
     *
     */
    public abstract Location getBlockLocation();

    /**
     *
     */
    public abstract Object getCursorPosition();

    /**
     *
     */
    public abstract Object getFace();

    /**
     *
     */
    public abstract int getActionId();

}