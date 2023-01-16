package org.lee;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class BotMain{
    public static void main(String[] args) throws InterruptedException {
        final String TOKEN = "";
        JDA bot = JDABuilder.createDefault(TOKEN)
                .setActivity(Activity.playing("with bot commands"))
                .addEventListeners(new BotMessages(), new BotCommands())
                .enableIntents(GatewayIntent.MESSAGE_CONTENT)
                .build().awaitReady();

        Guild guild = bot.getGuildById("1064534224977281194");

        if(guild != null){
            guild.upsertCommand("test-command", "run test command").queue();
            guild.upsertCommand("lucky-number", "enter lucky number")
                    .addOption(OptionType.INTEGER, "number", "your lucky number", true)
                    .queue();
            guild.upsertCommand("add-number", "command used")
                    .addOptions(
                            //add multiple options within one command which allows additional .set rules to be set
                            new OptionData(OptionType.INTEGER, "num1", "first number", true),
                            new OptionData(OptionType.INTEGER, "num2", "second number", true)
                                    .setRequiredRange(1, Integer.MAX_VALUE))
                    .queue();
        }

    }
}