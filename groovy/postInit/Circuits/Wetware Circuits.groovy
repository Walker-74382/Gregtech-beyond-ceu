import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('polybenzimidazole')*1152)
                .inputs(metaitem('wireFineNaquadahAlloy')* 16)
                .inputs(metaitem('plateTritanium')* 2)
                .inputs(metaitem('pipeSmallFluidPolybenzimidazole')* 2)
                .inputs(metaitem('dustShewanella')* 2)
                .inputs(metaitem('electric.pump.luv'))
                .outputs(metaitem('neuro_support_unit'))
                .duration(200)
                .EUt(30000)
                .buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .inputs(metaitem('neuro_support_unit'))
                .inputs(metaitem('component.advanced_smd.transistor')* 4)
                .inputs(metaitem('component.advanced_smd.capacitor')* 4)
                .inputs(metaitem('component.advanced_smd.diode')* 4)
                .inputs(metaitem('component.advanced_smd.inductor')* 4)
                .inputs(metaitem('component.advanced_smd.resistor')* 4)
                .inputs(metaitem('electrically_wired_petri_dish'))
                .inputs(metaitem('stem_cells'))
                .inputs(metaitem('foilKevlar')*4)
                .inputs(metaitem('foilZylon')* 4)
                .inputs(metaitem('wireFineElectrum')*32)
                .outputs(metaitem('processor.neuro')* 4)
                .duration(200)
                .EUt(12000)
                .buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('component.advanced_smd.transistor')* 8)
                .inputs(metaitem('component.advanced_smd.capacitor')* 8)
                .inputs(metaitem('processor.neuro'))
                .inputs(metaitem('crystal.system_on_chip'))
                .inputs(metaitem('plate.nano_central_processing_unit'))
                .inputs(metaitem('wireFineYttriumBariumCuprate')* 8)
                .outputs(metaitem('circuit.wetware_processor')* 4)
                .fluidInputs(fluid('soldering_alloy')*72)
                .duration(200)
                .EUt(12000)
                .buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('component.advanced_smd.transistor')* 8)
                .inputs(metaitem('component.advanced_smd.capacitor')* 8)
                .inputs(metaitem('processor.neuro'))
                .inputs(metaitem('crystal.system_on_chip'))
                .inputs(metaitem('plate.nano_central_processing_unit'))
                .inputs(metaitem('wireFineYttriumBariumCuprate')* 8)
                .outputs(metaitem('circuit.wetware_processor')* 4)
                .fluidInputs(fluid('tin')*144)
                .duration(200)
                .EUt(12000)
                .buildAndRegister();
                
// Neuro Processing Unit * 1
mods.gregtech.circuit_assembler.removeByInput(80000, [metaitem('circuit_board.wetware'), metaitem('stem_cells') * 16, metaitem('pipeSmallFluidPolybenzimidazole') * 8, metaitem('plateElectrum') * 8, metaitem('foilSiliconeRubber') * 16, metaitem('boltHsse') * 8], [fluid('sterilized_growth_medium') * 250 * 250])
