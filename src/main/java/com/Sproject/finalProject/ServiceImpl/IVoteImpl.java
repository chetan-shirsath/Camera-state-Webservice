package com.Sproject.finalProject.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Sproject.finalProject.Services.IVoteDAO;
import com.Sproject.finalProject.Services.IVoteService;

@Service
public class IVoteImpl implements IVoteService{
	@Autowired
	private IVoteDAO iVoteDAO;
	
	public boolean addVote(Integer voteId) {
		return iVoteDAO.addVote(voteId);
		
	}
	public String getVotes() {
		return iVoteDAO.getVotes();
	}
}
