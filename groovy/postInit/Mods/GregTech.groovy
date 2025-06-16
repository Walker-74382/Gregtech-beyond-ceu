import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

crafting.remove('gregtech:compressed_clay')
furnace.removeByInput(metaitem('dustTinAlloy'));
furnace.removeByInput(metaitem('dustCerium'));


VACUUM_FURNACE_RECIPES.recipeBuilder()
    .inputs(metaitem('dustTinAlloy'))
    .outputs(metaitem('ingotTinAlloy'))
    .duration(140)
    .EUt(80)
    .buildAndRegister();

crafting.addShaped("vacuum_component_parts", metaitem('vacuum_tube_components'), [
[ore('wireGtSingleCopper'), ore('wireGtSingleCopper'), ore('wireGtSingleCopper')], 
[ore('boltSteel'), ore('ringSteel'), ore('boltSteel')]
])

crafting.remove('gregtech:vacuum_tube');

// Vacuum Tube * 2
mods.gregtech.assembler.removeByInput(7, [metaitem('component.glass.tube'), metaitem('boltSteel') * 2, metaitem('wireGtSingleCopper') * 2, metaitem('circuit.integrated').withNbt(['Configuration': 1])], null)
// Vacuum Tube * 3
mods.gregtech.assembler.removeByInput(7, [metaitem('component.glass.tube'), metaitem('boltSteel') * 2, metaitem('wireGtSingleCopper') * 2], [fluid('red_alloy') * 18 * 18])
// Vacuum Tube * 4
mods.gregtech.assembler.removeByInput(7, [metaitem('component.glass.tube'), metaitem('boltSteel') * 2, metaitem('wireGtSingleAnnealedCopper') * 2], [fluid('red_alloy') * 18 * 18])

VACUUM_EJECTION_RECIPES.recipeBuilder()
    .inputs(metaitem('component.glass.tube'))
    .inputs(metaitem('vacuum_tube_components'))
    .outputs(metaitem('circuit.vacuum_tube'))
    .duration(200)
    .EUt(2)
    .buildAndRegister();

crafting.addShaped("vacuum_component_parts_2", metaitem('vacuum_tube_components')*2, [
[ore('wireGtSingleAnnealedCopper'), ore('wireGtSingleAnnealedCopper'), ore('wireGtSingleAnnealedCopper')], 
[ore('boltSteel'), ore('ringSteel'), ore('boltSteel')]
])

crafting.addShaped("vacuum_component_parts_3", metaitem('vacuum_tube_components')*4, [
[ore('wireGtSingleAnnealedCopper'), ore('wireGtSingleAnnealedCopper'), ore('wireGtSingleAnnealedCopper')], 
[metaitem('boltRedAlloy'), ore('ringSteel'), ore('boltRedAlloy')]
])

// Bronze Ingot * 4
mods.gregtech.alloy_smelter.removeByInput(16, [metaitem('ingotCopper') * 3, metaitem('dustTin')], null)
// Bronze Ingot * 4
mods.gregtech.alloy_smelter.removeByInput(16, [metaitem('dustCopper') * 3, metaitem('ingotTin')], null)
// Bronze Ingot * 4
mods.gregtech.alloy_smelter.removeByInput(16, [metaitem('ingotCopper') * 3, metaitem('ingotTin')], null)
// Bronze Ingot * 4
mods.gregtech.alloy_smelter.removeByInput(16, [metaitem('dustCopper') * 3, metaitem('dustTin')], null)
// Bronze Ingot * 4
mods.gregtech.alloy_smelter.removeByInput(16, [metaitem('ingotAnnealedCopper') * 3, metaitem('dustTin')], null)
// Bronze Ingot * 4
mods.gregtech.alloy_smelter.removeByInput(16, [metaitem('dustAnnealedCopper') * 3, metaitem('ingotTin')], null)
// Bronze Ingot * 4
mods.gregtech.alloy_smelter.removeByInput(16, [metaitem('ingotAnnealedCopper') * 3, metaitem('ingotTin')], null)
// Bronze Ingot * 4
mods.gregtech.alloy_smelter.removeByInput(16, [metaitem('dustAnnealedCopper') * 3, metaitem('dustTin')], null)

