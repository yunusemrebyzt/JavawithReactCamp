
import java.time.LocalDate;

import Adapter.EDevlet;
import Concrete.CampaignManager;
import Concrete.RegisterManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Purchase;
import Entities.Register;

public class Main {

	public static void main(String[] args) {
		Game game = new Game();
		game.setPrice(25);	
		game.setGameName("The Elder Scrolls V :Skyrim ");
		
		Gamer gamer1 = new Gamer("Yunus Emre","Bayazýt","19340562314",LocalDate.of(2000, 9, 19),50);
		
		Campaign campaign = new Campaign();
		campaign.setDiscount(30);
		campaign.setCampaignName("Yaz Ýndirimleri");
	
			
		Register register = new RegisterManager(new EDevlet());
		register.register(gamer1);
		
		CampaignManager campaignManager  = new CampaignManager();
		campaignManager.save(campaign);
		
		Purchase purchase = new Purchase();
		purchase.Information(game,campaign);
		purchase.Buy(gamer1);
		

	}

}
