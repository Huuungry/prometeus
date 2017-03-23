package stage5;
//package com.tasks5.command;

public class Echo implements Command{
	String[] args;
	
	Echo(String[] args){
		this.args=args;
	}
	
	
	@Override
	public void execute() {
			System.out.println(args[1]);
	}
}
