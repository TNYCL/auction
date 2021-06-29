package com.craftrise.util;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.craftrise.Main;
import com.craftrise.cache.Auction;

public class DataUtil {
	
	public static void setAuction(Auction auction) {
		Main.getSpring().mongoTemplate().insert(auction);
	}
	
	public static void updateAuction(String where, Object is, String key, Object value) {
		Query query = new Query();
		query.addCriteria(Criteria.where(where).is(is));
		Update update = new Update();
		update.set(key, value);
		Main.getSpring().mongoTemplate().updateFirst(query, update, Auction.class);
	}
	
}