import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;



        FORMING_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('board.epoxy'))
                .inputs(metaitem('foilGold'))
                .outputs(metaitem('laminated_epoxy_board'))
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .inputs(metaitem('laminated_epoxy_board'))
                .outputs(metaitem('engraved_epoxy_board'))
                .duration(200)
                .EUt(490)
                .buildAndRegister();

        ELECTRON_BEAM_LITHOGRAPHER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('novolacs_photoresist')*144)
                .inputs(metaitem('engraved_epoxy_board'))
                .circuitMeta(0)
                .outputs(metaitem('patterened_epoxy_board'))
                .duration(200)
                .EUt(470)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('iron_iii_chloride')*100)
                .inputs(metaitem('patterened_epoxy_board'))
                .outputs(metaitem('circuit_board.advanced'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_bisulfate_solution')*100)
                .inputs(metaitem('patterened_epoxy_board'))
                .outputs(metaitem('circuit_board.advanced'))
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('plateEpoxy'))
                .inputs(metaitem('platePolyetheretherketone'))
                .outputs(metaitem('plateEpoxidPcbBase'))
                .duration(210)
                .EUt(520)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*500)
                .inputs(metaitem('foilGold')* 8)
                .inputs(metaitem('plateEpoxidPcbBase'))
                .outputs(metaitem('board.epoxy'))
                .duration(340)
                .EUt(78)
                .buildAndRegister();

        // Advanced Circuit Board * 1
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('board.epoxy'), metaitem('foilElectrum') * 8], [fluid('sodium_persulfate') * 1000 * 1000])
// Advanced Circuit Board * 1
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('board.epoxy'), metaitem('foilElectrum') * 8], [fluid('iron_iii_chloride') * 500 * 500])
// Epoxy Circuit Board * 1
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('plateEpoxy'), metaitem('foilGold') * 8], [fluid('sulfuric_acid') * 500 * 500])

// Advanced Circuit Board * 1
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('board.epoxy'), metaitem('foilElectrum') * 8], [fluid('sodium_persulfate') * 1000 * 1000])
// Advanced Circuit Board * 1
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('board.epoxy'), metaitem('foilElectrum') * 8], [fluid('iron_iii_chloride') * 500 * 500])
// Epoxy Circuit Board * 1
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('plateEpoxy'), metaitem('foilGold') * 8], [fluid('sulfuric_acid') * 500 * 500])