furnace.removeByInput(metaitem('dustBronze'));

crafting.addShaped("steam_vacuum_ejector", metaitem('gtb:steam_vacuum_ejector'), [
[item('gtsteam:gts_meta_item_1', 2), ore('plateBronze'), item('gtsteam:gts_meta_item_1', 2)], 
[ore('cableGtSingleRedAlloy'), item('gregtech:machine', 985), ore('cableGtSingleRedAlloy')], 
[item('gtsteam:gts_meta_item_1', 1), ore('plateBronze'), item('gtsteam:gts_meta_item_1', 1)]
])

crafting.addShaped("lv_vacuum_ejector", metaitem('gtb:vacuum_ejector.lv'), [
[item('gregtech:meta_item_1', 172), ore('circuitLv'), item('gregtech:meta_item_1', 172)], 
[ore('cableGtSingleTin'), item('gregtech:machine', 986), ore('cableGtSingleTin')], 
[item('gregtech:meta_item_1', 127), ore('circuitLv'), item('gregtech:meta_item_1', 127)]
])

crafting.addShaped("mv_vacuum_ejector", metaitem('gtb:vacuum_ejector.mv'), [
[metaitem('electric.piston.mv'), ore('circuitMv'), metaitem('electric.piston.mv')], 
[metaitem('cableGtSingleCopper'), metaitem('hull.mv'), metaitem('cableGtSingleCopper')], 
[metaitem('electric.motor.mv'), ore('circuitMv'), metaitem('electric.motor.mv')]
])

crafting.addShaped("hv_vacuum_ejector", metaitem('gtb:vacuum_ejector.hv'), [
[metaitem('electric.piston.hv'), ore('circuitHv'), metaitem('electric.piston.hv')], 
[metaitem('cableGtSingleElectrum'), metaitem('hull.hv'), metaitem('cableGtSingleElectrum')], 
[metaitem('electric.motor.hv'), ore('circuitHv'), metaitem('electric.motor.hv')]
])

crafting.addShaped("steam_roaster", metaitem('gtb:steam_roaster'), [
[item('gtsteam:gts_meta_item_1', 1), ore('cableGtSingleRedAlloy'), item('gtsteam:gts_meta_item_1', 1)], 
[ore('circuitUlv'), item('gregtech:machine', 985), ore('circuitUlv')], 
[item('gtsteam:gts_meta_item_1', 2), ore('cableGtSingleRedAlloy'), item('gtsteam:gts_meta_item_1', 2)]
])

furnace.removeByInput(item('gregtech:ore_copper_0'));

crafting.addShaped("large_bloomery_recipe", metaitem('gtb:large_bloomery'), [
[ore('ingotIron'), item('pyrotech:refractory_brick_block'), ore('ingotIron')], 
[item('pyrotech:refractory_brick_block'), item('gregtech:machine_casing'), item('pyrotech:refractory_brick_block')], 
[ore('ingotIron'), item('pyrotech:refractory_brick_block'), ore('ingotIron')]
])

crafting.remove('gregtech:bronze_hull')

crafting.addShaped("gregtech:bronze_hull", item('gregtech:steam_casing'), [
[ore('plateIron'), ore('plateIron'), ore('plateIron')], 
[ore('plateIron'), ore('craftingToolHardHammer'), ore('plateIron')], 
[ore('plateIron'), ore('plateIron'), ore('plateIron')]
])

crafting.remove('gregtech:plate_iron')

PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
    .inputs(metaitem('dustBronze'))
    .chancedOutput(metaitem('ingotBronze')*1, 9000, 0)
    .chancedOutput(metaitem('copper_ore_slag')*1, 1000, 0)
    .inputs(item('minecraft:coal', 1)*4)
    .duration(400)
    .buildAndRegister();

PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
    .inputs(metaitem('dustBronze'))
    .chancedOutput(metaitem('ingotBronze')*1, 9000, 0)
    .chancedOutput(metaitem('copper_ore_slag')*1, 1000, 0)
    .inputs(item('minecraft:coal')*6)
    .duration(400)
    .buildAndRegister();

PRIMITIVE_BLAST_FURNACE_RECIPES.recipeBuilder()
    .inputs(metaitem('dustBronze'))
    .chancedOutput(metaitem('ingotBronze')*1, 9000, 0)
    .chancedOutput(metaitem('copper_ore_slag')*1, 1000, 0)
    .inputs(metaitem('dustAnthracite')*2)
    .duration(400)
    .buildAndRegister();

CENTRIFUGE_RECIPES.recipeBuilder()
    .inputs(metaitem('dustAnthracite'))
    .outputs(metaitem('dustCarbon'))
    .duration(120)
    .EUt(8)
    .buildAndRegister();

furnace.removeByInput(metaitem('compressed.coke_clay'));
// Graphene Dust * 1
mods.gregtech.mixer.removeByInput(480, [metaitem('dustGraphite'), metaitem('dustSilicon'), metaitem('dustCarbon') * 4, metaitem('circuit.integrated').withNbt(['Configuration': 1])], null)

CHEMICAL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('hydrofluoric_acid')*1000)
    .inputs(metaitem('dustSodiumHydroxide'))
    .fluidOutputs(fluid('water')*1000)
    .outputs(metaitem('dustSodiumFluoride'))
    .duration(120)
    .EUt(28)
    .buildAndRegister();

    // Beryllium Dust * 1
mods.gregtech.electrolyzer.removeByInput(60, [metaitem('dustEnderPearl') * 10], null)

// Plastic Circuit Board * 1
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('board.plastic'), metaitem('foilCopper') * 6], [fluid('sodium_persulfate') * 500 * 500])
// Plastic Circuit Board * 1
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('board.plastic'), metaitem('foilCopper') * 6], [fluid('iron_iii_chloride') * 250 * 250])

CHEMICAL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('hydrofluoric_acid')*4000)
    .inputs(metaitem('dustSodiumAluminate')*4)
    .inputs(metaitem('dustSodiumFluoride')*6)
    .fluidOutputs(fluid('cryolite')*1000)
    .outputs(metaitem('dustSodiumHydroxide')*4)
    .duration(120)
    .EUt(28)
    .buildAndRegister();

// Petri Dish * 1
mods.gregtech.fluid_solidifier.removeByInput(480, [metaitem('shape.mold.cylinder')], [fluid('polytetrafluoroethylene') * 36 * 36])
// Petri Dish * 2
mods.gregtech.fluid_solidifier.removeByInput(480, [metaitem('shape.mold.cylinder')], [fluid('polybenzimidazole') * 18 * 18])


ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('frameSteel'))
    .inputs(metaitem('item_casingSteel')*6)
    .outputs(item('gregtech:metal_casing', 4)*2)
    .duration(120)
    .EUt(48)
    .buildAndRegister();

ADSORPTION_TOWER.recipeBuilder()
    .fluidInputs(fluid('sulfuric_acid')*1000)
    .fluidInputs(fluid('sulfur_trioxide')*1000)
    .fluidOutputs(fluid('oleum')*1000)
    .duration(120)
    .EUt(68)
    .buildAndRegister();

TUBE_IN_TUBE_REACTOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('sulfuric_acid')*1000)
    .fluidInputs(fluid('vinyl_toluene')*1000)
    .fluidOutputs(fluid('divinylbenzene_mixture')*1000)
    .duration(200)
    .EUt(150)
    .buildAndRegister();

DISTILLATION_RECIPES.recipeBuilder()
    .fluidInputs(fluid('divinylbenzene_mixture')*1000)
    .fluidOutputs(fluid('divinylbenzene')*1000)
    .fluidOutputs(fluid('one_three_divinylbenzene')*1000)
    .duration(220)
    .EUt(110)
    .buildAndRegister();


//Lucas Reagent

