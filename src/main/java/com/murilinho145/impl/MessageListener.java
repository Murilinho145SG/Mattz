package com.murilinho145.impl;

import net.dv8tion.jda.api.entities.channel.ChannelType;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.isFromType(ChannelType.PRIVATE)) {
            if (!event.getAuthor().isBot()) {
                event.getMessage().reply("Sorry, but I still don't respond to messages sent to my DM.").complete();
            }
        }
    }
}
