package me.clientastisch.cardinal.events.event.impl.server.others;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.clientastisch.cardinal.checks.Checks;
import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * Will be called for each stuff that will receive a flag message
 *
 * @author Clientastisch
 * @since CAC v. 4.0.0
 */
public abstract class NotifyFlagEvent implements Event<NotifyFlagEvent> {

    public abstract Player getSuspect();

    public abstract Checks getChecks();
    
}
