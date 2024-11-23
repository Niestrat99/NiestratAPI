package io.github.niestrat99.niestratapi;

import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public interface NiestratAPI {
    /**
     * Sends a message to the player with ChatColor translation already implemented.
     * @param player - The player who shall receive the message.
     * @param msg - The message that is sent to the player.
     */
    void chatMsg(Player player, String msg);

    /**
     * Registers a command, making it a bit shorter to write.
     * @param commandName - The name of the command.
     * @param commandClass - The executing class file for the command.
     * @param plugin - The plugin this is going to be used in.
     */
    void regCommand(String commandName, CommandExecutor commandClass, JavaPlugin plugin);

    /**
     * Registers an event, making it a bit shorter to write.
     * @param eventClass - The event listener.
     * @param plugin - The plugin this is going to be used in.
     */
    void regEvent(Listener eventClass, JavaPlugin plugin);

    /**
     * Sends a log message to the console.
     * @param plugin - The plugin this is going to be used in.
     * @param level - Type of log message like INFO, WARNING or SEVERE.
     * @param msg - The message that shall be sent in the log.
     * @param sourceClass - The class file this log is sent from. Enter "null", if not needed.
     * @param stacktrace - The stacktrace printed, in case if there's an Exception. Enter "null", if not needed.
     */
    void log(Plugin plugin, Level level, String msg, Class<?> sourceClass, Exception stacktrace);
}
