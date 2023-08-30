package com.roytuts.java.command.designpattern;

import com.roytuts.java.command.designpattern.invoker.CommandInvoker;
import com.roytuts.java.command.designpattern.operation.CutPaste;
import com.roytuts.java.command.designpattern.service.Commandable;
import com.roytuts.java.command.designpattern.service.impl.RedoCutPasteCommand;
import com.roytuts.java.command.designpattern.service.impl.UndoCutPasteCommand;

public class CommandPatternTest {
	
	public static void main(String[] args) {
		CutPaste cutPaste = new CutPaste();
		Commandable redoCutPasteCommand = new RedoCutPasteCommand(cutPaste);
		Commandable undoCutPasteCommand = new UndoCutPasteCommand(cutPaste);
		
		CommandInvoker commandInvoker = new CommandInvoker(undoCutPasteCommand);
		commandInvoker.invoke();
		
		commandInvoker = new CommandInvoker(redoCutPasteCommand);
		commandInvoker.invoke();
	}
	
}
