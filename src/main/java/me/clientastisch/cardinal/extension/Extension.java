package me.clientastisch.cardinal.extension;

import java.util.List;
import me.clientastisch.cardinal.extension.impl.Addon;
import me.clientastisch.cardinal.extension.impl.command.Command;
import me.clientastisch.cardinal.extension.impl.dialects.PunishDialect;
import me.clientastisch.cardinal.extension.impl.dialects.ViolationDialect;
import me.clientastisch.cardinal.extension.impl.event.EventListener;
import org.bukkit.event.Listener;

/**
 * @author Clientastisch
 * @since CAC v. 0.9945
 */
public abstract class Extension {

    /**
     * Register a cardinal event
     *
     * @param addon addon
     * @param listener event
     */
    public static void registerListener(Addon addon, EventListener listener) {}

    /**
     * Unregister a cardinal event
     *
     * @param addon addon
     * @param listener event
     */
    public static void unregisterListener(Addon addon, EventListener listener) {}

    /**
     * Register a cardinal event
     *
     * @param addon addon
     * @param listener event
     */
    public static void registerListener(Addon addon, Listener listener) {}

    /**
     * Unregister a cardinal event
     *
     * @param addon addon
     * @param listener event
     */
    public static void unregisterListener(Addon addon, Listener listener) {}

    /**
     * Register a bukkit command
     *
     * @param addon addon
     * @param command implementation of command
     */
    public static void registerCommand(Addon addon, Command command) {}

    /**
     * Unregister a bukkit command
     *
     * @param addon addon
     * @param command implementation of command
     */
    public static void unregisterCommand(Addon addon, Command command) {}

    /**
     * Register a punish dialect.
     *
     * @param addon addon
     * @param dialect implementation of punish dialect
     */
    public static void registerDialect(Addon addon, PunishDialect dialect) {}

    /**
     * Unregister a punish dialect.
     *
     * @param addon addon
     * @param dialect implementation of punish dialect
     */
    public static void unregisterDialect(Addon addon, PunishDialect dialect) {}

    /**
     * Register a punish dialect.
     *
     * @param addon addon
     * @param dialect implementation of punish dialect
     */
    public static void registerDialect(Addon addon, ViolationDialect dialect) {}

    /**
     * Unregister a punish dialect.
     *
     * @param addon addon
     * @param dialect implementation of punish dialect
     */
    public static void unregisterDialect(Addon addon, ViolationDialect dialect) {}

    /**
     * Check if an addon is loaded by name
     *
     * @param addon addon
     * @return true if addon could be found and is loaded
     */
    public abstract boolean isLoaded(String addon);

}