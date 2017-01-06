package com.ichmed.scr3w.util.data;

import java.util.HashMap;

public interface IDatabase
{
	public HashMap<String, Object> getDatabase();
	
	public void setValue(String data, Object Value);
	
	public void modValue(String data, Object Value);
}
