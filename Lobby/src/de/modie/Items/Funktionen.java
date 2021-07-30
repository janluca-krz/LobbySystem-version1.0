package de.modie.Items;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.modie.main.Main;

public class Funktionen {
	
	public static void befüllen() {
		

		
		ItemStack Lobby1 = new ItemStack(Material.BEACON);
		ItemMeta Lobby1meta = Lobby1.getItemMeta();
		Lobby1meta.setDisplayName("§5Lobby - 1");
		Lobby1.setItemMeta(Lobby1meta);
		
		ItemStack Lobby2 = new ItemStack(Material.BEACON);
		ItemMeta Lobby2meta = Lobby2.getItemMeta();
		Lobby2meta.setDisplayName("§5Lobby - 2");
		Lobby2.setItemMeta(Lobby2meta);
		
		ItemStack Lobby3 = new ItemStack(Material.BEACON);
		ItemMeta Lobby3meta = Lobby3.getItemMeta();
		Lobby3meta.setDisplayName("§5Lobby - 3");
		Lobby3.setItemMeta(Lobby3meta);
		
		ItemStack Lobby4 = new ItemStack(Material.BEACON);
		ItemMeta Lobby4meta = Lobby4.getItemMeta();
		Lobby4meta.setDisplayName("§5Lobby - 4");
		Lobby4.setItemMeta(Lobby4meta);
		
		Main.LobbySwitcher.setItem(0, Lobby1);
		Main.LobbySwitcher.setItem(1, Lobby2);
		Main.LobbySwitcher.setItem(2, Lobby3);
		Main.LobbySwitcher.setItem(3, Lobby4);
	}
	
	public static void Compassbefüllen(Player p) {
		
		ItemStack lobby = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta lobbymeta = lobby.getItemMeta();
		lobbymeta.setDisplayName("§6Spawn");
		lobby.setItemMeta(lobbymeta);
		
		ItemStack Bedwars = new ItemStack(Material.BED);
		ItemMeta Bedwarsmeta = Bedwars.getItemMeta();
		Bedwarsmeta.setDisplayName("§bBed§cWars - §6Rush BW - §5Gay BW");
		Bedwars.setItemMeta(Bedwarsmeta);
		
		ItemStack Skywars = new ItemStack(Material.GRASS);
		ItemMeta Skywarsmeta = Bedwars.getItemMeta();
		Skywarsmeta.setDisplayName("§3SkyWars");
		Skywars.setItemMeta(Skywarsmeta);
		
		ItemStack stick = new ItemStack(Material.STICK);
		ItemMeta stickmeta = Bedwars.getItemMeta();
		stickmeta.setDisplayName("§6Knock§cFFA");
		stick.setItemMeta(stickmeta);
		
		ItemStack Getdown = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta Getdownmeta = Bedwars.getItemMeta();
		Getdownmeta.setDisplayName("§eGetDown");
		Getdown.setItemMeta(Getdownmeta);
		
		ItemStack oneblock = new ItemStack(Material.IRON_PLATE);
		ItemMeta oneblockmeta = oneblock.getItemMeta();
		oneblockmeta.setDisplayName("§3Oneblock");
		oneblock.setItemMeta(oneblockmeta);
		
		ItemStack CityBuild = new ItemStack(Material.WORKBENCH);
		ItemMeta CityBuildmeta = CityBuild.getItemMeta();
		CityBuildmeta.setDisplayName("§6CityBuild");
		CityBuild.setItemMeta(CityBuildmeta);
		
		ItemStack coins = new ItemStack(Material.YELLOW_FLOWER);
		ItemMeta coinsmeta = coins.getItemMeta();
		coinsmeta.setDisplayName("§5Coins");
		coins.setItemMeta(coinsmeta);
		
		Main.NavigatorInventory.setItem(4, lobby);
		Main.NavigatorInventory.setItem(20, Bedwars);
		Main.NavigatorInventory.setItem(24, Skywars);
		Main.NavigatorInventory.setItem(30, Getdown);
		Main.NavigatorInventory.setItem(32, oneblock);
		Main.NavigatorInventory.setItem(12, CityBuild);
		Main.NavigatorInventory.setItem(14, coins);
		Main.NavigatorInventory.setItem(40, stick);
	}
	
