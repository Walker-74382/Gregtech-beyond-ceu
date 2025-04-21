import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        ASSEMBLER_RECIPES.recipeBuilder()
                .duration(200)
                .EUt(20)
                .outputs(item('gtb:gtb_multiblock_casing', 8))
                .inputs(metaitem('boltSilver'))
                .inputs(metaitem('frameIron'))
                .fluidInputs(fluid('alumino_silicate_wool_solution')*288)
                .buildAndRegister();

        crafting.addShaped("gregtech:catalytic_reformation_unit_machine", item('gregtech:machine', 3007), [
                [ore('plateEglinSteel'), ore('circuitEv') , ore('plateEglinSteel')],
                [ore('circuitEv'), metaitem('hull.ev') , ore('circuitEv')],
                [ore('plateEglinSteel') , ore('circuitEv') , ore('plateEglinSteel')]])
            
        crafting.addShaped("gregtech:solid_fuel_generator_machine", item('gregtech:machine', 3008),[
                [ore('plateLowQualitySteel'), ore('rotorBronze'), ore('plateLowQualitySteel')],
                [ore('rotorBronze'), item('gregtech:machine_casing'), ore('rotorBronze')],
                [ore('plateLowQualitySteel'), ore('rotorBronze') ,ore('plateLowQualitySteel')]])
            
        crafting.addShaped("gregtech:fractional_distillation_unit", item('gregtech:machine', 3054),[
                [metaitem('pipeTinyFluidSteel'), ore('circuitHv'), metaitem('pipeTinyFluidSteel')],
                [metaitem('electric.pump.hv'), metaitem('hull.hv'),metaitem('electric.pump.hv')],
                [metaitem('pipeTinyFluidSteel'), ore('circuitHv') ,metaitem('pipeTinyFluidSteel')]])


        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('neodymium_magnet')*2)
                .inputs(ore('circuitHv'))
                .inputs(item('gregtech:machine', 985))
                .inputs(metaitem('plateSteel')* 2)
                .inputs(metaitem('robot.arm.hv')*2)
                .outputs(metaitem('gtb:gravity_separator'))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('platePurifiedSiliconCarbide')*4)
                .inputs(ore('circuitHv')* 2)
                .inputs(item('gregtech:meta_block_frame_524', 14))
                .inputs(metaitem('electric.pump.hv')*2)
                .inputs(metaitem('voltage_coil.mv'))
                .outputs(metaitem('gtb:high_temp_distillation_tower'))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(item('gregtech:metal_casing', 4))
                .inputs(metaitem('item_casingStainlessSteel')*4)
                .fluidInputs(fluid('novolac_epoxy_vinyl_ester') * 250)
                .outputs(item('gtb:gtb_multiblock_casing', 13))
                .duration(240)
                .EUt(220)
                .buildAndRegister();

        crafting.addShaped("gregtech:hot_tower", item('gregtech:machine', 3049),[
                [metaitem('circuit.nano_processor'), metaitem('electric.pump.hv'), metaitem('circuit.nano_processor')],
                [item('gtb:gtb_multiblock_casing', 13) , item('gregtech:wire_coil', 2), item('gtb:gtb_multiblock_casing', 13) ],
                [metaitem('circuit.nano_processor'), metaitem('electric.pump.hv') ,metaitem('circuit.nano_processor')]])

        crafting.addShaped("gregtech:cold_tower", item('gregtech:machine', 3050),[
                [metaitem('circuit.nano_processor'), metaitem('electric.pump.hv'), metaitem('circuit.nano_processor')],
                [item('gtb:gtb_multiblock_casing', 13) , item('gtb:cooling_coil'), item('gtb:gtb_multiblock_casing', 13) ],
                [metaitem('circuit.nano_processor'), metaitem('electric.pump.hv') ,metaitem('circuit.nano_processor')]])

        crafting.addShaped("gregtech:vacuum_furnace", item('gregtech:machine', 3003), [
                [ore('circuitMv'), item('gtb:gtb_multiblock_casing', 8) , ore('circuitMv')],
                [item('gtb:gtb_multiblock_casing', 8), item('gregtech:machine', 986) , item('gtb:gtb_multiblock_casing', 8)],
                [ore('circuitMv'), item('gtb:gtb_multiblock_casing', 8) , ore('circuitMv')]])

// Engraving Unit * 1
mods.gregtech.assembler.removeByInput(700, [item('gregtech:machine_casing'), metaitem('electric.pump.iv') * 2,  * 2, metaitem('rotorTungstenSteel') * 4, metaitem('circuit.mainframe') * 4], [fluid('tungsten_steel') * 512 * 512])
