package me.clientastisch.extension.impl.command;

import org.bukkit.command.CommandSender;

public interface Command {

    boolean execute(CommandSender sender, String command, String[] args, String raw);

}
