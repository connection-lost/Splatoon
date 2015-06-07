package me.crafter.mc.splatoon;

import java.util.logging.Logger;
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

	
}
