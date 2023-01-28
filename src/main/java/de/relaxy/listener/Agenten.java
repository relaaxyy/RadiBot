package de.relaxy.listener;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.buttons.Button;

import java.util.List;

public class Agenten extends ListenerAdapter {

    public void onMessageReceived (MessageReceivedEvent event) {

        if(event.isFromGuild()) {

            if(event.getMember().getPermissions().contains(Permission.ADMINISTRATOR)) {

                if(event.getMessage().getContentStripped().equals("!duelist")) {

                    EmbedBuilder duelist = new EmbedBuilder();

                    duelist.setTitle("DUELISTEN");
                    duelist.setDescription("Wähle hier zwischen Jett, Reyna, Raze, Yoru, Neon und Phoenix!");
                    duelist.setThumbnail("https://cdn.discordapp.com/attachments/1062439915444523029/1063263421522513990/Valorant_Cover_Art2.PNG");

                    Button jett = Button.secondary("jett", "Jett");
                    Button reyna = Button.secondary("reyna", "Reyna");
                    Button raze = Button.secondary("raze", "Raze");
                    Button yoru = Button.secondary("yoru", "Yoru");
                    Button neon = Button.secondary("neon", "Neon");
                    Button phoenix = Button.secondary("phoenix", "Phoenix");


                    event.getChannel().sendMessageEmbeds(duelist.build()).setActionRow(jett, reyna, raze).addActionRow(yoru, neon, phoenix).queue();

                } else if(event.getMessage().getContentStripped().equals("!sentinel")) {

                    EmbedBuilder duelist = new EmbedBuilder();

                    duelist.setTitle("SENTINEL");
                    duelist.setDescription("Wähle hier zwischen Cypher, Killjoy, Chamber oder Sage!");
                    duelist.setThumbnail("https://cdn.discordapp.com/attachments/1062439915444523029/1063263421522513990/Valorant_Cover_Art2.PNG");

                    Button cypher = Button.secondary("cypher", "Cypher");
                    Button killjoy = Button.secondary("killjoy", "Killjoy");
                    Button chamber = Button.secondary("chamber", "Chamber");
                    Button sage = Button.secondary("sage", "Sage");


                    event.getChannel().sendMessageEmbeds(duelist.build()).setActionRow(cypher, killjoy, chamber, sage).queue();

                } else if(event.getMessage().getContentStripped().equals("!init")) {

                    EmbedBuilder duelist = new EmbedBuilder();

                    duelist.setTitle("INITIATOR");
                    duelist.setDescription("Wähle hier zwischen Breach, Skye, Sova, Kayo oder Fade!");
                    duelist.setThumbnail("https://cdn.discordapp.com/attachments/1062439915444523029/1063263421522513990/Valorant_Cover_Art2.PNG");

                    Button breach = Button.secondary("breach", "Breach");
                    Button skye = Button.secondary("skye", "Skye");
                    Button sova = Button.secondary("sova", "Sova");
                    Button kayo = Button.secondary("kayo", "Kayo");
                    Button fade = Button.secondary("fade", "Fade");


                    event.getChannel().sendMessageEmbeds(duelist.build()).setActionRow(breach, skye, sova, kayo, fade).queue();

                } else if(event.getMessage().getContentStripped().equals("!smoke")) {

                    EmbedBuilder duelist = new EmbedBuilder();

                    duelist.setTitle("CONTROLLER");
                    duelist.setDescription("Wähle hier zwischen Brimstone, Omen, Astra, Viper oder Harbor!");
                    duelist.setThumbnail("https://cdn.discordapp.com/attachments/1062439915444523029/1063263421522513990/Valorant_Cover_Art2.PNG");

                    Button brim = Button.secondary("brim", "Brimstone");
                    Button omen = Button.secondary("omen", "Omen");
                    Button astra = Button.secondary("astra", "Astra");
                    Button viper = Button.secondary("viper", "Viper");
                    Button harbor = Button.secondary("harbor", "Harbor");


                    event.getChannel().sendMessageEmbeds(duelist.build()).setActionRow(brim, omen, astra, viper, harbor).queue();

                }

            }

        }

    }

