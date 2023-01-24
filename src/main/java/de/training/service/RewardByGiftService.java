package de.training.service;

import de.training.model.Product;
import de.training.model.RewardInformation;

import java.util.List;
import java.util.Optional;

public class RewardByGiftService extends  RewardService{

    private long giftProductId;

    @Override
    public RewardInformation applyReward(List<Product> order, long customerPoints) {
        RewardInformation rewardInformation = new RewardInformation();

        if (customerPoints >= neededPoints) {
            Optional<Product> result = order
                    .stream()
                    .filter(p -> p.getId() == giftProductId)
                    .findAny();

            if (result.isPresent()) {
                rewardInformation = new RewardInformation(neededPoints, result.get().getPrice());
            }

        }
        return rewardInformation;
    }

    public long getGiftProductId() {
        return giftProductId;
    }

    public void setGiftProductId(long giftProductId) {
        this.giftProductId = giftProductId;
    }
}
