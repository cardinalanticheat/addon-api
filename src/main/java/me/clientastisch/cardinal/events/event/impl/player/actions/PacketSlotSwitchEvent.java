package me.clientastisch.cardinal.events.event.impl.player.actions;

import me.clientastisch.cardinal.events.event.Event;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketSlotSwitchEvent implements Event<PacketSlotSwitchEvent> {

    public abstract int getSlot();

    public abstract long getLastSlot();

    public abstract long getDelay();

}
