package test1;

import de.training.model.Product;
import de.training.model.RewardInformation;
import de.training.service.RewardByDiscountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardByDiscountServiceNestedTest {
    private RewardByDiscountService reward = null;

    @BeforeEach
    void setUp() {
        reward = new RewardByDiscountService();
        reward.setPercentage(0.1);
        reward.setNeededPoints(100);
    }

    @Test
    void checkPercentageAndNeededPoints() {
        assertEquals(0.1, reward.getPercentage());
        assertEquals(100, reward.getNeededPoints());
    }

    @Nested
    class SmallOrder {
        private List<Product> smallOrder = null;

        @BeforeEach
        void setUp() {
            Product smallDecaf = new Product(1,"Small Decaf", 1.99);
            smallOrder = Collections.singletonList(smallDecaf);
        }

        @Nested
        class ZeroPoints {
            private RewardInformation info = null;

            @BeforeEach
            void setUp() {
                info = reward.applyReward(smallOrder,0);
            }

            @Test
            void checkDiscount(){
                assertEquals(0, info.getDiscount());
            }
        }


    }
}
