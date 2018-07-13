package tw.yeemo.CardHunter.Config;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public abstract class CustomConfig {

    CustomConfig(String path, String fileName) {
        file = new File(path, fileName);
        config = YamlConfiguration.loadConfiguration(file);
        init();
        getConfig().options().copyDefaults(true);
        saveConfig();
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
