
// Steel Ingot * 1
mods.gregtech.steam_blast_furnace.removeByInput(24, [metaitem('ingotWroughtIron')], null)

crafting.remove('gtsteam:steam_blast_furance');
// Rubber Bar * 1
mods.gregtech.alloy_klin.removeByInput(1, [metaitem('dustRawRubber') * 3, metaitem('dustSulfur')], null)

// Invar Ingot * 3
mods.gregtech.alloy_klin.removeByInput(1, [metaitem('ingotWroughtIron') * 2, metaitem('dustNickel')], null)
// Invar Ingot * 3
mods.gregtech.alloy_klin.removeByInput(1, [metaitem('dustWroughtIron') * 2, metaitem('ingotNickel')], null)
// Invar Ingot * 3
mods.gregtech.alloy_klin.removeByInput(1, [item('minecraft:iron_ingot') * 2 * 2, metaitem('ingotNickel')], null)
// Invar Ingot * 3
mods.gregtech.alloy_klin.removeByInput(1, [metaitem('dustIron') * 2, metaitem('dustNickel')], null)
// Invar Ingot * 3
mods.gregtech.alloy_klin.removeByInput(1, [item('minecraft:iron_ingot') * 2 * 2, metaitem('dustNickel')], null)
// Invar Ingot * 3
mods.gregtech.alloy_klin.removeByInput(1, [metaitem('dustIron') * 2, metaitem('ingotNickel')], null)
// Cupronickel Ingot * 2
mods.gregtech.alloy_klin.removeByInput(1, [metaitem('ingotAnnealedCopper'), metaitem('ingotNickel')], null)
// Cupronickel Ingot * 2
mods.gregtech.alloy_klin.removeByInput(1, [metaitem('dustAnnealedCopper'), metaitem('dustNickel')], null)
// Cupronickel Ingot * 2
mods.gregtech.alloy_klin.removeByInput(1, [metaitem('ingotAnnealedCopper'), metaitem('dustNickel')], null)
// Cupronickel Ingot * 2
mods.gregtech.alloy_klin.removeByInput(1, [metaitem('dustAnnealedCopper'), metaitem('ingotNickel')], null)
// Cupronickel Ingot * 2
mods.gregtech.alloy_klin.removeByInput(1, [metaitem('ingotCopper'), metaitem('ingotNickel')], null)
// Cupronickel Ingot * 2
mods.gregtech.alloy_klin.removeByInput(1, [metaitem('dustCopper'), metaitem('dustNickel')], null)
// Cupronickel Ingot * 2
mods.gregtech.alloy_klin.removeByInput(1, [metaitem('ingotCopper'), metaitem('dustNickel')], null)
// Cupronickel Ingot * 2
mods.gregtech.alloy_klin.removeByInput(1, [metaitem('dustCopper'), metaitem('ingotNickel')], null)

mods.gregtech.alloy_klin.recipeBuilder()
    .inputs(metaitem('compressed.coke_clay'))
    .outputs(metaitem('brick.coke'))
    .duration(200)
    .buildAndRegister();

mods.gregtech.alloy_klin.recipeBuilder()
    .inputs(metaitem('dustGalena')*4)
    .outputs(metaitem('ingotLead'))
    .duration(200)
    .buildAndRegister();