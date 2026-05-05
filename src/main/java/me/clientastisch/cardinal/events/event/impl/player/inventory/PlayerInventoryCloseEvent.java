package me.clientastisch.cardinal.events.event.impl.player.inventory;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;

/**
 * @author Clientastisch
 * @since CAC v. 5.0.0
 */
public abstract class PlayerInventoryCloseEvent implements Event<PlayerInventoryCloseEvent> {

    /**
     *
     */
    public abstract Player getPlayer();

    /**
     *
     */
    public abstract Object getPacket();

    /**
     *
     */
    public abstract Object getInventoryView();

    /**
     *
     */
    public abstract Object getInventory();

}