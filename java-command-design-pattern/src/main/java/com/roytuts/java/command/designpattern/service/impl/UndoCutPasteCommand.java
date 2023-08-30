package com.roytuts.java.command.designpattern.service.impl;

import com.roytuts.java.command.designpattern.operation.CutPaste;
import com.roytuts.java.command.designpattern.service.Commandable;

public class UndoCutPasteCommand implements Commandable {

	private CutPaste cutPaste;

	public UndoCutPasteCommand(CutPaste cutPaste) {
		this.cutPaste = cutPaste;
	}

	@Override
	public void execute() {
		cutPaste.undo();
	}

}
