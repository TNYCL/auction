package com.auction.utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class UtilChat {

	public static String color(String msg) {
		String message = ChatColor.translateAlternateColorCodes('&', msg);
		return message;
	}
	
	public static void message(Player player, String msg) {
		player.sendMessage(color(msg));
	}
	
}
