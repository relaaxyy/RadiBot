package de.relaxy.listener;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

public class Verify extends ListenerAdapter {

    public void onMessageReceived (MessageReceivedEvent event) {

        if(event.getMessage().getContentStripped().equals("!send verify")) {

            if(event.getMember().getPermissions().contains(Permission.ADMINISTRATOR)) {

                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("Hey, warte!");
                embed.setThumbnail("https://cdn.discordapp.com/attachments/1062439915444523029/1063245570711494726/greencheckmark.gif");
                embed.setDescription("Wir möchten dich gerne auf unserem Discord registrieren.");
                embed.addField(":question: Wie kann ich mich verifizieren?", "Klicke unten einfach auf Verify!", false);


                Button button = Button.success("verify", "Verify!");

                event.getChannel().sendMessageEmbeds(embed.build()).setActionRow(button).queue();
            }

        }

    }

    public void onButtonInteraction (ButtonInteractionEvent event) {

        if(event.getButton().getId().equals("verify")) {

            Role mitglied = event.getGuild().getRoleById("1063240743294091284");

            event.getGuild().addRoleToMember(event.getMember(), mitglied).queue();

            event.reply("Du bist jetzt ein Mitglied!").setEphemeral(true).queue();

        }

    }

}
