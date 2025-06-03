import gregtech.api.metatileentity.multiblock.CleanroomType
import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

def glasscable = item('appliedenergistics2:part:16')
def fboule = metaitem('boule.fluix')
def fwafer = metaitem('wafer.fluix')



item('appliedenergistics2:material:43').addOreDict(ore('FormationCore'))
item('appliedenergistics2:material:44').addOreDict(ore('AnnhilationCore'))
metaitem('entropycore').addOreDict(ore('EntropyCore'))

//Removing Cells base recipes
crafting.remove('appliedenergistics2:tools/network_portable_cell')
crafting.remove('appliedenergistics2:network/blocks/storage_chest')
crafting.remove('appliedenergistics2:network/cells/storage_components_cell_1k_part')
crafting.remove('appliedenergistics2:network/cells/storage_components_cell_4k_part')
crafting.remove('appliedenergistics2:network/cells/storage_components_cell_16k_part')
crafting.remove('appliedenergistics2:network/cells/storage_components_cell_64k_part')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_components_cell_1k_part')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_components_cell_4k_part')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_components_cell_16k_part')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_components_cell_64k_part')
crafting.remove('appliedenergistics2:misc/meteors_sky_compass')

crafting.remove('appliedenergistics2:network/cells/storage_cell_1k_storage')
crafting.remove('appliedenergistics2:network/cells/storage_cell_1k')
crafting.remove('appliedenergistics2:network/cells/storage_cell_4k_storage')
crafting.remove('appliedenergistics2:network/cells/storage_cell_4k')
crafting.remove('appliedenergistics2:network/cells/storage_cell_16k_storage')
crafting.remove('appliedenergistics2:network/cells/storage_cell_16k')
crafting.remove('appliedenergistics2:network/cells/storage_cell_64k_storage')
crafting.remove('appliedenergistics2:network/cells/storage_cell_64k')

crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_1k_storage')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_1k')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_4k_storage')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_4k')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_16k_storage')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_16k')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_64k_storage')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_64k')


crafting.remove('nae2:block/crafting/storage_256k')
crafting.remove('nae2:block/crafting/storage_1024k')
crafting.remove('nae2:block/crafting/storage_4096k')
crafting.remove('nae2:block/crafting/storage_16384k')

//Removing AE2 related GT items
crafting.remove('gregtech:bolt_saw_CrystalFluix')
crafting.remove('gregtech:screw_CrystalFluix')
crafting.remove('appliedenergistics2:network/blocks/controller')

// Crystal Fluix Bolt * 4
mods.gregtech.cutter.removeByInput(4, [metaitem('stickCrystalFluix')], [fluid('distilled_water') * 3 * 3])
// Crystal Fluix Bolt * 4
mods.gregtech.cutter.removeByInput(4, [metaitem('stickCrystalFluix')], [fluid('water') * 4 * 4])
// Crystal Fluix Bolt * 4
mods.gregtech.cutter.removeByInput(4, [metaitem('stickCrystalFluix')], [fluid('lubricant')])


oreDict.remove("crystalCertusQuartz", item('appliedenergistics2:material'))
oreDict.remove("crystalFluix", item('appliedenergistics2:material', 7))

//Removing Misc
crafting.remove('appliedenergistics2:network/blocks/energy_energy_cell')
crafting.remove('appliedenergistics2:network/blocks/energy_dense_energy_cell')
crafting.remove('appliedenergistics2:network/blocks/io_condenser')
crafting.remove('ae2fc:fluid_discretizer')
crafting.remove('appliedenergistics2:network/blocks/fluid_interfaces_interface')
crafting.remove('appliedenergistics2:network/blocks/interfaces_interface')
crafting.remove('appliedenergistics2:materials/annihilationcore')
crafting.remove('appliedenergistics2:materials/formationcore')
crafting.remove('appliedenergistics2:network/crafting/cpu_crafting_monitor')
crafting.remove('appliedenergistics2:network/crafting/cpu_crafting_unit')
crafting.remove('appliedenergistics2:network/crafting/cpu_crafting_accelerator')
crafting.remove('appliedenergistics2:network/crafting/cpu_crafting_storage_1k')
crafting.remove('appliedenergistics2:network/crafting/cpu_crafting_storage_4k')
crafting.remove('appliedenergistics2:network/crafting/cpu_crafting_storage_16k')
crafting.remove('appliedenergistics2:network/crafting/cpu_crafting_storage_64k')
crafting.remove('appliedenergistics2:network/cables/glass_fluix')
crafting.remove('appliedenergistics2:network/parts/quartz_fiber_part')
crafting.remove('appliedenergistics2:network/crafting/patterns_blank')
crafting.remove('ae2wtlib:booster_card_old')
crafting.remove('wct:wct')
crafting.remove('ae2fc:fluid_packet_decoder')
crafting.remove('ae2fc:ingredient_buffer')
crafting.remove('ae2fc:large_ingredient_buffer')
crafting.remove('ae2fc:burette')
crafting.remove('wct:magnet_card')

//Crafting Table Recipes
crafting.addShapeless('magnetcardlv', item('wct:magnet_card'), [item('appliedenergistics2:material:28'), metaitem('item_magnet.lv')])
crafting.addShapeless('magnetcardhv', item('wct:magnet_card'), [item('appliedenergistics2:material:28'), metaitem('item_magnet.hv')])
crafting.addShaped('basiccard', item('appliedenergistics2:material:25')*4, [
        [metaitem('wireFineRedAlloy'), metaitem('plateCertusQuartz'), metaitem('screwCrystalFluix')],
        [metaitem('wireFineRedAlloy'), item('appliedenergistics2:material:23'), metaitem('gemFlawlessCrystalFluix')],
        [metaitem('wireFineRedAlloy'), metaitem('plateCertusQuartz'), metaitem('screwCrystalFluix')]])
crafting.addShaped('advancedcard', item('appliedenergistics2:material:28')*4, [
        [metaitem('wireFineBlueAlloy'), metaitem('plateCertusQuartz'), metaitem('screwCrystalFluix')],
        [metaitem('wireFineBlueAlloy'), item('appliedenergistics2:material:23'), metaitem('gemFlawlessCrystalFluix')],
        [metaitem('wireFineBlueAlloy'), metaitem('plateCertusQuartz'), metaitem('screwCrystalFluix')]])

crafting.addShaped('portable_cell', item('appliedenergistics2:portable_cell').withNbt(["internalCurrentPower": 200000.0D, "internalMaxPower": 200000.0D]), [
        [metaitem('wireGtSingleRedAlloy'), metaitem('screwSteel'), metaitem('wireGtSingleRedAlloy')],
        [metaitem('plateWroughtIron'), ore('paneGlass'), metaitem('plateWroughtIron')],
        [metaitem('boltWroughtIron'), metaitem('crate.wood'), metaitem('boltWroughtIron')]])

crafting.addShaped('me_chest', item('appliedenergistics2:chest'), [
        [ore('blockGlass'), ore('blockGlass'), ore('blockGlass')],
        [metaitem('plateWroughtIron'), ore('circuitLv'), metaitem('plateWroughtIron')],
        [metaitem('screwCrystalFluix'), glasscable, metaitem('screwCrystalFluix')]])

