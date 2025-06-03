import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;





crafting.addShaped("plant_fibre_torch", item('pyrotech:torch_fiber'), [
[item('notreepunching:grass_fiber')], 
[ore('stickWood')]
])

crafting.addShaped("plant_fibre_torch_2", item('pyrotech:torch_fiber'), [
[item('primal_tech:plant_fibres')], 
[ore('stickWood')]
])

oreDict.add("dustAsh", item('pyrotech:material'));

crafting.remove("pyrotech:tech/basic/anvil_granite")

crafting.addShaped("granite_anvil_pyrotech_recipe", item('pyrotech:anvil_granite'), [
[ore('stoneSmooth'), ore('stoneSmooth'), ore('stoneSmooth')], 
[ore('plateStone'), ore('plateStone'), ore('plateStone')]
])

crafting.remove("pyrotech:ignition/flint_and_tinder")

mods.pyrotech.anvil.removeByOutput(item('pyrotech:material', 16)*2);

mods.pyrotech.anvil.recipeBuilder()
    .input(metaitem('ingotMasonryBrick'))
    .output(item('pyrotech:material', 16))
    .hits(5)
    .typeHammer()
    .tierGranite()
    .name('gt_masonry_to_pyrotech_masonry')
    .register()

furnace.removeByInput(metaitem('dustMasonryBrick'))

oreDict.remove("dustFlint", item('pyrotech:material', 31))

crafting.remove('pyrotech:tech/basic/drying_rack_crude')

crafting.addShaped("drying_rack_crude", item('pyrotech:drying_rack'), [
[ore('stickWood'), ore('stickWood')], 
[item('notreepunching:grass_fiber'), item('notreepunching:grass_fiber')]])

mods.pyrotech.crude_drying_rack.removeByInput(item('pyrotech:material', 12))

mods.pyrotech.crude_drying_rack.recipeBuilder()
    .input(item('notreepunching:grass_fiber'))
    .output(item('pyrotech:material', 13))
    .dryTime(260)
    .name('dried_plant_fibers_drying_rack')
    .register()

crafting.remove('pyrotech:furnace')

BLOOMERY_RECIPES.recipeBuilder()
    .inputs(item('gregtech:ore_copper_0'))
    .outputs(metaitem('nuggetCopper')*13)
    .outputs(metaitem('copper_ore_slag')*2)
    .duration(100)
    .buildAndRegister();

BLOOMERY_RECIPES.recipeBuilder()
    .inputs(item('gregtech:ore_tin_0'))
    .outputs(metaitem('nuggetTin')*13)
    .outputs(metaitem('tin_ore_slag')*2)
    .duration(100)
    .buildAndRegister();

BLOOMERY_RECIPES.recipeBuilder()
    .inputs(item('gregtech:ore_iron_0'))
    .outputs(item('minecraft:iron_nugget')*13)
    .outputs(item('pyrotech:generated_slag_iron')*2)
    .duration(100)
    .buildAndRegister();

BLOOMERY_RECIPES.recipeBuilder()
    .inputs(item('gregtech:ore_gold_0'))
    .outputs(item('minecraft:gold_nugget')*13)
    .outputs(item('pyrotech:generated_slag_gold')*2)
    .duration(100)
    .buildAndRegister();

crafting.remove('pyrotech:tool/bone_axe')
crafting.remove('pyrotech:tool/bone_pickaxe')
crafting.remove('pyrotech:tool/bone_hoe')
crafting.remove('pyrotech:tool/bone_sword')
crafting.remove('pyrotech:tool/bone_shovel')

crafting.remove('pyrotech:tool/bone_axe_durable')
crafting.remove('pyrotech:tool/bone_pickaxe_durable')
crafting.remove('pyrotech:tool/bone_hoe_durable')
crafting.remove('pyrotech:tool/bone_shovel_durable')

crafting.remove('pyrotech:tool/flint_axe_durable')
crafting.remove('pyrotech:tool/flint_pickaxe_durable')
crafting.remove('pyrotech:tool/flint_hoe_durable')
crafting.remove('pyrotech:tool/flint_shovel_durable')

crafting.remove('pyrotech:tool/gold_shears')

crafting.remove('pyrotech:tool/bone_shears')
crafting.remove('pyrotech:tool/flint_shears')
crafting.remove('pyrotech:tool/diamond_shears')

crafting.remove('pyrotech:diamond_hammer')
crafting.remove('pyrotech:iron_hammer')
crafting.remove('pyrotech:gold_hammer')


crafting.remove('pyrotech:tech/bloomery/tongs_iron')
crafting.remove('pyrotech:tech/bloomery/tongs_gold')
crafting.remove('pyrotech:tech/bloomery/tongs_diamond')