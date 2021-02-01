package voidy.all.cooked;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class foods implements ModInitializer {

	public static final Item cooked_pie = new Item(
			new Item.Settings().group(ItemGroup.FOOD).food(cookedfood.cooked_pie));

	public static final Item cooked_cookie = new Item(
			new Item.Settings().group(ItemGroup.FOOD).food(cookedfood.cooked_cookie));

	public static final Item sugar_cookie = new Item(
			new Item.Settings().group(ItemGroup.FOOD).food(cookedfood.sugar_cookie));

	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM, new Identifier("allcooked", "cooked_pie"), cooked_pie);

		Registry.register(Registry.ITEM, new Identifier("allcooked", "cooked_cookie"), cooked_cookie);

		Registry.register(Registry.ITEM, new Identifier("allcooked", "sugar_cookie"), sugar_cookie);

	}
}
