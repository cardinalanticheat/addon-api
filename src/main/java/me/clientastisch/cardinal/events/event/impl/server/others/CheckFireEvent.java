package me.clientastisch.cardinal.events.event.impl.server.others;

import me.clientastisch.cardinal.checks.Checks;
import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * Will be called before a flag gets invoked <br />
 * In case this is cancelled no violation will be stored and the
 * violation level remains unchanged
 *
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class CheckFireEvent implements Event<CheckFireEvent> {

    /**
     *
     */
    public abstract String getPunishment();

    /**
     *
     */
    public abstract boolean isPunishable();

    /**
     *
     */
    public abstract boolean isHidden();

    /**
     *
     */
    public abstract String getCategory();

    /**
     *
     */
    public abstract String getCheckName();

    /**
     *
     */
    public abstract int getViolation();

    /**
     *
     */
    public abstract Player getPlayer();

    /**
     *
     */
    public abstract Object getPacket();

}