package de.modie.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

import de.modie.main.Main;

public class FoodBar implements Listener {
	
	@EventHandler
	public void onFood(FoodLevelChangeEvent e) {
		if (e.getEntity() instanceof Player & e.getEntity().getWorld().getName().equals(Main.vord)) {
			e.setCancelled(true);
		}
			
	}

}