CHEMICAL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('ethanol')*1000)
    .fluidInputs(fluid('hydrochloric_acid')*1000)
    .fluidOutputs(fluid('ethyl_chloride')*1000)
    .duration(220)
    .EUt(110)
    .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('ethyl_chloride')*1000)
    .fluidInputs(fluid('toluene')*1000)
    .fluidOutputs(fluid('ethyl_toluene')*1000)
    .duration(220)
    .EUt(110)
    .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('ethyl_toluene')*1000)
    .fluidOutputs(fluid('vinyl_toluene')*1000)
    .notConsumable(metaitem('dustZincChloride'))
    .fluidOutputs(fluid('hydrogen')*2000)
    .duration(220)
    .EUt(110)
    .buildAndRegister();

SINTERING_OVEN_RECIPES.recipeBuilder()
    .fluidInputs(fluid('air')*100)
    .fluidInputs(fluid('methane')*100)
    .inputs(item('minecraft:quartz'))
    .outputs(metaitem('fused_quartz'))
    .duration(220)
    .EUt(110)
    .buildAndRegister();

crafting.addShaped("fused_quartz_block", item('gtb:gtb_multiblock_casing2', 3), [
[item('gregtech:meta_item_2', 438), item('gregtech:meta_item_2', 438)], 
[item('gregtech:meta_item_2', 438), item('gregtech:meta_item_2', 438)]
])


ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('plateSteel')*5)
    .circuitMeta(5)
    .outputs(metaitem('fume_hood'))
    .duration(220)
    .EUt(110)
    .buildAndRegister();

SINTERING_OVEN_RECIPES.recipeBuilder()
    .fluidInputs(fluid('oxygen')*1000)
    .notConsumable(metaitem('shape.extruder.rod'))
    .inputs(metaitem('stickSteel'))
    .fluidInputs(fluid('silver')*576)
    .outputs(metaitem('silver_electrode'))
    .duration(250)
    .EUt(70)
    .buildAndRegister();

SINTERING_OVEN_RECIPES.recipeBuilder()
    .fluidInputs(fluid('oxygen')*1000)
    .notConsumable(metaitem('shape.extruder.rod'))
    .inputs(metaitem('stickSteel'))
    .fluidInputs(fluid('gold')*576)
    .outputs(metaitem('gold_electrode'))
    .duration(250)
    .EUt(70)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('creosote')*100)
    .inputs(item('minecraft:leather'))
    .outputs(metaitem('treated_leather'))
    .duration(250)
    .EUt(20)
    .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('distilled_water')*1000)
    .inputs(metaitem('dustActivatedCarbon'))
    .fluidOutputs(fluid('activated_carbon_suspension')*1000)
    .duration(400)
    .EUt(120)
    .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('chlorine')*2000)
    .inputs(metaitem('dustPalladium'))
    .fluidOutputs(fluid('palladium_chloride')*1000)
    .duration(400)
    .EUt(120)
    .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder() //CSTR
    .fluidInputs(fluid('hydrochloric_acid')*1000)
    .fluidInputs(fluid('activated_carbon_suspension')*1000)
    .fluidInputs(fluid('palladium_chloride')*1000)
    .fluidOutputs(fluid('palladium_carbon_mixture')*1000)
    .duration(400)
    .EUt(120)
    .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('deionized_water')*1000)
    .inputs(metaitem('dustActivatedCarbon'))
    .fluidOutputs(fluid('activated_carbon_suspension')*1000)
    .duration(400)
    .EUt(120)
    .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder() //CSTR
    .fluidInputs(fluid('palladium_carbon_mixture')*1000)
    .fluidInputs(fluid('formaldehyde')*1000)
    .fluidOutputs(fluid('reduced_palladium_carbon_mixture')*1000)
    .duration(400)
    .EUt(120)
    .buildAndRegister();

