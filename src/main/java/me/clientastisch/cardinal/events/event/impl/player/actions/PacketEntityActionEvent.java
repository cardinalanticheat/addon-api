package me.clientastisch.cardinal.events.event.impl.player.actions;

import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author Clientastisch
 * @since CAC v. 1.0
 */
public abstract class PacketEntityActionEvent implements Event<PacketEntityActionEvent> {

    /**
     *
     */
    public abstract Player getPlayer();

    /**
     *
     */
    public abstract Object getPacket();

    /**
     *
     */
    public abstract EnumPlayerAction getAction();

    /**
     *
     */
    public abstract int getEntityId();

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