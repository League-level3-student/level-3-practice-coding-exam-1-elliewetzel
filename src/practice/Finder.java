package practice;

import java.util.ArrayList;

public class Finder {

	public Object lastIndexOf(ArrayList<String> arrayList, String string) {
		// TODO Auto-generated method stub
		
		int lastIndexof = -1;
		for(int i = 0; i < arrayList.size(); i++) {
			if(arrayList.get(i).toLowerCase().equals(string.toLowerCase())) {
				lastIndexof = i;
			}
		}
		return lastIndexof;
	}

}
