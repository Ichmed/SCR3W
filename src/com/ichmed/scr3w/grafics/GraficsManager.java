package com.ichmed.scr3w.grafics;

import java.util.*;

public class GraficsManager
{
	List<IRendered> l = new ArrayList<IRendered>();
	private boolean markedForSort = false;
	
	public void renderAll()
	{
		if(markedForSort) sortList();
		List<IRendered> tmp = l;
		for(IRendered r : tmp)
		{
			if(r.shouldCleanUp()) l.remove(r);
			else r.render();
		}
	}

	public void addElement(IRendered r)
	{
		l.add(r);
		markedForSort = true;
	}
	
	private void sortList()
	{
		markedForSort = false;
	}
	
	
}
