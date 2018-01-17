package com.johnnguyen;

import java.util.UUID;

import com.bitwig.extension.api.PlatformType;
import com.bitwig.extension.controller.AutoDetectionMidiPortNamesList;
import com.bitwig.extension.controller.ControllerExtensionDefinition;
import com.bitwig.extension.controller.api.ControllerHost;

public class ChordBuddyExtensionDefinition extends ControllerExtensionDefinition
{
   private static final UUID DRIVER_ID = UUID.fromString("66bb0bcd-9570-467c-9edc-6e07e82e346a");
   
   public ChordBuddyExtensionDefinition()
   {
   }

   @Override
   public String getName()
   {
      return "Chord Buddy";
   }
   
   @Override
   public String getAuthor()
   {
      return "goldendelicious";
   }

   @Override
   public String getVersion()
   {
      return "0.1";
   }

   @Override
   public UUID getId()
   {
      return DRIVER_ID;
   }
   
   @Override
   public String getHardwareVendor()
   {
      return "John Nguyen";
   }
   
   @Override
   public String getHardwareModel()
   {
      return "Chord Buddy";
   }

   @Override
   public int getRequiredAPIVersion()
   {
      return 3;
   }

   @Override
   public int getNumMidiInPorts()
   {
      return 0;
   }

   @Override
   public int getNumMidiOutPorts()
   {
      return 0;
   }

   @Override
   public void listAutoDetectionMidiPortNames(final AutoDetectionMidiPortNamesList list, final PlatformType platformType)
   {
   }

   @Override
   public ChordBuddyExtension createInstance(final ControllerHost host)
   {
      return new ChordBuddyExtension(this, host);
   }
}
