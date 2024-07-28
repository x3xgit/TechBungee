package techcommunity.net.techbungee;

import org.bukkit.plugin.java.JavaPlugin;
import techcommunity.net.techbungee.api.API;

public final class TechBungee {
    public static API getAPI(JavaPlugin plugin) {
        return new API(plugin);
    }
}
