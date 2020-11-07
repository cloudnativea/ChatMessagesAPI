package edu.swm.cloudsw.message;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MessagesController {
	
	@Autowired
	public MessageService messageService;

	
	@GetMapping("/api/message")
	public List<Message>  getAllMessages() {
		return messageService.getAllMessages();
		
	}
	
	@GetMapping("/api/message/{id}")
	public Optional<Message> getMessageById(@PathVariable String id) {
		
		Optional<Message> msg = messageService.getMessageById(id); 
		if (msg==null ) {
			throw new MessageNotFoundException(id);
		}
		return messageService.getMessageById(id); 
	}
	
	@PostMapping("/api/message")
	public void addMessage(@RequestBody Message msg) {
		
		messageService.addMessage(msg);
	}
	
	@PutMapping("/api/message/{id}")
	public void modifyMessage(@RequestBody Message msg, @PathVariable String id) {
		
		messageService.updateMessage(msg,id);
	}
	
	@DeleteMapping("/api/message/{id}")
	public void deleteMessage(@PathVariable String id) {
		
		messageService.deleteMessage(id);
	}
	
	
}
