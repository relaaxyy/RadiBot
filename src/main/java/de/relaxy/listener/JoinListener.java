package de.relaxy.listener;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class JoinListener extends ListenerAdapter {
    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent event) {
         Member member =  event.getMember();
        TextChannel channel;
        if((channel = (TextChannel) event.getGuild().getDefaultChannel()) != null ) {
            channel.sendMessage(member.getAsMention() + " begrüßt sich selber!");
        }
    }

    public void onGuildMemberLeave(GuildMemberRemoveEvent event) {
        Member member = event.getMember();
        TextChannel channel;


        if((channel = (TextChannel) event.getGuild().getDefaultChannel()) != null) {
            channel.sendMessage(member.getAsMention() + " hat sich wieder verpisst.");
        }
    }
}
