package de.modie.Commands;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.modie.warp.WarpManager;

public class WarpCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		if(!(s instanceof Player)) {
			return false;
		}
		Player p = (Player)s;
		if(args.length == 1) {
			if(WarpManager.getWarp(args[0])  != null) {
				p.teleport(WarpManager.getWarp(args[0]));
				p.sendMessage("§aDu bist nun bei §6" + args[0] + " §a!");
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 3, 1);
			} else {
				p.sendMessage("§cDiesen warp gibt es noch nicht ;(");
			}
		} else if(args.length == 2) {
			if(!p.hasPermission("lobby.warpmanage")) {
				p.sendMessage("§c Dazu hast du leider keine rechte");
				return false;	
			}
			if(args[0].equalsIgnoreCase("add")) {
				if(WarpManager.getWarp(args[1]) == null) {
					WarpManager.CreateWarp(args[1], p.getLocation());
					p.sendMessage("§aDu hats erfolgreich den warp §6" + args[1] + " gesetzt :)");
				} else {
					p.sendMessage("§cDiesen warp gibt es bereits ;(");
				}
			} else if(args[0].equalsIgnoreCase("delete")) {
				if(WarpManager.getWarp(args[1]) != null) {
					WarpManager.deleteWarp(args[1]);
					p.sendMessage("§aDu hast den warp §6" + args[1] + " §aerfolgreich gelöscht");
				} else {
					p.sendMessage("§cDiesen warp gibt es nicht ;(");
				}
			}
		}
		return false;
	}

}
