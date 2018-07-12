package tw.yeemo.CardHunter.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class OpenGUI implements Listener {

    @EventHandler
    public void OGUI(PlayerInteractEvent event) {
        if (event.getItem() == null || event.getItem().getType() != Material.BOOK) return;
        event.setCancelled(true);
    }
}
