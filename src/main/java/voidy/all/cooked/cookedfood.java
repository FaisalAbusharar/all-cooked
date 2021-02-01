package voidy.all.cooked;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class cookedfood {
        public static final FoodComponent cooked_pie = (new FoodComponent.Builder()).hunger(12).saturationModifier(.10f)
                        .build();

        public static final FoodComponent sugar_cookie = (new FoodComponent.Builder()).hunger(6).saturationModifier(.8f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 3), 1f).snack().build();

        public static final FoodComponent cooked_cookie = (new FoodComponent.Builder()).hunger(8)
                        .saturationModifier(.8f).snack().build();

}
