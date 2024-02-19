package com.murilinho145;

import com.murilinho145.impl.BotBuilder;
import com.murilinho145.libs.com.murilinho145.dotsec.SecCommon;
import com.murilinho145.libs.com.murilinho145.dotsec.SecEvent;

public class Matzz {
    public static void main(String[] args) {
        SecEvent.read(SecCommon.getPath());
        BotBuilder.init();
    }
}