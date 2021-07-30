package de.modie.Items;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import de.modie.main.Main;
import de.modie.warp.WarpManager;
import net.minecraft.server.v1_8_R3.EnumParticle;


public class InventoryClick implements Listener {
	public static ArrayList<Player> speed = new ArrayList<>();
	public static ArrayList<Player> DoubleJumpKlick = new ArrayList<>();
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@EventHandler
	public void KlickEvent(InventoryClickEvent e) {
		Player p = null;
		if(e.getWhoClicked() instanceof Player) {
			p = (Player) e.getWhoClicked();
		}
		
		
		if(!(e.getWhoClicked() instanceof Player)) return;
		if(e.getCurrentItem() == null) return;
		if(e.getCurrentItem().getType() == null)return;
		if(e.getInventory().getTitle().equals("§cNavigator")) {
			e.setCancelled(true);
			switch (e.getCurrentItem().getType()) {
			case MAGMA_CREAM:
				p.teleport(WarpManager.getWarp("Spawn"));
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 3, 1);
	            Particle particle = new Particle(EnumParticle.HEART, p.getLocation().add(0,0,0), true, 0.75f, 0.75f, 0.75f, 0, 10);
	            particle.sendAll();
				break;
			case WORKBENCH:
				p.teleport(WarpManager.getWarp("CityBuild"));
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 3, 1);
	            Particle particle1 = new Particle(EnumParticle.HEART, p.getLocation().add(0,0,0), true, 0.75f, 0.75f, 0.75f, 0, 10);
	            particle1.sendAll();
	            break;
	            
			case BED:
				p.teleport(WarpManager.getWarp("BW"));
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 3, 1);
	            Particle particle11 = new Particle(EnumParticle.HEART, p.getLocation().add(0,0,0), true, 0.75f, 0.75f, 0.75f, 0, 10);
	            particle11.sendAll();
	            break;
	            
