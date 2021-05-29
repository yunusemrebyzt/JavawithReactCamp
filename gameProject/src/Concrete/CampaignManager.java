package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void save(Campaign campaign) {
		System.out.println("Kampanya kaydedildi "+ campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("kampanya güncellendi"+ campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("kampanya silindi!"+ campaign.getCampaignName());
		
	}

}
