package motd.handlers;

import motd.References;
import motd.armor.CrabArmor;
import motd.items.BaseItem;
import motd.items.ItemEmeraldIdol;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

public class MOTDItems {

	@ObjectHolder(References.MODID + ":emerald_idol")
	public static final Item emerald_idol = null;
	@ObjectHolder(References.MODID + ":diamond_skull")
	public static final Item diamond_skull = null;
	@ObjectHolder(References.MODID + ":gold_tablet")
	public static final Item gold_tablet = null;
	@ObjectHolder(References.MODID + ":iron_ring")
	public static final Item iron_ring = null;
	@ObjectHolder(References.MODID + ":prismarin_cross")
	public static final Item prismarin_cross = null;
	@ObjectHolder(References.MODID + ":crab_shell_piece")
	public static final Item crab_shell_piece = null;

	@ObjectHolder(References.MODID + ":crab_helmet")
	public static final ItemArmor crab_helmet = null;
	@ObjectHolder(References.MODID + ":crab_chestplate")
	public static final ItemArmor crab_chestplate = null;
	@ObjectHolder(References.MODID + ":crab_leggings")
	public static final ItemArmor crab_leggings = null;
	@ObjectHolder(References.MODID + ":crab_boots")
	public static final ItemArmor crab_boots = null;

	public static void init() {
		new ItemEmeraldIdol();
		new BaseItem("diamond_skull", CreativeTabs.MISC);
		new BaseItem("gold_tablet", CreativeTabs.MISC);
		new BaseItem("iron_ring", CreativeTabs.MISC);
		new BaseItem("prismarin_cross", CreativeTabs.MISC);

		new BaseItem("crab_shell_piece", CreativeTabs.MATERIALS);

		new CrabArmor("crab_helmet", 1, EntityEquipmentSlot.HEAD);
		new CrabArmor("crab_chestplate", 1, EntityEquipmentSlot.CHEST);
		new CrabArmor("crab_leggings", 2, EntityEquipmentSlot.LEGS);
		new CrabArmor("crab_boots", 1, EntityEquipmentSlot.FEET);
	}

}
