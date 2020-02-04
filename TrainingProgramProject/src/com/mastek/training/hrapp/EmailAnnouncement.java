package com.mastek.training.hrapp;

public class EmailAnnouncement extends Announcement {

	// Each derived class of the base abstract class must override all abstract methods
	// from the case/parent class	
	
	@Override
	public void sendAnnouncement() {
		// TODO Auto-generated method stub
		System.out.println("Sending Emails TO:"+getForGroup()+" By "+getFrom()+
				" with Title: "+getSubject()+" and Text :"+getContentText());

	}

}