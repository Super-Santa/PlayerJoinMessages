package me.supersanta.playerjoinmessages.listeners;

import me.supersanta.playerjoinmessages.PlayerJoinMessages;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

import java.util.Objects;

public class JoinLeaveMessageListener implements Listener {

    Plugin plugin = PlayerJoinMessages.getPlugin(PlayerJoinMessages.class);

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        String firstJoinMessage = ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("FirstTimeJoinMessage")));
        firstJoinMessage = firstJoinMessage.replace("%player%", player.getDisplayName());

        String joinMessage = ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("JoinMessage")));
        joinMessage = joinMessage.replace("%player%", player.getDisplayName());

        if (player.hasPlayedBefore()) {
            event.setJoinMessage(joinMessage);
        } else {
            event.setJoinMessage(firstJoinMessage);
        }
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        String leaveMessage = ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("LeaveMessage")));
        leaveMessage = leaveMessage.replace("%player%", player.getDisplayName());

        event.setQuitMessage(leaveMessage);
    }

}
