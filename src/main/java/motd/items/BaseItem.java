package motd.items;

import net.minecraft.creativetab.CreativeTabs;
import zdoctor.lazylibrary.common.base.EasyItem;

public class BaseItem extends EasyItem {

	public BaseItem(String name, CreativeTabs creativeTab) {
		super(name);
		this.setCreativeTab(creativeTab);
	}

}
