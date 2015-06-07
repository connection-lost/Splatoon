package me.crafter.mc.splatoon;

import java.util.List;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SplatterShot {

	private int power;
	private int firerate;
	private int bulletspeed;
	private int accuracy;
	
	public SplatterShot(int _power, int _firerate, int _bulletspeed, int _accuracy){
		power = _power;
		firerate = _firerate;
		bulletspeed = _bulletspeed;
		accuracy = _accuracy;
	}
	
	

	/**
	 * Usage: Returns a spatter gun based on an ItemStack,
	 *        if the gun is invalid, return null.
	 * Requires: ItemStack
	 * Returns: Valid -> SplatterGun, Invalid -> null
	*/
	public static SplatterShot getGun(ItemStack item){
		ItemMeta itemmeta = item.getItemMeta();
		try {
			List<String> lore = itemmeta.getLore();
			int power = Integer.parseInt(lore.get(0).split(" ")[1]);
			int firerate = Integer.parseInt(lore.get(1).split(" ")[1]);
			int bulletspeed = Integer.parseInt(lore.get(2).split(" ")[1]);
			int accuracy = Integer.parseInt(lore.get(3).split(" ")[1]);
			return new SplatterShot(power, firerate, bulletspeed, accuracy);
		} catch (Exception ex) {}
		return null;
	}
	
}
