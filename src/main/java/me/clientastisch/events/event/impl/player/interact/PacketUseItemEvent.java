package me.clientastisch.events.event.impl.player.interact;

import me.clientastisch.events.event.Event;
import org.bukkit.inventory.ItemStack;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketUseItemEvent implements Event<PacketUseItemEvent> {

    public abstract ItemStack getItem();

}
