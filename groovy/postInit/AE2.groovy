import gregtech.api.metatileentity.multiblock.CleanroomType

def glasscable = item('appliedenergistics2:part:16')
def fboule = metaitem('boule.fluix')
def fwafer = metaitem('wafer.fluix')

mods.hei.hide(item('appliedenergistics2:facade', 0))
mods.hei.hide(item('appliedenergistics2:encoded_pattern'))
mods.hei.yeet(item('appliedenergistics2:material', 0))
mods.hei.yeet(item('appliedenergistics2:material', 1))
mods.hei.yeet(item('appliedenergistics2:material', 2))
mods.hei.yeet(item('appliedenergistics2:material', 3))
mods.hei.yeet(item('appliedenergistics2:material', 4))
mods.hei.yeet(item('appliedenergistics2:material', 5))
mods.hei.yeet(item('appliedenergistics2:material', 6))
mods.hei.yeet(item('appliedenergistics2:material', 7))
mods.hei.yeet(item('appliedenergistics2:material', 8))
mods.hei.yeet(item('appliedenergistics2:material', 10))
mods.hei.yeet(item('appliedenergistics2:material', 11))
mods.hei.yeet(item('appliedenergistics2:material', 12))
mods.hei.yeet(item('appliedenergistics2:material', 40))
mods.hei.yeet(item('appliedenergistics2:material', 45))
mods.hei.yeet(item('appliedenergistics2:material', 46))
mods.hei.yeet(item('appliedenergistics2:material', 49))
mods.hei.yeet(item('appliedenergistics2:material', 51))
mods.hei.yeet(item('appliedenergistics2:inscriber'))
mods.hei.yeet(item('appliedenergistics2:spatial_pylon'))
mods.hei.yeet(item('appliedenergistics2:spatial_io_port'))
mods.hei.yeet(item('appliedenergistics2:spatial_storage_cell_2_cubed'))
mods.hei.yeet(item('appliedenergistics2:spatial_storage_cell_16_cubed'))
mods.hei.yeet(item('appliedenergistics2:spatial_storage_cell_128_cubed'))
mods.hei.yeet(item('appliedenergistics2:material:32'))
mods.hei.yeet(item('appliedenergistics2:material:33'))
mods.hei.yeet(item('appliedenergistics2:material:34'))
mods.hei.yeet(item('nae2:material:0'))
mods.hei.yeet(item('nae2:storage_cell_void'))
mods.hei.yeet(item('nae2:fluid_storage_cell_void'))
mods.hei.yeet(item('nae2:part:2'))
mods.hei.yeet(item('nae2:exposer'))
mods.hei.yeet(item('nae2:pattern_multiplier'))
mods.hei.yeet(item('ae2stuff:inscriber'))
mods.hei.yeet(item('ae2fc:fluid_assembler'))
mods.hei.yeet(item('ae2fc:fluid_pattern_encoder'))
mods.hei.hideCategory('appliedenergistics2.grinder')
mods.hei.hideCategory('appliedenergistics2.inscriber')

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

