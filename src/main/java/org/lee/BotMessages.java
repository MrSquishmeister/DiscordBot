package org.lee;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class BotMessages extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if(!event.getAuthor().isBot()){
            String messageSent = event.getMessage().getContentDisplay();
            if(messageSent.contains("test")){
                event.getChannel().sendMessage("The word test was used in a message").queue();
            }
        }
     }
}
