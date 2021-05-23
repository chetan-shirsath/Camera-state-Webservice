package com.Sproject.finalProject.Contollers;

import java.util.Timer;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Sproject.finalProject.Services.IVoteService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ParkCameraController {
	@Autowired
	private IVoteService iVoteService;
	
	private Timer timer = new Timer();

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/addVote", method = RequestMethod.PUT)
	@ResponseBody
	public boolean addVote(@RequestParam Integer voteId) {
		if(voteId == null) return false;
		try {
				if(voteId >= 0 && voteId < 3)
					return iVoteService.addVote(voteId);
			
		}catch(Exception e){
			timer = null;
		}finally {
			if(timer != null) {
				timer.schedule(new TimerTask() {
			        public void run() {
			        	System.out.println(iVoteService.getVotes());
			        }
			    },0,30000);
				timer = null;
			}	
		}
		return false;
	}
}
