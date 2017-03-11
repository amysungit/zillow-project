/**
 * File Name: AppBasics.java<br>
 * Sung, Amy<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 4, 2017
 */
package com.sqa.hs.helpers;

import java.util.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Sung, Amy
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	static Scanner scanner = new Scanner(System.in);

	/**
	 * Helper method to farewell user given the appName and user name.
	 */
	public static void farewellUser(String appName, String user) {
		System.out.println("Thank you for using the " + appName + " app " + user + ", have a great day!");
	}

	/**
	 * @param question
	 * @return a boolean
	 */
	public static boolean requestBoolean(String question) {
		String input;
		boolean bool = true;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			bool = Boolean.parseBoolean(input.trim());
		} catch (NumberFormatException e) {
			System.err
					.println("You have not entered a correct boolean value (" + input + ")\nUsing false for set value");
			// e.printStackTrace();
		}
		return bool;
	}

	/**
	 * @param question
	 * @return a char
	 */
	public static char requestChar(String question) {
		char c;
		System.out.print(question + " ");
		c = scanner.nextLine().charAt(0);
		return c;
	}

	/**
	 * @param question
	 * @return
	 */
	public static double requestDouble(String question) {
		String input;
		double count = 0;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			count = Double.parseDouble(input.trim());
		} catch (NumberFormatException e) {
			System.err
					.println("You have not entered a correct numerical value (" + input + ")\nUsing 0.0 for set value");
			// e.printStackTrace();
		}
		return count;
	}

	/**
	 * @param question
	 * @return a float
	 */
	public static float requestFloat(String question) {
		String input;
		float count = 0;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			count = Float.parseFloat(input.trim());
		} catch (NumberFormatException e) {
			System.err.println("You have not entered a correct float value (" + input + ")\nUsing 0 for set value");
			// e.printStackTrace();
		}
		return count;
	}

	/**
	 * @param question
	 * @return
	 */
	public static int requestInt(String question) {
		String input;
		int count = 0;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			count = Integer.parseInt(input.trim());
		} catch (NumberFormatException e) {
			System.err.println("You have not entered a correct int value (" + input + ")\nUsing 0 for set value");
			// e.printStackTrace();
		}
		return count;
	}

	/**
	 * @param question
	 * @return a long
	 */
	public static long requestLong(String question) {
		String input;
		long count = 0;
		System.out.print(question + " ");
		input = scanner.nextLine();
		try {
			count = Long.parseLong(input.trim());
		} catch (NumberFormatException e) {
			System.err.println("You have not entered a correct long value (" + input + ")\nUsing 0 for set value");
			// e.printStackTrace();
		}
		return count;
	}

	/**
	 * @param question
	 * @return a sjort
	 */
	public static short requestShort(String question) {
		String input;
		short count = 0;
		System.out.print(question + " ");
		input = scanner.nextLine();
		// short number = scanner.nextShort();
		try {
			count = Short.parseShort(input.trim());
		} catch (NumberFormatException e) {
			System.err.println("You have not entered a correct short value (" + input + ")\nUsing 0 for set value");
			// e.printStackTrace();
		}
		return count;
	}

	/**
	 * @param question
	 * @return a string
	 */
	public static String requestString(String question) {
		System.out.print(question + " ");
		return scanner.nextLine();
	}

	/**
	 * Helper method to welcome user
	 */
	public static String welcomeUserAndGetName(String appName) {
		System.out.println("Welcome to " + appName + " application.");
		System.out.print("Could I have your name? ");
		return scanner.nextLine();
	}
}
