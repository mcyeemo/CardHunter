package tw.yeemo.CardHunter.Manager;

import tw.yeemo.CardHunter.CardHunterMain;
import tw.yeemo.CardHunter.Config.DefaultConfig;
import tw.yeemo.CardHunter.Config.PlayerdataConfig;

public class FileManager {

    private CardHunterMain plugin;

    public static DefaultConfig config;
    public static PlayerdataConfig playerdata;

    public FileManager(CardHunterMain plugin) {
        this.plugin = plugin;
    }

    public void init() {
        CardHunterMain.debug("Config file initialization");
        config = new DefaultConfig(plugin.getDataFolder(), "config.yml");
        playerdata = new PlayerdataConfig(plugin.getDataFolder(), "playerdata.yml");
        CardHunterMain.debug("The language file is initialized");
    }
}
