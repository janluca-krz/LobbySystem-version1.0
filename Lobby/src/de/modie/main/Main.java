package de.modie.main;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.Difficulty;
import org.bukkit.event.inventory.InventoryType;

import de.modie.Commands.FlyComand;
import de.modie.Commands.PermissionsCommand;
import de.modie.Commands.WarpCommand;
import de.modie.Items.Funktionen;
import de.modie.Items.Interact;
import de.modie.Items.InventoryClick;
import de.modie.Items.JoinEvent;
import de.modie.Listeners.AntiDrop;
import de.modie.Listeners.Double_Jump;
import de.modie.Listeners.FoodBar;
import de.modie.Listeners.ItemSwitchEvent;
import de.modie.Listeners.Join;
import de.modie.Listeners.PlayerDamageEvent;
import de.modie.Listeners.PremiumChat;
import de.modie.Listeners.SendTab;
import de.modie.Listeners.Sneak;
import de.modie.Listeners.WeatherChang;
import de.modie.utils.Config;


public class Main extends JavaPlugin implements Listener {
	public static String vord = "Lobby-37";
	private static Config cfg;
	
	public static Inventory NavigatorInventory = Bukkit.createInventory(null, 6*9, "§cNavigator");
	public static Inventory SettingsInventry = Bukkit.createInventory(null, 6*9, "§2Einstellungen");
	public static Inventory FreundeInventory = Bukkit.createInventory(null, 6*9, "§6Freunde");
	public static Inventory LobbySwitcher = Bukkit.createInventory(null, InventoryType.HOPPER, "§5Lobby - Switcher");
	public static Inventory PlayerHiderInventory = Bukkit.createInventory(null, InventoryType.HOPPER, "§3Player - Hiderr");
	public static Inventory ExtrasInentory = Bukkit.createInventory(null, InventoryType.CHEST, "§6Extra's");
	public static Inventory VisuelleKostemicsInventory = Bukkit.createInventory(null, InventoryType.HOPPER, "§aVisuelle Kosmetic");
	public static Inventory OtherKosmetics = Bukkit.createInventory(null, InventoryType.HOPPER, "§aAndere Kosmetics");
	public static Scoreboard sbside;
	public static boolean isDoubleJump;
	
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new Join(), this);
		Bukkit.getPluginManager().registerEvents(new FoodBar(), this);
		Bukkit.getPluginManager().registerEvents(new PlayerDamageEvent(), this);
		Bukkit.getPluginManager().registerEvents(new JoinEvent(), this);
		Bukkit.getPluginManager().registerEvents(new Interact(), this);
		Bukkit.getPluginManager().registerEvents(new PremiumChat(), this);
		Bukkit.getPluginManager().registerEvents(new SendTab(), this);
		Bukkit.getPluginManager().registerEvents(new AntiDrop(), this);
		Bukkit.getPluginManager().registerEvents(new InventoryClick(), this);
		Bukkit.getPluginManager().registerEvents(new Double_Jump(), this);
		Bukkit.getPluginManager().registerEvents(new Sneak(), this);
		Bukkit.getPluginManager().registerEvents(new ItemSwitchEvent(), this);
		Bukkit.getPluginManager().registerEvents(new WeatherChang(), this);
		Bukkit.getPluginManager().registerEvents(new de.modie.Listeners.Scoreboard(), this);
		
		getCommand("fly").setExecutor(new FlyComand());
		getCommand("permission").setExecutor(new PermissionsCommand(this));
		getCommand("warp").setExecutor(new WarpCommand());
		cfg = new Config("warps.yml", getDataFolder());
		
		Funktionen.befüllen();
		Funktionen.Compassbefüllen(null);
		Funktionen.Platzhalter(null);
		Funktionen.Playerhider(null);
		Funktionen.GadgetsMenue(null);
		Funktionen.Einstellungsmenue(null);
		Bukkit.getWorld(vord).setPVP(false);
		Bukkit.getWorld(vord).setDifficulty(Difficulty.PEACEFUL);
		Bukkit.getWorld(vord).setGameRuleValue("DoEntitySpawning", vord);
		
	}
	
	public static Config getCfg() {
		return cfg;
	}
	
}

