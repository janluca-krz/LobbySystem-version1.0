package de.modie.Items;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import de.modie.main.Main;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;

public class Interact implements Listener {
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		
		
		if(e.hasItem()) {
			if(e.getItem().hasItemMeta()) {
			if(e.getItem().getItemMeta().getDisplayName().equals("§cNavigator")) {
				p.openInventory(Main.NavigatorInventory);
				e.setCancelled(true);
			}
			}
		}
		
		if(e.hasItem()) {
			if(e.getItem().hasItemMeta()) {
			if(e.getItem().getItemMeta().getDisplayName().equals("§6Extras")) {
				p.openInventory(Main.ExtrasInentory);
				p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1, 1);
				e.setCancelled(true);
			}
			}
		}
		
		if(e.hasItem()) {
			if(e.getItem().hasItemMeta()) {
			if(e.getItem().getItemMeta().getDisplayName().equals("§5Lobby - Switcher")) {
				p.openInventory(Main.LobbySwitcher);
				p.playSound(p.getLocation(), Sound.ITEM_PICKUP, 1, 1);
				e.setCancelled(true);
			}
			} 
		}
		
		if(e.hasItem()) {
			if(e.getItem().hasItemMeta()) {
			if(e.getItem().getItemMeta().getDisplayName().equals("§2Einstellungen")) {
				p.openInventory(Main.SettingsInventry);
				p.playSound(p.getLocation(), Sound.CREEPER_HISS, 3, 1);
				e.setCancelled(true);
			}
			}
		}
		
		if(e.hasItem()) {
			if(e.getItem().hasItemMeta()) {
			if(e.getItem().getItemMeta().getDisplayName().equals("§bFreunde")) {
				p.openInventory(Main.FreundeInventory);
				p.playSound(p.getLocation(), Sound.ITEM_PICKUP, 1, 1);
				e.setCancelled(true);
			}
			}
	}
		
		if(e.hasItem()) {
			if(e.getItem().hasItemMeta()) {
			if(e.getItem().getItemMeta().getDisplayName().equals("§3Player - Hider")) {
				p.openInventory(Main.PlayerHiderInventory);
				p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
				e.setCancelled(true);
			}
			}
	}
		
		if(e.hasItem()) {
			if(e.getItem().hasItemMeta()) {
			if(e.getItem().getItemMeta().getDisplayName().equals("§bServer infortamtionen")) {
				TextComponent c = new TextComponent("§aDu kannst ");
				TextComponent c2 = new TextComponent(" §aalles über uns lesen");
				TextComponent clickme = new TextComponent("§5HIER");
				clickme.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://easymc.eu"));	
				clickme.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("§6Das ist unser Forum")));
				//p.sendMessage("§aDu kannst alle Information zu uns " + clickme + " §alesen");
				
				p.spigot().sendMessage(c,clickme,c2);
				e.setCancelled(true);
			}
			}
	}
}

}
