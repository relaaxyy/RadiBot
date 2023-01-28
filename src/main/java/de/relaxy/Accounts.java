package de.relaxy;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Accounts extends ListenerAdapter {

    public void onMessageReceived (MessageReceivedEvent event) {

        if(event.isFromGuild()) {

            if(event.getMember().getPermissions().contains(Permission.ADMINISTRATOR)) {

                if(event.getMessage().getContentStripped().equals("!lsacc")) {

                    EmbedBuilder embed = new EmbedBuilder();

                    embed.setTitle("LAST ACT SILVER");
                    embed.setThumbnail("https://cdn.discordapp.com/attachments/1062439915444523029/1063574329868165150/silver.png");
                    embed.addField("Username: OscarIRON69", "Password: HfT$/o·XbO2qR", true);
                    embed.setFooter("Ich bitte euch drum, kein Mist zu machen und keine Daten zu ändern.");

                    event.getChannel().sendMessageEmbeds(embed.build()).queue();

                } else if(event.getMessage().getContentStripped().equals("!lbacc")) {

                    EmbedBuilder embed = new EmbedBuilder();

                    embed.setTitle("LAST ACT BRONZE");
                    embed.setThumbnail("https://cdn.discordapp.com/attachments/1062439915444523029/1063574871482826982/bronze.webp");
                    embed.addField("Username: KISIR2003", "Password: srD0SBonTS(DK·u", true);
                    embed.setFooter("Ich bitte euch drum, kein Mist zu machen und keine Daten zu ändern.");

                    event.getChannel().sendMessageEmbeds(embed.build()).queue();

                } else if(event.getMessage().getContentStripped().equals("!lplatacc1")) {

                    EmbedBuilder embed = new EmbedBuilder();

                    embed.setTitle("LAST ACT PLAT");
                    embed.setThumbnail("https://cdn.discordapp.com/attachments/1062439915444523029/1063575035522056312/platin.png") ;
                    embed.addField("Username: muglamak1234", "Password: yjh&Gy/SeMMD", true);
                    embed.setFooter("Ich bitte euch drum, kein Mist zu machen und keine Daten zu ändern.");

                    event.getChannel().sendMessageEmbeds(embed.build()).queue();

                } else if(event.getMessage().getContentStripped().equals("!lplatacc2")) {

                    EmbedBuilder embed = new EmbedBuilder();

                    embed.setTitle("LAST ACT PLAT");
                    embed.setThumbnail("https://cdn.discordapp.com/attachments/1062439915444523029/1063575035522056312/platin.png") ;
                    embed.addField("Username: speedybean7777", "Password: K848DJHpld[][//d'f", true);
                    embed.setFooter("Ich bitte euch drum, kein Mist zu machen und keine Daten zu ändern.");

                    event.getChannel().sendMessageEmbeds(embed.build()).queue();

                } else if(event.getMessage().getContentStripped().equals("!silveracc")) {

                    EmbedBuilder embed = new EmbedBuilder();

                    embed.setTitle("SILVER ACCOUNT");
                    embed.setThumbnail("https://cdn.discordapp.com/attachments/1062439915444523029/1063574329868165150/silver.png");
                    embed.addField("Username: jeppekangen2", "Password: 45ahygPID';./,'[]", true);
                    embed.setFooter("Ich bitte euch drum, kein Mist zu machen und keine Daten zu ändern.");

                    event.getChannel().sendMessageEmbeds(embed.build()).queue();
                }
            }

        }

    }

}
