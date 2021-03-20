package troggs;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class DiscordBot {
    public static void main(String[] args) {
        JDABuilder jdaBuilder = JDABuilder.createDefault("ODIyNjQ2OTc2NzU5NDYzOTQ2.YFVTsw.AINc1NeOhHqNp5ruPfdx53O5XwE");
        jdaBuilder.setActivity(Activity.playing("snorting some cocaine"));
        JDA bot;
        try{
            bot = jdaBuilder.build();
            bot.awaitReady();
        } catch (LoginException | InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("bot is booted!");
    }
}
