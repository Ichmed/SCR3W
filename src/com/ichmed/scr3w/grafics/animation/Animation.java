package com.ichmed.scr3w.grafics.animation;

import com.ichmed.scr3w.grafics.IRendered;

public class Animation implements IRendered
{
	private IRendered[] frames;
	private int frameCounter;
	private int maxFrames;
	private boolean shouldLoop;
	
	public Animation(String frames[])
	{
		this(frames, false);
	}

	public Animation(String frames[], boolean shouldLoop)
	{
		this(frames, shouldLoop, frames.length);
	}
	
	public Animation(String[] frames, boolean shouldLoop, int maxFrames)
	{
		this.frames = new IRendered[frames.length];
		this.maxFrames = maxFrames;
		this.shouldLoop = shouldLoop;
	}

	@Override
	public void render()
	{
		frames[frameCounter].render();
		if(frameCounter < maxFrames) frameCounter++;
		else if(shouldLoop) frameCounter = 0;
	}

	@Override
	public boolean shouldCleanUp()
	{
		return frameCounter > this.maxFrames; 
	}

	@Override
	public void setPos(float x, float y)
	{
		for(IRendered r : frames)
			r.setPos(x, y);
	}

}
