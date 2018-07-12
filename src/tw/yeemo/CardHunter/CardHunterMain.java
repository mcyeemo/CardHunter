package tw.yeemo.CardHunter;

import org.bukkit.plugin.java.JavaPlugin;
import tw.yeemo.CardHunter.events.OpenGUI;

public class CardHunterMain extends JavaPlugin {

    @Override
    public void onEnable() {
        // Hello World
        getServer().getLogger().info("PANG_HU");

        //Register Event
        getServer().getPluginManager().registerEvents(new OpenGUI(),this);

    }
}
