package me.crafter.mc.splatoon;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class SplatoonGunListener implements Listener {
	
	private Map<String, Player> lastshot = new HashMap<String, Player>();
	
	@EventHandler
	public void fire(PlayerInteractEvent event){
		Player player = event.getPlayer();
		SplatterShot gun = SplatterShot.getGun(player.getItemInHand());
		if (gun == null) return;
		switch (event.getAction()){
		case RIGHT_CLICK_AIR:
		case RIGHT_CLICK_BLOCK:
			// Primary
			Location ploc = player.getEyeLocation();
			Snowball snowball = (Snowball)player.getWorld().spawn(ploc.add(ploc.getDirection()), Snowball.class);
			snowball.setVelocity(ploc.getDirection());
			
			
			
			
			break;
		case LEFT_CLICK_AIR:
		case LEFT_CLICK_BLOCK:
			// Secondary
			
			
			
			

			break;
		default:
			break;
		}
		
		
	}

}


