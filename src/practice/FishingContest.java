package practice;

import java.util.HashMap;

public class FishingContest {
	
	HashMap<String, double[]> allCatches = new HashMap<>();
	
	
	
	public FishingContest(HashMap<String, double[]> allCatches) {
		// TODO Auto-generated constructor stub
		this.allCatches = allCatches;
	}

	public double findBiggestFish(String string) {
		double[] fish = allCatches.get(string);
		double big = 0;
		for(int i = 0; i < fish.length; i++) {
			if(fish[i] > big) {
			big = fish[i];	
			}
		}
		return big;
	}

	public Object findWinner() {
		String win = "";
		double biggest = 0;
		for(String n : allCatches.keySet()) {
			double b = 0;
			double[] caught = allCatches.get(n);
			for(int i = 0; i < caught.length; i++) {
				if(caught[i] > b) {
					b = caught[i];
				}
			}
			if(b > biggest) {
				biggest = b;
				win = n;
			}
		}		
		return win;
	}

	

}
