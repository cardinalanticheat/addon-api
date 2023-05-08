package me.clientastisch.events.event.impl.server.tick;

import me.clientastisch.events.event.Event;

/**
 * Will be called every 1000 milliseconds
 *
 * @author Clientastisch
 * @since CAC v. 3.0.0
 */
public abstract class SpigotSecondEvent implements Event<SpigotSecondEvent> {

    public abstract long getState();

}
