package me.clientastisch.events.event.impl.player.actions;

import me.clientastisch.events.event.Event;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketSwingEvent implements Event<PacketSwingEvent> {

    public abstract long getDelay();

}
