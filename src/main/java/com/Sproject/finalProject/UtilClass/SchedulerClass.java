package com.Sproject.finalProject.UtilClass;

import java.util.Timer;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;

import com.Sproject.finalProject.DaoImpl.IVoteDAOImpl;

public class SchedulerClass {
	@Autowired
	static IVoteDAOImpl iVoteDAOImpl;
	private static Timer timer = new Timer();
	
	static TimerTask task = new TimerTask() {
        public void run() {
        	iVoteDAOImpl.getVotes();
        }
    };
    
    static {
    	timer.schedule(task, 15000, 15000);
    }
}
