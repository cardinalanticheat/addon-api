package me.clientastisch.events.event.impl.player.inventory;

import me.clientastisch.events.event.Event;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PlayerCloseInvEvent implements Event<PlayerCloseInvEvent> {

    public abstract Inventory getInventory();

    public abstract InventoryView getInventoryView();

}
