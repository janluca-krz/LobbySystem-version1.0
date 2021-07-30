package de.modie.Commands;


import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GMCommand implements CommandExecutor {
	

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
		Player p = (Player)sender;
		Player p2 = Bukkit.getPlayer(args[1]);
		
		if (cmd.getName().equalsIgnoreCase("gm")) {
			if(p.hasPermission("lobby.gamemode")) {	
				if (args.length <= 2) {
					
					switch (Integer.parseInt(args[0])) {
					case 0:
						p2.setGameMode(GameMode.SURVIVAL);
						break;
					case 1:
						p2.setGameMode(GameMode.CREATIVE);
						break;
					case 2:
						p2.setGameMode(GameMode.ADVENTURE);
						break;
					case 3:
						p2.setGameMode(GameMode.SPECTATOR);
						break;
	
					default:
						break;
					}
					
				} else if (args.length == 1) {
					if (cmd.getName().equalsIgnoreCase("gm")) {
						switch (Integer.parseInt(args[0])) {
						case 0:
							p.setGameMode(GameMode.SURVIVAL);
							break;
						case 1:
							p.setGameMode(GameMode.CREATIVE);
							break;
						case 2:
							p.setGameMode(GameMode.ADVENTURE);
							break;
						case 3:
							p.setGameMode(GameMode.SPECTATOR);
							break;
		
						default:
							break;
						}
					}
					

				}
			}
		}

		return false;
	}

}
