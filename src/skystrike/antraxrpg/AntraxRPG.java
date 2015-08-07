package skystrike.antraxrpg;

import org.bukkit.plugin.java.JavaPlugin;

public class AntraxRPG extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("AntraxRPG Starting up");
    }

    @Override
    public void onDisable() {
        getLogger().info("AntraxRPG Shutting down");
    }
}
