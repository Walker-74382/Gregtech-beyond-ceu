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

        crafting.addShaped("gregtech:solar_thermal_concentrator", item('gregtech:machine', 3001), [
                [metaitem('pipeNormalFluidBronze'), metaitem('plateSteel') , metaitem('pipeNormalFluidBronze')],
                [metaitem('plateSteel'), metaitem('electric.pump.lv') , metaitem('plateSteel')],
                [metaitem('pipeNormalFluidBronze'), metaitem('plateSteel') , metaitem('pipeNormalFluidBronze')]])

        crafting.addShaped("gregtech:fermentation_vat", item('gregtech:machine', 3012), [
                [ore('circuitMv'), metaitem('pipeLargeFluidSteel') , ore('circuitMv')],
                [metaitem('electric.pump.mv'), metaitem('hull.mv') , metaitem('electric.pump.mv')],
                [ore('circuitMv'), metaitem('pipeLargeFluidSteel') , ore('circuitMv')]])

        crafting.addShaped("gregtech:fischer_tropsch_reactor", item('gregtech:machine', 3013), [
                [metaitem('pipeHugeFluidTitanium'), ore('circuitEv') , metaitem('pipeHugeFluidTitanium')],
                [metaitem('electric.pump.ev'), metaitem('hull.ev') , metaitem('electric.pump.ev')],
                [metaitem('pipeHugeFluidTitanium'), ore('circuitEv') , metaitem('pipeHugeFluidTitanium')]])

        crafting.addShaped("gregtech:electrolytic_cell", item('gregtech:machine', 3016), [
                [metaitem('electric.pump.lv'), metaitem('frameSteel') , metaitem('electric.pump.lv')],
                [metaitem('stickSteelMagnetic'), metaitem('hull.lv') , metaitem('stickIronMagnetic')],
                [metaitem('electric.pump.lv'), metaitem('frameSteel') , metaitem('electric.pump.lv')]])
        
        crafting.addShaped("gregtech:clarifier", item('gregtech:machine', 3020), [
                [ore('circuitEv'), ore('rotorSteel'), ore('circuitEv')], 
                [item('gregtech:machine', 988), ore('stickSteelMagnetic'), item('gregtech:machine', 988)], 
                [ore('frameGtStainlessSteel'), ore('frameGtSteel'), ore('frameGtStainlessSteel')]])

        crafting.addShaped("gregtech:froth_flotation_unit", item('gregtech:machine', 3021), [
                [ore('circuitEv'), item('gregtech:meta_item_1', 145), ore('circuitEv')], 
                [ore('rotorSteel'), item('gregtech:machine', 988), ore('rotorSteel')], 
                [ore('circuitEv'), item('gregtech:meta_item_1', 145), ore('circuitEv')]])

        crafting.addShaped("gregtech:digester", item('gregtech:machine', 3022), [
                [ore('rotorTungstenSteel'), item('gregtech:meta_item_1', 190), ore('rotorTungstenSteel')], 
                [item('gregtech:meta_item_1', 145), item('gregtech:machine', 989), item('gregtech:meta_item_1', 145)], 
                [ore('circuitEv'), item('gregtech:meta_item_1', 190), ore('circuitEv')]])

        crafting.addShaped("gregtech:polymerization_tank", item('gregtech:machine', 3024), [
                [item('gregtech:meta_item_1', 247), ore('gearSteel'), item('gregtech:meta_item_1', 247)], 
                [ore('circuitLv'), item('gregtech:machine', 986), ore('circuitLv')], 
                [item('gregtech:meta_item_1', 142), ore('gearSteel'), item('gregtech:meta_item_1', 142)]])

        crafting.addShaped("gregtech:thermal_press", item('gregtech:machine', 3025), [
                [item('gregtech:meta_item_1', 172), item('gregtech:meta_item_1', 97), item('gregtech:meta_item_1', 172)], 
                [ore('circuitLv'), item('gregtech:machine', 986), ore('circuitLv')], 
                [item('gregtech:meta_item_1', 142), item('gregtech:meta_item_1', 97), item('gregtech:meta_item_1', 142)]])

        crafting.addShaped("gregtech:condesation_unit", item('gregtech:machine', 3028), [
                [item('gregtech:meta_item_1', 144), ore('plateStainlessSteel'), item('gregtech:meta_item_1', 144)], 
                [ore('circuitHv'), ore('frameGtStainlessSteel'), ore('circuitHv')], 
                [item('gregtech:meta_item_1', 144), item('gregtech:machine', 988), item('gregtech:meta_item_1', 144)]])

        crafting.addShaped("gregtech:cryogenic_distillation_plant", item('gregtech:machine', 3029), [
                [ore('pipeNormalFluidStainlessSteel'), ore('circuitHv'), ore('pipeNormalFluidStainlessSteel')], 
                [item('gregtech:meta_item_1', 144), item('gregtech:machine', 988), item('gregtech:meta_item_1', 144)], 
                [ore('pipeNormalFluidStainlessSteel'), ore('circuitHv'), ore('pipeNormalFluidStainlessSteel')]])

        crafting.addShaped("gregtech:rare_gas_stripping_unit", item('gregtech:machine', 3030), [
                [item('gregtech:meta_item_1', 144), ore('pipeNormalFluidStainlessSteel'), item('gregtech:meta_item_1', 144)], 
                [item('gregtech:meta_item_1', 174), item('gregtech:machine', 988), item('gregtech:meta_item_1', 174)], 
                [ore('pipeNormalFluidStainlessSteel'), ore('circuitHv'), ore('pipeNormalFluidStainlessSteel')]])

        crafting.addShaped("gregtech:pressure_swing_adsorber", item('gregtech:machine', 3031), [
                [ore('circuitHv'), item('gregtech:meta_item_1', 97), ore('circuitHv')], 
                [item('gregtech:meta_item_1', 143), item('gregtech:machine', 987), item('gregtech:meta_item_1', 143)], 
                [ore('circuitHv'), item('gregtech:meta_item_1', 97), ore('circuitHv')]])

        crafting.addShaped("gregtech:dissolution_tank", item('gregtech:machine', 3033), [
                [ore('frameGtStainlessSteel'), ore('circuitHv'), ore('frameGtStainlessSteel')], 
                [item('gregtech:meta_item_1', 144), item('gregtech:machine', 988), item('gregtech:meta_item_1', 144)], 
                [ore('plateStainlessSteel'), ore('circuitHv'), ore('plateStainlessSteel')]])

        crafting.addShaped("gregtech:crackers", item('gregtech:machine', 3040), [
                [item('gregtech:meta_item_1', 144), ore('pipeSmallFluidStainlessSteel'), item('gregtech:meta_item_1', 144)], 
                [ore('pipeSmallFluidStainlessSteel'), item('gregtech:machine', 988), ore('pipeSmallFluidStainlessSteel')], 
                [ore('circuitHv'), ore('pipeSmallFluidStainlessSteel'), ore('circuitHv')]])

        crafting.addShaped("gregtech:dilution_refrigerator", item('gregtech:machine', 3035), [
                [ore('pipeSmallFluidStainlessSteel'), ore('rotorTungstenSteel'), ore('pipeSmallFluidStainlessSteel')], 
                [item('gregtech:meta_item_1', 144), item('gregtech:machine', 988), item('gregtech:meta_item_1', 144)], 
                [ore('circuitHv'), ore('rotorTungstenSteel'), ore('circuitHv')]])

        crafting.addShaped("gregtech:curing_oven", item('gregtech:machine', 3039), [
                [ore('circuitHv'), ore('frameGtHslaSteel'), ore('circuitHv')], 
                [ore('springCupronickel'), item('gregtech:machine', 988), ore('springCupronickel')], 
                [ore('circuitHv'), item('gregtech:meta_item_1', 144), ore('circuitHv')]])

        crafting.addShaped("gregtech:burner_generator", item('gregtech:machine', 3034), [
                [item('gregtech:meta_item_1', 205), ore('circuitIv'), item('gregtech:meta_item_1', 205)], 
                [ore('springCupronickel'), item('gregtech:machine', 989), ore('springCupronickel')], 
                [item('gregtech:meta_item_1', 100), ore('circuitIv'), item('gregtech:meta_item_1', 100)]])

        SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
                .fluidInputs(fluid('soldering_alloy')*288)
                .inputs(item('gregtech:machine', 987))
                .inputs(item('gregtech:machine', 111)*4)
                .inputs(metaitem('plate.integrated_logic_circuit')*32)
                .inputs(metaitem('item_casingAluminium')*4)
                .inputs(ore('circuitHv')*8)
                .outputs(item('gregtech:machine', 3052))
                .duration(300)
                .EUt(80)
                .buildAndRegister();

        SPACE_COMPONENT_ASSEMBLING.recipeBuilder()
                .fluidInputs(fluid('soldering_alloy')*288)
                .inputs(item('gregtech:machine', 987))
                .inputs(item('gregtech:machine', 921)*4)
                .inputs(metaitem('plate.ultra_low_power_integrated_circuit')*32)
                .inputs(metaitem('item_casingAluminium')*4)
                .inputs(ore('circuitHv')*8)
                .outputs(item('gregtech:machine', 3053))
                .duration(300)
                .EUt(80)
                .buildAndRegister();

        crafting.addShaped("gregtech:electrowinning_cell", item('gregtech:machine', 3048), [
                [ore('circuitMv'), item('gregtech:meta_item_1', 96), ore('circuitMv')], 
                [item('gregtech:meta_item_1', 143), item('gregtech:machine', 986), item('gregtech:meta_item_1', 143)], 
                [ore('circuitMv'), item('gregtech:meta_item_1', 96), ore('circuitMv')]])

        crafting.addShaped("gregtech:mocvd_unit", item('gregtech:machine', 3046), [
                [item('gregtech:meta_item_1', 190), item('gregtech:meta_item_1', 205), item('gregtech:meta_item_1', 190)], 
                [ore('circuitEv'), item('gregtech:machine', 989), ore('circuitEv')], 
                [item('gregtech:meta_item_1', 250), ore('circuitEv'), item('gregtech:meta_item_1', 250)]])

        crafting.addShaped("gregtech:oxidation_furnace", item('gregtech:machine', 3045), [
                [item('gregtech:meta_item_1', 159), item('gregtech:meta_item_1', 144), item('gregtech:meta_item_1', 159)], 
                [ore('circuitHv'), item('gregtech:machine', 988), ore('circuitHv')], 
                [item('gregtech:meta_item_1', 174), ore('circuitEv'), item('gregtech:meta_item_1', 174)]])

        crafting.addShaped("gregtech:vacuum_metallizer", item('gregtech:machine', 3044), [
                [item('gregtech:meta_item_1', 174), ore('frameGtAluminium'), item('gregtech:meta_item_1', 174)], 
                [ore('circuitEv'), item('gregtech:machine', 988), ore('circuitEv')], 
                [item('gregtech:meta_item_1', 144), ore('frameGtAluminium'), item('gregtech:meta_item_1', 144)]])

        crafting.addShaped("gregtech:vis_breaker", item('gregtech:machine', 3043), [
                [item('gregtech:meta_item_1', 144), ore('pipeHugeFluidSteel'), item('gregtech:meta_item_1', 144)], 
                [ore('circuitHv'), item('gregtech:machine', 988), ore('circuitHv')], 
                [ore('frameGtAluminium'), ore('pipeHugeFluidSteel'), ore('frameGtAluminium')]])

        crafting.addShaped("gregtech:gravity_settler_tank", item('gregtech:machine', 3042), [
                [ore('pipeSmallFluidStainlessSteel'), item('gregtech:meta_item_1', 249), ore('pipeSmallFluidStainlessSteel')], 
                [ore('circuitHv'), item('gregtech:machine', 988), ore('circuitHv')], 
                [item('gregtech:meta_item_1', 144), item('gregtech:meta_item_1', 98), item('gregtech:meta_item_1', 144)]])

        crafting.addShaped("gregtech:enzymatic_hydrolisis_tank", item('gregtech:machine', 3038), [
                [ore('circuitIv'), item('gregtech:meta_item_1', 206), ore('circuitIv')], 
                [item('gregtech:meta_item_1', 146), item('gregtech:machine', 990), item('gregtech:meta_item_1', 146)], 
                [ore('circuitIv'), item('gregtech:meta_item_1', 206), ore('circuitIv')]])