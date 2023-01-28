package de.relaxy;

import de.relaxy.listener.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;


public class Main {
    public static JDABuilder builder;



    public static void main(String[] args) {
        builder = JDABuilder.createLight("MTA1Nzk0MzIyMTI5ODI2NjEyMw.GtnH_w.dhIQu4yXfUKbV7RLMWecmu21c-t2h5p0Ya1FEs");
        builder.setActivity(Activity.playing("Asylanträge bearbeiten"));
        //builder.addEventListeners(new BOT());
        builder.addEventListeners(new Verify());
        builder.addEventListeners(new JoinListener());
        builder.addEventListeners(new RollenSystem());
        builder.addEventListeners(new ViewSystem());
        builder.addEventListeners(new Agenten());
        builder.addEventListeners(new Accounts());
        builder.enableIntents(GatewayIntent.MESSAGE_CONTENT);
        builder.enableIntents(GatewayIntent.GUILD_MESSAGE_REACTIONS);
        JDA bot = builder.build();
        System.out.println("Sucessfully started...");


    }


}
