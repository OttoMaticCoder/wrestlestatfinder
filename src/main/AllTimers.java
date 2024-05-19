package main;

public class AllTimers {
	
//	College Data
	String weightClass;
	String nationalTitles;
	String matchCount;
	String winPercent;
	
//	International Data
	String weightClassKg;
	String worldTitles;
	String intMatchCount;
	String victoryPercent;

	String getCollegeStats() {
		return "Weight Class: " + weightClass + 
				", National Titles: " + nationalTitles +
				", Match Count: " + matchCount + 
				", Win Percent: " + winPercent; 
		
	}
	
	String getInternationalStats() {
		return "Weight KGs: " + weightClassKg + 
				", World/Olympic Medals: " + worldTitles +
				", FS Match Count: " + intMatchCount + 
				", Vctory Percentage: " + victoryPercent; 
		
	}
	

public void setCollegeStats(String weightClass, String nationalTitles,
							String matchCount, String winPercent) {
		
		this.weightClass = weightClass;
		this.nationalTitles = nationalTitles;
		this.matchCount = matchCount;
		this.winPercent = winPercent;
	
	
	} 

public void setInternationalStats(String weightClassKg, String worldTitles,
		String intMatchCount, String victoryPercent) {

		this.weightClassKg = weightClassKg;
		this.worldTitles = worldTitles;
		this.intMatchCount = intMatchCount;
		this.victoryPercent = victoryPercent;


	}
}
