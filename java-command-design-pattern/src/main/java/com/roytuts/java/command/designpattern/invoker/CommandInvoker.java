package com.roytuts.java.command.designpattern.invoker;

import com.roytuts.java.command.designpattern.service.Commandable;

public class CommandInvoker {

	private Commandable command;

	public CommandInvoker(Commandable command) {
		this.command = command;
	}

	public void invoke() {
		command.execute();
	}

}