	public static void Platzhalter(Player p) {

		
		ItemStack Platzhalter = new ItemStack(Material.STAINED_GLASS_PANE);
		ItemMeta Platzhaltermeta = Platzhalter.getItemMeta();
		Platzhaltermeta.setDisplayName(" ");
		Platzhalter.setItemMeta(Platzhaltermeta);
		
		Main.NavigatorInventory.setItem(25, Platzhalter);
		Main.NavigatorInventory.setItem(26, Platzhalter);
		Main.NavigatorInventory.setItem(27, Platzhalter);
		Main.NavigatorInventory.setItem(28, Platzhalter);
		Main.NavigatorInventory.setItem(29, Platzhalter);
		Main.NavigatorInventory.setItem(31, Platzhalter);
		Main.NavigatorInventory.setItem(33, Platzhalter);
		Main.NavigatorInventory.setItem(34, Platzhalter);
		Main.NavigatorInventory.setItem(35, Platzhalter);
		Main.NavigatorInventory.setItem(36, Platzhalter);
		Main.NavigatorInventory.setItem(37, Platzhalter);
		Main.NavigatorInventory.setItem(38, Platzhalter);
		Main.NavigatorInventory.setItem(39, Platzhalter);
		Main.NavigatorInventory.setItem(41, Platzhalter);
		Main.NavigatorInventory.setItem(42, Platzhalter);
		Main.NavigatorInventory.setItem(43, Platzhalter);
		Main.NavigatorInventory.setItem(44, Platzhalter);
		Main.NavigatorInventory.setItem(45, Platzhalter);
		Main.NavigatorInventory.setItem(46, Platzhalter);
		Main.NavigatorInventory.setItem(47, Platzhalter);
		Main.NavigatorInventory.setItem(48, Platzhalter);
		Main.NavigatorInventory.setItem(49, Platzhalter);
		Main.NavigatorInventory.setItem(50, Platzhalter);
		Main.NavigatorInventory.setItem(51, Platzhalter);
		Main.NavigatorInventory.setItem(52, Platzhalter);
		Main.NavigatorInventory.setItem(53, Platzhalter);
		Main.NavigatorInventory.setItem(0, Platzhalter);
		Main.NavigatorInventory.setItem(1, Platzhalter);
		Main.NavigatorInventory.setItem(2, Platzhalter);
		Main.NavigatorInventory.setItem(3, Platzhalter);
		Main.NavigatorInventory.setItem(5, Platzhalter);
		Main.NavigatorInventory.setItem(6, Platzhalter);
		Main.NavigatorInventory.setItem(7, Platzhalter);
		Main.NavigatorInventory.setItem(8, Platzhalter);
		Main.NavigatorInventory.setItem(9, Platzhalter);
		Main.NavigatorInventory.setItem(10, Platzhalter);
		Main.NavigatorInventory.setItem(11, Platzhalter);
		Main.NavigatorInventory.setItem(13, Platzhalter);
		Main.NavigatorInventory.setItem(15, Platzhalter);
		Main.NavigatorInventory.setItem(16, Platzhalter);
		Main.NavigatorInventory.setItem(17, Platzhalter);
		Main.NavigatorInventory.setItem(18, Platzhalter);
		Main.NavigatorInventory.setItem(19, Platzhalter);
		Main.NavigatorInventory.setItem(21, Platzhalter);
		Main.NavigatorInventory.setItem(22, Platzhalter);
		Main.NavigatorInventory.setItem(23, Platzhalter);
		Main.NavigatorInventory.setItem(25, Platzhalter);
		Main.LobbySwitcher.setItem(4, Platzhalter);
	}

