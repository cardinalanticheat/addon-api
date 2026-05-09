package me.clientastisch.cardinal.extension;

import me.clientastisch.cardinal.extension.impl.Addon;
import me.clientastisch.cardinal.extension.impl.command.Command;
import me.clientastisch.cardinal.extension.impl.dialects.PunishDialect;
import me.clientastisch.cardinal.extension.impl.dialects.ViolationDialect;
import me.clientastisch.cardinal.extension.impl.event.EventListener;
import org.bukkit.event.Listener;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public class Extension {

    /**
     * Register a cardinal event
     *
     * @param addon addon
     * @param listener event
     */
    public static void registerListener(Addon addon, EventListener listener) {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     * Unregister a cardinal event
     *
     * @param addon addon
     * @param listener event
     */
    public static void unregisterListener(Addon addon, EventListener listener) {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     * Register a cardinal event
     *
     * @param addon addon
     * @param listener event
     */
    public static void registerListener(Addon addon, Listener listener) {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     * Unregister a cardinal event
     *
     * @param addon addon
     * @param listener event
     */
    public static void unregisterListener(Addon addon, Listener listener) {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     * Register a bukkit command
     *
     * @param addon addon
     * @param command implementation of command
     */
    public static void registerCommand(Addon addon, Command command) {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     * Unregister a bukkit command
     *
     * @param addon addon
     * @param command implementation of command
     */
    public static void unregisterCommand(Addon addon, Command command) {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     * Register a punish dialect.
     *
     * @param addon addon
     * @param dialect implementation of punish dialect
     */
    public static void registerDialect(Addon addon, PunishDialect dialect) {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     * Unregister a punish dialect.
     *
     * @param addon addon
     * @param dialect implementation of punish dialect
     */
    public static void unregisterDialect(Addon addon, PunishDialect dialect) {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     * Register a punish dialect.
     *
     * @param addon addon
     * @param dialect implementation of punish dialect
     */
    public static void registerDialect(Addon addon, ViolationDialect dialect) {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     * Unregister a punish dialect.
     *
     * @param addon addon
     * @param dialect implementation of punish dialect
     */
    public static void unregisterDialect(Addon addon, ViolationDialect dialect) {
        throw new IllegalStateException("Implementation is provided by runtime");
    }

    /**
     * Check if an addon is loaded by name
     *
     * @param addon addon
     * @return true if addon could be found and is loaded
     */
    public boolean isLoaded(String addon) {
        return false;
    }

}