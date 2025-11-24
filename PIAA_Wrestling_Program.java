package CS121;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PIAA_Wrestling_Program {
	static String [] q = new String [1001];
	static String [] d = new String [1001];
	static int row = 0;
	static int col = 0;
	static int cnt = 0;
	static int i = 0;
	static int j = 0;
	static int s = 0;
	static int f = 0;
	static String enter = "";
	public static void main(String[] args) {
		// 
		Scanner in = new Scanner(System.in);
		String[] d = new String [1001];
		String padn = "0000";
		String pad = "..............................";
		String schdist = "";
		String piaadist = "";
		String fname = "";
		String lname = "";
		String wclass = "";
		String g = "";
		String win = "";
		String loss = "";
		String dist = "";
		int len = 0;
		int input = 0;
		int i = 0;
		int j = 0;
		int found = 0;
		boolean tof1 = true;
		boolean tof2 = true;
		boolean tof3 = true;
		boolean tof4 = true;
		boolean tof5 = true;
		boolean tof6 = true;
		boolean tof7 = true;
		boolean append = true;
		boolean piaa = true;
		boolean wtclass = true;
		boolean gr = true;
		boolean w = true;
		boolean l = true;
		boolean schooldist = true;
		boolean firname = true;
		boolean lastname = true;
		do {
			tof1 = true;
			cls();
			title("Main Menu");
			System.out.println("1.) Add Wrestling Data");
			System.out.println("2.) Edit Wrestling Data");
			System.out.println("3.) Delete Wrestling Data");
			System.out.println("4.) Update Wrestling Data");
			System.out.println("5.) Report Menu");
			System.out.println("6.) Sort Menu");
			System.out.println("7.) Save Wrestling Data");
			System.out.println("8.) Load Wrestling Data");
			System.out.println("9.) Quit");
			System.out.print("Enter your Option (1-9): ");
			try {
				input = in.nextInt();
			
			}
			catch (Exception err) {
				System.out.println("Error has occured!");
				input = 10;
			}
			in.nextLine();
			
			switch (input) {
			case 1:
				
				piaa = true;
				append = true;
				wtclass = true;
				schooldist = true;
				firname = true;
				lastname = true;
				gr = true;
				w = true;
				l = true;        
				do {
					cls();
					title("Add Wrestler Data");
					do {
						System.out.print("Enter Students PIAA district (1-12), or / for the Main Menu: ");
						enter = in.nextLine();
						
						if (enter.equals("/")) {
							break;
						}// end of if
						
						try {
							input = Integer.parseInt(enter);
							
						}// end of try
						catch (Exception err) {
							input = 0;
						}// end of catch	
						
						if (input < 1 || input > 12) {
							System.out.println("Error has occured, press enter to try again");
							enter = in.nextLine();
							piaa = true;
							wtclass = false;
							schooldist = false;
							firname = false;
							lastname = false;
							gr = false;
							w = false;
							l = false;
						}// end of if
						
						else {
							padn = "0000";
							d[1] = padn + enter;
							len = d[1].length();
							d[1] = d[1].substring(len-2, len);
							break;
						}// end of else
					} while(piaa);
					if (enter.equals("/")) {
						break;
					}// end of if
					
					do {
					System.out.print("Enter Students School district name, or / for the Main Menu: ");
					enter = in.nextLine();
					if (enter.equals("/")) {
						break;
					}// end of if
					
					else {
						pad = "..............................";
						d[2] = enter + pad;
						len = d[2].length();
						d[2] = d[2].substring(0, 20);
						break;
					}// end of else
				} while (schooldist);
					if (enter.equals("/")) {
						break;
					}// end of if
					do {
					System.out.print("Enter Students first name, or / for the Main Menu: ");
					enter = in.nextLine();
					if (enter.equals("/")) {
					break;
					}// end of if
					
					else {
						pad = "..............................";
						d[3] = enter + pad;
						len = d[3].length();
						d[3] = d[3].substring(0, 12);
						break;
					}// end of else
					} while (firname);
					if (enter.equals("/")) {
						break;
					}// end of if
					
					do {
					System.out.print("Enter Students last name, or / for the Main Menu: ");
					enter = in.nextLine();
					if (enter.equals("/")) {
						append = false;
						break;
					}// end of if
					
					else {
						pad = "..............................";
						d[4] = enter + pad;
						len = d[4].length();
						d[4] = d[4].substring(0, 17);
						break;
					}// end of else
					} while (lastname);
					if (enter.equals("/")) {
						break;
					}// end of if
					
					do {
						System.out.println("Valid Options are 108, 116, 124, 131, 138, 145, 152, 160, 170, 190, 215, or 285");
						System.out.print("Enter Students wieght class, or / for the Main Menu: ");
						enter = in.nextLine();
						if (enter.equals("/")) {
							break;
						}// end of if
						
						try {
							input = Integer.parseInt(enter);
							
						}// end of try
						catch (Exception err) {
							input = 0;
						}// end of catch	
						
						if (input == 108 || input == 116 || input == 124 || input == 131 || input == 138 || input == 145 || input == 152 || input == 160 ||input == 170 ||input == 190 ||input == 215 ||input == 285) {
							padn = "0000";
							d[5] = padn + enter;
							len = d[5].length();
							d[5] = d[5].substring(len-3, len);
							break;
							
						}// end of if
						
						
						else {
							System.out.println("Error has occured, press enter to try again");
							enter = in.nextLine();
							piaa = false;
							wtclass = true;
							schooldist = false;
							firname = false;
							lastname = false;
							gr = false;
							w = false;
							l = false;
						}// end of else
					} while(wtclass);
					if (enter.equals("/")) {
						break;
					}// end of if
					
					do {
						System.out.print("Enter Students grade (9-12), or / for the Main Menu: ");
						enter = in.nextLine();
						if (enter.equals("/")) {
							break;
						}// end of if
						
						try {
							input = Integer.parseInt(enter);
							
						}// end of try
						catch (Exception err) {
							input = 0;
						}// end of catch	
						
						if (input < 9 || input > 12) {
							System.out.println("Error has occured, press enter to try again");
							enter = in.nextLine();
							piaa = false;
							wtclass = false;
							schooldist = false;
							firname = false;
							lastname = false;
							gr = true;
							w = false;
							l = false;
							
						}// end of if
						
					
						
						else {
							padn = "0000";
							d[6] = padn + enter;
							len = d[6].length();
							d[6] = d[6].substring(len-2, len);
							break;
						}// end of else
					} while(gr);
					if (enter.equals("/")) {
						break;
					}// end of if
					
					do {
						System.out.print("Enter Students wins, or / for the Main Menu: ");
						enter = in.nextLine();
						if (enter.equals("/")) {
							break;
						}// end of if
						
						try {
							input = Integer.parseInt(enter);
							
						}// end of try
						catch (Exception err) {
							input = -9;
						}// end of catch	
						
						if (input < 0 || input > 999) {
							System.out.println("Error has occured, press enter to try again");
							enter = in.nextLine();
							piaa = false;
							wtclass = false;
							schooldist = false;
							firname = false;
							lastname = false;
							gr = false;
							w = true;
							l = false;
							break;
						}// end of if
		
						
						else {
							padn = "0000";
							d[7] = padn + enter;
							len = d[7].length();
							d[7] = d[7].substring(len-3, len);
							break;
						}// end of else
					} while(w);
					if (enter.equals("/")) {
						break;
					}// end of if
					
					 do {
						System.out.print("Enter Students losses, or / for the Main Menu: ");
						enter = in.nextLine();
						if (enter.equals("/")) {
							break;
						}// end of if
						
						try {
							input = Integer.parseInt(enter);
							
						}// end of try
						catch (Exception err) {
							input = -9;
						}// end of catch	
						
						if (input < 0 || input > 999) {
							System.out.println("Error has occured, press enter to try again");
							enter = in.nextLine();
							piaa = false;
							wtclass = false;
							schooldist = false;
							firname = false;
							lastname = false;
							gr = false;
							w = false;
							l = false;
						}// end of if
						
						
						
						else {
							padn = "0000";
							d[8] = padn + enter;
							len = d[8].length();
							d[8] = d[8].substring(len-3, len);
							break;
						}// end of else
					} while (l);
					 if (enter.equals("/")) {
							break;
						}// end of if
					cnt = cnt + 1;
					
		
					q[cnt] = d[1]+d[2]+d[3]+d[4]+d[5]+d[6]+d[7]+d[8];
					
				} while (append);
				break;
				
			case 2:
				tof4 = true;
				do {
				cls();
				title("Edit Option");
				System.out.print("Enter some part of the record you wish to Edit, / for the Main Menu: ");
				enter = in.nextLine();
				if (enter.equals("/")) {
					tof4 = false;
					break;
				}// end of if
				for (i=1; i<=cnt; i=i+1) {
					if (q[i].toUpperCase().contains(enter.toUpperCase())) {
						System.out.printf("%10s", "District");
						System.out.printf("%15s", "School ");
						System.out.printf("%30s", "Wt Class");
						System.out.printf("%23s", "Student Name");
						System.out.printf("%25s", "Grade");
						System.out.printf("%6s", "Win ");
						System.out.printf("%5s\n", "Loss");
						
						System.out.printf("%10s",  q[i].substring(0, 2));
						System.out.printf("%25s",  q[i].substring(2, 22));
						System.out.printf("%15s",  q[i].substring(51, 54));
						System.out.printf("%38s",  q[i].substring(22, 51));						
						System.out.printf("%15s",  q[i].substring(54, 56));
						System.out.printf("%5s",  q[i].substring(56, 59));
						System.out.printf("%5s\n",  q[i].substring(59, 62));
						System.out.println("Is this the correct item? [y/n]: ");
						d[0] = in.nextLine();
					
						if (d[0].equals("Y") || d[0].equals("y")) {
							found = i;
							i = cnt;
							
						}// end of if
					}// end if
				}// end for
					if (found == 0) {
						System.out.println("No item found to edit, press enter to try again or / for menu.");
						d[0] = in.nextLine();
						if (d[0].equals("/")) {
							break;
						}// end if
					}// end of if
						if (found >= 1 && found <= cnt) {
								d[1] = q[found].substring(0, 2);
								d[2] = q[found].substring(2, 22);
								d[3] = q[found].substring(22, 34);
								d[4] = q[found].substring(34, 51);
								d[5] = q[found].substring(51, 54);
								d[6] = q[found].substring(54, 56);
								d[7] = q[found].substring(56, 59);
								d[8] = q[found].substring(59, 62);
								cls();
								title("Edit Option");
								System.out.println("Press 'Enter' to accept the current value or enter the Corrected value");
								
								do {
								System.out.println();
								System.out.println("Enter Student's State District (1-12), the current value is: "+d[1]);
								enter = in.nextLine();
								if (enter.equals("")) {
									d[1] = d[1];
									break;
								}// end if
								else {
								try {
									input = Integer.parseInt(enter);
									
								}// end of try
								catch (Exception err) {
									input = 0;
								}// end of catch	
								
								if (input < 1 || input > 12) {
									System.out.println("Error has occured, press enter to try again");
									enter = in.nextLine();
									piaa = true;
									wtclass = false;
									schooldist = false;
									firname = false;
									lastname = false;
									gr = false;
									w = false;
									l = false;
								}// end of if
								
								else {
									padn = "0000";
									d[1] = padn + enter;
									len = d[1].length();
									d[1] = d[1].substring(len-2, len);
									break;
								}// end of else
								}// end else
							} while(piaa);
								
								
								System.out.println();
								System.out.println("Enter Student's School District, the current value is: "+d[2]);
								enter = in.nextLine();
								if (enter.equals("")) {
									d[2] = d[2];
								}// end if
								else {
									d[2] = enter;
									pad = "..............................";
									d[2] = enter + pad;
									len = d[2].length();
									d[2] = d[2].substring(0, 20);
								}// end else
								
								System.out.println();
								System.out.println("Enter Student's First Name, the current value is: "+d[3]);
								enter = in.nextLine();
								if (enter.equals("")) {
									d[3] = d[3];
								}// end if
								else {
									d[3] = enter;
									pad = "..............................";
									d[3] = enter + pad;
									len = d[3].length();
									d[3] = d[3].substring(0, 12);
								}// end else
								
								System.out.println();
								System.out.println("Enter Student's Last Name, the current value is: "+d[4]);
								enter = in.nextLine();
								if (enter.equals("")) {
									d[4] = d[4];
								}// end if
								else {
									d[4] = enter;
									pad = "..............................";
									d[4] = enter + pad;
									len = d[4].length();
									d[4] = d[4].substring(0, 17);
								}// end else
								
								wtclass = true;
								do {
								System.out.println();
								System.out.println("Enter Student's Wieght Class, the current value is: "+d[5]); 
								System.out.println("Valid Options are 108, 116, 124, 131, 138, 145, 152, 160, 170, 190, 215, or 285");
								enter = in.nextLine();
								if (enter.equals("")) {
									d[5] = d[5];
									break;
								}// end if
								else {
								try {
									input = Integer.parseInt(enter);
									
								}// end of try
								catch (Exception err) {
									input = 0;
								}// end of catch	
								
								if (input == 108 || input == 116 || input == 124 || input == 131 || input == 138 || input == 145 || input == 152 || input == 160 ||input == 170 ||input == 190 ||input == 215 ||input == 285) {
									padn = "0000";
									d[5] = padn + enter;
									len = d[5].length();
									d[5] = d[5].substring(len-3, len);
									wtclass = false;
									break;
									
								}// end of if
								
								
								else {
									System.out.println("Error has occured, press enter to try again");
									enter = in.nextLine();
									piaa = false;
									wtclass = true;
									schooldist = false;
									firname = false;
									lastname = false;
									gr = false;
									w = false;
									l = false;
								}// end of else
								} // end of else
								} while (wtclass);
								
								gr = true;
								do {
									System.out.println();
									System.out.println("Enter Student's Grade (9-12), the current value is: "+d[6]);
									enter = in.nextLine();
									if (enter.equals("")) {
										d[6] = d[6];
										break;
									}// end if
									else {
									try {
										input = Integer.parseInt(enter);
										
									}// end of try
									catch (Exception err) {
										input = 0;
									}// end of catch	
									
									if (input < 9 || input > 12) {
										System.out.println("Error has occured, press enter to try again");
										enter = in.nextLine();
										piaa = false;
										wtclass = false;
										schooldist = false;
										firname = false;
										lastname = false;
										gr = true;
										w = false;
										l = false;
										
									}// end of if
									
								
									
									else {
										padn = "0000";
										d[6] = padn + enter;
										len = d[6].length();
										d[6] = d[6].substring(len-2, len);
										gr = false;
										break;
									} // end of else
									}// end of else
								} while(gr);
								
								w = true;
								do {
									System.out.println();
									System.out.println("Enter Student's Wins, the current value is: "+d[7]);
									enter = in.nextLine();
									if (enter.equals("")) {
										d[7] = d[7];
										break;
									}// end of if
									else {
									try {
										input = Integer.parseInt(enter);
										
									}// end of try
									catch (Exception err) {
										input = -9;
									}// end of catch	
									
									if (input < 0 || input > 999) {
										System.out.println("Error has occured, press enter to try again");
										enter = in.nextLine();
										piaa = false;
										wtclass = false;
										schooldist = false;
										firname = false;
										lastname = false;
										gr = false;
										w = true;
										l = false;
										break;
									}// end of if
					
									
									else {
										padn = "0000";
										d[7] = padn + enter;
										len = d[7].length();
										d[7] = d[7].substring(len-3, len);
										w = false;
										break;
									} // end of else
									}// end of else
								} while(w);
								
								
								
								
								l = true;
								 do {
									System.out.println();
									System.out.println("Enter Student's Losses, the current value is: "+d[8]);
									enter = in.nextLine();
									if (enter.equals("")) {
										d[8] = d[8];
										break;
									}// end of if
									
									else {
									try {
										input = Integer.parseInt(enter);
										
									}// end of try
									catch (Exception err) {
										input = -9;
									}// end of catch	
									
									if (input < 0 || input > 999) {
										System.out.println("Error has occured, press enter to try again");
										enter = in.nextLine();
										piaa = false;
										wtclass = false;
										schooldist = false;
										firname = false;
										lastname = false;
										gr = false;
										w = false;
										l = false;
									}// end of if
									
									
									
									else {
										padn = "0000";
										d[8] = padn + enter;
										len = d[8].length();
										d[8] = d[8].substring(len-3, len);
										l = false;
										break;
									} // end of else
									}// end of else
								} while (l);
						}// end of if
						q[found] = d[1]+d[2]+d[3]+d[4]+d[5]+d[6]+d[7]+d[8];
				} while (tof4);
				
				break;
				
			case 3:
				cls();
				title("Delete Option");
				do {
				System.out.print("Enter a keyord to search a wrestler: ");
				enter = in.nextLine();
				for (i=1; i<=cnt; i=i+1) {
					if (q[i].toUpperCase().contains(enter.toUpperCase())) {
						System.out.println(q[i]);
						System.out.println("Is this the correct item (y/n)?");
						d[0] = in.nextLine();
						if (d[0].equals("Y") || d[0].equals("y")) {
							found = i;
							i = cnt;
						}// end of if
					}// end if
				}// end for
				if (found == 0) {
					System.out.println("No item found to edit, press enter to try again or / for menu.");
					d[0] = in.nextLine();
					if (d[0].equals("/")) {
						break;
					}// end if
				}// end of if
				for (i=found; i<cnt; i=i+1) {
					q[i] = q[i+1];
				}// end of for
				cnt = cnt -1;
				System.out.print("Enter a / to return to menu, or enter to delete more: ");
				enter = in.nextLine();
				if (enter.equals("/")) {
					tof7 = false;
					break;
				}// end if
			} while (tof7);
			
				break;
				
			case 4:
				tof5 = true;
				do {
					
					cls();
					title("Update Option");
					System.out.print("Enter some part of the School District you wish to Update, / for the Main Menu: ");
					enter = in.nextLine();
					if (enter.equals("/")) {
						tof5 = false;
						break;
					}// end of if
					for (i=1; i<=cnt; i=i+1) {
						if (q[i].substring(2, 22).toUpperCase().contains(enter.toUpperCase())) {
							System.out.printf("%10s", "District");
							System.out.printf("%15s", "School ");
							System.out.printf("%30s", "Wt Class");
							System.out.printf("%23s", "Student Name");
							System.out.printf("%25s", "Grade");
							System.out.printf("%6s", "Win ");
							System.out.printf("%5s\n", "Loss");
							
							System.out.printf("%10s",  q[i].substring(0, 2));
							System.out.printf("%25s",  q[i].substring(2, 22));
							System.out.printf("%15s",  q[i].substring(51, 54));
							System.out.printf("%38s",  q[i].substring(22, 51));						
							System.out.printf("%15s",  q[i].substring(54, 56));
							System.out.printf("%5s",  q[i].substring(56, 59));
							System.out.printf("%5s\n",  q[i].substring(59, 62));
							System.out.println("Is this the correct item? [y/n]: ");
							d[0] = in.nextLine();
							if (d[0].equals("Y") || d[0].equals("y")) {
								dist = q[i].substring(2, 22);
								found = i;
								i = cnt;
							}// end of if
						}// end if
					}// end for
					cls();
					title("Update");
					
					System.out.println("Press 'Enter' to accept the current value or enter the Corrected value");
					for (i=1; i<=cnt; i=i+1) {
					if (q[i].substring(2, 22).equals(dist)) {
						d[7] = q[i].substring(56, 59);
						d[8] = q[i].substring(59, 62);
					
					
						w = true;
						do {
							System.out.println();
							System.out.println("Update "+q[i].substring(22, 51)+"'s Wins, the current value is: "+d[7]);
							enter = in.nextLine();
							if (enter.equals("")) {
								d[7] = d[7];
								break;
							}// end of if
							else {
							try {
								input = Integer.parseInt(enter);
								
							}// end of try
							catch (Exception err) {
								input = -9;
							}// end of catch	
							
							if (input < 0 || input > 999) {
								System.out.println("Error has occured, press enter to try again");
								enter = in.nextLine();
								piaa = false;
								wtclass = false;
								schooldist = false;
								firname = false;
								lastname = false;
								gr = false;
								w = true;
								l = false;
								break;
							}// end of if
			
							
							else {
								padn = "0000";
								d[7] = padn + enter;
								len = d[7].length();
								d[7] = d[7].substring(len-3, len);
								w = false;
								break;
							} // end of else
							}// end of else
						} while(w);
						
						
						
						
						l = true;
						 do {
							System.out.println();
							System.out.println("Update "+q[i].substring(22, 51)+"'s Losses, the current value is: "+d[8]);
							enter = in.nextLine();
							if (enter.equals("")) {
								d[8] = d[8];
								break;
							}// end of if
							
							else {
							try {
								input = Integer.parseInt(enter);
								
							}// end of try
							catch (Exception err) {
								input = -9;
							}// end of catch	
							
							if (input < 0 || input > 999) {
								System.out.println("Error has occured, press enter to try again");
								enter = in.nextLine();
								piaa = false;
								wtclass = false;
								schooldist = false;
								firname = false;
								lastname = false;
								gr = false;
								w = false;
								l = false;
							}// end of if
							
							
							
							else {
								padn = "0000";
								d[8] = padn + enter;
								len = d[8].length();
								d[8] = d[8].substring(len-3, len);
								l = false;
								break;
							} // end of else
							}// end of else
						} while (l);
					
				q[i] = q[i].substring(0, 56)+d[7]+d[8];
					}
					}// end of for
				} while(tof5);
				
				break;
				
			case 5:
				do {
					tof2 = true;
					cls();
					title("Report Menu");
					System.out.println("1.) Report to Console");
					System.out.println("2.) Create Webpage");
					System.out.println("3.) Return to Main Menu");
					System.out.print("Enter your Option (1-3): ");
					try {
						input = in.nextInt();
					
					}
					catch (Exception err) {
						System.out.println("Error has occured!");
						input = 10;
					}
					in.nextLine();
					
					switch (input) {
					
					case 1:
						cls();
						title("Complete List of Wrestlers");
						if (cnt == 0) {
							System.out.println("No data Entered");
						}
						else {
						System.out.printf("%10s", "District");
						System.out.printf("%15s", "School ");
						System.out.printf("%30s", "Wt Class");
						System.out.printf("%23s", "Student Name");
						System.out.printf("%25s", "Grade");
						System.out.printf("%6s", "Win ");
						System.out.printf("%5s\n", "Loss");
						
						for (i=1; i<=cnt; i=i+1) {
						System.out.printf("%10s",  q[i].substring(0, 2));
						System.out.printf("%25s",  q[i].substring(2, 22));
						System.out.printf("%15s",  q[i].substring(51, 54));
						System.out.printf("%38s",  q[i].substring(22, 51));						
						System.out.printf("%15s",  q[i].substring(54, 56));
						System.out.printf("%5s",  q[i].substring(56, 59));
						System.out.printf("%5s\n",  q[i].substring(59, 62));
					
						} // end of for loop
						}// end of else
						
						
						System.out.println();
						System.out.println("Press Enter to Continue");
						enter = in.nextLine();
						break;
			
					case 2:
						try {
							PrintWriter wrestleout = new PrintWriter("index.html");
							wrestleout.println("<html><head><title>PIAA Wrestling Web Page</title>");
							wrestleout.println("<h1><center>PIAA Wrestling Web Page</center></h1>");
							wrestleout.println("<h3><center>By: Brennen Yingling</center></h3><hr></head>");
							wrestleout.println("<body><table border = 1 width = 100%><tr>");
							wrestleout.println("<td width = 10% align = center>PIAA District</td><td width = 10% align = center>School District</td><td width = 10% align = center>Weight Class</td><td width = 10% align = center>Name</td><td width = 10% align = center>Grade</td><td width = 10% align = center>Wins</td><td width = 10% align = center>Losses</td></tr>");
							
							for (i=1; i<=cnt; i=i+1) {
								d[1] = q[i].substring(0, 2);
								d[2] = q[i].substring(2, 22);
								d[3] = q[i].substring(51, 54);
								d[4] = q[i].substring(22, 34);
								d[5] = q[i].substring(34, 51);
								d[6] = q[i].substring(54, 56);
								d[7] = q[i].substring(56, 59);
								d[8] = q[i].substring(59, 62);
							
									wrestleout.println("<tr><td width = 10% align = center>"+d[1]+"</td>");
									wrestleout.println("<td width = 10% align = center>"+d[2]+"</td>");
									wrestleout.println("<td width = 10% align = center>"+d[3]+"</td>");
									wrestleout.println("<td width = 10% align = center>"+d[4]+d[5]+"</td>");
									wrestleout.println("<td width = 10% align = center>"+d[6]+"</td>");
									wrestleout.println("<td width = 10% align = center>"+d[7]+"</td>");
									wrestleout.println("<td width = 10% align = center>"+d[8]+"</td></tr>");
							}// end of for
							wrestleout.println("</table></body></html>");
						wrestleout.close();
						}// end of try
						catch (FileNotFoundException err) {
							System.out.println("Error Making the file, press Enter");
							Scanner save_err = new Scanner(System.in);
							save_err.nextLine();
						}// end of catch
						cls();
						title("Create Webpage");
						System.out.println("Open the index.html file to view");
						System.out.println("Press Enter to Continue");
						enter = in.nextLine();
						break;
						
					case 3:
						
						tof2 = false;
						break;
					

					default: 
						System.out.println("Choice must be between 1 & 3");
						System.out.println("Press Enter to Continue");
						enter = in.nextLine();
						break;
					
					}// end of switch
					} while (tof2);// end of while
				break;
				
			case 6:
				do {
					tof3 = true;
					cls();
					title("Sort Menu");
					System.out.println("1.) Sort by Last Name");
					System.out.println("2.) Sort by Weight Class");
					System.out.println("3.) Sort by School District");
					System.out.println("4.) Sort by PIAA District");
					System.out.println("5.) Return to Main Menu");
					System.out.print("Enter your Option (1-5): ");
					try {
						input = in.nextInt();
					
					}
					catch (Exception err) {
						System.out.println("Error has occured!");
						input = 10;
					}
					in.nextLine();
					
					switch (input) {
					case 1:
						cls();
						title("Sort by Last Name");
						System.out.println("Sorting by last name, please wait...");
						sort(34, 51);
						System.out.println(" Finished Sorting "+cnt+ " items");
						System.out.println("Press Enter to Continue");
						enter = in.nextLine();
						break;
						
					case 2:
						cls();
						title("Sort by Weight Class");
						System.out.println("Sorting by weight class, please wait...");
						sort(51, 54);
						System.out.println(" Finished Sorting "+cnt+ " items");
						System.out.println("Press Enter to Continue");
						enter = in.nextLine();
						break;
						
					case 3:
						cls();
						title("Sort by School District");
						System.out.println("Sorting by school district, please wait...");
						sort(2, 22);
						System.out.println(" Finished Sorting "+cnt+ " items");
						System.out.println("Press Enter to Continue");
						enter = in.nextLine();
						break;
						
					case 4:
						cls();
						title("Sort by PIAA District");
						System.out.println("Sorting by PIAA district, please wait...");
						sort(0, 2);
						System.out.println(" Finished Sorting "+cnt+ " items");
						System.out.println("Press Enter to Continue");
						enter = in.nextLine();
						break;
						
					case 5:
						tof3 = false;
						break;

					default: 
						System.out.println("Choice must be between 1 & 5");
						System.out.println("Press Enter to Continue");
						enter = in.nextLine();
						break;
					
					}// end of switch
					} while (tof3);// end of while
				break;
				
			case 7:
					cls();
					title("Save Option");
					System.out.println("Saving Data...");
					save();
					System.out.println("Succesfully saved to wrestling.txt");
					System.out.println();
					System.out.println("Press enter to continue");
					enter = in.nextLine();
				break;
				
			case 8:
				cls();
				title("Load Option");
				System.out.println("Loading Data...");
				load();
				System.out.println("Succesfully Loaded wrestling.txt");
				System.out.println();
				System.out.println("Press enter to continue");
				enter = in.nextLine();
				break;
				
			case 9:
				// do something
				cls();
				title("End of Program");
				System.out.println("That's all folks!!");
				tof1 = false;
				break;
			

			default: 
				System.out.println("Choice must be between 1 & 9");
				System.out.println("Press Enter to Continue");
				enter = in.nextLine();
				break;
			
			}// end of switch
			} while (tof1);// end of while
	
	

	}
	
	// clear screen method
	public static void cls() {
		for (int i = 0; i<=50; i = i+1) {
			System.out.println();
		} // end of for
	} // end of clear screen
		
	// title and credits method
	public static void title(String sub) {
		System.out.println("PIAA Wrestling Program");
		System.out.println(sub);
		System.out.println("By: Brennen Yingling");
		System.out.println();
	} // end of title and credits
	
	// save option
	public static void save() {
		try {
			PrintWriter treasureout = new PrintWriter("wrestling.txt");
			treasureout.println(cnt);
			for (row=1; row<=cnt; row=row+1) {
				treasureout.println(q[row]);
			}// end of for
			treasureout.close();
		}// end of try
		catch (FileNotFoundException err) {
			System.out.println("Error Saving the file, press Enter");
			Scanner save_err = new Scanner(System.in);
			save_err.nextLine();
		}// end of catch
	}// end of save option

	// load option
		public static void load() {
			try {
				File fin = new File("wrestling.txt");
				Scanner treasurein = new Scanner(fin);
				enter = treasurein.nextLine();
				cnt = Integer.parseInt(enter);
				for (row = 1; row <= cnt; row = row+1) {
						q[row] = treasurein.nextLine();
					}// end of for
				treasurein.close();
			}// end of try
			catch (FileNotFoundException err) {
				System.out.println("Error Loading the file, press Enter");
				Scanner load_err = new Scanner(System.in);
				load_err.nextLine();
			}// end of catch
		}// end of load option
		
		// Sorting method
				public static void sort(int s, int f) {
					for (j=1; j<=cnt; j=j+1) {
						for (i=1; i<=cnt-j; i=i+1) {
							if (q[i].substring(s, f).compareTo(q[i+1].substring(s, f))>0) {
								d[0]=q[i];
								q[i]=q[i+1];
								q[i+1]=d[0];
							}// end of if
						}// end of for
					}// end of for
				}// end of sort
}
