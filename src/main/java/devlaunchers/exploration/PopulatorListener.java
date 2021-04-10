package devlaunchers.exploration;

import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldInitEvent;

public class PopulatorListener implements Listener {
    private static boolean populatorIsInitialized = false;

    @EventHandler
    public void onWorldInit(WorldInitEvent e) {
        if (!populatorIsInitialized) {
            System.out.println("onWorldInit: WORLD HAS INITIALIZED");
            World world = e.getWorld();
            // spawn is generated before the next line is called
            world.getPopulators().add(new TestStructure());
            populatorIsInitialized = true;
        }
    }
}