crafting.addShaped('energy_cell', item('appliedenergistics2:energy_cell'), [
        [metaitem('plateCertusQuartz'), ore('dustCrystalFluix'), metaitem('plateCertusQuartz')],
        [ore('dustCrystalFluix'), item('appliedenergistics2:quartz_glass'), ore('dustCrystalFluix')],
        [metaitem('plateCertusQuartz'), ore('dustCrystalFluix'), metaitem('plateCertusQuartz')]])

crafting.addShaped('dense_energy_cell', item('appliedenergistics2:dense_energy_cell'), [
        [metaitem('plateCrystalFluix'), glasscable, metaitem('plateCrystalFluix')],
        [item('appliedenergistics2:energy_cell'), item('appliedenergistics2:material:23'), item('appliedenergistics2:energy_cell')],
        [metaitem('plateCrystalFluix'), glasscable, metaitem('plateCrystalFluix')]])

crafting.addShaped('condenser', item('appliedenergistics2:condenser'), [
        [metaitem('plateDoubleStainlessSteel'), metaitem('electric.piston.ev'), metaitem('plateDoubleStainlessSteel')],
        [glasscable, item('gregtech:machine:233'), glasscable],
        [metaitem('plateDoubleStainlessSteel'), metaitem('electric.piston.ev'), metaitem('plateDoubleStainlessSteel')]])

crafting.addShaped('discretizer', item('ae2fc:fluid_discretizer'), [
        [metaitem('plateDoubleStainlessSteel'), item('appliedenergistics2:fluid_interface'), metaitem('plateDoubleStainlessSteel')],
        [metaitem('robot.arm.hv'), item('appliedenergistics2:condenser'), metaitem('fluid.regulator.hv')],
        [metaitem('plateDoubleStainlessSteel'), item('appliedenergistics2:interface'), metaitem('plateDoubleStainlessSteel')]])

crafting.addShaped('packet_decoder', item('ae2fc:fluid_packet_decoder'), [
        [metaitem('plateStainlessSteel'), metaitem('conveyor.module.hv'), metaitem('plateStainlessSteel')],
        [glasscable, item('appliedenergistics2:fluid_interface'), glasscable],
        [metaitem('plateStainlessSteel'), item('appliedenergistics2:material:43'), metaitem('plateStainlessSteel')]])

crafting.addShaped('burette', item('ae2fc:burette'), [
        [metaitem('plateStainlessSteel'), glasscable, metaitem('plateStainlessSteel')],
        [metaitem('electric.pump.hv'), item('ae2fc:dual_interface'), metaitem('conveyor.module.hv')],
        [metaitem('plateStainlessSteel'), glasscable, metaitem('plateStainlessSteel')]])

crafting.addShaped('gregtech_beyond:buffer', item('ae2fc:ingredient_buffer'), [
        [metaitem('plateCertusQuartz'), ore('AnnhilationCore'), metaitem('plateCertusQuartz')],
        [item('appliedenergistics2:quartz_glass'), item('ae2fc:dual_interface'), item('appliedenergistics2:quartz_glass')],
        [metaitem('plateCertusQuartz'), ore('FormationCore'), metaitem('plateCertusQuartz')]])

crafting.addShaped('largebuffer', item('ae2fc:large_ingredient_buffer'), [
        [metaitem('plateCrystalFluix'), item('ae2fc:ingredient_buffer'), metaitem('plateCrystalFluix')],
        [item('ae2fc:ingredient_buffer'), ore('EntropyCore'), item('ae2fc:ingredient_buffer')],
        [metaitem('plateCrystalFluix'), item('ae2fc:ingredient_buffer'), metaitem('plateCrystalFluix')]])

crafting.addShaped('fmaintainer', item('ae2fc:fluid_level_maintainer'), [
        [metaitem('plateAluminium'), item('appliedenergistics2:part:281'), metaitem('plateAluminium')],
        [item('appliedenergistics2:material:24'), item('appliedenergistics2:fluid_interface'), item('appliedenergistics2:material:24')],
        [metaitem('plateAluminium'), item('appliedenergistics2:material:53'), metaitem('plateAluminium')]])

//Item Interfaces
crafting.addShaped('interfacemv', item('appliedenergistics2:interface'), [
        [metaitem('plateAluminium'), ore('AnnhilationCore'), metaitem('plateAluminium')],
        [metaitem('conveyor.module.mv'), metaitem('crate.bronze'), metaitem('conveyor.module.mv')],
        [metaitem('plateAluminium'), ore('FormationCore'), metaitem('plateAluminium')]])

crafting.addShaped('interfacehv', item('appliedenergistics2:interface')*2, [
        [metaitem('plateStainlessSteel'), ore('AnnhilationCore'), metaitem('plateStainlessSteel')],
        [metaitem('conveyor.module.hv'), metaitem('crate.bronze'), metaitem('conveyor.module.hv')],
        [metaitem('plateStainlessSteel'), ore('FormationCore'), metaitem('plateStainlessSteel')]])

crafting.addShaped('interfaceev', item('appliedenergistics2:interface')*4, [
        [metaitem('plateTitanium'), ore('AnnhilationCore'), metaitem('plateTitanium')],
        [metaitem('conveyor.module.ev'), metaitem('crate.steel'), metaitem('conveyor.module.ev')],
        [metaitem('plateTitanium'), ore('FormationCore'), metaitem('plateTitanium')]])

crafting.addShaped('interfaceiv', item('appliedenergistics2:interface')*8, [
        [metaitem('plateTungstenSteel'), ore('AnnhilationCore'), metaitem('plateTungstenSteel')],
        [metaitem('conveyor.module.iv'), metaitem('crate.steel'), metaitem('conveyor.module.iv')],
        [metaitem('plateTungstenSteel'), ore('FormationCore'), metaitem('plateTungstenSteel')]])

//Fluid Interfaces
crafting.addShaped('fluidinterfacehv', item('appliedenergistics2:fluid_interface'), [
        [metaitem('plateStainlessSteel'), ore('AnnhilationCore'), metaitem('plateStainlessSteel')],
        [metaitem('electric.pump.hv'), item('gregtech:hermetic_casing:0'), metaitem('electric.pump.hv')],
        [metaitem('plateStainlessSteel'), ore('FormationCore'), metaitem('plateStainlessSteel')]])

crafting.addShaped('fluidinterfaceev', item('appliedenergistics2:fluid_interface')*2, [
        [metaitem('plateTitanium'), ore('AnnhilationCore'), metaitem('plateTitanium')],
        [metaitem('electric.pump.ev'), item('gregtech:hermetic_casing:1'), metaitem('electric.pump.ev')],
        [metaitem('plateTitanium'), ore('FormationCore'), metaitem('plateTitanium')]])

crafting.addShaped('fluidinterfaceiv', item('appliedenergistics2:fluid_interface')*4, [
        [metaitem('plateTungstenSteel'), ore('AnnhilationCore'), metaitem('plateTungstenSteel')],
        [metaitem('electric.pump.iv'), item('gregtech:hermetic_casing:2'), metaitem('electric.pump.iv')],
        [metaitem('plateTungstenSteel'), ore('FormationCore'), metaitem('plateTungstenSteel')]])


