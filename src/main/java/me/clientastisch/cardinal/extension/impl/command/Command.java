package me.clientastisch.cardinal.extension.impl.command;

import org.bukkit.command.CommandSender;

/**
 * @author Clientastisch
 * @since CAC v. 1.0
 */
public interface Command {

    /**
     *
     */
    boolean execute(CommandSender sender, String command, String[] args, String raw);

}