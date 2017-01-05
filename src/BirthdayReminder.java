
	 // Copyright Wintriss Technical Schools 2013
	import javax.swing.JOptionPane;

	public class BirthdayReminder {

		public static void main(String[] args) {
		
			// 1. correct the birthdays for your family below
			String momsBirthday = "August 27th";
			String dadsBirthday = "June 9th";
			String myBirthday = "January 6th";
			String otherBirthday = "February 12";
			// 2. Find out which birthday the user wants and and store their response in a variable
String FamilyMember = JOptionPane.showInputDialog("Whose birthday do you want?");		
			// 3. Print out what the user typed
		System.out.println(FamilyMember);
			// 4. if user asked for "mom"
				//print mom's birthday
		if(FamilyMember.equals("mom")){
			System.out.println(momsBirthday);
			
			
		}
			// 5. if user asked for "dad"
				// print dad's birthday
		if(FamilyMember.equals("dad")){
	JOptionPane.showConfirmDialog(null, dadsBirthday);
		}
			// 6. if user asked for your name
				// print myBirthday
			if(FamilyMember.equals("davin")){
	JOptionPane.showConfirmDialog(null, myBirthday);
			}
			
			if(FamilyMember.equals("lincon"));
			JOptionPane.showConfirmDialog(null, otherBirthday);
			//7. otherwise print "Sorry, i don't remember that person's birthday!"
			if(FamilyMember.equals("mom")){
			}
			else if(FamilyMember.equals("dad")){
			}
			else if(FamilyMember.equals("davin")){	
			}
			else if (FamilyMember.equals("lincon")){
			}
				else{
	
			}
			JOptionPane.showInputDialog("Sorry i don know that person.");
			
			}
	} 
	
	