//Blank Patterns
crafting.addShaped('blankpatternlv', item('appliedenergistics2:material:52'), [
        [metaitem('boltCrystalFluix'), ore('plateRubber'), metaitem('boltCrystalFluix')],
        [ore('plateRubber'), ore('circuitLv'), ore('plateRubber')],
        [ore('dustCertusQuartz'), metaitem('plateSteel'), ore('dustCertusQuartz')]])
crafting.addShaped('blankpatternmv', item('appliedenergistics2:material:52')*2, [
        [metaitem('boltCrystalFluix'), ore('platePlastic'), metaitem('boltCrystalFluix')],
        [ore('platePlastic'), ore('circuitMv'), ore('platePlastic')],
        [ore('gemCertusQuartz'), metaitem('plateAluminium'), ore('gemCertusQuartz')]])
crafting.addShaped('blankpatternhv', item('appliedenergistics2:material:52')*4, [
        [metaitem('boltCrystalFluix'), ore('platePolyvinylChloride'), metaitem('boltCrystalFluix')],
        [ore('platePolyvinylChloride'), ore('circuitHv'), ore('platePolyvinylChloride')],
        [ore('gemCertusQuartz'), metaitem('plateStainlessSteel'), ore('gemCertusQuartz')]])
crafting.addShaped('blankpatternev', item('appliedenergistics2:material:52')*8, [
        [metaitem('boltCrystalFluix'), ore('platePolytetrafluoroethylene'), metaitem('boltCrystalFluix')],
        [ore('platePolytetrafluoroethylene'), ore('circuitEv'), ore('platePolytetrafluoroethylene')],
        [ore('gemFlawlessCertusQuartz'), metaitem('plateTitanium'), ore('gemFlawlessCertusQuartz')]])
crafting.addShaped('blankpatterniv', item('appliedenergistics2:material:52')*16, [
        [metaitem('boltCrystalFluix'), ore('platePolybenzimidazole'), metaitem('boltCrystalFluix')],
        [ore('platePolybenzimidazole'), ore('circuitIv'), ore('platePolybenzimidazole')],
        [ore('gemExquisiteCertusQuartz'), metaitem('plateTungstenSteel'), ore('gemExquisiteCertusQuartz')]])

