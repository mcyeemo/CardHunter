package tw.yeemo.CardHunter;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import tw.yeemo.CardHunter.Manager.FileManager;

public class CardHunterMain extends JavaPlugin {

    static CardHunterMain instance = null;

    @Override
    public void onEnable() {
        instance = this;

        // FileManager
        FileManager fileManager = new FileManager(this);
        fileManager.init();
    }

    public void debug(String msg) {
        if (!getConfig().getBoolean("Debug")) return;
        getServer().getConsoleSender().sendRawMessage(ChatColor.RED + "(DEBUG) - " + ChatColor.GOLD + msg);
    }

    public static CardHunterMain getInstance() {
        return instance;
    }

    @Override
    public void onDisable(){
        instance = null;
    }
}
