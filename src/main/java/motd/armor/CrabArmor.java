package motd.armor;

import motd.References;
import motd.handlers.MOTDItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class CrabArmor extends ItemArmor {
	
	private static ArmorMaterial material = EnumHelper.addArmorMaterial("crab", References.MODID + ":crab", 15, new int[] {2, 5, 5, 2}, 14, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 2.0F);
	
	public CrabArmor(String name, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(material, renderIndexIn, equipmentSlotIn);
		this.setUnlocalizedName(name);
		this.setRegistryName(References.MODID, name);
		this.setCreativeTab(CreativeTabs.COMBAT);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		if (player.inventory.armorItemInSlot(0).getItem() == MOTDItems.crab_boots &&
			player.inventory.armorItemInSlot(1).getItem() == MOTDItems.crab_leggings &&
			player.inventory.armorItemInSlot(2).getItem() == MOTDItems.crab_chestplate &&
			player.inventory.armorItemInSlot(3).getItem() == MOTDItems.crab_helmet
		) {
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(13), 0, 1));
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(11), 0, 1));
		}
	}
	
}
