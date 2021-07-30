package de.modie.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BanCommand implements CommandExecutor {

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		Player p = (Player)s;
		Player target = Bukkit.getPlayer(args[0]);
		if(p.hasPermission("lobby.ban")) {
			if(s instanceof Player) {
				if(cmd.getName().equalsIgnoreCase("ban")) {
					if(args.length == 2) {
						
						switch (Integer.parseInt(args[0])) {
						case 1:
							target.getPlayer().setBanned(true);
							p.sendMessage("Du hast den spieler " + target.getName() + "gebannt");
							break;
							
						case 2:
							target.getPlayer().setBanned(true);
							p.sendMessage("Du hast den spieler " + target.getName() + "gebannt");
							break;
							
						case 3:
							target.getPlayer().setBanned(true);
							p.sendMessage("Du hast den spieler " + target.getName() + "gebannt");
							break;

						default:
							break;
						}
					}
				} 
				
			} else {
				p.sendMessage("§bEasyMC§7: §cIrgendetwas hat nicht funktioniert :(");
			}
		}
		return false;
	}

}
