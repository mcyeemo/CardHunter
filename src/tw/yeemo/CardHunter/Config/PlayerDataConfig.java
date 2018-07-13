package tw.yeemo.CardHunter.Config;

import java.io.File;

public class PlayerDataConfig extends CustomConfig {

    public PlayerDataConfig(File file, String fileName) {
        super(file.toString(), fileName);
    }

    @Override
    protected void init() {
        getConfig().options().header("abc");
        getConfig().addDefault("test","test");

    }
}
