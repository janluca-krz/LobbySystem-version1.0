package de.modie.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import de.modie.main.Main;

public class Gadgets implements Listener {
	
	@SuppressWarnings("unused")
	private Main main;
	
	public Gadgets(Main main) {
		this.main = main;
		Bukkit.getPluginManager().registerEvents(this, main);
	}
	
	@EventHandler
	public void onGadgets(PlayerInteractEvent e) {
		if(e.getItem() != null && e.getItem().getType() == Material.CHEST) {
			
		}
		
	}

}
