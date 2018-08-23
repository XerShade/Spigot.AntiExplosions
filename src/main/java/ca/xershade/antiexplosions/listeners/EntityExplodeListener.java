package ca.xershade.antiexplosions.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class EntityExplodeListener implements Listener {
    @EventHandler
    public void onEntityExplode(EntityExplodeEvent event)
    {
        // Check to see if it is already canceled.
        if(!event.isCancelled()) {
            // It's not, change that.
            event.setCancelled(true);

            // Also make other stuff zero to ensure it's canceled.
            event.setYield(0);
        }
    }
}
