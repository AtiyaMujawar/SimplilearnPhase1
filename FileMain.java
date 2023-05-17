package com.asses1;

import java.io.IOException;
import java.util.*;

public class FileMain {
	public static void main(String[] args) throws IOException {
		Scanner in=new Scanner(System.in);
		System.out.println("Project: Virtual Key for Your Repositories \n Developer : Atiya Mujawar");
		System.out.println("—---------------------------------------------------------------------\n");
		FileOperations fop=new FileOperations();
		while(true) {
			System.out.println("\n\nChoose from the below options :-");
			System.out.println("1.Retrieve All files(ascending order)\n2.Business-level operations\n3.Close application");
			int ch=in.nextInt();
			if(ch>=3) {
				System.out.println("Application Successfully Closed");
				System.exit(0);
			}
			switch(ch) {
				case 1:
					fop.viewAllFiles();
					break;
				case 2:
					while(true) {						
						System.out.println("\n1.Add file to the application\n2.Delete file from the application\n3.Search file from the application\n4.Return");
						System.out.print("Enter Your choice :");
						int choice=in.nextInt();
						if(choice>=4) {
							break;
						}
						switch(choice) {
							case 1:
								System.out.println("Enter the name of file to be added:");
								String name=in.next();
								String content="The File contains confidental information.";
								fop.addNewFile(name,content);
								break;
							case 2:
								System.out.println("Enter name of the file that needs to be deleted:");
								name=in.next();
								fop.deleteFile(name);
								break;
							case 3:
								System.out.println("Enter the name of the file:");
								name=in.next();
								fop.searchFile(name);
								break;
						}
					}
				}
			}
		}
}
