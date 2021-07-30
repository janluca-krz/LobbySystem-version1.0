package de.modie.Listeners;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.util.Vector;
import de.modie.Items.InventoryClick;

import org.bukkit.GameMode;


public class Double_Jump implements Listener{

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        p.setAllowFlight(true);
        p.setFlying(false);
    }

    @EventHandler 
    (priority = EventPriority.HIGH)
    public void onFallDamage(EntityDamageEvent event) {
    if(event.getEntity() instanceof Player && event.getCause() == DamageCause.FALL)
    	event.setCancelled(true); }

    @EventHandler
    public void onFly(PlayerToggleFlightEvent e) {
        Player p = e.getPlayer();
	        if(p.getGameMode() == GameMode.ADVENTURE) {
	            e.setCancelled(true);
	            p.playSound(p.getEyeLocation(), Sound.ENDERDRAGON_WINGS, 3, 1);
	            p.setAllowFlight(false);
	            p.setFlying(false);
	            p.setVelocity(p.getLocation().getDirection().multiply(0.9).add(new Vector(0,0.8,0)));
	            }
        }

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        Player p = e.getPlayer();
	        if(p.getGameMode() == GameMode.ADVENTURE) {
	        	if(InventoryClick.DoubleJumpKlick.contains(p)) {
		            if(p.getLocation().add(0, -1, 0).getBlock().getType() != Material.AIR) {
		                p.setAllowFlight(true);
		                p.setFlying(false);	            
		            }
	        	}
	        }
    }

}