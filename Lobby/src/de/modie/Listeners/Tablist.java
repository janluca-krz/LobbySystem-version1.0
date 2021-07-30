package de.modie.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

public class Tablist {
	
	private static Scoreboard sb;
	
	public static void setScoreboard() {
		sb = Bukkit.getScoreboardManager().getNewScoreboard();
		
		sb.registerNewTeam("000Owner");
		sb.registerNewTeam("001Admin");
		sb.registerNewTeam("002Sr-Dev");
		sb.registerNewTeam("003Dev");
		sb.registerNewTeam("004Jr-Dev");
		sb.registerNewTeam("005Sr-Mod");
		sb.registerNewTeam("006Mod");
		sb.registerNewTeam("007Jr-Mod");
		sb.registerNewTeam("008Sr-Sup");
		sb.registerNewTeam("009Sup");
		sb.registerNewTeam("010Jr-Sup");
		sb.registerNewTeam("011Sr-Content");
		sb.registerNewTeam("012Content");
		sb.registerNewTeam("013Jr-Content");
		sb.registerNewTeam("014Sr-Builder");
		sb.registerNewTeam("015Builder");
		sb.registerNewTeam("016Jr-Builder");
		sb.registerNewTeam("017Easy");
		sb.registerNewTeam("018VIP");
		sb.registerNewTeam("0019Premium");
		
		sb.getTeam("000Owner").setPrefix("§4Owner§7:");
		sb.getTeam("001Admin").setPrefix("§cAdmin§7:");;
		sb.getTeam("002Sr-Dev").setPrefix("§bSr-Dev§7:");
		sb.getTeam("003Dev").setPrefix("§bDev §7: ");
		sb.getTeam("004Jr-Dev").setPrefix("§bJr-Dev§7:");
		sb.getTeam("005Sr-Mod").setPrefix("§1Sr-Mod§7:");
		sb.getTeam("006Mod").setPrefix("§1Mod§7:");
		sb.getTeam("007Jr-Mod").setPrefix("§1Jr-Mod§7:");
		sb.getTeam("008Sr-Sup").setPrefix("§2Sr-Sup§7:");
		sb.getTeam("009Sup").setPrefix("§2Sup§7:");
		sb.getTeam("010Jr-Sup").setPrefix("§2Jr-Sup§7:");
		sb.getTeam("011Sr-Content").setPrefix("§3Sr-Content§7:");
		sb.getTeam("012Content").setPrefix("§3Content§7:");
		sb.getTeam("013Jr-Content").setPrefix("§3Jr-Content§7:");
		sb.getTeam("014Sr-Builder").setPrefix("§eSr-Builder§7:");
		sb.getTeam("015Builder").setPrefix("§eBuilder§7:");
		sb.getTeam("016Jr-Builder").setPrefix("§eJr-Content§7:");
		sb.getTeam("017Easy").setPrefix("§bEasy§7:");
		sb.getTeam("018VIP").setPrefix("§5VIP§7:");
		sb.getTeam("0019Premium").setPrefix("§6Premium§7:");
		
		for(Player all: Bukkit.getOnlinePlayers()) {
			setTeam(all);
		}
		
	}
	
	@SuppressWarnings("deprecation")
	public static void setTeam(Player p) {
		String team = "";
		
		if(p.hasPermission("lobby.owner") || p.isOp()) {
			team = "000Owner";
		} else {
			team = "001Admin";
		} 
		if(p.hasPermission("lobby.lobby.srdev")) {
			team = "002Sr-Dev";
		} else {
			team = "003Dev";
		}
		if(p.hasPermission("lobby.jrdev")) {
			team = "004Jr-Dev";
		} else {
			team = "005Sr-Mod";
		} 
		if(p.hasPermission("lobby.mod")) {
			team = "006Mod";
		} else {
			team = "007Jr-Mod";
		}
		if(p.hasPermission("lobby.srsup")) {
			team = "008Sr-Sup";
		} else {
			team = "009Sup";
		}
		if(p.hasPermission("loby.jrsup")) {
			team = "010Jr-Sup";
		} else {
			team = "011Sr-Content";
		}
		if(p.hasPermission("lobby.content")) {
			team = "012Content";
		} else {
			team = "013Jr-Content";
		}
		if(p.hasPermission("lobby.srbuilder")) {
			team = "014Sr-Builder";
		} else {
			team = "015Builder";
		}
		if(p.hasPermission("lobby.jrbuilder")) {
			team = "016Jr-Builder";
		} else {
			team = "017Easy";
		}
		if(p.hasPermission("lobby.vip")) {
			team = "018VIP";
		} else {
			team = "0019Premium";
		}
		
		sb.getTeam(team).addPlayer(p);
		p.setScoreboard(sb);
		
	}

}
