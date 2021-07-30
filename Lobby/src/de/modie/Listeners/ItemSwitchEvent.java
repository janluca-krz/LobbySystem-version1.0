package de.modie.Listeners;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;

public class ItemSwitchEvent implements Listener {
	
	 @EventHandler
	 public void onSwitch(final PlayerItemHeldEvent e) {
		 final Player p = e.getPlayer();
		 p.playSound(p.getLocation(), Sound.WOOD_CLICK, 1, 1);
	 }

}
