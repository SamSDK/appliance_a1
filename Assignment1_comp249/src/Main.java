//----------------------------------------------------
//Assignment 1
//Question 1
//Written by: Joshua-James Nantel-Ouimet (#40131733)
//----------------------------------------------------

import java.util.Scanner;

public class Main {
	
	// method to display menu
	public static void displayMenu() {
		System.out.println("What do you want to do?");
		System.out.println("\t1.  Enter new appliances (password required)");
		System.out.println("\t2.  Change information of an appliance (password required)");
		System.out.println("\t3.  Display all appliances by a specific brand");
		System.out.println("\t4.  Display all appliances under a certain price");
		System.out.println("\t5.  Quit");
		System.out.println("Please enter your choice >");
	}
	public static void displayAttributeMenu() {
		System.out.println("What attribute would you like to change?");
		System.out.println("\t1.  brand");
		System.out.println("\t2.  type");
		System.out.println("\t3.  price");
		System.out.println("\t4.  Quit");
		System.out.println("Enter your choice >");
	}
	
	//method to prompt user for password
	public static void askPassword() {
		System.out.println("Please enter your password:");
	}
	

	
	//main method
	public static void main(String[] args) {
		//display welcome message
		System.out.println("----------------------------------");
		System.out.println("Welcome to my appliance program");
		System.out.println("----------------------------------\n");
		
		//attributes
		int maxAppliances = 0;
		int menuChoice = 0;
		int quantityWanted = 0;
		int quantityOfObjects = 0;
		Scanner keyboard = new Scanner(System.in);
		String passwordEntered = "";
		int passwordAttempts = 0;
		final String PASSWORD = "c249";
		boolean validAccess = false;
		
		
		//prompt the store owner for maximum number of appliances
		System.out.println("What is the maximum amount of appliances that your store can contain?");
		maxAppliances = keyboard.nextInt();
		Appliance[] inventory = new Appliance[maxAppliances];
		
		
		
		
		//display list of program options
		//prompt user for choice till valid input
		boolean quit = false;
		do {
			// display list of program options
			// prompt user for choice till valid input
			displayMenu();
			menuChoice = keyboard.nextInt();
			keyboard.nextLine(); // move cursor to next line
		
		switch(menuChoice) {
		case 1: {
			while(passwordAttempts <= 12) {
				if(passwordAttempts == 3 || passwordAttempts == 6 || passwordAttempts == 9 || passwordAttempts == 12) {
					if(passwordAttempts == 12) {
						System.out.println("Program detected suspicious activity and will terminate immediately!");
						System.exit(0);
					} else {
						
						do {
							displayMenu();
							menuChoice = keyboard.nextInt();
							keyboard.nextLine(); //move cursor to next line
						}while(menuChoice<1 || menuChoice > 5);
						
						if(menuChoice == 1) {
							askPassword();
							passwordEntered = keyboard.nextLine();
							if(passwordEntered.equals(PASSWORD)) {
								validAccess = true;
								System.out.println("Correct Password");
								passwordAttempts = 0;
								break;
							} else {
								passwordAttempts++;
							}
						}else {
							break;
						}
					}
				} else {
					askPassword();
					passwordEntered = keyboard.nextLine();
					if(passwordEntered.equals(PASSWORD)) {
						validAccess = true;
						System.out.println("Correct Password");
						passwordAttempts = 0;
						break;
					} else {
						passwordAttempts++;
					}
				}
			}
			if(validAccess) {
				System.out.println("How many appliances would you like to enter?: ");
				quantityWanted = keyboard.nextInt();
				keyboard.nextLine(); // move cursor to the next line
				if(quantityWanted > 0 && quantityWanted <= (maxAppliances - quantityOfObjects)) {
					for(int i = 0; i < quantityWanted; i++) {
						System.out.println("What is the type of appliance #" + (quantityOfObjects + 1) + "?");
						String typeEntered = keyboard.nextLine();
						System.out.println("What is the brand of appliance #" + (quantityOfObjects + 1) + "?");
						String brandEntered = keyboard.nextLine();
						System.out.println("What is the price of appliance #" + (quantityOfObjects + 1)  + "?");
						double priceEntered = keyboard.nextDouble();
						keyboard.nextLine(); //get cursor to next line
						
						//create object with this information
						inventory[quantityOfObjects] = new Appliance(typeEntered, brandEntered, priceEntered);
						quantityOfObjects++;
					}
				} else {
					System.out.println("We are unable to add them because this would exceed the max amount of appliances, there is this much room left: " + (maxAppliances - quantityOfObjects)); 
				}
				break;
			}
		}
			case 2: { 
			while(passwordAttempts <= 3) {
				if(passwordAttempts == 3) {
						do {
							displayMenu();
							menuChoice = keyboard.nextInt();
							keyboard.nextLine(); //move cursor to next line
						}while(menuChoice<1 || menuChoice > 5);
						
						if(menuChoice == 2) {
							askPassword();
							passwordEntered = keyboard.nextLine();
							if(passwordEntered.equals(PASSWORD)) {
								validAccess = true;
								System.out.println("Correct Password");
								passwordAttempts = 0;
								break;
							} else {
								passwordAttempts++;
							}
						} else if(menuChoice == 1) {
							askPassword();
							passwordEntered = keyboard.nextLine();
							if(passwordEntered.equals(PASSWORD)) {
								validAccess = true;
								System.out.println("Correct Password");
								passwordAttempts = 0;
								break;
							} else {
								passwordAttempts++;
							}
						} else{
							break;
						}
				} else {
					askPassword();
					passwordEntered = keyboard.nextLine();
					if(passwordEntered.equals(PASSWORD)) {
						validAccess = true;
						System.out.println("Correct Password");
						passwordAttempts = 0;
						break;
					} else {
						passwordAttempts++;
					}
				}
			}
			
			if(validAccess && menuChoice == 1) {
				System.out.println("How many appliances would you like to enter?: ");
				quantityWanted = keyboard.nextInt();
				keyboard.nextLine(); // move cursor to the next line
				if(quantityWanted > 0 && quantityWanted <= (maxAppliances - quantityOfObjects)) {
					for(int i = 0; i < quantityWanted; i++) {
						System.out.println("What is the type of appliance #" + (quantityOfObjects + 1) + "?");
						String typeEntered = keyboard.nextLine();
						System.out.println("What is the brand of appliance #" + (quantityOfObjects + 1) + "?");
						String brandEntered = keyboard.nextLine();
						System.out.println("What is the price of appliance #" + (quantityOfObjects + 1)  + "?");
						double priceEntered = keyboard.nextDouble();
						keyboard.nextLine(); //get cursor to next line
						
						//create object with this information
						inventory[quantityOfObjects] = new Appliance(typeEntered, brandEntered, priceEntered);
						quantityOfObjects++;
					}
				} else {
					System.out.println("We are unable to add them because this would exceed the max amount of appliances, there is this much room left: " + (maxAppliances - quantityOfObjects)); 
				}
			} else if(validAccess && menuChoice == 2) {
					System.out.println("What is the serial number of the item that you wish to update?:");
					long serialNumberAttempt = keyboard.nextLong();
					keyboard.nextLine(); //move cursor to next line
					for(int i = 0; i < quantityOfObjects; i++) {
						if(inventory[i].getSerialNumber() == serialNumberAttempt) {
							System.out.println(inventory[i].toString());
							System.out.println();
							int choice = 0;
							for(int j = 0; j<5; j++) {
								do {
									displayAttributeMenu();
									choice = keyboard.nextInt();
									keyboard.nextLine(); // move cursor to next line
								} while(choice <= 0 || choice > 4);
								if(choice == 1) {
									System.out.println("Enter the new brand name: ");
									String updatedBrand = keyboard.nextLine();
									inventory[i].setBrand(updatedBrand);
									System.out.println("Here is the new information");
									System.out.println(inventory[i].toString());
								}else if(choice == 2) {
									System.out.println("Enter the new type: ");
									String updatedType = keyboard.nextLine();
									inventory[i].setType(updatedType);
									System.out.println("Here is the new information");
									System.out.println(inventory[i].toString());
								} else if(choice == 3) {
									System.out.println("Enter the new price: ");
									double updatedPrice = keyboard.nextDouble();
									inventory[i].setPrice(updatedPrice);
									keyboard.nextLine(); // move cursor to next line
									System.out.println("Here is the new information");
									System.out.println(inventory[i].toString());
								} else if(choice ==4) {
									System.out.println("Okay, system will terminate");
						
								}
							}
						} else {
							System.out.println("There is no appliance with that serial number");
							System.out.println("Would you like to enter a new serial number? If not, program will terminate. (y/n)");
							String response = keyboard.nextLine();
							if(response.equalsIgnoreCase("y")) {
								System.out.println(" Reminder: this is your second attempt. What is the serial number of the item that you wish to update?:");
								serialNumberAttempt = keyboard.nextLong();
								keyboard.nextLine(); //move cursor to next line
								for(int j = 0; j <quantityOfObjects; j++) {
									if(inventory[j].getSerialNumber() == serialNumberAttempt) {
										System.out.println(inventory[j].toString());
										System.out.println();
										int choice = 0;
										for(int k = 0; k<5; k++) {
											do {
												displayAttributeMenu();
												choice = keyboard.nextInt();
												keyboard.nextLine(); // move cursor to next line
											} while(choice <= 0 || choice > 4);
											if(choice == 1) {
												System.out.println("Enter the new brand name: ");
												String updatedBrand = keyboard.nextLine();
												inventory[j].setBrand(updatedBrand);
												System.out.println("Here is the new information");
												System.out.println(inventory[j].toString());
											}else if(choice == 2) {
												System.out.println("Enter the new type: ");
												String updatedType = keyboard.nextLine();
												inventory[j].setType(updatedType);
												System.out.println("Here is the new information");
												System.out.println(inventory[j].toString());
											} else if(choice == 3) {
												System.out.println("Enter the new price: ");
												double updatedPrice = keyboard.nextDouble();
												inventory[j].setPrice(updatedPrice);
												keyboard.nextLine(); // move cursor to next line
												System.out.println("Here is the new information");
												System.out.println(inventory[j].toString());
											} else if(choice ==4) {
												System.out.println("Okay, system will terminate");
	
											}
										}
									}
								}
								
							} else {
								System.out.println("System will now terminate");
					
							}
						}
					}
			} else {
				System.out.println("Please restart program if you would like to continue. Password attempts have been exhausted");
			}
			break;
		} 
			case 3: {
			System.out.println("Please enter a brand name: ");
			String brandNameWanted = keyboard.nextLine();
			System.out.println("Okay, let me check the items in the inventory... \n\n\t computing... \n\t done\n");
			int objectsFound = 0;
			for(int i = 0; i < quantityOfObjects; i++) {
				if(inventory[i].findAppliancesBy(brandNameWanted)) {
					System.out.println(inventory[i].toString());
					objectsFound++;
				} else {
					continue;
				}
			}
			if(objectsFound == 0) {
				System.out.println("Unfortunately, there are no appliances under that brand name.");
			}
			break;
		} case 4: {
			System.out.println("Please enter the price you wish to search for:");
			double priceWanted = keyboard.nextDouble();
			keyboard.nextLine(); //move cursor to new line
			int objectsFound = 0;
			for(int i = 0; i < quantityOfObjects; i++) {
				if(inventory[i].findCheaperThan(priceWanted)) {
					System.out.println(inventory[i].toString());
					objectsFound++;
				} else {
					continue;
				}
			}
			if(objectsFound == 0) {
				System.out.println("Unfortunately, there are no appliances with a lower price.");
			}
			break;
		} case 5: {
			System.out.println("Thank you for using my program! See you next time");
			quit = true;
			break;
		}
		default:
			break;
			}
		}while(!quit);
		
		keyboard.close();
	}
}
		
