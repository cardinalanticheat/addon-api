package me.clientastisch.cardinal.events.event.impl.player.inventory;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PlayerOpenInvEvent implements Event<PlayerOpenInvEvent> {

    public abstract Inventory getInventory();

    public abstract InventoryView getInventoryView();

}
