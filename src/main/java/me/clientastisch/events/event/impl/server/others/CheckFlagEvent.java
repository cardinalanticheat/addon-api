package me.clientastisch.events.event.impl.server.others;

import me.clientastisch.events.event.Event;

/**
 * Will be called right before a flag message will be broadcast  <br />
 * In case this is cancelled no chat message will be send but the
 * violation level changes
 *
 * @author Clientastisch
 * @since CAC v. 0.9992
 */
public abstract class CheckFlagEvent implements Event<CheckFlagEvent> {

    public abstract String getCategory();

    public abstract String getCheckName();

    public abstract String getPunishment();

    public abstract boolean isPunishable();

    public abstract boolean isHidden();

    public abstract int getViolation();

}