DISTILLATION_RECIPES.recipeBuilder()
    .fluidInputs(fluid('reduced_palladium_carbon_mixture')*1000)
    .fluidOutputs(fluid('formaldehyde')*1000)
    .outputs(metaitem('dustPalladiumOnCarbon'))
    .fluidOutputs(fluid('deionized_water')*1000)
    .fluidOutputs(fluid('hydrochloric_acid')*2000)
    .duration(400)
    .EUt(120)
    .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('stearic_acid')*1000)
    .notConsumable(metaitem('dustPalladiumOnCarbon'))
    .fluidOutputs(fluid('oleic_acid')*1000)
    .duration(400)
    .EUt(120)
    .buildAndRegister();

EXTRUDER_RECIPES.recipeBuilder()
    .outputs(metaitem('graphite_electrode'))
    .inputs(metaitem('dustGraphite'))
    .notConsumable(metaitem('shape.extruder.rod'))
    .duration(260)
    .EUt(20)
    .buildAndRegister();

DRYING_COLUMN_RECIPES.recipeBuilder()
    .fluidInputs(fluid('acetic_acid')*1000)
    .fluidOutputs(fluid('glacial_acetic_acid')*1000)
    .duration(1000)
    .EUt(480)
    .buildAndRegister();

crafting.addShaped("tubey", item('gregtech:machine', 3056), [
[ore('pipeSmallFluidSteel'), ore('circuitHv'), ore('pipeSmallFluidSteel')], 
[ore('pipeSmallFluidSteel'), ore('circuitHv'), ore('pipeSmallFluidSteel')], 
[item('gregtech:meta_item_1', 144), item('gregtech:machine', 988), item('gregtech:meta_item_1', 144)]
])

crafting.addShaped("reactive_ion_etcher", item('gregtech:machine', 3058), [
[ore('pipeNormalFluidLead'), item('gregtech:meta_item_1', 175), ore('pipeNormalFluidLead')], 
[ore('circuitEv'), item('gregtech:machine', 988), ore('circuitEv')], 
[item('gregtech:meta_item_1', 145), item('gregtech:meta_item_1', 175), item('gregtech:meta_item_1', 145)]
])

crafting.addShaped("pvd_unit", item('gregtech:machine', 3059), [
[item('gregtech:meta_item_1', 145), item('gtb:gtb_multiblock_casing2'), item('gregtech:meta_item_1', 145)], 
[item('gregtech:meta_item_1', 175), ore('circuitEv'), item('gregtech:meta_item_1', 175)], 
[item('gregtech:meta_item_1', 145), item('gtb:gtb_multiblock_casing2'), item('gregtech:meta_item_1', 145)]
])

crafting.addShaped("blender", item('gregtech:machine', 3060), [
[item('gregtech:meta_item_1', 144), ore('rotorStainlessSteel'), item('gregtech:meta_item_1', 144)], 
[ore('circuitEv'), item('gregtech:machine', 988), ore('circuitEv')], 
[item('gregtech:meta_item_1', 174), item('gregtech:meta_item_1', 144), item('gregtech:meta_item_1', 174)]
])

crafting.addShaped("sonicator", item('gregtech:machine', 3061), [
[item('gregtech:meta_item_1', 145), ore('pipeQuadrupleFluidTitanium'), item('gregtech:meta_item_1', 145)], 
[ore('circuitEv'), item('gtb:gtb_multiblock_casing2', 1), ore('circuitEv')], 
[item('gregtech:meta_item_1', 175), ore('pipeQuadrupleFluidTitanium'), item('gregtech:meta_item_1', 175)]
])

crafting.addShaped("electron_beam", item('gregtech:machine', 3062), [
[item('gregtech:meta_item_1', 145), item('gregtech:meta_item_1', 235), item('gregtech:meta_item_1', 145)], 
[ore('circuitHv'), item('gregtech:metal_casing', 4), ore('circuitHv')], 
[item('gregtech:meta_item_1', 160), item('gregtech:meta_item_1', 220), item('gregtech:meta_item_1', 160)]
])

crafting.addShaped("thermal_vacuum_thingy", item('gregtech:machine', 3063), [
[ore('circuitEv'), item('gtb:gtb_multiblock_casing2', 2), ore('circuitEv')], 
[item('gregtech:meta_item_1', 145), item('gregtech:wire_coil', 2), item('gregtech:meta_item_1', 145)], 
[ore('circuitEv'), item('gtb:gtb_multiblock_casing2', 2), ore('circuitEv')]
])

