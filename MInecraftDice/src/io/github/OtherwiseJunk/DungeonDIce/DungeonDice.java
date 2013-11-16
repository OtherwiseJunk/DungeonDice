package io.github.OtherwiseJunk.DungeonDIce;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public final class DungeonDice extends JavaPlugin {
    @Override

    public void onEnable(){
    	getLogger().info("Dungeon Dice, signing in!");
    }

 

    @Override

    public void onDisable() {
    	getLogger().info("Dungeon Dice, signing out!!");
    }
    
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){

    	if(cmd.getName().equalsIgnoreCase("DDRoll")){ // If the player typed /basic then do the following...
    		
    		Dice dice = new Dice(Integer.parseInt(args[1]));
    		getServer().broadcastMessage(sender + "rolled" +args[0]+ "d" + args[1] + "and got a " + dice.Roll(Integer.parseInt(args[0])));
    		
    		return true;

    	} //If this has happened the function will return true. 

            // If this hasn't happened the a value of false will be returned.

    	return false; 

    }

 
    
}