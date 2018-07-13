package tw.yeemo.CardHunter.Config;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public abstract class CustomConfig {

    public CustomConfig(String path, String fileName) {
        file = new File(path, fileName);
        config = YamlConfiguration.loadConfiguration(file);
        init();
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    protected abstract void init();

    protected File file;
    protected FileConfiguration config;

    protected FileConfiguration getConfig() {
        return config;
    }

    protected void saveConfig(){
        try {
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void reloadConfig(){
        config = YamlConfiguration.loadConfiguration(file);
    }
}
