package de.modie.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import de.modie.main.Main;

public class PlayerDamageEvent implements Listener {
	
	@EventHandler
	public void onDamage(EntityDamageEvent e) {
		if (e.getEntity() instanceof Player & e.getEntity().getWorld().getName().equals(Main.vord)) {
			e.setCancelled(true);
		}
	}
}
