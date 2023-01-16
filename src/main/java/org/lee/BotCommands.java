package org.lee;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;

public class BotCommands extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if(event.getName().equals("test-command")){
            event.reply("test command ran").queue();
        }
        else if(event.getName().equals("lucky-number")){
            OptionMapping option = event.getOption("number");
            int luckyNumber = option.getAsInt();
            event.reply("your lucky number is: " + luckyNumber).queue();
        }
        else if(event.getName().equals("add-number")){
            OptionMapping num1 = event.getOption("num1");
            OptionMapping num2 = event.getOption("num2");

            int result = num1.getAsInt() + num2.getAsInt();
            event.reply("the answer is: " + result).queue();
        }
    }
}
