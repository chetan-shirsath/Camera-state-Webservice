package com.Sproject.finalProject.DaoImpl;


import java.util.Map;

import org.springframework.stereotype.Repository;

import com.Sproject.finalProject.Services.IVoteDAO;
import com.Sproject.finalProject.UtilClass.UserVoteProvider;

@Repository
public class IVoteDAOImpl implements IVoteDAO{
	
	public boolean addVote(Integer voteId) {	
		Map<Integer, Integer> map = UserVoteProvider.getUserVoteProvider().getMap();
		map.put(voteId,	map.getOrDefault(voteId, 0)+1);
		return true;
	}
	public String getVotes() {
		Map<Integer, Integer> map1 = UserVoteProvider.getUserVoteProvider().getMap();
		int val = 0;
		int vote = 0;
		for(Map.Entry<Integer, Integer> entry : map1.entrySet())
			if(entry.getValue() > val) {
				val = entry.getValue();
				vote = entry.getKey();
			}
		map1.clear();
		if(vote == 0) return "Stay";
		else if (vote == 1) return "Pan Right";
		else if (vote == 2) return "Pan Left";
		
		return "";
	}
}
