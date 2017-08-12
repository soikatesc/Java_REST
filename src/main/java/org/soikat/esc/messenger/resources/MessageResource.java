package org.soikat.esc.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.soikat.esc.messenger.model.Message;
import org.soikat.esc.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET			// request type http method
	@Produces(MediaType.APPLICATION_XML)   //What type of data response
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
}
