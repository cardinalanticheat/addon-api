package me.clientastisch.cardinal.events.event.impl.player.others;

import java.util.List;
import me.clientastisch.cardinal.events.event.Event;
import org.bukkit.entity.Player;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class PacketMetadataUpdateEvent extends Event<PacketMetadataUpdateEvent> {

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
    public int getEntityId() {
        return 0;
    }

    /**
     *
     */
    public List<Object> getWatchable() {
        return null;
    }

}