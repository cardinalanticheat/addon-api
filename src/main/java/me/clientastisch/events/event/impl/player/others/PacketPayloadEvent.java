package me.clientastisch.events.event.impl.player.others;

import me.clientastisch.events.event.Event;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class PacketPayloadEvent implements Event<PacketPayloadEvent> {

    public abstract String getMessage();

    public abstract String getChannel();

}

