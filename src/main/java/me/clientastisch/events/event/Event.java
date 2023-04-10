package me.clientastisch.events.event;

import io.netty.channel.Channel;
import me.clientastisch.controller.PlayerController;
import org.bukkit.entity.Player;

import java.util.UUID;

/**
 * @author Clientastisch
 * @since CAC v. 0.9978
 */
public interface Event<T extends Event> {

    Object getPacket();

    Player getPlayer();

    Channel getPipeline();

    PlayerController getController();

    UUID getUUID();

    void cancelled();

    void continued();

    boolean isContinue();

    boolean isCancelled();

}
