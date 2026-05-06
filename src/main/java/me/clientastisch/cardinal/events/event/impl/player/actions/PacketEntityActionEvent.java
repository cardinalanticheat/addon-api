package me.clientastisch.cardinal.events.event.impl.player.actions;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PacketEntityActionEvent extends Event<PacketEntityActionEvent> {

    /**
     *
     */
    public Player getPlayer() {
        return null;
    }

    /**
     *
     */
    public Object getPacket() {
        return null;
    }

    /**
     *
     */
    public EnumPlayerAction getAction() {
        return null;
    }

    /**
     *
     */
    public int getEntityId() {
        return 0;
    }

    public enum EnumPlayerAction {

        START_SNEAKING,
        STOP_SNEAKING,
        START_SPRINTING,
        STOP_SPRINTING,
        LEAVE_BED,
        START_FLYING_WITH_ELYTRA,
        NULL;

    }

}