    public void onButtonInteraction (ButtonInteractionEvent event) {

        //               DUELISTEN

        if(event.getButton().getId().equals("jett")) {
            Role jett = event.getGuild().getRoleById("1000372259346710588");
            if(hasRole(event.getMember(), jett)) {
                event.getGuild().removeRoleFromMember(event.getMember(), jett).queue();
                event.reply("Du hast Jett nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), jett).queue();

                event.reply("Du hast Jett nun ausgewählt.").setEphemeral(true).queue();

            }

        } else if(event.getButton().getId().equals("reyna")) {
            Role reyna = event.getGuild().getRoleById("1000372568001347644");
            if(hasRole(event.getMember(), reyna)) {
                event.getGuild().removeRoleFromMember(event.getMember(), reyna).queue();
                event.reply("Du hast Reyna nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), reyna).queue();

                event.reply("Du hast Reyna nun ausgewählt.").setEphemeral(true).queue();

            }

        } else if(event.getButton().getId().equals("raze")) {
            Role raze = event.getGuild().getRoleById("1000372734485868604");
            if(hasRole(event.getMember(), raze)) {
                event.getGuild().removeRoleFromMember(event.getMember(), raze).queue();
                event.reply("Du hast Raze nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), raze).queue();

                event.reply("Du hast Raze nun ausgewählt.").setEphemeral(true).queue();

            }

        } else if(event.getButton().getId().equals("yoru")) {
            Role yoru = event.getGuild().getRoleById("1063408494167986276");
            if(hasRole(event.getMember(), yoru)) {
                event.getGuild().removeRoleFromMember(event.getMember(), yoru).queue();
                event.reply("Du hast Yoru nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), yoru).queue();

                event.reply("Du hast Yoru nun ausgewählt.").setEphemeral(true).queue();

            }

        } else if(event.getButton().getId().equals("neon")) {
            Role neon = event.getGuild().getRoleById("1063408856350326845");
            if(hasRole(event.getMember(), neon)) {
                event.getGuild().removeRoleFromMember(event.getMember(), neon).queue();
                event.reply("Du hast Neon nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), neon).queue();

                event.reply("Du hast Neon nun ausgewählt.").setEphemeral(true).queue();

            }

        } else if(event.getButton().getId().equals("phoenix")) {
            Role phoenix = event.getGuild().getRoleById("1000372601400598611");
            if(hasRole(event.getMember(), phoenix)) {
                event.getGuild().removeRoleFromMember(event.getMember(), phoenix).queue();
                event.reply("Du hast Phoenix nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), phoenix).queue();

                event.reply("Du hast Phoenix nun ausgewählt.").setEphemeral(true).queue();

            }



            //                      SENTINEL

        } else if(event.getButton().getId().equals("cypher")) {
            Role cypher = event.getGuild().getRoleById("1000373109687341066");
            if(hasRole(event.getMember(), cypher)) {
                event.getGuild().removeRoleFromMember(event.getMember(), cypher).queue();
                event.reply("Du hast Cypher nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), cypher).queue();

                event.reply("Du hast Cypher nun ausgewählt.").setEphemeral(true).queue();

            }

        } else if(event.getButton().getId().equals("killjoy")) {
            Role killjoy = event.getGuild().getRoleById("1063411270843371610");
            if(hasRole(event.getMember(), killjoy)) {
                event.getGuild().removeRoleFromMember(event.getMember(), killjoy).queue();
                event.reply("Du hast Killjoy nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), killjoy).queue();

                event.reply("Du hast nun Killjoy ausgewählt.").setEphemeral(true).queue();

            }

        } else if(event.getButton().getId().equals("chamber")) {
            Role chamber = event.getGuild().getRoleById("1000373171884654712");
            if(hasRole(event.getMember(), chamber)) {
                event.getGuild().removeRoleFromMember(event.getMember(), chamber).queue();
                event.reply("Du hast Chamber nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), chamber).queue();

                event.reply("Du hast nun Chamber ausgewählt.").setEphemeral(true).queue();

            }

        } else if(event.getButton().getId().equals("sage")) {
            Role sage = event.getGuild().getRoleById("1000372889004028005");
            if(hasRole(event.getMember(), sage)) {
                event.getGuild().removeRoleFromMember(event.getMember(), sage).queue();
                event.reply("Du hast Sage nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), sage).queue();

                event.reply("Du hast nun Sage ausgewählt.").setEphemeral(true).queue();

            }

             //                     INITIATOR


        } else if(event.getButton().getId().equals("breach")) {
            Role breach = event.getGuild().getRoleById("1062389179310420019");
            if(hasRole(event.getMember(), breach)) {
                event.getGuild().removeRoleFromMember(event.getMember(), breach).queue();
                event.reply("Du hast Breach nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), breach).queue();

                event.reply("Du hast nun Breach ausgewählt.").setEphemeral(true).queue();

            }


        } else if(event.getButton().getId().equals("skye")) {
            Role skye = event.getGuild().getRoleById("1063412730763165797");
            if(hasRole(event.getMember(), skye)) {
                event.getGuild().removeRoleFromMember(event.getMember(), skye).queue();
                event.reply("Du hast Skye nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), skye).queue();

                event.reply("Du hast nun Skye ausgewählt.").setEphemeral(true).queue();

            }


        } else if(event.getButton().getId().equals("sova")) {
            Role sova = event.getGuild().getRoleById("1063412890251567184");
            if(hasRole(event.getMember(), sova)) {
                event.getGuild().removeRoleFromMember(event.getMember(), sova).queue();
                event.reply("Du hast Sova nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), sova).queue();

                event.reply("Du hast nun Sova ausgewählt.").setEphemeral(true).queue();

            }


        } else if(event.getButton().getId().equals("kayo")) {
            Role kayo = event.getGuild().getRoleById("1063412988192759838");
            if(hasRole(event.getMember(), kayo)) {
                event.getGuild().removeRoleFromMember(event.getMember(), kayo).queue();
                event.reply("Du hast Kayo nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), kayo).queue();

                event.reply("Du hast nun Kayo ausgewählt.").setEphemeral(true).queue();

            }


        } else if(event.getButton().getId().equals("fade")) {
            Role fade = event.getGuild().getRoleById("1000373322820882482");
            if(hasRole(event.getMember(), fade)) {
                event.getGuild().removeRoleFromMember(event.getMember(), fade).queue();
                event.reply("Du hast Fade nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), fade).queue();

                event.reply("Du hast nun Fade ausgewählt.").setEphemeral(true).queue();

            }

                        //              SMOKER


        } else if(event.getButton().getId().equals("brim")) {
            Role brim = event.getGuild().getRoleById("1000773736129101974");
            if(hasRole(event.getMember(), brim)) {
                event.getGuild().removeRoleFromMember(event.getMember(), brim).queue();
                event.reply("Du hast Brimstone nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), brim).queue();

                event.reply("Du hast nun Brimstone ausgewählt.").setEphemeral(true).queue();

            }


        } else if(event.getButton().getId().equals("omen")) {
            Role omen = event.getGuild().getRoleById("1000373220106588252");
            if(hasRole(event.getMember(), omen)) {
                event.getGuild().removeRoleFromMember(event.getMember(), omen).queue();
                event.reply("Du hast Omen nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), omen).queue();

                event.reply("Du hast nun Omen ausgewählt.").setEphemeral(true).queue();

            }


        } else if(event.getButton().getId().equals("viper")) {
            Role viper = event.getGuild().getRoleById("1000372800281907241");
            if(hasRole(event.getMember(), viper)) {
                event.getGuild().removeRoleFromMember(event.getMember(), viper).queue();
                event.reply("Du hast Viper nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), viper).queue();

                event.reply("Du hast nun Viper ausgewählt.").setEphemeral(true).queue();

            }


        } else if(event.getButton().getId().equals("astra")) {
            Role astra = event.getGuild().getRoleById("1000373039835381810");
            if(hasRole(event.getMember(), astra)) {
                event.getGuild().removeRoleFromMember(event.getMember(), astra).queue();
                event.reply("Du hast Astra nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), astra).queue();

                event.reply("Du hast nun Astra ausgewählt.").setEphemeral(true).queue();

            }


        } else if(event.getButton().getId().equals("harbor")) {
            Role harbor = event.getGuild().getRoleById("1063413451667542116");
            if(hasRole(event.getMember(), harbor)) {
                event.getGuild().removeRoleFromMember(event.getMember(), harbor).queue();
                event.reply("Du hast Harbor nicht mehr ausgewählt.").setEphemeral(true).queue();
            } else {
                event.getGuild().addRoleToMember(event.getMember(), harbor).queue();

                event.reply("Du hast nun Harbor ausgewählt.").setEphemeral(true).queue();

            }


        }

    }

    public static boolean hasRole(Member member, Role role) {
        List<Role> memberRoles = member.getRoles();
        return memberRoles.contains(role);
    }



}
