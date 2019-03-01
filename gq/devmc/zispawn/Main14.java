package gq.devmc.zispawn;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main14
  extends JavaPlugin
  implements Listener
{
  public void onEnable()
  {
    getServer().getPluginManager().registerEvents(this, this);
  }
  
  @EventHandler
  public void onDeath(PlayerDeathEvent e)
  {
    final Player p = e.getEntity();
    Bukkit.getScheduler().runTaskLater(this, new Runnable()
    {
      public void run()
      {
        p.spigot().respawn();
      }
    }, 1L);
  }
}
