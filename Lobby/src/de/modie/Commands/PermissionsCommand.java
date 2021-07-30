package de.modie.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachment;

import de.modie.main.Main;

public class PermissionsCommand implements CommandExecutor {
	
	private Main plugin;
	
	public PermissionsCommand(Main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		Player p = (Player)s;
		
		if(args.length == 1) {
			String perm = args[0];
			
			if (p.hasPermission(perm)) {
				p.sendMessage("§20k, Du hasu die Permissions §e" + perm);
				return true;
			} else {
				p.sendMessage("§cDazu hast du keine Rechte");
				return true;
			}
		}
		
		if(args.length == 3) {
			if(args[0].equalsIgnoreCase("add") || args[0].equalsIgnoreCase("remove")) {
				Player target = Bukkit.getPlayer(args[1]);
				String permissions = args[2];
				if(target != null) {
					setPermissions(args[0], target, permissions);
					
					boolean done = setPermissions(args[0], target, permissions);
					
					if(done) {
						p.sendMessage("§aAlles hat geklapt");
					} else {
						p.sendMessage("Irgendetwas hat nicht funktioniert");
					}
					
				} else {
					p.sendMessage("§bEasyMC §7: §cBitte benutze /permissions [add/remove] [Spieler] [Permissions]");
				}
			} else {
				p.sendMessage("§bEasyMC §7: §cBitte benutze /permissions [add/remove] [Spieler] [Permissions]");
			}
		} else {
			p.sendMessage("§bEasyMC §7: §cBitte benutze /permissions [add/remove] [Spieler] [Permissions]");
		}
		
		return true;
	}
	
	public boolean setPermissions(String type,Player target, String permissionsName) {
		if(type.equalsIgnoreCase("add")) {
				
			PermissionAttachment attachment = target.addAttachment(plugin);
			attachment.setPermission(permissionsName, true);
			return true;
		}
		if(type.equalsIgnoreCase("remove")) {
			
			PermissionAttachment attachment = target.addAttachment(plugin);
			attachment.setPermission(permissionsName, false);
			
			return true;
		}
		return false;
		
	}

}
