

mods.primal_tech.clay_kiln.recipeBuilder()
    .input(item('minecraft:stone'))
    .output(item('gtb:gtb_multiblock_casing', 6))
    .cookTime(50)
    .register()

crafting.remove('primal_tech:recipe_plant_fibres')

mods.primal_tech.stone_anvil.removeByOutput(item('minecraft:flint'))

mods.primal_tech.stone_anvil.recipeBuilder()
    .input(item('primal_tech:flint_block'))
    .output(item('minecraft:flint'))
    .register()

crafting.remove('primal_tech:recipe_wooden_basin')

crafting.addShaped("recipe_wooden_basin", item('primal_tech:wooden_basin'), [
[ore('plankWood'), item('minecraft:stick'), ore('plankWood')], 
[ore('plankWood'), item('primal_tech:flint_block'), ore('plankWood')], 
[item('gtb:gtb_multiblock_casing', 6), null, item('gtb:gtb_multiblock_casing', 6)]
])

crafting.remove('primal_tech:recipe_clay_kiln')

crafting.addShaped("recipe_clay_kiln", item('primal_tech:clay_kiln'), [
[null, ore('ingotBrick'), null], 
[ore('ingotBrick'), null, ore('ingotBrick')], 
[ore('ingotBrick'), ore('ingotBrick'), ore('ingotBrick')]
])

crafting.remove('primal_tech:recipe_twine')

crafting.addShaped("recipe_twine", item('notreepunching:grass_string'), [
[item('primal_tech:plant_fibres'), item('primal_tech:plant_fibres')], 
[item('primal_tech:plant_fibres'), null]
])

oreDict.remove("string", item('primal_tech:twine'))

crafting.remove('primal_tech:recipe_fibre_torch');
crafting.remove('primal_tech:recipe_stone_grill');


mods.primal_tech.wooden_basin.recipeBuilder()
    .input(item('minecraft:gravel'))
    .input(item('minecraft:sand'))
    .input(metaitem('dustBrick'))
    .fluidInput(fluid('water')*1000)
    .output(metaitem('dustMasonryBrick'))
    .register()

mods.primal_tech.clay_kiln.recipeBuilder()
    .input(metaitem('dustMasonryBrick'))
    .output(metaitem('ingotMasonryBrick'))
    .cookTime(50)
    .register()


mods.jei.category.hideCategory('primal_tech.stone_grill_recipes')

