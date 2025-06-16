

crafting.remove('horsepower:hand_grindstone');

crafting.addShaped("hand_grindstone", item('horsepower:hand_grindstone'), [[null, null, ore('stickWood')], [item('gtb:gtb_multiblock_casing', 6), item('gtb:gtb_multiblock_casing', 6), item('gtb:gtb_multiblock_casing', 6)], [item('gtb:gtb_multiblock_casing', 6), item('gtb:gtb_multiblock_casing', 6), item('gtb:gtb_multiblock_casing', 6)]])


mods.horsepower.grindstone.recipeBuilder()
    .input(item('gtb:gtb_multiblock_casing', 6))
    .output(metaitem('dustStone'))
    .time(5)
    .register()

mods.horsepower.press.recipeBuilder()
    .input(metaitem('dustStone'))
    .output(metaitem('plateStone'))
    .register()

crafting.remove('horsepower:press')

crafting.addShaped("horsepower_press", item('horsepower:press'), [
[item('minecraft:lead'), null, item('minecraft:lead')], 
[ore('plankWood'), item('minecraft:wooden_pressure_plate'), ore('plankWood')], 
[ore('stoneObsidian'), ore('plankWood'), ore('stoneObsidian')]
])

furnace.removeByInput(item('horsepower:dough'));

crafting.remove('horsepower:dough');

mods.horsepower.grindstone.removeByInput(item('minecraft:wheat'));

mods.horsepower.press.recipeBuilder()
    .input(item('minecraft:iron_ingot') * 3)
    .output(metaitem('plateIron'))
    .register()

mods.horsepower.press.recipeBuilder()
    .input(metaitem('dustFireclay'))
    .output(metaitem('compressed.fireclay'))
    .register()
