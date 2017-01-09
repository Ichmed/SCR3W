package com.ichmed.scr3w.grafics;

public interface IRendered
{
	public void render();
	public boolean shouldCleanUp();
	
	public void setPos(float x, float y);
}
