
public class Kata1_WordSearch {
	
	/*
	 * Write a method that will search an array of strings for all strings that contain another string, ignoring capitalization. Then return an array of the found strings.

		The method takes two parameters, the query string and the array of strings to search, and returns an array.
		
		If the string isn't contained in any of the strings in the array, the method returns an array containing a single string: "Empty".
		
		Example: If the string to search for is "me", and the array to search is ["home", "milk", "Mercury", "fish"], the method should return ["home", "Mercury"].
	 */
	
	public boolean wordContains(String word, String[] WordArray){
		for (int i=0;i<WordArray.length;i++){
			if (WordArray[i]==word){
				return true;
			}
		}
		return false;
	}
	
	public String[] wordSearch(String word,String[] arrayInput){
		//GOAL: determine whether an array of strings contains a substring
		//NOTE* - MUST use fixed length arrays
		
		String[] TempArray1 = new String[arrayInput.length];
		String[] TempArray2;
		int count1=0;
		int count2=0;
		
		for(int i=0;i<arrayInput.length;i++){
			//create an array of all the words found in the input array
			//*note, this array is the same length as the input, therefore contains NULL values
			if(arrayInput[i].toLowerCase().contains(word.toLowerCase())){
				TempArray1[count1] = arrayInput[i];
				count1++;
			}	
		}
		
		if (count1>0){
			//1. check to see if anything was found
			//2. If found, add all the values found to a correctly sized array
			//3.return
			TempArray2 = new String[count1];
			for(int i=0;i<arrayInput.length;i++){
				if(TempArray1[i] != null){
					count2++;
					TempArray2[count2-1] = TempArray1[i];
				}
			}
			return TempArray2;
		}
		else{
			//nothing found, return
			TempArray1 = new String[1];
			TempArray1[0]="Empty";
			return TempArray1;
		}
	}
	
	
}
