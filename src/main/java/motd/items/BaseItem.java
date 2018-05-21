package motd.items;

import motd.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BaseItem extends Item {
	
	public BaseItem(String name, CreativeTabs creativeTab) {
		this.setUnlocalizedName(name);
		this.setRegistryName(References.MODID, name);
		this.setCreativeTab(creativeTab);
	}
	
}
