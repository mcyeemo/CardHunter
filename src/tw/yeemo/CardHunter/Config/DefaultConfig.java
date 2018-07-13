package tw.yeemo.CardHunter.Config;

import java.io.File;

public class DefaultConfig extends CustomConfig {

    public DefaultConfig(File file, String name) {
        super(file.toString(), name);
    }

    @Override
    protected void init() {
        getConfig().options().header("if you want to show debug message and turn true!");
        getConfig().addDefault("Debug", true);
    }
}
