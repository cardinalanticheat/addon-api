package me.clientastisch.cardinal.events.event.impl.player.inventory;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PlayerInventoryCloseEvent extends Event<PlayerInventoryCloseEvent> {

    /**
     *
     */
    public Player getPlayer() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public Object getPacket() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public Object getInventoryView() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     *
     */
    public Object getInventory() {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

}