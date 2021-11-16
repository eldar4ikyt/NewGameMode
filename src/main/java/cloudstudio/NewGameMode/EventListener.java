package cloudstudio.NewGameMode;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventListener implements Listener {
    @EventHandler
    public void onJoin22(AsyncPlayerChatEvent e) {
        e.getPlayer().setGameMode(GameMode.CLOUDSTUDIO);
    }
}
