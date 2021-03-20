package whfo.whfo;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;

public class SozanasSword extends SwordItem {
    public SozanasSword() {
        super(new IItemTier() {
            @Override
            public int getMaxUses() {
                return 5000;
            }

            @Override
            public float getEfficiency() {
                return 5;
            }

            @Override
            public float getAttackDamage() {
                return 10;
            }

            @Override
            public int getHarvestLevel() {
                return 4;
            }

            @Override
            public int getEnchantability() {
                return 5;
            }

            @Override
            public Ingredient getRepairMaterial() {
                return null;
            }
        }, 2, 0, new Item.Properties().group(ItemGroup.COMBAT));
    }

    @Override
    public boolean hitEntity(ItemStack item, LivingEntity target, LivingEntity attacker) {
        target.setFire(10);
        return true;
    }
}