	public static void Playerhider(Player p) {
		
		ItemStack player = new ItemStack(Material.INK_SACK,1, (byte)10);
		ItemMeta playermeta = player.getItemMeta();
		playermeta.setDisplayName("§a Alle sichtbar");
		player.setItemMeta(playermeta);
		
		@SuppressWarnings("deprecation")
		ItemStack vip = new ItemStack(Material.INK_SACK,1, DyeColor.CYAN.getData());
		ItemMeta vipmeta = vip.getItemMeta();
		vipmeta.setDisplayName("§5VIP's und Teammitglider");
		vip.setItemMeta(vipmeta);
		
		ItemStack admin = new ItemStack(Material.REDSTONE_BLOCK);
		ItemMeta adminmeta = admin.getItemMeta();
		adminmeta.setDisplayName("§cNiemand sichtbar");
		admin.setItemMeta(adminmeta);
		
		Main.PlayerHiderInventory.setItem(0, player);
		Main.PlayerHiderInventory.setItem(2, vip);
		Main.PlayerHiderInventory.setItem(4, admin);
		
		
	}

	public static void Einstellungsmenue (Player p) {
		
		ItemStack Doublejump = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta Doublejumpmeta = Doublejump.getItemMeta();
		Doublejumpmeta.setDisplayName("§6Double Jump ist §aAktiviert");
		Doublejump.setItemMeta(Doublejumpmeta);
		
		ItemStack Doublejumpaus = new ItemStack(Material.BARRIER);
		ItemMeta Doublejumpausmeta = Doublejumpaus.getItemMeta();
		Doublejumpmeta.setDisplayName("§6DoubleJump ist deaktiviert");
		Doublejumpaus.setItemMeta(Doublejumpausmeta);
		
		Main.SettingsInventry.setItem(10, Doublejumpaus);
		Main.SettingsInventry.setItem(10, Doublejump);
		
		
	}

	public static void GadgetsMenue(Player p) {
		ItemStack Visual = new ItemStack(Material.ENDER_CHEST);
		ItemMeta Visualmeta = Visual.getItemMeta();
		Visualmeta.setDisplayName("§aVisuelle Kosmetics");
		Visual.setItemMeta(Visualmeta);
		
		ItemStack glaskopf = new ItemStack(Material.GLASS);
		ItemMeta glaskopfmeta = glaskopf.getItemMeta();
		glaskopfmeta.setDisplayName("§2Glas Kopf");
		glaskopf.setItemMeta(glaskopfmeta);
		
		ItemStack glaskopf1 = new ItemStack(Material.GRASS);
		ItemMeta glaskopfmeta1 = glaskopf1.getItemMeta();
		glaskopfmeta1.setDisplayName("§6Grass Block");
		glaskopf1.setItemMeta(glaskopfmeta1);
		
		ItemStack glaskopf11 = new ItemStack(Material.LAPIS_BLOCK);
		ItemMeta glaskopfmeta11 = glaskopf11.getItemMeta();
		glaskopfmeta11.setDisplayName("§bLapis Block");
		glaskopf11.setItemMeta(glaskopfmeta11);
		
		ItemStack glaskopf111 = new ItemStack(Material.BEDROCK);
		ItemMeta glaskopfmeta111 = glaskopf111.getItemMeta();
		glaskopfmeta111.setDisplayName("§0Bedrock");
		glaskopf111.setItemMeta(glaskopfmeta111);
		
		ItemStack glaskopf1111 = new ItemStack(Material.SIGN);
		ItemMeta glaskopfmeta1111 = glaskopf1111.getItemMeta();
		glaskopfmeta1111.setDisplayName("§cAlles Entfernen");
		glaskopf1111.setItemMeta(glaskopfmeta1111);
		
		
		Main.ExtrasInentory.setItem(11, Visual);
		Main.VisuelleKostemicsInventory.setItem(0, glaskopf);
		Main.VisuelleKostemicsInventory.setItem(1, glaskopf1);
		Main.VisuelleKostemicsInventory.setItem(2, glaskopf11);
		Main.VisuelleKostemicsInventory.setItem(3, glaskopf111);
		Main.VisuelleKostemicsInventory.setItem(4, glaskopf1111);
	}
}
