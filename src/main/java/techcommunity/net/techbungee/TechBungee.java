package techcommunity.net.techbungee;

import org.bukkit.plugin.java.JavaPlugin;
import techcommunity.net.techbungee.api.TechAPI;

public final class TechBungee {
    public static TechAPI getAPI(JavaPlugin plugin) {
        return new TechAPI(plugin);
    }
}
