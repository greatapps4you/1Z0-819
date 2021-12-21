package us.greatapps4you.ocp.mostmissed.time;

public class OCPTime {
	
	/**
	 * What will the output of the following commands be?
	 * javac OCPTime.java 
	 * jdeps -summary OCPTime.class
	 * 
	 * Answer:
	 * OCPTime.class -> java.base
	 * OCPTime.class -> java.sql
	 */

	public static void time() {
		int time = 100;
		java.sql.Timestamp ts = new java.sql.Timestamp(time);
		java.util.Date d = new java.util.Date();
		ts = new java.sql.Timestamp(d.getTime());
		System.out.println(ts);
	}
}
