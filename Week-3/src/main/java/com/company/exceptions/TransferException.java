package com.company.exceptions;

/*
 * If you want to make your own custom exception, extend Exception
 */
public class TransferException extends Exception{

	public TransferException() {
		super("transfer amount exceeded");
	}
}
