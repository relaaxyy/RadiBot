package de.relaxy.listener;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.entities.emoji.CustomEmoji;
import net.dv8tion.jda.api.entities.emoji.Emoji;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

import java.util.List;

public class RollenSystem extends ListenerAdapter {

    public void onMessageReceived (MessageReceivedEvent event) {

        if(event.isFromGuild()) {

            if(event.getMessage().getContentStripped().equals("!lowranks")) {

                EmbedBuilder duelist = new EmbedBuilder();

                duelist.setTitle("LOW RANKS");
                duelist.setDescription("Wähle hier zwischen Eisen, Bronze oder Silber!");
                duelist.setThumbnail("https://cdn.discordapp.com/attachments/1062439915444523029/1063263421522513990/Valorant_Cover_Art2.PNG");

                //LOW RANKS
                Button iron = Button.secondary("iron", "Iron");
                Button bronze = Button.secondary("bronze", "Bronze");
                Button silver = Button.secondary("silver", "Silver");


                event.getChannel().sendMessageEmbeds(duelist.build()).setActionRow(iron, bronze, silver)
                                                                    .queue();

            } else if(event.getMessage().getContentStripped().equals("!midranks")) {

                EmbedBuilder duelist = new EmbedBuilder();

                duelist.setTitle("MID RANKS");
                duelist.setDescription("Wähle hier zwischen Gold, Platin oder Diamant!");
                duelist.setThumbnail("https://cdn.discordapp.com/attachments/1062439915444523029/1063263421522513990/Valorant_Cover_Art2.PNG");

                //MID RANKS
                Button gold = Button.secondary("gold", "Gold");
                Button plat = Button.secondary("plat", "Platin");
                Button dia = Button.secondary("dia", "Diamond");

                event.getChannel().sendMessageEmbeds(duelist.build()).setActionRow(gold, plat, dia)
                        .queue();

            }  else if(event.getMessage().getContentStripped().equals("!highranks")) {

                EmbedBuilder duelist = new EmbedBuilder();

                duelist.setTitle("HIGH RANKS");
                duelist.setDescription("Wähle hier zwischen Ascendant, Immortal oder Radiant!");
                duelist.setThumbnail("https://cdn.discordapp.com/attachments/1062439915444523029/1063263421522513990/Valorant_Cover_Art2.PNG");

                //HIGH RANKS
                Button asc = Button.secondary("asc", "Ascendant");
                Button immo = Button.secondary("immo", "Immortal");
                Button rad = Button.secondary("rad", "Radiant");

                event.getChannel().sendMessageEmbeds(duelist.build()).setActionRow(asc, immo, rad).queue();

            }

        }

    }

    public void onButtonInteraction (ButtonInteractionEvent event) {

        if(event.getButton().getId().equals("iron")) {
            Role iron = event.getGuild().getRoleById("1063272235869151373");
            if(hasRole(event.getMember(), iron)) {
                event.getGuild().removeRoleFromMember(event.getMember(), iron).queue();
                event.reply("Du bist nun kein Eisen mehr!").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), iron).queue();

                event.reply("Du bist nun Eisen.").setEphemeral(true).queue();

            }

        } else if(event.getButton().getId().equals("bronze")) {
            Role bronze = event.getGuild().getRoleById("1063273088713768980");
            if(hasRole(event.getMember(), bronze)) {
                event.getGuild().removeRoleFromMember(event.getMember(), bronze).queue();
                event.reply("Du bist nun kein Bronze mehr!").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), bronze).queue();

                event.reply("Du bist nun Bronze.").setEphemeral(true).queue();

            }

        } else if(event.getButton().getId().equals("silver")) {
            Role silver = event.getGuild().getRoleById("1062388283600011274");
            if(hasRole(event.getMember(), silver)) {
                event.getGuild().removeRoleFromMember(event.getMember(), silver).queue();
                event.reply("Du bist nun kein Silber mehr!").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), silver).queue();

                event.reply("Du bist nun Silber.").setEphemeral(true).queue();

            }

        } else if(event.getButton().getId().equals("gold")) {
            Role gold = event.getGuild().getRoleById("1062388425623339048");
            if(hasRole(event.getMember(), gold)) {
                event.getGuild().removeRoleFromMember(event.getMember(), gold).queue();
                event.reply("Du bist nun kein Gold mehr!").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), gold).queue();

                event.reply("Du bist nun Gold.").setEphemeral(true).queue();

            }

        } else if(event.getButton().getId().equals("plat")) {
            Role plat = event.getGuild().getRoleById("1062388429448544266");
            if(hasRole(event.getMember(), plat)) {
                event.getGuild().removeRoleFromMember(event.getMember(), plat).queue();
                event.reply("Du bist nun kein Platin mehr!").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), plat).queue();

                event.reply("Du bist nun Platin.").setEphemeral(true).queue();

            }

        } else if(event.getButton().getId().equals("dia")) {
            Role dia = event.getGuild().getRoleById("1062388685724725389");
            if(hasRole(event.getMember(), dia)) {
                event.getGuild().removeRoleFromMember(event.getMember(), dia).queue();
                event.reply("Du bist nun kein Diamant mehr!").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), dia).queue();

                event.reply("Du bist nun Diamant.").setEphemeral(true).queue();

            }

        } else if(event.getButton().getId().equals("asc")) {
            Role asc = event.getGuild().getRoleById("1062388419415769098");
            if(hasRole(event.getMember(), asc)) {
                event.getGuild().removeRoleFromMember(event.getMember(), asc).queue();
                event.reply("Du bist nun kein Ascendant mehr!").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), asc).queue();

                event.reply("Du bist nun Ascendant.").setEphemeral(true).queue();

            }

        } else if(event.getButton().getId().equals("immo")) {
            Role immo = event.getGuild().getRoleById("1062388248707596338");
            if(hasRole(event.getMember(), immo)) {
                event.getGuild().removeRoleFromMember(event.getMember(), immo).queue();
                event.reply("Du bist nun kein Immortal mehr!").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), immo).queue();

                event.reply("Du bist nun Immortal.").setEphemeral(true).queue();

            }

        } else if(event.getButton().getId().equals("rad")) {
            Role rad = event.getGuild().getRoleById("1058006844406255758");
            if(hasRole(event.getMember(), rad)) {
                event.getGuild().removeRoleFromMember(event.getMember(), rad).queue();
                event.reply("Du bist nun kein Radiant mehr!").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), rad).queue();

                event.reply("Du bist nun Radiant.").setEphemeral(true).queue();

            }

        }

    }

    public static boolean hasRole(Member member, Role role) {
        List<Role> memberRoles = member.getRoles();
        return memberRoles.contains(role);
    }
}
