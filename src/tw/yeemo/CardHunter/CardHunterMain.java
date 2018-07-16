package tw.yeemo.CardHunter;

import org.bukkit.plugin.java.JavaPlugin;
import tw.yeemo.CardHunter.Manager.FileManager;
import tw.yeemo.CardHunter.Manager.LanguageManager;
import tw.yeemo.CardHunter.utils.ConsoleColor;

public class CardHunterMain extends JavaPlugin {

    static CardHunterMain instance = null;
    static boolean debug = false;

    @Override
    public void onEnable() {
        instance = this;
        debug = getConfig().getBoolean("Debug");

        // FileManager
        FileManager fileManager = new FileManager(this);
        fileManager.init();

        // LanguageManager
        LanguageManager languageManager = new LanguageManager(this);
        LanguageManager.init();
    }

    public static void debug(String msg) {
        if (!debug) return;
        System.out.print(ConsoleColor.RED + "(DEBUG) - " + ConsoleColor.YELLOW + msg + ConsoleColor.RESET);
    }

    public static CardHunterMain getInstance() {
        return instance;
    }

    @Override
    public void onDisable(){
        instance = null;
    }
}
