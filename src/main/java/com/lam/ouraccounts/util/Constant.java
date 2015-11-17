package com.lam.ouraccounts.util;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import org.apache.commons.lang.time.DateFormatUtils;

public class Constant {

	// public static final String BASEURL = "http://133.130.89.237:8080";
	public static final String BASEURL = "http://localhost:8080";

	/**
	 * @param tableName
	 * @return Map which stores the procedure IN/OUT params
	 */
	public static Map<String, String> createProcedureParams(String tableName) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("tableName", tableName);
		map.put("generateId", "");
		return map;
	}

	/**
	 *
	 * @param map
	 * @return unique id
	 */
	public static String getID(Map<String, String> map) {
		return map.get("generateId");
	}

	/**
	 *
	 * @return yyyy-MM-dd HH:mm:ss
	 */
	public static String getCurrentDate() {
		Calendar calendar = Calendar.getInstance();
		String date = DateFormatUtils.format(calendar, "yyyy-MM-dd HH:mm:ss", TimeZone.getTimeZone("Etc/GMT-8"));
		return date;
	}
}
