package org.enginehub.worldeditcui.event.cui;

import org.enginehub.worldeditcui.event.CUIEvent;
import org.enginehub.worldeditcui.event.CUIEventArgs;
import org.enginehub.worldeditcui.event.CUIEventType;
import org.enginehub.worldeditcui.render.region.Region;

/**
 * Called when cylinder event is received
 * 
 * @author lahwran
 * @author yetanotherx
 * @author Adam Mummery-Smith
 */
public class CUIEventCylinder extends CUIEvent
{
	public CUIEventCylinder(CUIEventArgs args)
	{
		super(args);
	}
	
	@Override
	public CUIEventType getEventType()
	{
		return CUIEventType.CYLINDER;
	}
	
	@Override
	public String raise()
	{
		Region selection = this.controller.getSelection(this.multi);
		if (selection == null)
		{
			this.controller.getDebugger().debug("No active multi selection.");
			return null;
		}
		
		int x = this.getInt(0);
		int y = this.getInt(1);
		int z = this.getInt(2);
		double radX = this.getDouble(3);
		double radZ = this.getDouble(4);
		
		selection.setCylinderCenter(x, y, z);
		selection.setCylinderRadius(radX, radZ);
		
		this.controller.getDebugger().debug("Setting centre/radius");
		
		return null;
	}
}
