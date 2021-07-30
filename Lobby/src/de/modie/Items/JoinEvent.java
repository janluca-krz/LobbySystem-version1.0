package de.modie.Items;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import de.modie.main.Main;

public class JoinEvent implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if(p.getWorld().getName().equals(Main.vord)) {
			
			ItemStack Compass = new ItemStack(Material.NETHER_STAR);
			ItemMeta CompassMeta = Compass.getItemMeta();
			CompassMeta.setDisplayName("§cNavigator");
			Compass.setItemMeta(CompassMeta);
			
			ItemStack Extras = new ItemStack(Material.CHEST);
			ItemMeta ExtrasMeta = Extras.getItemMeta();
			ExtrasMeta.setDisplayName("§6Extras");
			Extras.setItemMeta(ExtrasMeta);
			
			ItemStack LobbySwitcher = new ItemStack(Material.BEACON);
			ItemMeta LobbySwitcherMeta = LobbySwitcher.getItemMeta();
			LobbySwitcherMeta.setDisplayName("§5Lobby - Switcher");
			LobbySwitcher.setItemMeta(LobbySwitcherMeta);		
			
			ItemStack PlayerHide = new ItemStack(Material.BLAZE_ROD);
			ItemMeta PlayerHideMeta = PlayerHide.getItemMeta();
			PlayerHideMeta.setDisplayName("§3Player - Hider");
			PlayerHide.setItemMeta(PlayerHideMeta);
			
			ItemStack Speed = new ItemStack(Material.FEATHER);
			ItemMeta SpeedHideMeta = Speed.getItemMeta();
			SpeedHideMeta.setDisplayName("§bSpeed");
			Speed.setItemMeta(SpeedHideMeta);
			
			ItemStack Freunde = new ItemStack(Material.SKULL_ITEM);
			ItemMeta FreundeMeta = Speed.getItemMeta();
			FreundeMeta.setDisplayName("§bFreunde");
			Freunde.setItemMeta(FreundeMeta);
			
			p.getInventory().setItem(4, Compass);
			p.getInventory().setItem(0, Extras);
			p.getInventory().setItem(8, LobbySwitcher);
			p.getInventory().setItem(7, Freunde);
			p.getInventory().setItem(1, PlayerHide);
			
				ItemStack Platzhalter2 = new ItemStack(Material.STAINED_GLASS_PANE);
				ItemMeta Platzhalter2meta = Platzhalter2.getItemMeta();
				Platzhalter2meta.setDisplayName(" ");
				Platzhalter2.setItemMeta(Platzhalter2meta);
				
				p.getInventory().setItem(9, Platzhalter2);
				p.getInventory().setItem(10, Platzhalter2);
				p.getInventory().setItem(11, Platzhalter2);
				p.getInventory().setItem(12, Platzhalter2);
				p.getInventory().setItem(13, Platzhalter2);
				p.getInventory().setItem(14, Platzhalter2);
				p.getInventory().setItem(15, Platzhalter2);
				p.getInventory().setItem(16, Platzhalter2);
				p.getInventory().setItem(17, Platzhalter2);
				p.getInventory().setItem(18, Platzhalter2);
				p.getInventory().setItem(19, Platzhalter2);
				p.getInventory().setItem(20, Platzhalter2);
				p.getInventory().setItem(21, Platzhalter2);
				p.getInventory().setItem(22, Platzhalter2);
				p.getInventory().setItem(23, Platzhalter2);
				p.getInventory().setItem(24, Platzhalter2);
				p.getInventory().setItem(25, Platzhalter2);
				p.getInventory().setItem(26, Platzhalter2);
				p.getInventory().setItem(27, Platzhalter2);
				p.getInventory().setItem(28, Platzhalter2);
				p.getInventory().setItem(29, Platzhalter2);
				p.getInventory().setItem(30, Platzhalter2);
				p.getInventory().setItem(31, Platzhalter2);
				p.getInventory().setItem(32, Platzhalter2);
				p.getInventory().setItem(33, Platzhalter2);
				p.getInventory().setItem(34, Platzhalter2);
				p.getInventory().setItem(35, Platzhalter2);
			
			Main.ExtrasInentory.setItem(0, Speed);
		}
	}
}
