package tw.yeemo.CardHunter.Manager;

import tw.yeemo.CardHunter.CardHunterMain;
import tw.yeemo.CardHunter.Config.DefaultConfig;
import tw.yeemo.CardHunter.Config.PlayerDataConfig;

public class FileManager {

    private CardHunterMain plugin;

    public static DefaultConfig config;
    public static PlayerDataConfig playerdata;

    public FileManager(CardHunterMain plugin){
        this.plugin = plugin;
    }

    public void init() {
        config = new DefaultConfig(plugin.getDataFolder(), "config.yml");
        playerdata = new PlayerDataConfig(plugin.getDataFolder(), "playerdata.yml");
    }
}
