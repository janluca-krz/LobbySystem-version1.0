package de.modie.Commands;


import java.util.ArrayList;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyComand implements CommandExecutor {
	
	public static ArrayList<Player> fly = new ArrayList<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
		Player p = (Player)sender;
		if (p.hasPermission("loby.premium")) {
			if (cmd.getName().equalsIgnoreCase("fly")) {
				p.setGameMode(GameMode.SURVIVAL);
					if(!(fly.contains(p))) {
						if(p.getGameMode() == GameMode.SURVIVAL) {
							fly.add(p);
							p.setAllowFlight(true);
							p.isFlying();
							p.getAllowFlight();
							p.sendMessage("Fliegen an");
						}
					} else {
						fly.remove(p);
						p.setAllowFlight(false);
						p.sendMessage("Fliegen aus");
						p.setGameMode(GameMode.ADVENTURE);
					}
				
			} else {
				sender.sendMessage("Bitte benutze /fly");
			}
		} else {
			sender.sendMessage("Dazu hast du keine Rechte :(");
		}
		return false;
	}

}
