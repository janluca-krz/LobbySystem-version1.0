package de.modie.Listeners;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Sneak implements Listener {
	
    @EventHandler
	public void onPlayerToggleSneak(PlayerToggleSneakEvent event) {
    	
		//Neues Inventar, wenn man sneaked
    	
    	ItemStack SilentLobby = new ItemStack(Material.TNT);
		ItemMeta SilentLobbyMeta = SilentLobby.getItemMeta();
		SilentLobbyMeta.setDisplayName("§cSilentLobby");
		SilentLobby.setItemMeta(SilentLobbyMeta);
		
    	ItemStack Settings = new ItemStack(Material.REDSTONE_COMPARATOR);
		ItemMeta SettingsMeta = Settings.getItemMeta();
		SettingsMeta.setDisplayName("§2Einstellungen");
		Settings.setItemMeta(SettingsMeta);
		
    	ItemStack infos = new ItemStack(Material.PAPER);
		ItemMeta infosMeta = infos.getItemMeta();
		infosMeta.setDisplayName("§bServer infortamtionen");
		infos.setItemMeta(infosMeta);
		
		//altes Inventar, wenn man snicht sneaked
		
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
    	
    	
        Player p = event.getPlayer();
        Boolean isSneaking = p.isSneaking();
        if(!(p.isFlying())) {
        	if(isSneaking) {
            	p.getInventory().setItem(4, Compass);
    			p.getInventory().setItem(4, Compass);
    			p.getInventory().setItem(0, Extras);
    			p.getInventory().setItem(8, LobbySwitcher);
    			p.getInventory().setItem(7, Freunde);
    			p.getInventory().setItem(1, PlayerHide);
    			p.getInventory().clear(2);
    			p.getInventory().clear(6);
    			p.playSound(p.getLocation(), Sound.WOOD_CLICK, 3, 1);
        	} else {
        		p.getInventory().clear(0);
        		p.getInventory().clear(1);
        		p.getInventory().clear(2);
        		p.getInventory().clear(3);
        		p.getInventory().clear(4);
        		p.getInventory().clear(5);
        		p.getInventory().clear(6);
        		p.getInventory().clear(7);
        		p.getInventory().clear(8);
        		
                p.getInventory().setItem(4, SilentLobby);
                p.getInventory().setItem(2, Settings);
                p.getInventory().setItem(6, infos);
                p.playSound(p.getLocation(), Sound.WOOD_CLICK, 3, 1);
        	}
        } else if(p.isFlying()) {
        	p.getInventory().clear(2);
        	p.getInventory().clear(6);
        	p.getInventory().setItem(4, Compass);
			p.getInventory().setItem(4, Compass);
			p.getInventory().setItem(0, Extras);
			p.getInventory().setItem(8, LobbySwitcher);
			p.getInventory().setItem(7, Freunde);
			p.getInventory().setItem(1, PlayerHide);
        }
    }
 
    @EventHandler
    public void onScroll(PlayerItemHeldEvent e, Player p) {
    	p.playSound(p.getLocation(), Sound.CLICK, 3, 1);
    }

}
