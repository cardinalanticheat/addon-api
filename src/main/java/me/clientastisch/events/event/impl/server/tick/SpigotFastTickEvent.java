package me.clientastisch.events.event.impl.server.tick;

import me.clientastisch.events.event.Event;

/**
 * Will be called every 50 milliseconds
 *
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class SpigotFastTickEvent implements Event<SpigotFastTickEvent> {

    public abstract long getState();

}
