package com.murilinho145.impl;


import com.murilinho145.libs.com.murilinho145.dotsec.SecEvent;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class BotBuilder {
    public static final JDABuilder builder = JDABuilder.createDefault(SecEvent.get("BOT_TOKEN")).enableIntents(GatewayIntent.MESSAGE_CONTENT,
            GatewayIntent.GUILD_MEMBERS,
            GatewayIntent.GUILD_MESSAGES,
            GatewayIntent.GUILD_EMOJIS_AND_STICKERS,
            GatewayIntent.GUILD_INVITES);
    public static void init() {
        builder.addEventListeners(new MessageListener());
        builder.build();
    }
}
