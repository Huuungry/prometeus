package stage5;
//package com.tasks5.command;

public class Sendbox{
	public static void main(String[] args){
		//YOUR CODE COMES HERE
		try{
		if(args.length == 0){
			new Error().execute();		
		}
		else if (args[0].equals("help")){
			new Help().execute();
		}
		
		else if (args[0].equals("echo") && args.length==2){
			new Echo(args).execute();
		}
		
		else if (args[0].equals("date")&& args[1]=="now"){
			new Date().execute();
		}
		
		else if (args[0].equals("exit")){
			new Exit().execute();
		}
		
		else {
			new Error().execute();
		}
		}
	
	catch (Exception e){
		new Error().execute();
	}
	}	
	}