			case DIAMOND_BOOTS:
				p.teleport(WarpManager.getWarp("GetDown"));
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 3, 1);
	            Particle particle111 = new Particle(EnumParticle.HEART, p.getLocation().add(0,0,0), true, 0.75f, 0.75f, 0.75f, 0, 10);
	            particle111.sendAll();
	            break;
			case STICK:
				p.teleport(WarpManager.getWarp("KnockFFA"));
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 3, 1);
	            Particle particle1111 = new Particle(EnumParticle.HEART, p.getLocation().add(0,0,0), true, 0.75f, 0.75f, 0.75f, 0, 10);
	            particle1111.sendAll();
	            break;
			case IRON_PLATE:
				p.teleport(WarpManager.getWarp("oneblock"));
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 3, 1);
	            Particle particle11111 = new Particle(EnumParticle.HEART, p.getLocation().add(0,0,0), true, 0.75f, 0.75f, 0.75f, 0, 10);
	            particle11111.sendAll();
	            break;
			case GRASS:
				p.teleport(WarpManager.getWarp("SkyWars"));
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 3, 1);
	            Particle particle111111 = new Particle(EnumParticle.HEART, p.getLocation().add(0,0,0), true, 0.75f, 0.75f, 0.75f, 0, 10);
	            particle111111.sendAll();
	            break;
			case YELLOW_FLOWER:
				p.teleport(WarpManager.getWarp("Coins"));
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 3, 1);
	            Particle particle1111111 = new Particle(EnumParticle.HEART, p.getLocation().add(0,0,0), true, 0.75f, 0.75f, 0.75f, 0, 10);
	            particle1111111.sendAll();
	            break;

			default:
				p.sendMessage("§7Dieser slot ist leer :(");
				p.closeInventory();
				break;
			}
				
		}
		
		ItemStack Doublejump = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta Doublejumpmeta = Doublejump.getItemMeta();
		Doublejumpmeta.setDisplayName("§6Double Jump ist §aAktiviert");
		Doublejump.setItemMeta(Doublejumpmeta);
		
		ItemStack Doublejumpaus = new ItemStack(Material.BARRIER);
		ItemMeta Doublejumpausmeta = Doublejumpaus.getItemMeta();
		Doublejumpmeta.setDisplayName("§6DoubleJump ist deaktiviert");
		Doublejumpaus.setItemMeta(Doublejumpausmeta);
		
		if(!(e.getWhoClicked() instanceof Player)) return;
		if(e.getCurrentItem() == null) return;
		if(e.getCurrentItem().getType() == null)return;
		if(e.getInventory().getTitle().equals("§2Einstellungen")) {
			e.setCancelled(true);
			switch (e.getCurrentItem().getType()) {
			case DIAMOND_BOOTS:
				Main.isDoubleJump = false;
					p.setAllowFlight(false);
					e.setCancelled(true);
					Main.SettingsInventry.remove(10);
					Main.SettingsInventry.setItem(10, Doublejumpaus);
					p.sendMessage("DoubleJump aus");
				break;
			case BARRIER:
					Main.SettingsInventry.remove(10);
					Main.SettingsInventry.setItem(10, Doublejump);
					p.sendMessage("DoubleJump an");
					p.setAllowFlight(true);
				
				break;

			default:
				break;
			}
		}
		
		if(!(e.getWhoClicked() instanceof Player)) return;
		if(e.getCurrentItem() == null) return;
		if(e.getCurrentItem().getType() == null)return;
		if(e.getInventory().getTitle().equals("§6Extra's")) {
			e.setCancelled(true);
			switch (e.getCurrentItem().getType()) {
			case ENDER_CHEST:
				p.openInventory(Main.VisuelleKostemicsInventory);
				e.setCancelled(true);
				break;

			default:
				p.sendMessage("§7Dieser slot ist leer :(");
				p.closeInventory();
				break;
			}
				
		}
		
		ItemStack glaskopf = new ItemStack(Material.GLASS);
		ItemMeta glaskopfmeta = glaskopf.getItemMeta();
		glaskopfmeta.setDisplayName("§2Glas Kopf");
		glaskopf.setItemMeta(glaskopfmeta);
		
		ItemStack kopf = new ItemStack(Material.GRASS);
		ItemMeta kopfmeta = kopf.getItemMeta();
		kopfmeta.setDisplayName("§6Grass Block");
		kopf.setItemMeta(kopfmeta);
		
		ItemStack glaskopf11 = new ItemStack(Material.LAPIS_BLOCK);
		ItemMeta glaskopfmeta11 = glaskopf11.getItemMeta();
		glaskopfmeta11.setDisplayName("§bLapis Block");
		glaskopf11.setItemMeta(glaskopfmeta11);
		
		ItemStack glaskopf111 = new ItemStack(Material.BEDROCK);
		ItemMeta glaskopfmeta111 = glaskopf111.getItemMeta();
		glaskopfmeta111.setDisplayName("§0Bedrock");
		glaskopf111.setItemMeta(glaskopfmeta111);
		
		ItemStack glaskopf1111 = new ItemStack(Material.WALL_SIGN);
		ItemMeta glaskopfmeta1111 = glaskopf1111.getItemMeta();
		glaskopfmeta1111.setDisplayName("§cAlles Entfernen");
		glaskopf1111.setItemMeta(glaskopfmeta1111);
		
		
		if(!(e.getWhoClicked() instanceof Player)) return;
		if(e.getCurrentItem() == null) return;
		if(e.getCurrentItem().getType() == null)return;
		if(e.getInventory().getTitle().equals("§aVisuelle Kosmetic")) {
			e.setCancelled(true);
			switch (e.getCurrentItem().getType()) {
			case GLASS:
					p.getInventory().setHelmet(null);
					p.getInventory().setHelmet(glaskopf);
					e.setCancelled(true);	
					p.sendMessage("§aDu hast nun den §5Glass §ablock als Kopf");
				break;
				
			case GRASS:
					p.getInventory().setHelmet(null);
					p.getInventory().setHelmet(kopf);
					e.setCancelled(true);
					p.sendMessage("§aDu hast nun den §5Grass §ablock als Kopf");
				break;
				
			case LAPIS_BLOCK:
				if(e.getInventory().getTitle().equals("§aVisuelle Kosmetic")) {
					p.getInventory().setHelmet(null);
					p.getInventory().setHelmet(glaskopf11);
					e.setCancelled(true);
					p.sendMessage("§aDu hast nun den §5Lapis §aBlock als Kopf");
				}
				break;
				
			case BEDROCK:
				p.getInventory().setHelmet(null);
				p.getInventory().setHelmet(glaskopf111);
				e.setCancelled(true);
				p.sendMessage("§aDu hast nun den §5Bedrock §aBlock als Kopf");
				break;
			
			case SIGN:
				p.getInventory().setHelmet(null);
				p.sendMessage("§cDir wirden alle Hüte entfernt");
				break;

			default:
				p.sendMessage("§7Dieser slot ist leer :(");
				p.closeInventory();
				break;
			}
				
		}
		
		if(!(e.getWhoClicked() instanceof Player)) return;
		if(e.getCurrentItem() == null) return;
		if(e.getCurrentItem().getType() == null)return;
		if(e.getInventory().getTitle().equals("§3Player - Hiderr"))
			e.setCancelled(true);
		switch (e.getCurrentItem().getType()) {
		case INK_SACK:
			p.sendMessage("§aAlle spieler sind nun sichtbar");
			e.setCancelled(true);
			p.closeInventory();
			break;
		case REDSTONE_BLOCK:
			p.sendMessage("§cDu siehst nun keine Spieler mehr!");
			e.setCancelled(true);
			p.closeInventory();

		default:
			break;
		}
		
		if(!(e.getWhoClicked() instanceof Player)) return;
		if(e.getCurrentItem() == null) return;
		if(e.getCurrentItem().getType() == null)return;
		if(e.getInventory().getTitle().equals("§6Extras")) {
			e.setCancelled(true);
			switch (e.getCurrentItem().getType()) {
			case FEATHER:
				p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 3, 1);
	            Particle particle = new Particle(EnumParticle.HEART, p.getLocation().add(0,0,0), true, 0.75f, 0.75f, 0.75f, 0, 10);
	            particle.sendAll();
				break;

			default:
				p.sendMessage("§7Dieser slot ist leer :(");
				break;
			}
				
		}
		//Extras Inventar
		if(e.getInventory().getName().equals("§6Extras")) {
			e.setCancelled(true);	
		}
		//Lobby Switcher
		if(e.getInventory().getName().equals("§5Lobby - Switcher")) {
			e.setCancelled(true);	
		}
		
