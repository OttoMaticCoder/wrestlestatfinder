package main;

import java.util.Scanner;

public class RunClass {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Who do you want stats for?");
		String name = scanner.nextLine();
		System.out.println("College or International?");
		String style = scanner.nextLine();
				
//		Wrestlers 
		AllTimers spenserLee = new AllTimers();
		AllTimers kyleDake = new AllTimers();
		AllTimers davidTaylor = new AllTimers();
		
//		College and International Stats
		spenserLee.setCollegeStats("125lbs", "3", "75-5", "93.75%");
		spenserLee.setInternationalStats("57kg", "0", "27-0", "100%");
		
		kyleDake.setCollegeStats("141lbs, 149lbs, 157lbs, 165lbs", "4", "141-3", "99.979%");
		kyleDake.setInternationalStats("74 & 79kg", "4 Gold 1 Silver 1 Bronze", "134-19", "85.82%");
		
		davidTaylor.setCollegeStats("157, 165lbs", "2", "133-4", "99.978%");
		davidTaylor.setInternationalStats("86kg", "4 Gold 1 Silver", "152-21", "86.18%");
		
		if (name.equals("Spenser Lee")) {
			if (style.equals("College")) {
				System.out.println(spenserLee.getCollegeStats());
			}
			if (style.equals("International")) {
				System.out.println(spenserLee.getInternationalStats());

			}
		} else if (name.equals("David Taylor")) {
			if (style.equals("College")) {
				System.out.println(davidTaylor.getCollegeStats());
			}
			if (style.equals("International")) {
				System.out.println(davidTaylor.getInternationalStats());
			}
			
		} else if (name.equals("Kyle Dake")) {
			if (style.equals("College")) {
				System.out.println(kyleDake.getCollegeStats());
			}
			if (style.equals("International")) {
				System.out.println(kyleDake.getInternationalStats());
			}
			
			
		} else 
			System.out.println("Sorry not in system");
	}
		
	
}
