package me.clientastisch.cardinal.events.event.impl.player.others;

import java.util.Collections;
import java.util.List;
import lombok.Getter;
import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author Clientastisch
 * @since CAC v. 1.0
 */
public abstract class PacketMetadataUpdateEvent implements Event<PacketMetadataUpdateEvent> {

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
    public abstract int getEntityId();

    /**
     *
     */
    public abstract List<Object> getWatchable();

}