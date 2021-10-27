import org.jibble.pircbot.*;

public class TwitchBot extends PircBot{
	public TwitchBot()
	{
		this.setName("pyrocat12");
		this.isConnected();
	}
	@Override
	public void onMessage(String channel, String sender, String login, String hostName, String message)
	{
		String yo="!setgame";
		if(message.equalsIgnoreCase("!game"))
		{
			sendMessage(channel, "The current game is "+ Config.currentGame);
		}
		
		else if(message.equalsIgnoreCase("!about"))
		{
			sendMessage(channel, "I am just a bot that says Yo");
		}
		else if(message.equalsIgnoreCase("!leave"))
		{
			sendMessage(channel, "Goodbye!");
			partChannel(channel);
		}
		else if(message.equalsIgnoreCase("!uliClutch"))
		{
			
			sendMessage(channel, "Ulico has clutched "+ uliClutch()+ " times!");
		}
		else if(message.equalsIgnoreCase("!uliChoke"))
		{
			sendMessage(channel, "Ulico has choked "+ uliChoke() + " times!");
		}
		
		 else if(message.substring(0,8).equals(yo))
		{
			System.out.println(message);
			setGame(message);
			sendMessage(channel, "The current game is set to "+ Config.currentGame);
			
		} 
		 
	}
	
	//this is for when someone joins a chat it can do something
	//I didnt feel like this was worth implementing because it could be overbearing
	
	@Override
	public void onJoin(String channel, String sender, String login, String hostName)
	{
		//sendMessage(channel, "Yo");
		
	}
	//changes the currentGame variable which is in the Config class
	public void setGame(String message)
	{
		int length=message.length();
		Config.currentGame=message.substring(9,length);
		
	}
	//are methods that count how many times my man ulico clutches or chokes
	public int uliClutch()
	{
		return Config.uliclutch++;
		
	}
	public int uliChoke()
	{
		return Config.ulichoke++;
	}
	
}
	

