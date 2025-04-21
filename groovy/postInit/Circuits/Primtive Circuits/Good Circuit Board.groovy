import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

                
        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('iron_iii_chloride')*100)
                .inputs(metaitem('patterened_phenol_circuit_board'))
                .outputs(metaitem('circuit_board.good'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_bisulfate_solution')*100)
                .inputs(metaitem('patterened_phenol_circuit_board'))
                .outputs(metaitem('circuit_board.good'))
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('novolacs_photoresist')*100)
                .inputs(metaitem('board.phenolic'))
                .outputs(metaitem('patterened_phenol_circuit_board'))
                .duration(299)
                .EUt(12)
                .buildAndRegister();

// Good Circuit Board * 1
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('foilSilver') * 4, metaitem('board.phenolic')], [fluid('sodium_persulfate') * 200 * 200])
// Good Circuit Board * 1
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('foilSilver') * 4, metaitem('board.phenolic')], [fluid('iron_iii_chloride') * 100 * 100])
// Good Circuit Board * 1
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('foilSilver') * 4, metaitem('board.phenolic')], [fluid('sodium_persulfate') * 200 * 200])
// Good Circuit Board * 1
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('foilSilver') * 4, metaitem('board.phenolic')], [fluid('iron_iii_chloride') * 100 * 100])
