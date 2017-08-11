package org.soikat.esc.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/messages")
public class MessageResource {
	
	@GET			// request type http method
	@Produces(MediaType.TEXT_PLAIN)   //What type of data response
	public String getMessages() {
		return "Hello World";
	}
}
