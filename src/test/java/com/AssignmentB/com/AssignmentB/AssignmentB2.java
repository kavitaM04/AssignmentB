package com.AssignmentB.com.AssignmentB;

public class AssignmentB2 {

	public static void main(String args[]) {
		String str = "Bangalore Is in India";
		String result = returnRepeatCharsWord(str);
		System.out.println("Words in which repeated chars are :" + result  + "\n" );
		returnRepeatChar(result);
		

	}

	public static String returnRepeatCharsWord(String str1) {

		String result1 = "";
		String strArray[] = str1.split(" ");

		for (int z = 0; z < strArray.length; z++) {
			System.out.println("Words to test are :" + strArray[z]);
			for (int i = 0; i < strArray[z].length(); i++) {
				int count = 1;
				for (int j = i + 1; j < strArray[z].length(); j++) {
					if (strArray[z].toLowerCase().charAt(i) == strArray[z].toLowerCase().charAt(j)) {
						result1 = result1 + strArray[z] + " ";
						count++;
						break;
					}
					
                 }
				if (count>1)
				break;
			}

		}
		return result1;
	}

	public static void returnRepeatChar(String result1) {

		String strArray[] = result1.split(" ");
		for (int z = 0; z < strArray.length; z++) {
			for (int i = 0; i < strArray[z].length()-1; i++) {
				int count = 1 ;
				for (int j = i + 1; j < strArray[z].length(); j++) {
					if (strArray[z].toLowerCase().charAt(i) == strArray[z].toLowerCase().charAt(j)) {
						count++;
					}
                
				}
				if (count >1)
				{
					System.out.println("first repeated char in :"+ strArray[z] +  "\n" + " is: " + strArray[z].toLowerCase().charAt(i));
	                System.out.println("Total count of repeated chars is :" +count + "\n" );
					break;
				}
			}

		}

	}
}
