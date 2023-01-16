package org.lee;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.jetbrains.annotations.NotNull;

public class DiscordBotMain extends ListenerAdapter {

    public static void main(String[] args) {
        JDA bot = JDABuilder.createDefault("MTA2NDUzMzQ5ODYyODY3NzcyMg.Gn84FL.veJTyggCYD-63BTwChWIS19So3guGf2Eg6Anr8")
                .setActivity(Activity.playing("with your mum"))
                .addEventListeners(new DiscordBotMain())
                .enableIntents(GatewayIntent.MESSAGE_CONTENT)
                .build();
    }

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