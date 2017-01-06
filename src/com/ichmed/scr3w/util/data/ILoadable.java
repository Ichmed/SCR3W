package com.ichmed.scr3w.util.data;

public interface ILoadable extends IDatabase
{
	public String getLoadableName();
	
	public void loadValue(String s, Object o);
}