crafting.addShaped("atomic_layer_deposition", item('gregtech:machine', 3065), [
[item('gregtech:meta_item_1', 145), ore('circuitHv'), item('gregtech:meta_item_1', 145)], 
[ore('rotorStainlessSteel'), item('gregtech:metal_casing', 5), ore('rotorStainlessSteel')], 
[item('gregtech:meta_item_1', 175), ore('circuitHv'), item('gregtech:meta_item_1', 175)]
])

crafting.addShaped("adsorption_tower_recipes", item('gregtech:machine', 3057), [
[item('gregtech:meta_item_1', 175), item('gregtech:meta_item_1', 145), item('gregtech:meta_item_1', 175)], 
[ore('rotorStainlessSteel'), item('gregtech:metal_casing', 4), ore('rotorStainlessSteel')], 
[item('gregtech:meta_item_1', 145), ore('circuitHv'), item('gregtech:meta_item_1', 145)]
])

crafting.addShaped("basic_structural_casing", item('gtb:gtb_multiblock_casing', 7), [
[ore('screwAluminium'), ore('plateTinAlloy'), ore('screwAluminium')], 
[ore('plateTinAlloy'), ore('frameGtSteel'), ore('plateTinAlloy')], 
[ore('screwAluminium'), ore('plateTinAlloy'), ore('screwAluminium')]
])

ASSEMBLER_RECIPES.recipeBuilder()
    .circuitMeta(6)
    .inputs(item('gregtech:meta_block_frame_3', 7))
    .inputs(metaitem('plateLead')*6)
    .duration(300)
    .EUt(12)
    .outputs(item('gtb:gtb_multiblock_casing', 15))
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .circuitMeta(6)
    .inputs(item('gregtech:meta_block_frame_524', 14))
    .inputs(metaitem('platePurifiedSiliconCarbide')*6)
    .duration(300)
    .EUt(12)
    .outputs(item('gtb:gtb_multiblock_casing', 10))
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .circuitMeta(6)
    .inputs(metaitem('frameHssg'))
    .inputs(metaitem('plateHssg')*6)
    .duration(400)
    .EUt(180)
    .outputs(item('gtb:gtb_multiblock_casing2'))
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .circuitMeta(6)
    .inputs(metaitem('pipeNormalFluidTitanium')*2)
    .inputs(metaitem('circuit.nano_processor')*2)
    .inputs(metaitem('frameTitanium'))
    .inputs(metaitem('plateTitanium')*6)
    .outputs(item('gtb:gtb_multiblock_casing2', 1)*6)
    .duration(400)
    .EUt(180)
    .buildAndRegister();

crafting.addShaped("thermal_evaporation", item('gtb:gtb_multiblock_casing2', 2), [
[ore('plateAnnealedCopper'), item('gregtech:meta_item_1', 143), ore('plateAnnealedCopper')], 
[ore('plateAnnealedCopper'), ore('frameGtSteel'), ore('plateAnnealedCopper')], 
[ore('plateAnnealedCopper'), item('gregtech:meta_item_1', 143), ore('plateAnnealedCopper')]
])

MIXER_RECIPES.recipeBuilder()
    .inputs(metaitem('dustIndium'))
    .inputs(metaitem('dustGallium'))
    .inputs(metaitem('dustArsenic'))
    .outputs(metaitem('dustIndiumGalliumArsenide')*3)
    .duration(200)
    .EUt(40)
    .buildAndRegister();

crafting.remove("gregtech:cracking_unit");

BLAST_RECIPES.recipeBuilder()
    .inputs(metaitem('dustCerium'))
    .outputs(metaitem('ingotCerium'))
    .blastFurnaceTemp(3000)
    .EUt(800)
    .duration(300)
    .buildAndRegister();

    // Water * 2000
mods.gregtech.chemical_reactor.removeByInput(120, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('ammonia') * 1000 * 1000, fluid('methanol') * 2000 * 2000])
