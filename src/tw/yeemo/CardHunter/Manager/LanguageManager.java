package tw.yeemo.CardHunter.Manager;

import tw.yeemo.CardHunter.CardHunterMain;
import tw.yeemo.CardHunter.utils.ConsoleColor;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class LanguageManager {

    private static CardHunterMain plugin;
    private static HashMap<String, Properties> languageMap;

    public LanguageManager(CardHunterMain plugin) {
        LanguageManager.plugin = plugin;
    }

    public static void init() {
        // Search File
        CardHunterMain.debug("Language file initialization");
        languageMap = new HashMap<>();
        File folder = new File(plugin.getDataFolder(),"Local");
        if(!folder.exists()) return;
        for (File file : folder.listFiles()){
            if(file.getName().contains(".properties")){
                loadFile(file.getPath());
            }
        }
        CardHunterMain.debug("The language file is initialized");
    }

    public static Set<String> getLanguages(){
        return languageMap.keySet();
    }

    private static void loadFile(String fileName) {
        try {
            InputStream in = new BufferedInputStream(new FileInputStream(fileName));
            Properties p = new Properties();
            p.load(in);
            if(!p.getProperty("LANGUAGE_NAME").isEmpty()){
                languageMap.put(p.getProperty("LANGUAGE_NAME"), p);
                CardHunterMain.debug("Read the language file of " + ConsoleColor.GREEN + p.getProperty("LANGUAGE_NAME"));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
