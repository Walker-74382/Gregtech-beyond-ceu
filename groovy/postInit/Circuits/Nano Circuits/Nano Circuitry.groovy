import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('circuit_board.advanced'))
                .inputs(metaitem('plate.nano_central_processing_unit'))
                .inputs(metaitem('nano_smd_capacitor')* 8)
                .inputs(metaitem('nano_smd_transistor')* 8)
                .inputs(metaitem('nano_smd_resistor')* 8)
                .inputs(metaitem('wireFineElectrum')* 8)
                .fluidInputs(fluid('tin')* 144)
                .inputs(metaitem('hv_voltage_regulator'))
                .outputs(metaitem('circuit.nano_processor'))
                .duration(300)
                .EUt(490)
                .buildAndRegister()

// Nanoprocessor Assembly * 1
mods.gregtech.circuit_assembler.removeByInput(600, [metaitem('circuit_board.advanced'), metaitem('circuit.nano_processor') * 2, metaitem('component.smd.inductor') * 4, metaitem('component.smd.capacitor') * 8, metaitem('plate.random_access_memory') * 8, metaitem('wireFineElectrum') * 16], [fluid('soldering_alloy') * 144 * 144])

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('circuit_board.advanced'))
                .inputs(metaitem('circuit.nano_processor')*2)
                .inputs(metaitem('nano_smd_inductor')*4)
                .inputs(metaitem('nano_smd_capacitor')*8)
                .inputs(metaitem('plate.random_access_memory')*8)
                .inputs(metaitem('wireFineElectrum')*16)
                .inputs(metaitem('dip_8_microcontroller'))
                .outputs(metaitem('circuit.nano_assembly'))
                .duration(300)
                .EUt(490)
                .buildAndRegister()

// Nanoprocessor Assembly * 1
mods.gregtech.circuit_assembler.removeByInput(600, [metaitem('circuit_board.advanced'), metaitem('circuit.nano_processor') * 2, metaitem('component.smd.inductor') * 4, metaitem('component.smd.capacitor') * 8, metaitem('plate.random_access_memory') * 8, metaitem('wireFineElectrum') * 16], [fluid('tin') * 288 * 288])
// Nanoprocessor Assembly * 1
mods.gregtech.circuit_assembler.removeByInput(600, [metaitem('circuit_board.advanced'), metaitem('circuit.nano_processor') * 2, metaitem('component.advanced_smd.inductor'), metaitem('component.advanced_smd.capacitor') * 2, metaitem('plate.random_access_memory') * 8, metaitem('wireFineElectrum') * 16], [fluid('soldering_alloy') * 144 * 144])
// Nanoprocessor Assembly * 1
mods.gregtech.circuit_assembler.removeByInput(600, [metaitem('circuit_board.advanced'), metaitem('circuit.nano_processor') * 2, metaitem('component.advanced_smd.inductor'), metaitem('component.advanced_smd.capacitor') * 2, metaitem('plate.random_access_memory') * 8, metaitem('wireFineElectrum') * 16], [fluid('tin') * 288 * 288])
