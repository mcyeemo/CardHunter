package tw.yeemo.CardHunter.Manager;

import tw.yeemo.CardHunter.CardHunterMain;
import tw.yeemo.CardHunter.Config.DefaultConfig;

public class FileManager {

    private CardHunterMain plugin;

    public FileManager(CardHunterMain plugin){
        this.plugin = plugin;
    }


    public void init() {
        new DefaultConfig(plugin.getDataFolder(), "config.yml");
    }
}
