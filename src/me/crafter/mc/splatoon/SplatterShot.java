package me.crafter.mc.splatoon;

import java.util.LinkedList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SplatterShot {

	private int color;
	private int power;
	private int firerate;
	private int bulletspeed;
	private int accuracy;
	
	public SplatterShot(int _color, int _power, int _firerate, int _bulletspeed, int _accuracy){
		color = _color;
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
			int color = Integer.parseInt(lore.get(0).split(" ")[1]);
			int power = Integer.parseInt(lore.get(1).split(" ")[1]);
			int firerate = Integer.parseInt(lore.get(2).split(" ")[1]);
			int bulletspeed = Integer.parseInt(lore.get(3).split(" ")[1]);
			int accuracy = Integer.parseInt(lore.get(4).split(" ")[1]);
			return new SplatterShot(color, power, firerate, bulletspeed, accuracy);
		} catch (Exception ex) {}
		return null;
	}
	
	public static void makeGun(Player player, int color, int power, int firerate, int bulletspeed, int accuracy){
		ItemStack item = player.getItemInHand();
		if (item == null || item.getType().equals(Material.AIR)){
			player.sendMessage(ChatColor.RED + "Not a correct item.");
		} else {
			player.setItemInHand(makeGun(player.getItemInHand(), color, power, firerate, bulletspeed, accuracy));
		}
		
	}
	
	public static ItemStack makeGun(ItemStack original, int color, int power, int firerate, int bulletspeed, int accuracy){
		ItemMeta itemmeta = original.getItemMeta();
		List<String> lore = new LinkedList<String>();
		lore.add(ChatColor.WHITE + "Color: " + color);
		lore.add(ChatColor.WHITE + "Power: " + power);
		lore.add(ChatColor.WHITE + "Fire Rate: " + firerate);
		lore.add(ChatColor.WHITE + "Projectile Speed: " + bulletspeed);
		lore.add(ChatColor.WHITE + "Accuracy: " + accuracy);
		itemmeta.setLore(lore);
		original.setItemMeta(itemmeta);
		return original;
	}
	
}
