package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface PurchaseService {

	void Information(Game game,Campaign campaign2);
	
	void Buy(Gamer gamer);
}
