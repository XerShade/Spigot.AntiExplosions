package ca.xershade.antiexplosions;

import org.bukkit.plugin.java.JavaPlugin;
import ca.xershade.antiexplosions.listeners.EntityExplodeListener;

public final class AntiExplosions extends JavaPlugin {

    @Override
    public void onEnable() {
        // Register the listener.
        getServer().getPluginManager().registerEvents(new EntityExplodeListener(), this);
    }
}
