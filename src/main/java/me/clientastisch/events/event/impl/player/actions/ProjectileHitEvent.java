package me.clientastisch.events.event.impl.player.actions;

import me.clientastisch.events.event.Event;
import org.bukkit.entity.Entity;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public abstract class ProjectileHitEvent implements Event<ProjectileHitEvent> {

    public abstract Entity getEntity();

}
