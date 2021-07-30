package de.modie.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.modie.main.Main;

public class PremiumChat implements Listener {
	
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		
		if(e.getPlayer().getWorld().getName().equals(Main.vord)) {			
				if(p.isOp()) {
					e.setFormat("§4Owner §7:  " + e.getPlayer().getDisplayName() + " §7>> " + e.getMessage());
				} else if (p.hasPermission("lobby.admin")) {
					e.setFormat("§cAdmin§7  :   " + e.getPlayer().getDisplayName() + " §7>> " + e.getMessage());
				} else if (p.hasPermission("lobby.srdev")) {
					e.setFormat("§bSr-Dev§7  :  " + e.getPlayer().getDisplayName() +  "§7> >" + e.getMessage());
				} else if(p.hasPermission("lobby.Dev")) {
					e.setFormat("§bDev§7  :  " + e.getPlayer().getDisplayName() +  "§7> >" + e.getMessage());
				} else if(p.hasPermission("lobby.jrdev")) {
					e.setFormat("§bJrDev§7  :  " + e.getPlayer().getDisplayName() +  "§7> >" + e.getMessage());
				} else if (p.hasPermission("lobby.srmod")) {
					e.setFormat("§1Sr-Mod§7  :  " + e.getPlayer().getDisplayName() +  "§7> >" + e.getMessage());
				} else if(p.hasPermission("lobby.mod")) {
					e.setFormat("§1Mod§7  :  " + e.getPlayer().getDisplayName() +  "§7> >" + e.getMessage());
				} else if (p.hasPermission("lobby.jrmod")) {
					e.setFormat("§bJr-Mod§7  :  " + e.getPlayer().getDisplayName() +  "§7> >" + e.getMessage());
				} else if(p.hasPermission("lobby.srsup")) {
					e.setFormat("§2Sr-Sup§7  :  " + e.getPlayer().getDisplayName() +  "§7> >" + e.getMessage());
				} else if(p.hasPermission("lobby.sup")) {
					e.setFormat("§2Sup§7  :  " + e.getPlayer().getDisplayName() +  "§7> >" + e.getMessage());
				} else if (p.hasPermission("loby.jrsup")) {
					e.setFormat("§bJr-Sup§7  :  " + e.getPlayer().getDisplayName() +  "§7> >" + e.getMessage());
				} else if(p.hasPermission("lobby.srcontent")) {
					e.setFormat("§3Sr-Content§7  :  " + e.getPlayer().getDisplayName() +  "§7> >" + e.getMessage());
				} else if(p.hasPermission("lobby.content")) {
					e.setFormat("§3Content§7  :  " + e.getPlayer().getDisplayName() +  "§7> >" + e.getMessage());
				} else if(p.hasPermission("lobby.jrcontent")) {
					e.setFormat("§3Jr-Content§7  :  " + e.getPlayer().getDisplayName() +  "§7> >" + e.getMessage());
				} else if(p.hasPermission("lobby.srbuilder")) {
					e.setFormat("§eSr-Builder§7  :  " + e.getPlayer().getDisplayName() +  "§7> >" + e.getMessage());
				} else if(p.hasPermission("lobby.builder")) {
					e.setFormat("§eBuilder§7  :  " + e.getPlayer().getDisplayName() +  "§7> >" + e.getMessage());
				} else if(p.hasPermission("lobby.jrbuilder")) {
					e.setFormat("§eJr-Builder§7  :  " + e.getPlayer().getDisplayName() +  "§7> >" + e.getMessage());
				} else if(p.hasPermission("lobby.easy")) {
					e.setFormat("§9Easy§7  :  " + e.getPlayer().getDisplayName() +  "§7> >" + e.getMessage());
				} else if(p.hasPermission("lobby.vip")) {
					e.setFormat("§6VIP§7  :  " + e.getPlayer().getDisplayName() +  "§7> >" + e.getMessage());
				} else if(p.hasPermission("lobby.premium+")) {
					e.setFormat("§ePremium +§7  :  " + e.getPlayer().getDisplayName() +  "§7> >" + e.getMessage());
				} else if(p.hasPermission("lobby.premium")) {
					e.setFormat("§ePremium§7  :  " + e.getPlayer().getDisplayName() +  "§7> >" + e.getMessage());
				} else {
					p.sendMessage("§7Nur leute mit dem §6Premium §7 Rang können hier schreiben");
					e.setCancelled(true);
				}
		}
	}

}
