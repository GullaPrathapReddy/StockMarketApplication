package com.pt.sp.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtility {

	public static Logger getloggerInstance() {
		return LoggerFactory.getLogger(LoggerUtility.class);
	}
}
