package me.clientastisch.events.event.impl.server.others;

import me.clientastisch.events.event.Event;

/**
 * Will be called before a flag gets invoked <br />
 * In case this is cancelled no violation will be stored and the
 * violation level remains unchanged
 *
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class CheckFireEvent implements Event<CheckFireEvent> {

    public abstract String getCategory();

    public abstract String getCheckName();

    public abstract String getPunishment();

    public abstract boolean isPunishable();

    public abstract boolean isHidden();

    public abstract int getViolation();

}
