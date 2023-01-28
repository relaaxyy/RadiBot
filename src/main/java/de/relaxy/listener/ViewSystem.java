package de.relaxy.listener;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.UserSnowflake;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.concurrent.TimeUnit;

public class ViewSystem extends ListenerAdapter {

    public void onMessageReceived (MessageReceivedEvent event) {

        if(event.isFromGuild()) {

            if(event.getMember().getPermissions().contains(Permission.ADMINISTRATOR)) {

                if(event.getMessage().getContentStripped().startsWith("!view")) {

                    Member chef = event.getMessage().getMentions().getMembers().get(0);

                    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd.MM.yyyy");

                    EmbedBuilder embedBuilder = new EmbedBuilder();
                    embedBuilder.setThumbnail(chef.getEffectiveAvatarUrl());
                    embedBuilder.setTitle("Information zu " + chef.getEffectiveName());
                    embedBuilder.setDescription("Siehe verschiedene Infos!");
                    embedBuilder.addField("User-ID: ", chef.getId(), true);
                    embedBuilder.addField("Joined: ", chef.getTimeJoined().format(fmt), true);

                    Button kick = Button.secondary("kick", "Kicken");
                    Button ban = Button.danger("ban", "Bannen");


                    event.getChannel().sendMessageEmbeds(embedBuilder.build()).setActionRow(kick, ban).queue();

                }

            }

        }

    }

    public void onButtonInteraction (ButtonInteractionEvent event) {

        if(event.getMember().getPermissions().contains(Permission.ADMINISTRATOR)) {

            if(event.getButton().getId().startsWith("kick")) {

                String id = event.getButton().getId().substring(4);
                event.getGuild().kick(UserSnowflake.fromId(id)).queue();
                event.reply(event.getMember().getEffectiveName() + " wurde gekickt.");

            } else if(event.getButton().getId().startsWith("ban")) {
                String id = event.getButton().getId().substring(3);
                event.getGuild().ban(UserSnowflake.fromId(id), 7, TimeUnit.DAYS);
                event.reply(event.getMember().getEffectiveName() + " wurde gebannt.");
            }

        }

    }
}