//Removing AE2 related GT items
crafting.remove('gregtech:bolt_saw_CrystalFluix')
crafting.remove('gregtech:screw_CrystalFluix')
mods.gregtech.cutter.removeByInput(4, [metaitem('stickCrystalFluix')], [fluid('lubricant')])
mods.gregtech.cutter.removeByInput(4, [metaitem('stickCrystalFluix')], [fluid('distilled_water') * 3])
mods.gregtech.cutter.removeByInput(4, [metaitem('stickCrystalFluix')], [fluid('water') * 4])

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
        [metaitem('plate'), metaitem('conveyor.module.hv'), metaitem('plateStainlessSteel')],
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
mods.gregtech.assembler.recipeBuilder() //1k Item
    .inputs(metaitem('crate.wood'), metaitem('dustNetherQuartz'), metaitem('wireFineRedAlloy')*4, ore('circuitMv'), metaitem('screwCrystalFluix')*2, metaitem('plateSteel'))
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:material:35'))
    .duration(20) 
    .EUt(16)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //1k Item
    .inputs(metaitem('crate.wood'), metaitem('dustCertusQuartz'), metaitem('wireFineRedAlloy')*4, ore('circuitMv'), metaitem('screwCrystalFluix')*2, metaitem('plateSteel'))
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:material:35'))
    .duration(20) 
    .EUt(16)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //4k Item
    .inputs(ore('gemNetherQuartz'), ore('FormationCore'), ore('AnnhilationCore'), metaitem('wireFineRedAlloy')*4, metaitem('plate.basic_fluix_systematic_chip'), metaitem('screwCrystalFluix')*2, metaitem('plateAluminium'))
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:material:36'))
    .duration(20) 
    .EUt(128)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //4k Item
    .inputs( metaitem('gemCertusQuartz'), ore('FormationCore'), ore('AnnhilationCore'), metaitem('wireFineRedAlloy')*4, metaitem('plate.basic_fluix_systematic_chip'), metaitem('screwCrystalFluix')*2, metaitem('plateAluminium'))
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:material:36'))
    .duration(20) 
    .EUt(128)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //16k Item
    .inputs(metaitem('gemFlawlessNetherQuartz'), ore('FormationCore')*2, ore('AnnhilationCore')*2, metaitem('wireFineRedAlloy')*8, metaitem('plate.basic_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*3, metaitem('plateStainlessSteel'))
    .fluidInputs(fluid('certus_quartz')*144)
    .outputs(item('appliedenergistics2:material:37'))
    .duration(20) 
    .EUt(256)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //16k Item
    .inputs(metaitem('gemFlawlessCertusQuartz'), ore('FormationCore')*2, ore('AnnhilationCore')*2, metaitem('wireFineRedAlloy')*8, metaitem('plate.basic_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*3, metaitem('plateStainlessSteel'))
    .fluidInputs(fluid('nether_quartz')*144)
    .outputs(item('appliedenergistics2:material:37'))
    .duration(20) 
    .EUt(256)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //64k Item
    .inputs(metaitem('gemExquisiteNetherQuartz'), ore('EntropyCore'), metaitem('wireFineRedAlloy')*16, metaitem('plate.complex_fluix_systematic_chip'), metaitem('screwCrystalFluix')*4, metaitem('plateTitanium'))
    .fluidInputs(fluid('certus_quartz')*288)
    .outputs(item('appliedenergistics2:material:38'))
    .duration(20) 
    .EUt(1024)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //64k Item
    .inputs(metaitem('gemExquisiteCertusQuartz'), ore('EntropyCore'), metaitem('wireFineRedAlloy')*16, metaitem('plate.complex_fluix_systematic_chip'), metaitem('screwCrystalFluix')*4, metaitem('plateTitanium'))
    .fluidInputs(fluid('nether_quartz')*288)
    .outputs(item('appliedenergistics2:material:38'))
    .duration(20) 
    .EUt(1024)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //256k Item
    .inputs(metaitem('gemCrystalFluix'), ore('EntropyCore')*2, metaitem('wireFineRedAlloy')*32, metaitem('plate.complex_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*6, metaitem('plateTungstenSteel'))
    .fluidInputs(fluid('certus_quartz')*576)
    .outputs(item('nae2:material:1'))
    .duration(20) 
    .EUt(2048)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //256k Item
    .inputs(metaitem('gemCrystalFluix'), ore('EntropyCore')*2, metaitem('wireFineRedAlloy')*32, metaitem('plate.complex_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*6, metaitem('plateTungstenSteel'))
    .fluidInputs(fluid('nether_quartz')*576)
    .outputs(item('nae2:material:1'))
    .duration(20) 
    .EUt(2048)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //1024k Item
    .inputs(metaitem('gemFlawlessCrystalFluix'), ore('EntropyCore')*4, metaitem('wireFineRedAlloy')*64, metaitem('plate.complex_fluix_systematic_chip')*4, metaitem('screwCrystalFluix')*8, metaitem('plateRhodiumPlatedPalladium'))
    .fluidInputs(fluid('crystal_fluix')*144)
    .outputs(item('nae2:material:2'))
    .duration(20) 
    .EUt(4096)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //4096k Item
    .inputs(metaitem('gemExquisiteCrystalFluix'), ore('EntropyCore')*8, metaitem('wireRedAlloy')*16, metaitem('plate.complex_fluix_systematic_chip')*8, metaitem('screwCrystalFluix')*16, metaitem('plateDoubleRhodiumPlatedPalladium'))
    .fluidInputs(fluid('crystal_fluix')*288)
    .outputs(item('nae2:material:3'))
    .duration(40) 
    .EUt(8192)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //16384k Item
    .inputs(metaitem('gemExquisiteCrystalFluix')*2, ore('EntropyCore')*16, metaitem('wireRedAlloy')*32, metaitem('plate.complex_fluix_systematic_chip')*16, metaitem('screwCrystalFluix')*32, metaitem('plateNaquadahAlloy'))
    .fluidInputs(fluid('crystal_fluix')*576)
    .outputs(item('nae2:material:4'))
    .duration(80) 
    .EUt(16384)
    .buildAndRegister()


mods.gregtech.assembler.recipeBuilder() //1k Fluid
    .inputs(metaitem('drum.wood'), metaitem('dustNetherQuartz'), metaitem('wireFineBlueAlloy')*4, ore('circuitMv'), metaitem('screwCrystalFluix')*2, metaitem('plateBrass'))
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:material:54'))
    .duration(30) 
    .EUt(16)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //1k Fluid
    .inputs(metaitem('drum.wood'), metaitem('dustCertusQuartz'), metaitem('wireFineBlueAlloy')*4, ore('circuitMv'), metaitem('screwCrystalFluix')*2, metaitem('plateBrass'))
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:material:54'))
    .duration(30) 
    .EUt(16)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //4k Fluid
    .inputs(ore('gemNetherQuartz'), ore('FormationCore'), ore('AnnhilationCore'), metaitem('wireFineBlueAlloy')*4, metaitem('plate.basic_fluix_systematic_chip'), metaitem('screwCrystalFluix')*2, metaitem('plateElectrum'))
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:material:55'))
    .duration(30) 
    .EUt(240)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //4k Fluid
    .inputs(metaitem('gemCertusQuartz'), ore('FormationCore'), ore('AnnhilationCore'), metaitem('wireFineBlueAlloy')*4, metaitem('plate.basic_fluix_systematic_chip'), metaitem('screwCrystalFluix')*2, metaitem('plateElectrum'))
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:material:55'))
    .duration(30) 
    .EUt(240)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //16k Fluid
    .inputs(ore('gemFlawlessNetherQuartz'), ore('FormationCore')*2, ore('AnnhilationCore')*2, metaitem('wireFineBlueAlloy')*8, metaitem('plate.complex_fluix_systematic_chip'), metaitem('screwCrystalFluix')*3, metaitem('plateChrome'))
    .fluidInputs(fluid('certus_quartz')*144)
    .outputs(item('appliedenergistics2:material:56'))
    .duration(30) 
    .EUt(1024)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //16k Fluid
    .inputs(metaitem('gemFlawlessCertusQuartz'), ore('FormationCore')*2, ore('AnnhilationCore')*2, metaitem('wireFineBlueAlloy')*8, metaitem('plate.complex_fluix_systematic_chip'), metaitem('screwCrystalFluix')*3, metaitem('plateChrome'))
    .fluidInputs(fluid('nether_quartz')*144)
    .outputs(item('appliedenergistics2:material:56'))
    .duration(30) 
    .EUt(1024)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //64k Fluid
    .inputs(ore('gemExquisiteNetherQuartz'), ore('EntropyCore'), metaitem('wireFineBlueAlloy')*16, metaitem('plate.complex_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*4, metaitem('platePlatinum'))
    .fluidInputs(fluid('certus_quartz')*288)
    .outputs(item('appliedenergistics2:material:57'))
    .duration(30) 
    .EUt(4096)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //64k Fluid
    .inputs(metaitem('gemExquisiteCertusQuartz'), ore('EntropyCore'), metaitem('wireFineBlueAlloy')*16, metaitem('plate.complex_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*4, metaitem('platePlatinum'))
    .fluidInputs(fluid('nether_quartz')*288)
    .outputs(item('appliedenergistics2:material:57'))
    .duration(30) 
    .EUt(4096)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //256k Item
    .inputs(metaitem('gemCrystalFluix'), ore('EntropyCore')*2, metaitem('wireFineBlueAlloy')*32, metaitem('plate.complex_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*6, metaitem('plateTungstenSteel'))
    .fluidInputs(fluid('certus_quartz')*576)
    .outputs(item('nae2:material:5'))
    .duration(20) 
    .EUt(2048)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //256k Item
    .inputs(metaitem('gemCrystalFluix'), ore('EntropyCore')*2, metaitem('wireFineBlueAlloy')*32, metaitem('plate.complex_fluix_systematic_chip')*2, metaitem('screwCrystalFluix')*6, metaitem('plateTungstenSteel'))
    .fluidInputs(fluid('nether_quartz')*576)
    .outputs(item('nae2:material:5'))
    .duration(20) 
    .EUt(2048)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //1024k Fluid
    .inputs(metaitem('gemFlawlessCrystalFluix'), ore('EntropyCore')*4, metaitem('wireFineBlueAlloy')*64, metaitem('plate.complex_fluix_systematic_chip')*4, metaitem('screwCrystalFluix')*8, metaitem('plateRhodiumPlatedPalladium'))
    .fluidInputs(fluid('crystal_fluix')*144)
    .outputs(item('nae2:material:6'))
    .duration(20) 
    .EUt(4096)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //4096k Fluid
    .inputs(metaitem('gemExquisiteCrystalFluix'), ore('EntropyCore')*8, metaitem('wireBlueAlloy')*16, metaitem('plate.complex_fluix_systematic_chip')*8, metaitem('screwCrystalFluix')*16, metaitem('plateDoubleRhodiumPlatedPalladium'))
    .fluidInputs(fluid('crystal_fluix')*288)
    .outputs(item('nae2:material:7'))
    .duration(40) 
    .EUt(8192)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder() //16384k Fluid
    .inputs(metaitem('gemExquisiteCrystalFluix')*2, ore('EntropyCore')*16, metaitem('wireBlueAlloy')*32, metaitem('plate.complex_fluix_systematic_chip')*16, metaitem('screwCrystalFluix')*32, metaitem('plateNaquadahAlloy'))
    .fluidInputs(fluid('crystal_fluix')*576)
    .outputs(item('nae2:material:8'))
    .duration(80) 
    .EUt(16384)
    .buildAndRegister()

//Cores
mods.gregtech.assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:22'), ore('dustCrystalFluix')*2, metaitem('gemFlawlessNetherQuartz'), ore('circuitLv'), metaitem('wireFineBlueAlloy')*8, metaitem('boltInvar')*4)
    .fluidInputs(fluid('certus_quartz')*144)
    .outputs(item('appliedenergistics2:material:44')*2)
    .duration(480) 
    .EUt(120)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:22'), ore('dustCrystalFluix')*2, metaitem('gemFlawlessCertusQuartz'), ore('circuitLv'), metaitem('wireFineRedAlloy')*8, metaitem('boltSteel')*4)
    .fluidInputs(fluid('nether_quartz')*144)
    .outputs(item('appliedenergistics2:material:43')*2)
    .duration(480) 
    .EUt(120)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:22'), metaitem('gemFlawlessNetherQuartz'), metaitem('plate.basic_fluix_systematic_chip'), metaitem('wireFineBlueAlloy')*4, metaitem('boltInvar')*2, metaitem('plateNetherQuartz'))
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:material:44')*4)
    .duration(480) 
    .EUt(1920)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:22'), metaitem('gemFlawlessCertusQuartz'), metaitem('plate.basic_fluix_systematic_chip'), metaitem('wireFineRedAlloy')*4, metaitem('boltSteel')*2, metaitem('plateCertusQuartz'))
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:material:43')*4)
    .duration(480) 
    .EUt(1920)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('FormationCore'), ore('AnnhilationCore'), metaitem('foilPolyvinylChloride')*8, metaitem('gemFlawlessCrystalFluix'), ore('circuitHv')*2, metaitem('wireFineElectrum')*16, metaitem('screwAnnealedCopper')*8)
    .fluidInputs(fluid('quartzite')*576)
    .outputs(metaitem('entropycore'))
    .duration(600) 
    .EUt(480)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('FormationCore')*2, ore('AnnhilationCore')*2, metaitem('plate.simple_fluix_systematic_chip')*4, metaitem('screwAnnealedCopper')*4)
    .fluidInputs(fluid('quartzite')*576)
    .outputs(metaitem('entropycore'))
    .duration(600) 
    .EUt(480)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('FormationCore'), ore('AnnhilationCore'), metaitem('plate.basic_fluix_systematic_chip')*4, metaitem('screwCrystalFluix')*4)
    .fluidInputs(fluid('quartzite')*288)
    .outputs(metaitem('entropycore')*2)
    .duration(300) 
    .EUt(480)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('FormationCore'), ore('AnnhilationCore'), metaitem('plate.complex_fluix_systematic_chip')*4, metaitem('screwBlueAlloy')*4)
    .fluidInputs(fluid('quartzite')*288)
    .outputs(metaitem('entropycore')*4)
    .duration(150) 
    .EUt(480)
    .buildAndRegister()

//Wireless related
mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('sensor.luv')*2, metaitem('emitter.luv')*2, item('appliedenergistics2:material:42'), item('EntropyCore')*4, metaitem('plateDenseRhodiumPlatedPalladium')*4, metaitem('screwHsss')*16)
    .fluidInputs(fluid('crystal_fluix')*1152)
    .outputs(item('wct:wct'))
    .duration(400) 
    .EUt(7680)
    .buildAndRegister()
crafting.addShaped('securitystation', item('appliedenergistics2:security_station'), [
        [ore('plateTitanium'), ore('itemIlluminatedPanel'), ore('plateTitanium')],
        [glasscable, ore('circuitEv'), glasscable],
        [ore('plateTitanium'), ore('EntropyCore'), ore('plateTitanium')]])
crafting.addShaped('blankpatternlv', item('appliedenergistics2:material:41'), [
        [null, metaitem('emitter.ev'), null],
        [ore('plateCrystalFluix'), item('appliedenergistics2:material:48'), ore('plateCrystalFluix')],
        [glasscable metaitem('plateDoubleTitanium'), glasscable]])


//Making Presses
mods.gregtech.laser_engraver.recipeBuilder()
    .inputs(ore('blockSteel'))
    .notConsumable(ore('craftingLensGreen'))
    .outputs(item('appliedenergistics2:material:19'))
    .duration(2400) 
    .EUt(128)
    .buildAndRegister()

mods.gregtech.laser_engraver.recipeBuilder()
    .inputs(ore('blockSteel'))
    .notConsumable(ore('craftingLensRed'))
    .outputs(item('appliedenergistics2:material:13'))
    .duration(2400) 
    .EUt(128)
    .buildAndRegister()

mods.gregtech.laser_engraver.recipeBuilder()
    .inputs(ore('blockSteel'))
    .notConsumable(ore('craftingLensLightBlue'))
    .outputs(item('appliedenergistics2:material:14'))
    .duration(2400) 
    .EUt(128)
    .buildAndRegister()

mods.gregtech.laser_engraver.recipeBuilder()
    .inputs(ore('blockSteel'))
    .notConsumable(ore('craftingLensYellow'))
    .outputs(item('appliedenergistics2:material:15'))
    .duration(2400) 
    .EUt(128)
    .buildAndRegister()

//Using presses
mods.gregtech.forming_press.recipeBuilder()
    .inputs(ore('plateSilicon'))
    .notConsumable(item('appliedenergistics2:material:19'))
    .outputs(item('appliedenergistics2:material:20'))
    .duration(100) 
    .EUt(96)
    .buildAndRegister()

mods.gregtech.forming_press.recipeBuilder()
    .inputs(ore('plateGold'))
    .notConsumable(item('appliedenergistics2:material:13'))
    .outputs(item('appliedenergistics2:material:18'))
    .duration(100) 
    .EUt(96)
    .buildAndRegister()

mods.gregtech.forming_press.recipeBuilder()
    .inputs(ore('plateDiamond'))
    .notConsumable(item('appliedenergistics2:material:14'))
    .outputs(item('appliedenergistics2:material:17'))
    .duration(100) 
    .EUt(96)
    .buildAndRegister()

mods.gregtech.forming_press.recipeBuilder()
    .inputs(ore('plateCertusQuartz'))
    .notConsumable(item('appliedenergistics2:material:15'))
    .outputs(item('appliedenergistics2:material:16'))
    .duration(100) 
    .EUt(96)
    .buildAndRegister()

//Making AE2 Processors
mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:18'), metaitem('wireGtSingleRedAlloy')*4, metaitem('boltCrystalFluix')*4, ore('circuitUlv')*2, metaitem('plate.random_access_memory')*8)
    .outputs(item('appliedenergistics2:material:22'))
    .duration(400) 
    .EUt(120)
    .buildAndRegister()

mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:17'), metaitem('wireGtSingleRedAlloy')*4, metaitem('boltCrystalFluix')*4, ore('circuitUlv')*2, metaitem('plate.random_access_memory')*8)
    .outputs(item('appliedenergistics2:material:24'))
    .duration(400) 
    .EUt(120)
    .buildAndRegister()

mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:16'), metaitem('wireGtSingleRedAlloy')*4, metaitem('boltCrystalFluix')*4, ore('circuitUlv')*2, metaitem('plate.random_access_memory')*8)
    .outputs(item('appliedenergistics2:material:23'))
    .duration(400) 
    .EUt(120)
    .buildAndRegister()

//Cheaper AE2 Processors
mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:18'), metaitem('wireFineRedAlloy')*4, metaitem('boltCrystalFluix')*2, metaitem('plate.simple_fluix_systematic_chip'))
    .fluidInputs(fluid('tin')*72)
    .outputs(item('appliedenergistics2:material:22'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()

mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:17'), metaitem('wireFineRedAlloy')*4, metaitem('boltCrystalFluix')*2, metaitem('plate.simple_fluix_systematic_chip'))
    .fluidInputs(fluid('tin')*72)
    .outputs(item('appliedenergistics2:material:24'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()

mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:16'), metaitem('wireFineRedAlloy')*4, metaitem('boltCrystalFluix')*2, metaitem('plate.simple_fluix_systematic_chip'))
    .fluidInputs(fluid('tin')*72)
    .outputs(item('appliedenergistics2:material:23'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()

mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:18'), metaitem('wireFineRedAlloy')*4, metaitem('boltCrystalFluix')*2, metaitem('plate.simple_fluix_systematic_chip'))
    .fluidInputs(fluid('soldering_alloy')*36)
    .outputs(item('appliedenergistics2:material:22'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()
mods.gregtech.circuit_assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:17'), metaitem('wireFineRedAlloy')*4, metaitem('boltCrystalFluix')*2, metaitem('plate.simple_fluix_systematic_chip'))
    .fluidInputs(fluid('soldering_alloy')*36)
    .outputs(item('appliedenergistics2:material:24'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()
mods.gregtech.circuit_assembler.recipeBuilder()  
    .inputs(item('appliedenergistics2:material:20'), item('appliedenergistics2:material:16'), metaitem('wireFineRedAlloy')*4, metaitem('boltCrystalFluix')*2, metaitem('plate.simple_fluix_systematic_chip'))
    .fluidInputs(fluid('soldering_alloy')*36)
    .outputs(item('appliedenergistics2:material:23'))
    .cleanroom(CleanroomType.CLEANROOM)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()

//Crafting Units and Cables
mods.gregtech.assembler.recipeBuilder()
    .inputs(metaitem('cover.screen'), glasscable, ore('circuitLv'), item('appliedenergistics2:crafting_unit'), metaitem('screwCrystalFluix')*4)
    .outputs(item('appliedenergistics2:crafting_monitor'))
    .duration(50) 
    .EUt(16)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('circuitHv')*2, glasscable, ore('EntropyCore')*2, item('appliedenergistics2:crafting_unit'), metaitem('screwCrystalFluix')*6)
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:crafting_accelerator')*2)
    .duration(100) 
    .EUt(480)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('circuitHv')*2, glasscable, ore('EntropyCore')*2, item('appliedenergistics2:crafting_unit'), metaitem('screwCrystalFluix')*6)
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:crafting_accelerator')*2)
    .duration(100) 
    .EUt(480)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('circuitEv')*2, item('appliedenergistics2:crafting_accelerator')*2, item('appliedenergistics2:material:36'), metaitem('screwCrystalFluix')*12)
    .fluidInputs(fluid('nether_quartz')*144)
    .outputs(item('nae2:coprocessor_4x')*2)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('circuitEv')*2, item('appliedenergistics2:crafting_accelerator')*2, item('appliedenergistics2:material:36'), metaitem('screwCrystalFluix')*12)
    .fluidInputs(fluid('certus_quartz')*144)
    .outputs(item('nae2:coprocessor_4x')*2)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('circuitIv')*2, item('nae2:coprocessor_4x')*2, ore('EntropyCore')*4, item('appliedenergistics2:material:37'), metaitem('screwCrystalFluix')*18)
    .fluidInputs(fluid('crystal_fluix')*72)
    .outputs(item('nae2:coprocessor_16x')*2)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('circuitIv')*2, item('nae2:coprocessor_4x')*2, ore('EntropyCore')*4, item('appliedenergistics2:material:37'), metaitem('screwCrystalFluix')*18)
    .fluidInputs(fluid('crystal_fluix')*72)
    .outputs(item('nae2:coprocessor_16x')*2)
    .duration(200) 
    .EUt(480)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('circuitLuv'), item('nae2:coprocessor_16x')*2, ore('EntropyCore')*8, item('appliedenergistics2:material:38'), metaitem('screwCrystalFluix')*24)
    .fluidInputs(fluid('crystal_fluix')*144)
    .outputs(item('nae2:coprocessor_64x'))
    .duration(200) 
    .EUt(1920)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('circuitLuv'), item('nae2:coprocessor_16x')*2, ore('EntropyCore')*8, item('appliedenergistics2:material:38'), metaitem('screwCrystalFluix')*24)
    .fluidInputs(fluid('crystal_fluix')*144)
    .outputs(item('nae2:coprocessor_64x'))
    .duration(200) 
    .EUt(1920)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:interface'), ore('circuitMv'), item('appliedenergistics2:part:36')*2, metaitem('platePlastic')*6, metaitem('screwCrystalFluix')*12)
    .fluidInputs(fluid('certus_quartz')*72)
    .outputs(item('appliedenergistics2:crafting_unit')*2)
    .duration(200) 
    .EUt(120)
    .buildAndRegister()
mods.gregtech.assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:interface'), ore('circuitMv'), item('appliedenergistics2:part:36')*2, metaitem('platePlastic')*6, metaitem('screwCrystalFluix')*12)
    .fluidInputs(fluid('nether_quartz')*72)
    .outputs(item('appliedenergistics2:crafting_unit')*2)
    .duration(200) 
    .EUt(120)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:35'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('appliedenergistics2:crafting_storage_1k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:36'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('appliedenergistics2:crafting_storage_4k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:37'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('appliedenergistics2:crafting_storage_16k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:38'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('appliedenergistics2:crafting_storage_64k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('nae2:material:1'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('nae2:storage_crafting_256k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('nae2:material:2'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('nae2:storage_crafting_1024k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('nae2:material:3'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('nae2:storage_crafting_4096k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('nae2:material:4'), item('appliedenergistics2:crafting_unit'))
    .outputs(item('nae2:storage_crafting_16384k'))
    .duration(50) 
    .EUt(30)
    .buildAndRegister()

//Storage cells
mods.gregtech.canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:35'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:storage_cell_1k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:36'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:storage_cell_4k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:37'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:storage_cell_16k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:38'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:storage_cell_64k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:54'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:fluid_storage_cell_1k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:55'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:fluid_storage_cell_4k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:56'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:fluid_storage_cell_16k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('appliedenergistics2:material:57'), item('appliedenergistics2:material:39'))
    .outputs(item('appliedenergistics2:fluid_storage_cell_64k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('nae2:material:1'), item('appliedenergistics2:material:39'))
    .outputs(item('nae2:storage_cell_256k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('nae2:material:5'), item('appliedenergistics2:material:39'))
    .outputs(item('nae2:storage_cell_fluid_256k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('nae2:material:2'), item('appliedenergistics2:material:39'))
    .outputs(item('nae2:storage_cell_1024k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('nae2:material:6'), item('appliedenergistics2:material:39'))
    .outputs(item('nae2:storage_cell_fluid_1024k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('nae2:material:3'), item('appliedenergistics2:material:39'))
    .outputs(item('nae2:storage_cell_4096k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('nae2:material:7'), item('appliedenergistics2:material:39'))
    .outputs(item('nae2:storage_cell_fluid_4096k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('nae2:material:4'), item('appliedenergistics2:material:39'))
    .outputs(item('nae2:storage_cell_16384k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()
mods.gregtech.canner.recipeBuilder()
    .inputs(item('nae2:material:8'), item('appliedenergistics2:material:39'))
    .outputs(item('nae2:storage_cell_fluid_16384k'))
    .duration(20) 
    .EUt(7)
    .buildAndRegister()

//Cables
mods.gregtech.autoclave.recipeBuilder()
    .inputs(metaitem('dustSmallGlass'))
    .fluidInputs(fluid('crystal_fluix') * 36)
    .notConsumable(metaitem('shape.extruder.pipe.normal'))
    .outputs(glasscable)
    .duration(100)
    .EUt(16)
    .buildAndRegister()
mods.gregtech.autoclave.recipeBuilder()
    .inputs(metaitem('dustSmallGlass'))
    .fluidInputs(fluid('nether_quartz') * 36)
    .notConsumable(metaitem('shape.extruder.pipe.normal'))
    .outputs(item('appliedenergistics2:part:140'))
    .duration(50)
    .EUt(16)
    .buildAndRegister()
mods.gregtech.autoclave.recipeBuilder()
    .inputs(metaitem('dustSmallGlass'))
    .fluidInputs(fluid('certus_quartz') * 36)
    .notConsumable(metaitem('shape.extruder.pipe.normal'))
    .outputs(item('appliedenergistics2:part:140'))
    .duration(50)
    .EUt(16)
    .buildAndRegister()

//Misc
mods.gregtech.fluid_solidifier.recipeBuilder()
    .inputs(metaitem('boltSteel'))
    .fluidInputs(fluid('crystal_fluix')*18)
    .outputs(metaitem('boltCrystalFluix'))
    .duration(15)
    .EUt(30)
    .buildAndRegister()

mods.gregtech.mixer.recipeBuilder()
    .inputs(ore('dustSilicon'), ore('dustRedstone'), ore('gemNetherQuartz'), ore('gemCertusQuartz'))
    .fluidInputs(fluid('water')*1000)
    .outputs(metaitem('dustCrystalFluix')*4)
    .duration(400)
    .EUt(7)
    .buildAndRegister()

mods.gregtech.mixer.recipeBuilder()
    .inputs(ore('dustSilicon'), ore('dustRedstone'), ore('gemNetherQuartz'), ore('gemCertusQuartz'))
    .fluidInputs(fluid('distilled_water')*250)
    .outputs(metaitem('dustCrystalFluix')*4)
    .duration(200)
    .EUt(7)
    .buildAndRegister()

//Fluix wafers
mods.gregtech.electric_blast_furnace.recipeBuilder() //boule
    .inputs(ore('dustCrystalFluix')*16, ore('oreDustSmallGalliumArsenide'))
    .fluidInputs(fluid('nitrogen') * 2000)
    .outputs(fboule)
    .duration(6000)
    .EUt(60)
    .buildAndRegister()

mods.gregtech.cutter.recipeBuilder() //wafer
    .inputs(fboule)
    .outputs(metaitem('wafer.fluix')*16)
    .duration(200)
    .EUt(32)
    .buildAndRegister()

mods.gregtech.laser_engraver.recipeBuilder() //simple fsc wafer
    .inputs(fwafer)
    .notConsumable(ore('lensAmethyst'))
    .outputs(metaitem('wafer.simple_fluix_systematic_chip'))
    .duration(900) 
    .EUt(120)
    .buildAndRegister()
mods.gregtech.laser_engraver.recipeBuilder() //basic fsc wafer
    .inputs(fwafer)
    .notConsumable(ore('craftingLensPurple'))
    .outputs(meraitem('wafer.basic_fluix_systematic_chip'))
    .duration(900) 
    .EUt(480)
    .buildAndRegister()
mods.gregtech.laser_engraver.recipeBuilder() //complex fsc wafer
    .inputs(fwafer)
    .notConsumable(ore('lensCrystalFluix'))
    .outputs(metaitem('wafer.complex_fluix_systematic_chip'))
    .duration(900) 
    .EUt(1920)
    .buildAndRegister()

mods.gregtech.cutter.recipeBuilder() //simple fsc
    .inputs(metaitem('wafer.simple_fluix_systematic_chip'))
    .outputs(metaitem('plate.simple_fluix_systematic_chip')*16)
    .duration(900)
    .EUt(64)
    .buildAndRegister()
mods.gregtech.cutter.recipeBuilder() //basic fsc
    .inputs(metaitem('wafer.basic_fluix_systematic_chip'))
    .outputs(metaitem('plate.basic_fluix_systematic_chip')*8)
    .duration(900)
    .EUt(256)
    .buildAndRegister()
mods.gregtech.cutter.recipeBuilder() //complex fsc
    .inputs(metaitem('wafer.complex_fluix_systematic_chip'))
    .outputs(metaitem('plate.complex_fluix_systematic_chip')*4)
    .duration(900)
    .EUt(1024)
    .buildAndRegister()
