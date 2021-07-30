package de.modie.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

import de.modie.main.Main;

public class WeatherChang implements Listener{
	
	@EventHandler
	public void onBreak(WeatherChangeEvent e) {
		if(e.getWorld().getName().equals(Main.vord)) {
			e.setCancelled(true);
		}
	}

}
