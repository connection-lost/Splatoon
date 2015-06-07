package me.crafter.mc.splatoon;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Splatoon extends JavaPlugin {

	public final Logger logger = Logger.getLogger("Mincraft");

	public void onEnable(){
		// Read configs
		// TODO config reading
		
		
		// Init listeners
    	PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new SplatoonGun(), this);
	}
 

    public void onDisable() {
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, final String[] args){
    	if (cmd.getName().equals("splatoon")){
    		// Not require player
    		
    		
    		
    		
    		
    		
    		
    		// Requires player
    		if (!(sender instanceof Player)) return true;
    		Player player = (Player)sender;
    		if (args.length == 0){
    			// TODO show help
    		} else {
    			if (args[0].equals("make")){
    				try {
    					int color = Integer.parseInt(args[1]);
    					int power = Integer.parseInt(args[2]);
    					int firerate = Integer.parseInt(args[3]);
    					int bulletspeed = Integer.parseInt(args[4]);
    					int accuracy = Integer.parseInt(args[5]);
    					SplatterShot.makeGun(player, color, power, firerate, bulletspeed, accuracy);
    					player.sendMessage("Made a gun.");
    				} catch (Exception ex) {
    					player.sendMessage("Something wrong");
    				}
    			}
    			
    			
    		}
    		
    		
    		
    		
    	}
    	return true;
    }
	
}
