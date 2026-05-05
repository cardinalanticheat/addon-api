package me.clientastisch.cardinal.extension.impl.command;

import org.bukkit.command.CommandSender;

/**
 * @author Clientastisch
 * @since CAC v. 1.0
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
    boolean execute(CommandSender sender, String command, String[] args, String raw);

}