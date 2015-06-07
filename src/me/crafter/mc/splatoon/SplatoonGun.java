package me.crafter.mc.splatoon;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class SplatoonGun implements Listener {
	
	private Map<String, Player> lastshot = new HashMap<String, Player>();
	
	@EventHandler
	public void fire(PlayerInteractEvent event){
		Player player = event.getPlayer();
		SplatterShot gun = SplatterShot.getGun(player.getItemInHand());
		if (gun == null) return;
		switch (event.getAction()){
		case LEFT_CLICK_AIR:
		case LEFT_CLICK_BLOCK:
			// Primary
			
			
			
			
			break;
		case RIGHT_CLICK_AIR:
		case RIGHT_CLICK_BLOCK:
			// Secondary
		
			
			
			break;
		default:
			break;
		}
		
		
	}

}


