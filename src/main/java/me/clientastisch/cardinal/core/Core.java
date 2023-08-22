package me.clientastisch.cardinal.core;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Clientastisch
 * @since CAC v. 0.9958
 */
public class Core {

    /**
     * Sometimes it's necessary to be capable of getting
     * the spigot reference.
     */
    public static final Core INSTANCE = null;

    /**
     * The JavaPlugin instance which is necessary if you
     * want to register something.
     */
    public final JavaPlugin plugin = null;

    /**
     * The replayID cannot be changed during a session.
     * It can't be changed in general and will be generated randomly.
     *
     * @return returns the current replay id
     */
    public String getReplayID() {
        return null;
    }
}
