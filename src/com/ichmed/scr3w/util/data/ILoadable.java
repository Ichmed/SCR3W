package com.ichmed.scr3w.util.data;

import java.util.List;

public interface ILoadable extends IDatabase
{
	public String getLoadableName();
	
	public void loadValue(String s, Object o);
	
	public void createSafeList(List<Object> l);
}
