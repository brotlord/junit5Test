package de.training.service;

import de.training.model.Product;
import de.training.model.RewardInformation;

import java.util.List;

public class RewardByConversionService extends  RewardService{

    private double amount;

    @Override
    public RewardInformation applyReward(List<Product> order, long customerPoints) {
        RewardInformation rewardInformation = new RewardInformation();

        if (customerPoints >= neededPoints) {
            double orderTotal = calculateTotal(order);
            if (orderTotal > amount) {
                rewardInformation = new RewardInformation(neededPoints, amount);
            }
        }

        return rewardInformation;
    }
}
