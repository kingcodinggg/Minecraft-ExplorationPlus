package devlaunchers.exploration;

import org.bukkit.plugin.java.JavaPlugin;

public final class ExplorationPlus extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("peepeepoopoo");
        getServer().getPluginManager().registerEvents(new PopulatorListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
