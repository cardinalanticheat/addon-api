package me.clientastisch.cardinal.events.event.impl.server.others;

import me.clientastisch.cardinal.checks.Checks;
import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author Clientastisch
 * @since CAC v. 1.0
 */
public abstract class BanFireEvent implements Event<BanFireEvent> {

    /**
     *
     */
    public abstract Object getPacket();

    /**
     *
     */
    public abstract Player getPlayer();

    /**
     *
     */
    public abstract Checks getCheck();

}