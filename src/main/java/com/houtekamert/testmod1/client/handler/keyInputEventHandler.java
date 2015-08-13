package com.houtekamert.testmod1.client.handler;//

import com.houtekamert.testmod1.client.settings.Keybindings;
import com.houtekamert.testmod1.reference.Keys;
import com.houtekamert.testmod1.utitlity.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class keyInputEventHandler
{
    private static Keys getPressedKeybinding()
    {
        if (Keybindings.charge.isPressed())
        {
            return Keys.CHARGE;
        }
        else if (Keybindings.release.isPressed())
        {
            return Keys.RELEASE;
        }

       return Keys.UNKNOWN;
    }

    /*@SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        LogHelper.info(getPressedKeybinding());
    }*/
}
