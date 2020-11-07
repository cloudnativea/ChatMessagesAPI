package edu.swm.cloudsw.message;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "messages")
public class Message {
	
	@Id
	public String id;
	
	public String text;
	public String createdAt;
	public String updatedAt;
	
	
	public Message() {
	
	}
	
	public Message(String id, String text, String createdAt, String updatedAt) {
		super();
		this.id = id;
		this.text = text;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	
}
