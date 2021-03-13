package com.app.exception;

import javax.swing.JOptionPane;

import com.jk.util.exceptions.handler.ExceptionHandler;
import com.jk.util.exceptions.handler.JKExceptionHandler;

@ExceptionHandler
public class ArrayIndexExceptionHandler implements JKExceptionHandler<ArrayIndexOutOfBoundsException> {

	@Override
	public void handle(ArrayIndexOutOfBoundsException throwable, boolean throwRuntimeException) {
		JOptionPane.showMessageDialog(null, "My ArrayIndexException Handler");
	}

}