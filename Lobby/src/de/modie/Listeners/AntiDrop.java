package de.modie.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

import de.modie.main.Main;

public class AntiDrop implements Listener {
	
	@EventHandler
	public void onDrop(PlayerDropItemEvent e) {	
		if (e.getPlayer().getWorld().getName().equals(Main.vord)) {
			e.setCancelled(true);
		}
		
			
	}

}
