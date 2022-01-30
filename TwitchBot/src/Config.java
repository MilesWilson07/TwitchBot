
public class Config {
	public static String currentGame="Rocket League";
	private static final String OAUTH="oauth:";
	private static final String CHANNEL="#pyrocat12";
	private static final int PORT=6667;
	private static final String ADDRESS="irc.twitch.tv";
	public static int uliclutch=1;
	public static int ulichoke=1;
	public static void main(String[] args) throws Exception
	{
		String channel=CHANNEL;
				
		//Defining the bot
		TwitchBot bot=new TwitchBot();
		bot.setVerbose(true);
		bot.connect(ADDRESS, PORT, OAUTH);
		bot.joinChannel(channel);
		System.out.println("Successfully Joined Channel!");
		bot.sendMessage(channel, "Yo");
		//bot.getName();
		
		//an infinite loop that allows for a message to be printed every five minutes
		for(;;)
		{
		Thread.sleep(300000);
		bot.sendMessage(channel, "Insta: MilesWilson07");
		}
	}
}

