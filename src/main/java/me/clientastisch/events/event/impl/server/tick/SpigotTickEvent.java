package me.clientastisch.events.event.impl.server.tick;

import me.clientastisch.events.event.Event;

/**
 * Will be called each 1000 milliseconds
 *
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class SpigotTickEvent implements Event<SpigotTickEvent> {

    public abstract long getState();

}
