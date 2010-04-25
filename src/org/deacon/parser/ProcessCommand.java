package org.deacon.parser;

import org.deacon.DeaconResponse;
import org.deacon.DeaconService;

public class ProcessCommand implements Command {
	
	private DeaconService  service;
	private DeaconResponse response;
	
	public ProcessCommand(DeaconService s, DeaconResponse r) {
		this.service  = s;
		this.response = r;
	}

	@Override
	public void execute(String meteorCommand) {
		// Get the text from the meteorCommand
		// It will be in the form:
		//		Meteor.process(<message_number>,"<channel_name>","<message_payload>");
		// Put the text into response
		// Tell the DeaconService to notify its observers
	}

}
