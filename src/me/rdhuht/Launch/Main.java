package me.rdhuht.Launch;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("plugin start now");
        this.getCommand("Launch").setExecutor(new Fly());
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

}
