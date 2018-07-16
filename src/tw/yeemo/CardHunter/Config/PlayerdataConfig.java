package tw.yeemo.CardHunter.Config;

import java.io.File;

public class PlayerdataConfig extends CustomConfig {

    public PlayerdataConfig(File file, String fileName) {
        super(file.toString(), fileName);
    }

    @Override
    protected void init() {
        getConfig().options().header("this is player data storage, Don't Touch!!");
    }
}
