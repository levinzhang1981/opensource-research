package com.levinzhang.springweb.log;

import ch.qos.logback.classic.AsyncAppender;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class DiscardableAsyncAppender extends AsyncAppender {

	protected boolean isDiscardable(ILoggingEvent event) {
		return true;
	}

}
