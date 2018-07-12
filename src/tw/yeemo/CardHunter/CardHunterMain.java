package tw.yeemo.CardHunter;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class CardHunterMain extends JavaPlugin {

    @Override
    public void onEnable() {
        // Config
        getConfig().options().header("Show Debug Message");
        getConfig().addDefault("Debug", true);
        getConfig().options().copyDefaults(true);
        this.saveConfig();
    }

    public void debug(String msg) {
        if(!getConfig().getBoolean("Debug")) return;
        getServer().getConsoleSender().sendRawMessage(ChatColor.RED + "(DEBUG) - " + ChatColor.GOLD + msg);
    }
}
