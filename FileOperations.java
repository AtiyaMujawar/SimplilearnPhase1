package com.asses1;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class FileOperations {
	
	public void viewAllFiles() {
	    File dir = new File("/Users/apple/Documents/Project1");

	    List<String> files = new ArrayList<>(List.of(dir.list()));

	    if (files.isEmpty()) {
	        System.out.println("Directory is empty");
	    } 
	    else {
	        Collections.sort(files);
	        System.out.println("List of Files:");
	        for (String file : files) {
	            System.out.println(file);
	        }
	    }
	}
	
	public void addNewFile(String filename,String content) throws IOException {
		
		File dir = new File("/Users/apple/Documents/Project1");
		ArrayList<String>files=new ArrayList<>(List.of(dir.list()));
		if (files.contains(filename+".txt")) {
			System.out.println("File is already present in the system");
	    return;
		}

		File file = new File("/Users/apple/Documents/Project1/"+filename+".txt");
		file.createNewFile();
		FileWriter fw=new FileWriter(file);
		fw.write(content);
		fw.close();
		System.out.println("New File Created Sucessfully");
	}
	
	public void deleteFile(String filename) {
		
		 File dir = new File("/Users/apple/Documents/Project1");
		 File[] files = dir.listFiles();
		 List<File> fileList = null;
		 if (files != null) {
			 fileList = new ArrayList<>(List.of(files));
		 }
		
		if(fileList.isEmpty())
			System.out.println("Directory is empty");
		else {
			for (File file : fileList) {
	            if ((filename+".txt").equals(file.getName())) {
	                file.delete();
	                System.out.println("File deleted successfully");
	                return;
				}
			}
			System.out.println("File is not present in the system");
			}	
	}
	
	public void searchFile(String filename) {
		File dir = new File("/Users/apple/Documents/Project1");
		List<String> files = new ArrayList<>(List.of(dir.list()));
		
		if(files.isEmpty())
			System.out.println("Directory is empty");
		else {
			if(files.contains(filename+".txt"))
				System.out.println("File is present in the system");

			else
				System.out.println("File is not present in the system");
		}
	}
}

