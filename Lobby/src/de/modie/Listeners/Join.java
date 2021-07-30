package de.modie.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import de.modie.main.Main;
import de.modie.warp.WarpManager;

public class Join implements Listener {
	
				
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		p.setGameMode(GameMode.ADVENTURE);
		p.getInventory().clear();
		p.setMaxHealth(8);
		p.setFoodLevel(20);
		p.resetMaxHealth();
		p.setLevel(2021);
		p.teleport(WarpManager.getWarp("Spawn"));
		p.getInventory().setHelmet(null);
		Scoreboard.setScoreboard(p);
		if(p.hasPermission("lobby.join")) {
			e.setJoinMessage(p.getDisplayName() + "§a [+]");
		} else {
			e.setJoinMessage("");
		}
		
		
		
	}
	
	@EventHandler
	public void onEntity(EntitySpawnEvent e) {
		if(Bukkit.getWorld(Main.vord) != null) {
			e.setCancelled(false);
		} else {
			e.setCancelled(true);
		}
	}
	
	@SuppressWarnings("null")
	@EventHandler
	public void onBlockPLace(BlockPlaceEvent e) {
		Player p = null;
		if(p.isOp()) {
			e.setBuild(true);
		}
	}

}
