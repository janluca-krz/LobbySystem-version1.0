package de.modie.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;

import de.modie.main.Main;


public class Scoreboard implements Listener {
	
	public static void setScoreboard(Player p) {
		Main.sbside = Bukkit.getScoreboardManager().getNewScoreboard();
		Objective obj = Main.sbside.registerNewObjective("aaa", "bbb");
		
		obj.setDisplayName("§bEasyMC.eu - Netzwerk");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		
		Score nameheading = obj.getScore("§7Name:");
		Score name = obj.getScore("§b " + p.getDisplayName());
		Score platzhalter = obj.getScore(" ");
		Score Discord = obj.getScore("§7Discord:");
		Score discordIP = obj.getScore("§6https://discord.gg/");
		Score platzhalter2 = obj.getScore("§b");
		Score online = obj.getScore("§7Online:");
		@SuppressWarnings("deprecation")
		Score onlinePlayers = obj.getScore(Bukkit.getServer().getOfflinePlayer("§6" + Bukkit.getOnlinePlayers().size() + "§7/§6100"));
		
		nameheading.setScore(100);
		name.setScore(99);
		platzhalter.setScore(98);
		Discord.setScore(97);
		discordIP.setScore(96);
		platzhalter2.setScore(95);
		online.setScore(94);
		onlinePlayers.setScore(93);
		
		p.setScoreboard(Main.sbside);
	}

}
