package com.johnnguyen;

import com.bitwig.extension.controller.api.ControllerHost;
import com.bitwig.extension.controller.api.Transport;
import com.bitwig.extension.controller.ControllerExtension;

public class ChordBuddyExtension extends ControllerExtension
{
   protected ChordBuddyExtension(final ChordBuddyExtensionDefinition definition, final ControllerHost host)
   {
      super(definition, host);
   }

   @Override
   public void init()
   {
      final ControllerHost host = (ControllerHost)getHost();

      // TODO: Perform your driver initialization here.
      // For now just show a popup notification for verification that it is running.
      host.showPopupNotification("Chord Buddy Initialized");
   }

   @Override
   public void exit()
   {
      // TODO: Perform any cleanup once the driver exits
      // For now just show a popup notification for verification that it is no longer running.
	   ((ControllerHost)getHost()).showPopupNotification("Chord Buddy Exited");
   }

   @Override
   public void flush()
   {
      // TODO Send any updates you need here.
   }
}
