package tw.yeemo.CardHunter.Config;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import tw.yeemo.CardHunter.CardHunterMain;
import tw.yeemo.CardHunter.utils.ConsoleColor;

import java.io.File;
import java.io.IOException;

public abstract class CustomConfig {

    CustomConfig(String path, String fileName) {
        file = new File(path, fileName);
        config = YamlConfiguration.loadConfiguration(file);
        init();
        getConfig().options().copyDefaults(true);
        saveConfig();
        CardHunterMain.debug("Read the Config file of " + ConsoleColor.GREEN + fileName);
    }

    protected abstract void init();

    private File file;
    private FileConfiguration config;

    public FileConfiguration getConfig() {
        return config;
    }

    public void saveConfig(){
        try {
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reloadConfig(){
        config = YamlConfiguration.loadConfiguration(file);
    }
}
