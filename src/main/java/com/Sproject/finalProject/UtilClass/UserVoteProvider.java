package com.Sproject.finalProject.UtilClass;

import java.util.HashMap;
import java.util.Map;

public class UserVoteProvider {
	private static UserVoteProvider userVoteProvider = null;
	private Map<Integer, Integer> map = null;
	
	private UserVoteProvider(Map<Integer, Integer> map1) {
		map = map1;
	}
	
	public static UserVoteProvider getUserVoteProvider() {
		if(userVoteProvider == null) {
			userVoteProvider = new UserVoteProvider(new HashMap<Integer, Integer>());
		}
		return userVoteProvider;
	}
	
	public Map<Integer, Integer> getMap(){
		if(map != null) {
			return map;
		}
		return null;
	}
}
