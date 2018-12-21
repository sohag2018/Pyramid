package practiceAtHome;

public class Pyramid {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {  //this create invisible  index 0 1 2 3 4 5 6 7 8 9 
			for(int j=0;j<10-i;j++) {  //for index [0] 10t space(10-0=10), [1] 9t space(10-1=9)  and so on. this calculation shows result in following print line
				System.out.print(" ");//this create space before printing "1": 
			}
			
			for (int k=0;k<=i;k++) { //calculation: 1st line print once (k=represent 0 index), 2nd time (twice) but 9th index print 10 times
				System.out.print("1 "); //it will create the visibility of pyramid and we need space to create the pyramid formate nothing else and we dont need anyline for that
			}
			System.out.println();  //needed for creating line everytime. if i put "*" you can see it.
		}
		
		
	}                        // note: see the next exaple for better understand

}