//		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Spawn")) {
//			p.teleport(Bukkit.getWorld(Main.vord).getSpawnLocation());
//			p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 3, 1);
//            Particle particle = new Particle(EnumParticle.HEART, p.getLocation().add(0,0,0), true, 0.75f, 0.75f, 0.75f, 0, 10);
//            particle.sendAll();
//			e.setCancelled(true);	
//		}
		
		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§3Player - Hider")) {
			e.setCancelled(true);
		}
		
		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§cNavigator")) {
			e.setCancelled(true);	
	}
		
		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Extras")) {
			e.setCancelled(true);	
	}
		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§bFreunde")) {
			e.setCancelled(true);	
	}
		
		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§5Lobby - Switcher")) {
			e.setCancelled(true);	
	}
		
		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§2Einstellungen")) {
			e.setCancelled(true);	
	}
		
		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§cSlientLobby")) {
			e.setCancelled(true);	
	}
		
		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§bServer infortamtionen")) {
			e.setCancelled(true);	
	}
		
		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§bBed§cWars - §6Rush BW - §5Gay BW")) {
			p.teleport(WarpManager.getWarp("BW"));
            Particle particle = new Particle(EnumParticle.HEART, p.getLocation().add(0,0,0), true, 0.75f, 0.75f, 0.75f, 0, 10);
            particle.sendAll();
			e.setCancelled(true);	
	}
		
		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§3SkyWars")) {
			p.teleport(WarpManager.getWarp("SkyWars"));
			p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 3, 1);
            Particle particle = new Particle(EnumParticle.HEART, p.getLocation().add(0,0,0), true, 0.75f, 0.75f, 0.75f, 0, 10);
            particle.sendAll();
			e.setCancelled(true);	
	}
		
		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§6CityBuild")) {
			p.teleport(WarpManager.getWarp("CityBuild"));
			p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 3, 1);
            Particle particle = new Particle(EnumParticle.HEART, p.getLocation().add(0,0,0), true, 0.75f, 0.75f, 0.75f, 0, 10);
            particle.sendAll();
			e.setCancelled(true);	
	}
		
		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§3Oneblock")) {
			p.teleport(WarpManager.getWarp("oneblock"));
			p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 3, 1);
            Particle particle = new Particle(EnumParticle.HEART, p.getLocation().add(0,0,0), true, 0.75f, 0.75f, 0.75f, 0, 10);
            particle.sendAll();
			e.setCancelled(true);	
	}
		
		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§5Coins")) {
			p.teleport(WarpManager.getWarp("Coins"));
			p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 3, 1);
            Particle particle = new Particle(EnumParticle.HEART, p.getLocation().add(0,0,0), true, 0.75f, 0.75f, 0.75f, 0, 10);
            particle.sendAll();
			e.setCancelled(true);	
	}
		
		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§eGetDown")) {
			p.teleport(WarpManager.getWarp("GetDown"));
			p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 3, 1);
            Particle particle = new Particle(EnumParticle.HEART, p.getLocation().add(0,0,0), true, 0.75f, 0.75f, 0.75f, 0, 10);
            particle.sendAll();
			e.setCancelled(true);	
	}
		
		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Knock§cFFA")) {
			p.teleport(WarpManager.getWarp("KnockFFA"));
			p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 3, 1);
            Particle particle = new Particle(EnumParticle.HEART, p.getLocation().add(0,0,0), true, 0.75f, 0.75f, 0.75f, 0, 10);
            particle.sendAll();
			e.setCancelled(true);	
	}

		if(e.getCurrentItem().getItemMeta().getDisplayName().equals("§bSpeed")) {
			if(p.hasPotionEffect(PotionEffectType.SPEED)) {
				p.removePotionEffect(PotionEffectType.SPEED);
				p.sendMessage("DU bist nun nicht mehr schneller");
				e.setCancelled(true);
			} else {
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				p.sendMessage("DU bist nun schneller");
				e.setCancelled(true);
			}
				e.setCancelled(true);	
		}
	}

}
