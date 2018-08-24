package ca.xershade.antiexplosions;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.EntityType;
import ca.xershade.antiexplosions.listeners.EntityExplodeListener;

public final class AntiExplosions extends JavaPlugin {
    @Override
    public void onEnable() {
        // Generate configuration defaults.
        for(EntityType t : EntityType.values()) {
            // Assign the default value of false ot the entity type.
            getConfig().addDefault(t.name(), false);
        }

        // Now save the defaults.
        getConfig().options().copyDefaults(true);
        saveConfig();

        // Register the listeners.
        getServer().getPluginManager().registerEvents(new EntityExplodeListener(this), this);
    }
}
