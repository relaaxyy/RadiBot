package de.relaxy;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.LayoutComponent;

import java.util.List;


public class BOT extends ListenerAdapter {

    String command = "konrad";

    public void onMessageReceived (MessageReceivedEvent event) {

        if(event.isFromGuild()) {

            if(event.getMessage().getContentStripped().equals(command)) {


                event.getChannel().sendMessage("Asyl wurde erfolgreich beantragt!").queue();


            } else if(event.getMessage().getContentStripped().equals("!!iron")) {

                EmbedBuilder bauplan = new EmbedBuilder();

                bauplan.setTitle("IRON 1 | IRON 2 | IRON 3");

                event.getChannel().sendMessageEmbeds(bauplan.build()).queue();


            } else if(event.getMessage().getContentStripped().equals("!!bronze")) {

                EmbedBuilder bauplan = new EmbedBuilder();

                bauplan.setTitle("BRONZE 1 | BRONZE 2 | BRONZE 3");

                event.getChannel().sendMessageEmbeds(bauplan.build()).queue();


            } else if(event.getMessage().getContentStripped().equals("!!silver")) {

                EmbedBuilder bauplan = new EmbedBuilder();

                bauplan.setTitle("SILVER 1 | SILVER 2 | SILVER 3");

                event.getChannel().sendMessageEmbeds(bauplan.build()).queue();


            } else if(event.getMessage().getContentStripped().equals("!!gold")) {

                EmbedBuilder bauplan = new EmbedBuilder();

                bauplan.setTitle("GOLD 1 | GOLD 2 | GOLD 3");

                event.getChannel().sendMessageEmbeds(bauplan.build()).queue();


            } else if(event.getMessage().getContentStripped().equals("!!plat")) {

                EmbedBuilder bauplan = new EmbedBuilder();

                bauplan.setTitle("PLATIN 1 | PLATIN 2 | PLATIN 3");

                event.getChannel().sendMessageEmbeds(bauplan.build()).queue();


            } else if(event.getMessage().getContentStripped().equals("!!diamond")) {

                EmbedBuilder bauplan = new EmbedBuilder();

                bauplan.setTitle("DIAMOND 1 | DIAMOND 2 | DIAMOND 3");

                event.getChannel().sendMessageEmbeds(bauplan.build()).queue();


            } else if(event.getMessage().getContentStripped().equals("!!asc")) {

                EmbedBuilder bauplan = new EmbedBuilder();

                bauplan.setTitle("ASCENDANT 1 | ASCENDANT 2 | ASCENDANT 3");

                event.getChannel().sendMessageEmbeds(bauplan.build()).queue();


            } else if(event.getMessage().getContentStripped().equals("!!immo")) {

                EmbedBuilder bauplan = new EmbedBuilder();

                bauplan.setTitle("IMMORTAL 1 | IMMORTAL 2 | IMMORTAL 3");

                event.getChannel().sendMessageEmbeds(bauplan.build()).queue();


            } else if(event.getMessage().getContentStripped().equals("!!radiant")) {

                EmbedBuilder bauplan = new EmbedBuilder();

                bauplan.setTitle("RADIANT");

                event.getChannel().sendMessageEmbeds(bauplan.build()).queue();


            }

        }

    }
}
