package com.roytuts.java.command.designpattern.operation;

public class CutPaste {

	public void redo() {
		System.out.println("Cut/Paste the selected text");
	}

	public void undo() {
		System.out.println("Revert Cut/Paste");
	}

}
