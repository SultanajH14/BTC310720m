package com.bit.resource;

public class InvalidDataException extends Exception	{

	public String Data;
	public InvalidDataException(String Data) {
		this.Data = Data;
	}
	public String InvalidData() {
		
		return Data;
	}
	
}
