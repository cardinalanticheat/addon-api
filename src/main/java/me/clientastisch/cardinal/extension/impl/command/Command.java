package me.clientastisch.cardinal.extension.impl.command;

import org.bukkit.command.CommandSender;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
public interface Command {

    /**
     * Implement a command hook that will be executed by cardinal for custom commands.
     * Here an example for the parameters when running the command "cac flag"
     *
     * @param sender the command sender (player or console)
     * @param command the command e.g. "cac"
     * @param args array of arguments e.g. ["cac", "flag"]
     * @param raw the raw string e.g. "/cac flag"
     * @return true when the command matches
     */
    public boolean execute(CommandSender sender, String command, String[] args, String raw);

}