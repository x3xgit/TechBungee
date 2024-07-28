package techcommunity.net.techbungee.api;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class TechAPI {
    private final JavaPlugin plugin;

    public TechAPI(JavaPlugin plugin) {
        this.plugin = plugin;

        plugin.getServer().getMessenger().registerOutgoingPluginChannel(plugin, "BungeeCord");
    }

    public void transferTo(Player player, String serverName) {
        if (player.isOnline()) {
            ByteArrayDataOutput out = ByteStreams.newDataOutput();
            out.writeUTF("ConnectOther");
            out.writeUTF(player.getName());
            out.writeUTF(serverName);
            player.sendPluginMessage(plugin, "BungeeCord", out.toByteArray());
        }
    }
}
