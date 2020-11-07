package edu.swm.cloudsw.message;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value =HttpStatus.NOT_FOUND,reason = "Np Such message Found")
public class MessageNotFoundException extends RuntimeException {

	public MessageNotFoundException(String id) {
		// TODO Auto-generated constructor stub
	}

}
