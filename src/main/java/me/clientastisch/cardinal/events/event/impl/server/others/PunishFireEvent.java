package me.clientastisch.cardinal.events.event.impl.server.others;

import me.clientastisch.cardinal.events.event.Event;

/**
 * Will be called if a player should be punished because of a flag <br />
 * SILENT, SETBACK, DAMAGE, VELOCITY, SLOT, BLINDNESS, ATTACK_CANCEL, DAMAGE_CANCEL, NONE
 *
 * @author Clientastisch
 * @since CAC v. 0.9978
 */
public abstract class PunishFireEvent implements Event<PunishFireEvent> {

    public abstract String getPunishment();

    public abstract String getCategory();

    public abstract String getCheckName();

}
