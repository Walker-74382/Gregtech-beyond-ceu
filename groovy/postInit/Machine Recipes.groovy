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