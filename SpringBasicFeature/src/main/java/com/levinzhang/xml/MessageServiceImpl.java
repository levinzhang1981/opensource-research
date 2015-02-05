package com.levinzhang.xml;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

	public String getMessage() {
		
		return "Result From XML";
	}

}
