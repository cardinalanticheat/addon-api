package me.clientastisch.cardinal.extension;

import me.clientastisch.cardinal.extension.impl.Addon;
import me.clientastisch.cardinal.extension.impl.command.Command;
import me.clientastisch.cardinal.extension.impl.dialects.PunishDialect;
import me.clientastisch.cardinal.extension.impl.dialects.ViolationDialect;
import me.clientastisch.cardinal.extension.impl.event.EventListener;
import org.bukkit.event.Listener;

import java.util.List;

/**
 * @author Clientastisch
 * @since CAC v. 0.9945
 */
public class Extension {

    /**
     * @param addon Main-class of the extension
     * @param listener Anticheat event listener
     */
    public static void registerListener(Addon addon, EventListener listener) {
    }

    /**
     * @param addon Main-class of the extension
     * @param listener Bukkit event listener
     */
    public static void registerListener(Addon addon, Listener listener) {
    }

    /**
     * @param addon Main-class of the extension
     * @param listener Anticheat event listener
     */
    public static void unregisterListener(Addon addon, EventListener listener) {
    }

    /**
     * @param addon Main-class of the extension
     * @param listener Bukkit event listener
     */
    public static void unregisterListener(Addon addon, Listener listener) {
    }

    /**
     * @param addon Main-class of the extension
     * @param command Command listener
     */
    public static void registerCommand(Addon addon, Command command) {
    }

    /**
     * @param addon Main-class of the extension
     * @param command Command listener
     */
    public static void unregisterCommand(Addon addon, Command command) {
    }

    /**
     * @param addon Main-class of the extension
     * @param dialect Database dialect
     */
    public static void registerDialect(Addon addon, PunishDialect dialect) {
    }

    /**
     * @param addon Main-class of the extension
     * @param dialect Database dialect
     */
    public static void unregisterDialect(Addon addon, PunishDialect dialect) {
    }

    /**
     * @param addon Main-class of the extension
     * @param dialect Database dialect
     */
    public static void registerDialect(Addon addon, ViolationDialect dialect) {
    }

    /**
     * @param addon Main-class of the extension
     * @param dialect Database dialect
     */
    public static void unregisterDialect(Addon addon, ViolationDialect dialect) {
    }

    /**
     * Get a list of all loaded addons
     *
     * @return List of loaded addons
     */
    public List<AddonInfo> getAddons() {
        return null;
    }

    /**
     * Check if a addon is loaded
     *
     * @param addon Name of the addon
     * @return whether the addon is loaded
     */
    public boolean isLoaded(String addon) {
        return false;
    }
}
