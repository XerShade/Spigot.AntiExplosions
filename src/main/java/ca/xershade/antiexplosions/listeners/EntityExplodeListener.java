package ca.xershade.antiexplosions.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class EntityExplodeListener implements Listener {
    private final JavaPlugin plugin;

    public EntityExplodeListener(JavaPlugin plugin) {
        // Store a reference to the plugin.
        this.plugin = plugin;
    }

    @EventHandler
    public void onEntityExplode(EntityExplodeEvent event)
    {
        // Check to see if the entity is not allowed to explode.
        if (!plugin.getConfig().getBoolean(event.getEntityType().name(), false)) {
            // Check to see if the event is canceled.
            if(!event.isCancelled()) {
                // We don't want this to happen, cancel it.
                event.setCancelled(true);
            }
        }
    }
}
