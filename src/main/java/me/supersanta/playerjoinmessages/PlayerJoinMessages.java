package me.supersanta.playerjoinmessages;

import me.supersanta.playerjoinmessages.listeners.JoinLeaveMessageListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerJoinMessages extends JavaPlugin {

    @Override
    public void onEnable() {

        //Registers the config
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        //Registers the join and leave listener
        getServer().getPluginManager().registerEvents(new JoinLeaveMessageListener(), this);
    }
}
