package edu.swm.cloudsw.message;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MessageService {
	
	@Autowired
	public  MessageRepository msgRepository;
	
	public List<Message> getAllMessages() {
		return msgRepository.findAll();
	}

	public Optional<Message> getMessageById(String id) {
		
		return msgRepository.findById(id);
	}

	public void addMessage(Message msg) {

		msgRepository.save(msg);

	}

	public  void updateMessage(Message msg, String id) {
		
		msgRepository.save(msg);
	}

	public  void deleteMessage(String id) {
		
		msgRepository.deleteById(id);
		
	}

}