//Storage Components
ASSEMBLER_RECIPES.recipeBuilder() //1k Item
    .inputs(metaitem('crate.wood'), metaitem('dustNetherQuartz'), metaitem('wireFineRedAlloy')*4, ore('circuitMv'), metaitem('screwCrystalFluix')*2, metaitem('plateSteel'))
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:material:35'))
    .duration(20) 
    .EUt(16)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //1k Item
    .inputs(metaitem('crate.wood'), metaitem('dustCertusQuartz'), metaitem('wireFineRedAlloy')*4, ore('circuitMv'), metaitem('screwCrystalFluix')*2, metaitem('plateSteel'))
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:material:35'))
    .duration(20) 
    .EUt(16)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //4k Item
    .inputs(ore('gemNetherQuartz'), ore('FormationCore'), ore('AnnhilationCore'), metaitem('wireFineRedAlloy')*4, metaitem('plate.basic_fluix_systematic_chip'), metaitem('screwCrystalFluix')*2, metaitem('plateAluminium'))
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:material:36'))
    .duration(20) 
    .EUt(128)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //4k Item
    .inputs( metaitem('gemCertusQuartz'), ore('FormationCore'), ore('AnnhilationCore'), metaitem('wireFineRedAlloy')*4, metaitem('plate.basic_fluix_systematic_chip'), metaitem('screwCrystalFluix')*2, metaitem('plateAluminium'))
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:material:36'))
    .duration(20) 
    .EUt(128)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //16k Item
    .inputs(metaitem('gemFlawlessNetherQuartz'), ore('FormationCore')*2, ore('AnnhilationCore')*2, metaitem('wireFineRedAlloy')*8, metaitem('plate.basic_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*3, metaitem('plateStainlessSteel'))
    .fluidInputs(fluid('certus_quartz')*144)
    .outputs(item('appliedenergistics2:material:37'))
    .duration(20) 
    .EUt(256)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //16k Item
    .inputs(metaitem('gemFlawlessCertusQuartz'), ore('FormationCore')*2, ore('AnnhilationCore')*2, metaitem('wireFineRedAlloy')*8, metaitem('plate.basic_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*3, metaitem('plateStainlessSteel'))
    .fluidInputs(fluid('nether_quartz')*144)
    .outputs(item('appliedenergistics2:material:37'))
    .duration(20) 
    .EUt(256)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //64k Item
    .inputs(metaitem('gemExquisiteNetherQuartz'), ore('EntropyCore'), metaitem('wireFineRedAlloy')*16, metaitem('plate.complex_fluix_systematic_chip'), metaitem('screwCrystalFluix')*4, metaitem('plateTitanium'))
    .fluidInputs(fluid('certus_quartz')*288)
    .outputs(item('appliedenergistics2:material:38'))
    .duration(20) 
    .EUt(1024)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //64k Item
    .inputs(metaitem('gemExquisiteCertusQuartz'), ore('EntropyCore'), metaitem('wireFineRedAlloy')*16, metaitem('plate.complex_fluix_systematic_chip'), metaitem('screwCrystalFluix')*4, metaitem('plateTitanium'))
    .fluidInputs(fluid('nether_quartz')*288)
    .outputs(item('appliedenergistics2:material:38'))
    .duration(20) 
    .EUt(1024)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //256k Item
    .inputs(metaitem('gemCrystalFluix'), ore('EntropyCore')*2, metaitem('wireFineRedAlloy')*32, metaitem('plate.complex_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*6, metaitem('plateTungstenSteel'))
    .fluidInputs(fluid('certus_quartz')*576)
    .outputs(item('nae2:material:1'))
    .duration(20) 
    .EUt(2048)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //256k Item
    .inputs(metaitem('gemCrystalFluix'), ore('EntropyCore')*2, metaitem('wireFineRedAlloy')*32, metaitem('plate.complex_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*6, metaitem('plateTungstenSteel'))
    .fluidInputs(fluid('nether_quartz')*576)
    .outputs(item('nae2:material:1'))
    .duration(20) 
    .EUt(2048)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //1024k Item
    .inputs(metaitem('gemFlawlessCrystalFluix'), ore('EntropyCore')*4, metaitem('wireFineRedAlloy')*64, metaitem('plate.complex_fluix_systematic_chip')*4, metaitem('screwCrystalFluix')*8, metaitem('plateRhodiumPlatedPalladium'))
    .fluidInputs(fluid('crystal_fluix')*144)
    .outputs(item('nae2:material:2'))
    .duration(20) 
    .EUt(4096)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //4096k Item
    .inputs(metaitem('gemExquisiteCrystalFluix'), ore('EntropyCore')*8, metaitem('wireGtSingleRedAlloy')*16, metaitem('plate.complex_fluix_systematic_chip')*8, metaitem('screwCrystalFluix')*16, metaitem('plateDoubleRhodiumPlatedPalladium'))
    .fluidInputs(fluid('crystal_fluix')*288)
    .outputs(item('nae2:material:3'))
    .duration(40) 
    .EUt(8192)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //16384k Item
    .inputs(metaitem('gemExquisiteCrystalFluix')*2, ore('EntropyCore')*16, metaitem('wireGtSingleRedAlloy')*32, metaitem('plate.complex_fluix_systematic_chip')*16, metaitem('screwCrystalFluix')*32, metaitem('plateNaquadahAlloy'))
    .fluidInputs(fluid('crystal_fluix')*576)
    .outputs(item('nae2:material:4'))
    .duration(80) 
    .EUt(16384)
    .buildAndRegister()


ASSEMBLER_RECIPES.recipeBuilder() //1k Fluid
    .inputs(metaitem('drum.wood'), metaitem('dustNetherQuartz'), metaitem('wireFineBlueAlloy')*4, ore('circuitMv'), metaitem('screwCrystalFluix')*2, metaitem('plateBrass'))
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:material:54'))
    .duration(30) 
    .EUt(16)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //1k Fluid
    .inputs(metaitem('drum.wood'), metaitem('dustCertusQuartz'), metaitem('wireFineBlueAlloy')*4, ore('circuitMv'), metaitem('screwCrystalFluix')*2, metaitem('plateBrass'))
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:material:54'))
    .duration(30) 
    .EUt(16)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //4k Fluid
    .inputs(ore('gemNetherQuartz'), ore('FormationCore'), ore('AnnhilationCore'), metaitem('wireFineBlueAlloy')*4, metaitem('plate.basic_fluix_systematic_chip'), metaitem('screwCrystalFluix')*2, metaitem('plateElectrum'))
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:material:55'))
    .duration(30) 
    .EUt(240)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //4k Fluid
    .inputs(metaitem('gemCertusQuartz'), ore('FormationCore'), ore('AnnhilationCore'), metaitem('wireFineBlueAlloy')*4, metaitem('plate.basic_fluix_systematic_chip'), metaitem('screwCrystalFluix')*2, metaitem('plateElectrum'))
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:material:55'))
    .duration(30) 
    .EUt(240)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //16k Fluid
    .inputs(ore('gemFlawlessNetherQuartz'), ore('FormationCore')*2, ore('AnnhilationCore')*2, metaitem('wireFineBlueAlloy')*8, metaitem('plate.complex_fluix_systematic_chip'), metaitem('screwCrystalFluix')*3, metaitem('plateChrome'))
    .fluidInputs(fluid('certus_quartz')*144)
    .outputs(item('appliedenergistics2:material:56'))
    .duration(30) 
    .EUt(1024)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //16k Fluid
    .inputs(metaitem('gemFlawlessCertusQuartz'), ore('FormationCore')*2, ore('AnnhilationCore')*2, metaitem('wireFineBlueAlloy')*8, metaitem('plate.complex_fluix_systematic_chip'), metaitem('screwCrystalFluix')*3, metaitem('plateChrome'))
    .fluidInputs(fluid('nether_quartz')*144)
    .outputs(item('appliedenergistics2:material:56'))
    .duration(30) 
    .EUt(1024)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //64k Fluid
    .inputs(ore('gemExquisiteNetherQuartz'), ore('EntropyCore'), metaitem('wireFineBlueAlloy')*16, metaitem('plate.complex_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*4, metaitem('platePlatinum'))
    .fluidInputs(fluid('certus_quartz')*288)
    .outputs(item('appliedenergistics2:material:57'))
    .duration(30) 
    .EUt(4096)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //64k Fluid
    .inputs(metaitem('gemExquisiteCertusQuartz'), ore('EntropyCore'), metaitem('wireFineBlueAlloy')*16, metaitem('plate.complex_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*4, metaitem('platePlatinum'))
    .fluidInputs(fluid('nether_quartz')*288)
    .outputs(item('appliedenergistics2:material:57'))
    .duration(30) 
    .EUt(4096)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //256k Item
    .inputs(metaitem('gemCrystalFluix'), ore('EntropyCore')*2, metaitem('wireFineBlueAlloy')*32, metaitem('plate.complex_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*6, metaitem('plateTungstenSteel'))
    .fluidInputs(fluid('certus_quartz')*576)
    .outputs(item('nae2:material:5'))
    .duration(20) 
    .EUt(2048)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //256k Item
    .inputs(metaitem('gemCrystalFluix'), ore('EntropyCore')*2, metaitem('wireFineBlueAlloy')*32, metaitem('plate.complex_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*6, metaitem('plateTungstenSteel'))
    .fluidInputs(fluid('nether_quartz')*576)
    .outputs(item('nae2:material:5'))
    .duration(20) 
    .EUt(2048)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //1024k Fluid
    .inputs(metaitem('gemFlawlessCrystalFluix'), ore('EntropyCore')*4, metaitem('wireFineBlueAlloy')*64, metaitem('plate.complex_fluix_systematic_chip')*4, metaitem('screwCrystalFluix')*8, metaitem('plateRhodiumPlatedPalladium'))
    .fluidInputs(fluid('crystal_fluix')*144)
    .outputs(item('nae2:material:6'))
    .duration(20) 
    .EUt(4096)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //4096k Fluid
    .inputs(metaitem('gemExquisiteCrystalFluix'), ore('EntropyCore')*8, metaitem('wireGtSingleBlueAlloy')*16, metaitem('plate.complex_fluix_systematic_chip')*8, metaitem('screwCrystalFluix')*16, metaitem('plateDoubleRhodiumPlatedPalladium'))
    .fluidInputs(fluid('crystal_fluix')*288)
    .outputs(item('nae2:material:7'))
    .duration(40) 
    .EUt(8192)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder() //16384k Fluid
    .inputs(metaitem('gemExquisiteCrystalFluix')*2, ore('EntropyCore')*16, metaitem('wireGtSingleBlueAlloy')*32, metaitem('plate.complex_fluix_systematic_chip')*16, metaitem('screwCrystalFluix')*32, metaitem('plateNaquadahAlloy'))
    .fluidInputs(fluid('crystal_fluix')*576)
    .outputs(item('nae2:material:8'))
    .duration(80) 
    .EUt(16384)
    .buildAndRegister()

//Cores
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:22'), ore('dustCrystalFluix')*2, metaitem('gemFlawlessNetherQuartz'), ore('circuitLv'), metaitem('wireFineBlueAlloy')*8, metaitem('boltInvar')*4)
    .fluidInputs(fluid('certus_quartz')*144)
    .outputs(item('appliedenergistics2:material:44')*2)
    .duration(480) 
    .EUt(120)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:22'), ore('dustCrystalFluix')*2, metaitem('gemFlawlessCertusQuartz'), ore('circuitLv'), metaitem('wireFineRedAlloy')*8, metaitem('boltSteel')*4)
    .fluidInputs(fluid('nether_quartz')*144)
    .outputs(item('appliedenergistics2:material:43')*2)
    .duration(480) 
    .EUt(120)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:22'), metaitem('gemFlawlessNetherQuartz'), metaitem('plate.basic_fluix_systematic_chip'), metaitem('wireFineBlueAlloy')*4, metaitem('boltInvar')*2, metaitem('plateNetherQuartz'))
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:material:44')*4)
    .duration(480) 
    .EUt(1920)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:22'), metaitem('gemFlawlessCertusQuartz'), metaitem('plate.basic_fluix_systematic_chip'), metaitem('wireFineRedAlloy')*4, metaitem('boltSteel')*2, metaitem('plateCertusQuartz'))
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:material:43')*4)
    .duration(480) 
    .EUt(1920)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(ore('FormationCore'), ore('AnnhilationCore'), metaitem('foilPolyvinylChloride')*8, metaitem('gemFlawlessCrystalFluix'), ore('circuitHv')*2, metaitem('wireFineElectrum')*16, metaitem('screwAnnealedCopper')*8)
    .fluidInputs(fluid('quartzite')*576)
    .outputs(metaitem('entropycore'))
    .duration(600) 
    .EUt(480)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(ore('FormationCore')*2, ore('AnnhilationCore')*2, metaitem('plate.simple_fluix_systematic_chip')*4, metaitem('screwAnnealedCopper')*4)
    .fluidInputs(fluid('quartzite')*576)
    .outputs(metaitem('entropycore'))
    .duration(600) 
    .EUt(480)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(ore('FormationCore'), ore('AnnhilationCore'), metaitem('plate.basic_fluix_systematic_chip')*4, metaitem('screwCrystalFluix')*4)
    .fluidInputs(fluid('quartzite')*288)
    .outputs(metaitem('entropycore')*2)
    .duration(300) 
    .EUt(480)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(ore('FormationCore'), ore('AnnhilationCore'), metaitem('plate.complex_fluix_systematic_chip')*4, metaitem('screwBlueAlloy')*4)
    .fluidInputs(fluid('quartzite')*288)
    .outputs(metaitem('entropycore')*4)
    .duration(150) 
    .EUt(480)
    .buildAndRegister()

//Wireless related
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('sensor.luv')*2, metaitem('emitter.luv')*2, item('appliedenergistics2:material:42'), metaitem('entropycore')*4, metaitem('plateDenseRhodiumPlatedPalladium')*4, metaitem('screwHsss')*16)
    .fluidInputs(fluid('crystal_fluix')*1152)
    .outputs(item('wct:wct'))
    .duration(400) 
    .EUt(7680)
    .buildAndRegister()

crafting.addShaped('securitystation', item('appliedenergistics2:security_station'), [
        [ore('plateTitanium'), ore('itemIlluminatedPanel'), ore('plateTitanium')],
        [glasscable, ore('circuitEv'), glasscable],
        [ore('plateTitanium'), ore('EntropyCore'), ore('plateTitanium')]])

//Using presses
FORMING_PRESS_RECIPES.recipeBuilder()
    .inputs(ore('plateSilicon'))
    .notConsumable(item('appliedenergistics2:material:19'))
    .outputs(item('appliedenergistics2:material:20'))
    .duration(100) 
    .EUt(96)
    .buildAndRegister()

FORMING_PRESS_RECIPES.recipeBuilder()
    .inputs(ore('plateGold'))
    .notConsumable(item('appliedenergistics2:material:15'))
    .outputs(item('appliedenergistics2:material:18'))
    .duration(100) 
    .EUt(96)
    .buildAndRegister()

FORMING_PRESS_RECIPES.recipeBuilder()
    .inputs(ore('plateDiamond'))
    .notConsumable(item('appliedenergistics2:material:14'))
    .outputs(item('appliedenergistics2:material:17'))
    .duration(100) 
    .EUt(96)
    .buildAndRegister()

FORMING_PRESS_RECIPES.recipeBuilder()
    .inputs(ore('plateCertusQuartz'))
    .notConsumable(item('appliedenergistics2:material:13'))
    .outputs(item('appliedenergistics2:material:16'))
    .duration(100) 
    .EUt(96)
    .buildAndRegister()

//Making AE2 Processors
CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:18'), metaitem('wireGtSingleRedAlloy')*4, metaitem('boltCrystalFluix')*4, ore('circuitUlv')*2, metaitem('plate.random_access_memory')*8)
    .outputs(item('appliedenergistics2:material:22'))
    .duration(400) 
    .EUt(120)
    .buildAndRegister()

CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:17'), metaitem('wireGtSingleRedAlloy')*4, metaitem('boltCrystalFluix')*4, ore('circuitUlv')*2, metaitem('plate.random_access_memory')*8)
    .outputs(item('appliedenergistics2:material:24'))
    .duration(400) 
    .EUt(120)
    .buildAndRegister()

CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:16'), metaitem('wireGtSingleRedAlloy')*4, metaitem('boltCrystalFluix')*4, ore('circuitUlv')*2, metaitem('plate.random_access_memory')*8)
    .outputs(item('appliedenergistics2:material:23'))
    .duration(400) 
    .EUt(120)
    .buildAndRegister()

//Cheaper AE2 Processors
CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:18'), metaitem('wireFineRedAlloy')*4, metaitem('boltCrystalFluix')*2, metaitem('plate.simple_fluix_systematic_chip'))
    .fluidInputs(fluid('tin')*72)
    .outputs(item('appliedenergistics2:material:22'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()

CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:17'), metaitem('wireFineRedAlloy')*4, metaitem('boltCrystalFluix')*2, metaitem('plate.simple_fluix_systematic_chip'))
    .fluidInputs(fluid('tin')*72)
    .outputs(item('appliedenergistics2:material:24'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()

CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:16'), metaitem('wireFineRedAlloy')*4, metaitem('boltCrystalFluix')*2, metaitem('plate.simple_fluix_systematic_chip'))
    .fluidInputs(fluid('tin')*72)
    .outputs(item('appliedenergistics2:material:23'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()

CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:18'), metaitem('wireFineRedAlloy')*4, metaitem('boltCrystalFluix')*2, metaitem('plate.simple_fluix_systematic_chip'))
    .fluidInputs(fluid('soldering_alloy')*36)
    .outputs(item('appliedenergistics2:material:22'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()
CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:17'), metaitem('wireFineRedAlloy')*4, metaitem('boltCrystalFluix')*2, metaitem('plate.simple_fluix_systematic_chip'))
    .fluidInputs(fluid('soldering_alloy')*36)
    .outputs(item('appliedenergistics2:material:24'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()
CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()  
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:16'), metaitem('wireFineRedAlloy')*4, metaitem('boltCrystalFluix')*2, metaitem('plate.simple_fluix_systematic_chip'))
    .fluidInputs(fluid('soldering_alloy')*36)
    .outputs(item('appliedenergistics2:material:23'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()

//Crafting Units and Cables
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('cover.screen'), glasscable, ore('circuitLv'), item('appliedenergistics2:crafting_unit'), metaitem('screwCrystalFluix')*4)
    .outputs(item('appliedenergistics2:crafting_monitor'))
    .duration(50) 
    .EUt(16)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(ore('circuitHv')*2, glasscable, ore('EntropyCore')*2, item('appliedenergistics2:crafting_unit'), metaitem('screwCrystalFluix')*6)
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:crafting_accelerator')*2)
    .duration(100) 
    .EUt(480)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(ore('circuitHv')*2, glasscable, ore('EntropyCore')*2, item('appliedenergistics2:crafting_unit'), metaitem('screwCrystalFluix')*6)
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:crafting_accelerator')*2)
    .duration(100) 
    .EUt(480)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(ore('circuitEv')*2, item('appliedenergistics2:crafting_accelerator')*2, item('appliedenergistics2:material:36'), metaitem('screwCrystalFluix')*12)
    .fluidInputs(fluid('nether_quartz')*144)
    .outputs(item('nae2:coprocessor_4x')*2)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(ore('circuitEv')*2, item('appliedenergistics2:crafting_accelerator')*2, item('appliedenergistics2:material:36'), metaitem('screwCrystalFluix')*12)
    .fluidInputs(fluid('certus_quartz')*144)
    .outputs(item('nae2:coprocessor_4x')*2)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(ore('circuitIv')*2, item('nae2:coprocessor_4x')*2, ore('EntropyCore')*4, item('appliedenergistics2:material:37'), metaitem('screwCrystalFluix')*18)
    .fluidInputs(fluid('crystal_fluix')*72)
    .outputs(item('nae2:coprocessor_16x')*2)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(ore('circuitIv')*2, item('nae2:coprocessor_4x')*2, ore('EntropyCore')*4, item('appliedenergistics2:material:37'), metaitem('screwCrystalFluix')*18)
    .fluidInputs(fluid('crystal_fluix')*72)
    .outputs(item('nae2:coprocessor_16x')*2)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(ore('circuitLuv'), item('nae2:coprocessor_16x')*2, ore('EntropyCore')*8, item('appliedenergistics2:material:38'), metaitem('screwCrystalFluix')*24)
    .fluidInputs(fluid('crystal_fluix')*144)
    .outputs(item('nae2:coprocessor_64x'))
    .duration(200) 
    .EUt(1920)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(ore('circuitLuv'), item('nae2:coprocessor_16x')*2, ore('EntropyCore')*8, item('appliedenergistics2:material:38'), metaitem('screwCrystalFluix')*24)
    .fluidInputs(fluid('crystal_fluix')*144)
    .outputs(item('nae2:coprocessor_64x'))
    .duration(200) 
    .EUt(1920)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:interface'), ore('circuitMv'), item('appliedenergistics2:part:36')*2, metaitem('platePlastic')*6, metaitem('screwCrystalFluix')*12)
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:crafting_unit')*2)
    .duration(200) 
    .EUt(120)
    .buildAndRegister()
ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:interface'), ore('circuitMv'), item('appliedenergistics2:part:36')*2, metaitem('platePlastic')*6, metaitem('screwCrystalFluix')*12)
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:crafting_unit')*2)
    .duration(200) 
    .EUt(120)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:35'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('appliedenergistics2:crafting_storage_1k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:36'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('appliedenergistics2:crafting_storage_4k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:37'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('appliedenergistics2:crafting_storage_16k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:38'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('appliedenergistics2:crafting_storage_64k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('nae2:material:1'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('nae2:storage_crafting_256k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('nae2:material:2'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('nae2:storage_crafting_1024k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('nae2:material:3'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('nae2:storage_crafting_4096k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('nae2:material:4'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('nae2:storage_crafting_16384k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()

//Storage cells
CANNER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:35'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:storage_cell_1k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:36'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:storage_cell_4k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:37'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:storage_cell_16k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:38'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:storage_cell_64k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:54'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:fluid_storage_cell_1k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:55'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:fluid_storage_cell_4k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:56'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:fluid_storage_cell_16k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material:57'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:fluid_storage_cell_64k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('nae2:material:1'), item('appliedenergistics2:material:39'))
    .outputs(item('nae2:storage_cell_256k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('nae2:material:5'), item('appliedenergistics2:material:39'))
    .outputs(item('nae2:storage_cell_fluid_256k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('nae2:material:2'), item('appliedenergistics2:material:39'))
    .outputs(item('nae2:storage_cell_1024k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('nae2:material:6'), item('appliedenergistics2:material:39'))
    .outputs(item('nae2:storage_cell_fluid_1024k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('nae2:material:3'), item('appliedenergistics2:material:39'))
    .outputs(item('nae2:storage_cell_4096k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('nae2:material:7'), item('appliedenergistics2:material:39'))
    .outputs(item('nae2:storage_cell_fluid_4096k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('nae2:material:4'), item('appliedenergistics2:material:39'))
    .outputs(item('nae2:storage_cell_16384k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
CANNER_RECIPES.recipeBuilder()
    .inputs(item('nae2:material:8'), item('appliedenergistics2:material:39'))
    .outputs(item('nae2:storage_cell_fluid_16384k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()

//Cables
AUTOCLAVE_RECIPES.recipeBuilder()
    .inputs(metaitem('dustSmallGlass'))
    .fluidInputs(fluid('crystal_fluix') * 36)
    .notConsumable(metaitem('shape.extruder.pipe.normal'))
    .outputs(glasscable)
    .duration(100)
    .EUt(16)
    .buildAndRegister()
AUTOCLAVE_RECIPES.recipeBuilder()
    .inputs(metaitem('dustSmallGlass'))
    .fluidInputs(fluid('nether_quartz') * 36)
    .notConsumable(metaitem('shape.extruder.pipe.normal'))
    .outputs(item('appliedenergistics2:part:140'))
    .duration(50)
    .EUt(16)
    .buildAndRegister()
AUTOCLAVE_RECIPES.recipeBuilder()
    .inputs(metaitem('dustSmallGlass'))
    .fluidInputs(fluid('certus_quartz') * 36)
    .notConsumable(metaitem('shape.extruder.pipe.normal'))
    .outputs(item('appliedenergistics2:part:140'))
    .duration(50)
    .EUt(16)
    .buildAndRegister()

//Misc
FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
    .inputs(metaitem('boltSteel'))
    .fluidInputs(fluid('crystal_fluix')*18)
    .outputs(metaitem('boltCrystalFluix'))
    .duration(15)
    .EUt(30)
    .buildAndRegister()

MIXER_RECIPES.recipeBuilder()
    .inputs(ore('dustSilicon'), ore('dustRedstone'), ore('gemNetherQuartz'), ore('gemCertusQuartz'))
    .fluidInputs(fluid('water')*1000)
    .outputs(metaitem('dustCrystalFluix')*4)
    .duration(400)
    .EUt(7)
    .buildAndRegister()

MIXER_RECIPES.recipeBuilder()
    .inputs(ore('dustSilicon'), ore('dustRedstone'), ore('gemNetherQuartz'), ore('gemCertusQuartz'))
    .fluidInputs(fluid('distilled_water')*250)
    .outputs(metaitem('dustCrystalFluix')*4)
    .duration(200)
    .EUt(7)
    .buildAndRegister()

//Fluix wafers
BLAST_RECIPES.recipeBuilder() //boule
    .inputs(ore('dustCrystalFluix')*16, ore('dustGalliumArsenide'))
    .fluidInputs(fluid('nitrogen') * 2000)
    .outputs(fboule)
    .duration(6000)
    .EUt(60)
    .buildAndRegister()

CUTTER_RECIPES.recipeBuilder() //wafer
    .inputs(fboule)
    .outputs(metaitem('wafer.fluix')*16)
    .duration(200)
    .EUt(32)
    .buildAndRegister()

LASER_ENGRAVER_RECIPES.recipeBuilder() //simple fsc wafer
    .inputs(fwafer)
    .notConsumable(ore('lensAmethyst'))
    .outputs(metaitem('wafer.simple_fluix_systematic_chip'))
    .duration(900) 
    .EUt(120)
    .buildAndRegister()
LASER_ENGRAVER_RECIPES.recipeBuilder() //basic fsc wafer
    .inputs(fwafer)
    .notConsumable(ore('craftingLensPurple'))
    .outputs(metaitem('wafer.basic_fluix_systematic_chip'))
    .duration(900) 
    .EUt(480)
    .buildAndRegister()
LASER_ENGRAVER_RECIPES.recipeBuilder() //complex fsc wafer
    .inputs(fwafer)
    .notConsumable(ore('lensCrystalFluix'))
    .outputs(metaitem('wafer.complex_fluix_systematic_chip'))
    .duration(900) 
    .EUt(1920)
    .buildAndRegister()

CUTTER_RECIPES.recipeBuilder() //simple fsc
    .inputs(metaitem('wafer.simple_fluix_systematic_chip'))
    .outputs(metaitem('plate.simple_fluix_systematic_chip')*16)
    .duration(900)
    .EUt(64)
    .buildAndRegister()

CUTTER_RECIPES.recipeBuilder() //basic fsc
    .inputs(metaitem('wafer.basic_fluix_systematic_chip'))
    .outputs(metaitem('plate.basic_fluix_systematic_chip')*8)
    .duration(900)
    .EUt(256)
    .buildAndRegister()

CUTTER_RECIPES.recipeBuilder() //complex fsc
    .inputs(metaitem('wafer.complex_fluix_systematic_chip'))
    .outputs(metaitem('plate.complex_fluix_systematic_chip')*4)
    .duration(900)
    .EUt(1024)
    .buildAndRegister()

ASSEMBLER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('soldering_alloy')*144)
    .inputs(metaitem('hull.mv'))
    .inputs(item('appliedenergistics2:smooth_sky_stone_block')*4)
    .inputs(ore('circuitHv')*4)
    .inputs(item('appliedenergistics2:material', 24))
    .outputs(item('appliedenergistics2:controller'))
    .EUt(200)
    .duration(400)
    .buildAndRegister();

METEORITE_PREDICTION_CALCULATION.recipeBuilder()
    .fluidInputs(fluid('drilling_fluid')*16000)
    .inputs(metaitem('satellite'))
    .outputs(metaitem('meteorite'))
    .chancedOutput(metaitem('satellite'), 9000, 200)
    .duration(400)
    .EUt(80)
    .buildAndRegister();

METEORITE_MINING.recipeBuilder()
    .inputs(metaitem('meteorite'))
    .outputs(item('appliedenergistics2:sky_stone_block')*60)
    .chancedOutput(item('appliedenergistics2:material', 13), 300, 20)
    .chancedOutput(item('appliedenergistics2:material', 15), 300, 20)
    .chancedOutput(item('appliedenergistics2:material', 14), 300, 20)
    .chancedOutput(item('appliedenergistics2:material', 19), 300, 20)
    .chancedOutput(item('appliedenergistics2:material', 21), 300, 20)
    .fluidOutputs(fluid('lava')*4000)
    .duration(400)
    .EUt(80)
    .buildAndRegister();

MACERATOR_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:sky_stone_block'))
    .outputs(item('appliedenergistics2:material', 45))
    .duration(30)
    .EUt(12)
    .buildAndRegister();

COMPRESSOR_RECIPES.recipeBuilder()
    .outputs(item('appliedenergistics2:sky_stone_block'))
    .inputs(item('appliedenergistics2:material', 45))
    .duration(30)
    .EUt(12)
    .buildAndRegister();

crafting.remove('appliedenergistics2:misc/deconstruction_fluix_block')
crafting.remove('appliedenergistics2:misc/deconstruction_certus_quartz_block')
crafting.remove('appliedenergistics2:misc/deconstruction_certus_quartz_pillar')
crafting.remove('appliedenergistics2:misc/deconstruction_certus_chiseled_quartz')

crafting.addShapeless('deconstruction_fluix_block',item('gregtech:meta_gem', 14013)*4, [item('appliedenergistics2:fluix_block')])
crafting.addShapeless('deconstruction_certus_quartz_block',item('gregtech:meta_gem', 14214)*4, [item('appliedenergistics2:quartz_block')])
crafting.addShapeless('deconstruction_certus_quartz_pillar',item('gregtech:meta_gem', 14214)*4, [item('appliedenergistics2:quartz_pillar')])
crafting.addShapeless('deconstruction_certus_chiseled_quartz',item('gregtech:meta_gem', 14214)*4, [item('appliedenergistics2:chiseled_quartz_block')])


crafting.remove('appliedenergistics2:misc/fluixpearl')

MIXER_RECIPES.recipeBuilder()
    .inputs(metaitem('dustCrystalFluix')*4)
    .inputs(item('wrcbe:material', 2))
    .inputs(item('appliedenergistics2:material', 12)*4)
    .inputs(item('appliedenergistics2:material', 45)*2)
    .fluidInputs(fluid('distilled_water')*2000)
    .outputs(item('appliedenergistics2:material', 9))
    .duration(200)
    .EUt(42)
    .buildAndRegister();

crafting.remove('appliedenergistics2:network/blocks/inscribers');
crafting.remove('ae2stuff:recipe2');

// Enderpearl Dust * 10
mods.gregtech.mixer.removeByInput(480, [metaitem('dustBeryllium'), metaitem('dustPotassium') * 4, metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('nitrogen') * 5000 * 5000])

crafting.remove('nae2:item/material/storage/cell_part_fluid_256k');
crafting.remove('nae2:item/material/storage/cell_part_fluid_1024k');
crafting.remove('nae2:item/material/storage/cell_part_fluid_4096k');
crafting.remove('nae2:item/material/storage/cell_part_fluid_16384k');


crafting.remove('nae2:item/cell/storage_cell_fluid_256k');
crafting.remove('nae2:item/cell/storage_cell_fluid_1024k');
crafting.remove('nae2:item/cell/storage_cell_fluid_4096k');
crafting.remove('nae2:item/cell/storage_cell_fluid_16384k');


crafting.remove('nae2:item/material/storage/cell_part_256k');
crafting.remove('nae2:item/material/storage/cell_part_1024k');
crafting.remove('nae2:item/material/storage/cell_part_4096k');
crafting.remove('nae2:item/material/storage/cell_part_16384k');


crafting.remove('nae2:item/cell/storage_cell_256k');
crafting.remove('nae2:item/cell/storage_cell_1024k');
crafting.remove('nae2:item/cell/storage_cell_4096k');
crafting.remove('nae2:item/cell/storage_cell_16384k');


crafting.remove('ae2fc:fluid_level_maintainer');
crafting.remove('nae2:block/crafting/4x_coprocessor');
crafting.remove('nae2:block/crafting/16x_coprocessor');
crafting.remove('nae2:block/crafting/64x_coprocessor');


crafting.remove('appliedenergistics2:misc/seeds_fluix');

MIXER_RECIPES.recipeBuilder()
    .inputs(metaitem('dustCrystalFluix'))
    .inputs(item('minecraft:sand'))
    .outputs(item('appliedenergistics2:crystal_seed', 1200))
    .duration(300)
    .EUt(80)
    .buildAndRegister();
    
crafting.remove('appliedenergistics2:misc/grindstone_woodengear');

mods.appliedenergistics2.inscriber.removeAll()


FORMING_PRESS_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material', 47)*2)
    .inputs(item('appliedenergistics2:material', 28))
    .outputs(item('appliedenergistics2:material', 59))
    .duration(800)
    .EUt(1000)
    .buildAndRegister();


FORMING_PRESS_RECIPES.recipeBuilder()
    .inputs(item('appliedenergistics2:material', 25))
    .inputs(ore('blockRedstone'))
    .inputs(ore('blockLapis'))
    .outputs(item('appliedenergistics2:material', 60))
    .duration(800)
    .EUt(1000)
    .buildAndRegister();

















































//OREDICTS

oreDict.remove("gearWood", item('appliedenergistics2:material', 40))
oreDict.remove("dustCertusQuartz", item('appliedenergistics2:material', 2))
oreDict.remove("dustWheat", item('appliedenergistics2:material', 4))
oreDict.remove("dustQuartz", item('appliedenergistics2:material', 3))
oreDict.remove("dustNetherQuartz", item('appliedenergistics2:material', 3))
oreDict.remove("dustFluix", item('appliedenergistics2:material', 8))
oreDict.remove("itemSilicon", item('appliedenergistics2:material', 5))
oreDict.remove("dustEnder", item('appliedenergistics2:material', 46))
oreDict.remove("dustEnderPearl", item('appliedenergistics2:material', 46))
oreDict.remove("dustIron", item('appliedenergistics2:material', 51))
oreDict.remove("dustGold", item('appliedenergistics2:material', 49))














//GRINDER COMPAT

mods.appliedenergistics2.grinder.removeByInput(item('appliedenergistics2:material', 7))
mods.appliedenergistics2.grinder.removeByInput(item('minecraft:iron_ingot'))
mods.appliedenergistics2.grinder.removeByInput(item('minecraft:gold_ore'))
mods.appliedenergistics2.grinder.removeByInput(item('minecraft:ender_pearl'))
mods.appliedenergistics2.grinder.removeByInput(item('gregtech:ore_gold_0'))
mods.appliedenergistics2.grinder.removeByInput(item('minecraft:quartz'))
mods.appliedenergistics2.grinder.removeByInput(item('gregtech:meta_gem', 214))
mods.appliedenergistics2.grinder.removeByInput(item('minecraft:iron_ore'))
mods.appliedenergistics2.grinder.removeByInput(item('minecraft:quartz_ore'))
mods.appliedenergistics2.grinder.removeByInput(item('gregtech:ore_certus_quartz_0'))
mods.appliedenergistics2.grinder.removeByInput(item('gregtech:ore_iron_0'))
mods.appliedenergistics2.grinder.removeByInput(item('minecraft:wheat'))
mods.appliedenergistics2.grinder.removeByInput(item('minecraft:gold_ingot'))
mods.appliedenergistics2.grinder.removeByInput(item('appliedenergistics2:material'))
mods.appliedenergistics2.grinder.removeByInput(item('gregtech:ore_nether_quartz_0'))

mods.appliedenergistics2.grinder.recipeBuilder()
    .input(item('gregtech:ore_nether_quartz_0'))
    .output(metaitem('dustNetherQuartz'))
    .turns(3)
    .register()

mods.appliedenergistics2.grinder.recipeBuilder()
    .input(item('minecraft:quartz'))
    .output(metaitem('dustNetherQuartz'))
    .turns(2)
    .register()

mods.appliedenergistics2.grinder.recipeBuilder()
    .input(item('minecraft:quartz_ore'))
    .output(metaitem('dustNetherQuartz'))
    .turns(3)
    .register()

mods.appliedenergistics2.grinder.recipeBuilder()
    .input(item('minecraft:gold_ingot'))
    .output(metaitem('dustGold'))
    .turns(3)
    .register()

mods.appliedenergistics2.grinder.recipeBuilder()
    .input(item('minecraft:gold_ore'))
    .output(metaitem('dustGold'))
    .turns(3)
    .register()

mods.appliedenergistics2.grinder.recipeBuilder()
    .input(item('gregtech:ore_gold_0'))
    .output(metaitem('dustGold'))
    .turns(3)
    .register()

mods.appliedenergistics2.grinder.recipeBuilder()
    .input(item('minecraft:wheat'))
    .output(metaitem('dustWheat'))
    .turns(3)
    .register()

mods.appliedenergistics2.grinder.recipeBuilder()
    .input(item('gregtech:ore_iron_0'))
    .output(metaitem('dustIron'))
    .turns(3)
    .register()

mods.appliedenergistics2.grinder.recipeBuilder()
    .input(item('minecraft:iron_ingot'))
    .output(metaitem('dustIron'))
    .turns(2)
    .register()

mods.appliedenergistics2.grinder.recipeBuilder()
    .input(item('minecraft:iron_ore'))
    .output(metaitem('dustIron'))
    .turns(3)
    .register()

mods.appliedenergistics2.grinder.recipeBuilder()
    .input(metaitem('gemCertusQuartz'))
    .output(metaitem('dustCertusQuartz'))
    .turns(2)
    .register()

mods.appliedenergistics2.grinder.recipeBuilder()
    .input(item('gregtech:ore_certus_quartz_0'))
    .output(metaitem('dustCertusQuartz'))
    .turns(3)
    .register()

crafting.remove('appliedenergistics2:network/blocks/storage_device')
crafting.remove('appliedenergistics2:misc/grindstone')

crafting.addShaped("ae2_grindstone", item('appliedenergistics2:grindstone'), [
[ore('boltSteel'), ore('gearSteel'), ore('boltSteel')], 
[ore('gemQuartz'), item('gregtech:machine', 985), ore('gemQuartz')], 
[ore('stoneCobble'), ore('gemQuartz'), ore('stoneCobble')]
])

FORMING_PRESS_RECIPES.recipeBuilder()
    .inputs(metaitem('plateDiamond'))
    .notConsumable(item('appliedenergistics2:material', 14))
    .outputs(item('appliedenergistics2:material', 17))
    .EUt(20)
    .duration(200)
    .buildAndRegister();