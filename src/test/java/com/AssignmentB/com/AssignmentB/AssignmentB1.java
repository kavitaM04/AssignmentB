package com.AssignmentB.com.AssignmentB;


public class AssignmentB1 {

	public static void main(String[] args) {
		problemA();
	}

	private static void problemA() {
	
			int count = 100000;
			int multiplier;
			int[] array1 = new int[6];
			int[] array2 = new int[6];
			int matches_int = 0;
			int temp;
			
			//loop between 100000 and 300000
			while(count <= 300000){
			   int z = count;
			   multiplier = count*2;
			   
			   // take no and respective multiplied value in an array
			   for (int i = 0; i < 6; i++) {
	                array1[i] = z% 10;
	                array2[i] = multiplier% 10;
	                z = z / 10;
	                multiplier = multiplier /10;
	                }
			   
			   //sort original Array
	            for (int i = 0; i < 6; i++) {
	                for (int j = i + 1; j < 6; j++){
	                    if (array1[i] > array1[j]){
	                        temp = array1[i];
	                        array1[i] = array1[j];
	                        array1[j] = temp;}
	                }
	            }
	            
	            // sort multiplier aary
	            for (int i = 0; i < 6; i++) {
	                for (int j = i + 1; j < 6; j++) {
	                    if (array2[i] > array2[j])
	                    {
	                        temp = array2[i];
	                        array2[i] = array2[j];
	                        array2[j] = temp;
	                    }
	                }
	            }
	            
	            //compare both arrays after sorting
	            for(int i=0;i< 6;i++){
	                if(array1[i] == array2[i]){
	                    matches_int += 1;
	                }
	            }
			   if(matches_int == 6){
			       System.out.println(count);
			   }
			   matches_int = 0;
			   count += 1;
			}}
}
