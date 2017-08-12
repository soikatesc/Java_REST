package org.soikat.esc.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.soikat.esc.messenger.model.Message;
import org.soikat.esc.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET			// request type http method
	@Produces(MediaType.APPLICATION_JSON)   //What type of data response
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message) {
		return messageService.addMessage(message);
	}
	
	@GET
	@Path("/{ messageId }")
	@Produces(MediaType.APPLICATION_JSON)
	public Message test(@PathParam("messageId") long messageId) {
		return messageService.getMessage(messageId);
	}
}
