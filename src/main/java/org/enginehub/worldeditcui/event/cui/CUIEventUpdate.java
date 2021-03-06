package org.enginehub.worldeditcui.event.cui;

import org.enginehub.worldeditcui.event.CUIEvent;
import org.enginehub.worldeditcui.event.CUIEventArgs;
import org.enginehub.worldeditcui.event.CUIEventType;

/**
 * Called when update event is received
 * 
 * @author lahwran
 * @author yetanotherx
 * @author Adam Mummery-Smith
 */
public class CUIEventUpdate extends CUIEvent
{
	public CUIEventUpdate(CUIEventArgs args)
	{
		super(args);
	}
	
	@Override
	public CUIEventType getEventType()
	{
		return CUIEventType.UPDATE;
	}
	
	@Override
	public String raise()
	{
		return null;
	}
}
