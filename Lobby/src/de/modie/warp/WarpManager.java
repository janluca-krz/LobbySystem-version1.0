package de.modie.warp;

import org.bukkit.Location;
import de.modie.main.Main;

public class WarpManager {
	
	public static Location getWarp(String name) {
		return (Location) Main.getCfg().getConfiguration().get(name);
	}
	
	public static void CreateWarp(String name, Location location) {
		Main.getCfg().set(name, location);
		Main.getCfg().save();
	}
	
	public static void deleteWarp(String name) {
		Main.getCfg().set(name, null);
		Main.getCfg().save();
	}

}
