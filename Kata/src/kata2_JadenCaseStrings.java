
public class kata2_JadenCaseStrings {

	public String toJadeCase(String inputPhrase){
		/*
		 * 
		 * Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). 
		 * Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every word.

			Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, 
			but they are not capitalized in the same way he originally typed them.
					 
		 * 
		 * 
		 */
		String temp = " ";
		String CorrectString="";
		String [] SplitArray;
		
		if ( (inputPhrase == null) || (inputPhrase.length()==0) ){
			return null;
		}
		else{
			SplitArray = inputPhrase.split(" ");
			for(int i=0;i<SplitArray.length;i++){
				temp = SplitArray[i];
				CorrectString =CorrectString + ( (temp.substring(0, 1).toUpperCase()+temp.substring(1)) + " ");
			}
			
			CorrectString = CorrectString.substring(0, CorrectString.length()-1);
			
			return CorrectString;
		}
	}
	
}
