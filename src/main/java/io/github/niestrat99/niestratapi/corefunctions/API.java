package io.github.niestrat99.niestratapi.corefunctions;

import io.github.niestrat99.niestratapi.NiestratAPI;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Level;

public class API implements NiestratAPI {

    // Typical functions for Main Classes.
    public void regCommand(String commandName, CommandExecutor commandClass, JavaPlugin plugin) {
        Objects.requireNonNull(plugin.getCommand(commandName)).setExecutor(commandClass);
    }

    public void regEvent(Listener eventClass, JavaPlugin plugin) {
        plugin.getServer().getPluginManager().registerEvents(eventClass, plugin);
    }

    public void log(Plugin plugin, Level level, String msg, Class<?> sourceClass, Exception stacktrace) {
        String message = msg;
        if (sourceClass != null) {
            message = message.concat("\n(" + sourceClass.getName() + ")");
        }
        if (stacktrace != null) {
            message = message.concat("\nStacktrace:\n" + stacktrace);
        }
        plugin.getLogger().log(level, message);
    }

    // Typical functions for Chats.
    public void chatMsg(Player player, String msg) {
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', msg));
    }
}
