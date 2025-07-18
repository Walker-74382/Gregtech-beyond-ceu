import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_carbonate_solution')*4000)
                .fluidInputs(fluid('oxygen')*2000)
                .inputs(metaitem('dustChromite')* 7)
                .fluidOutputs(fluid('carbon_dioxide')*4000)
                .fluidOutputs(fluid('sodium_chromate_solution')*4000)
                .outputs(metaitem('dustBandedIron')* 5)
                .duration(200)
                .EUt(80)
                .buildAndRegister()

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*1000)
                .inputs(metaitem('dustSodaAsh')* 5)
                .fluidOutputs(fluid('sodium_carbonate_solution')*1000)
                .duration(299)
                .EUt(500)
                .buildAndRegister()

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .fluidInputs(fluid('sodium_chromate_solution')*2000)
                .outputs(metaitem('dustSodiumSulfate')* 7)
                .fluidOutputs(fluid('sodium_dichromate_solution')*1000)
                .duration(200)
                .EUt(700)
                .buildAndRegister()

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_dichromate_solution')*1000)
                .outputs(metaitem('dustSodiumDichromate')* 11)
                .fluidOutputs(fluid('sulfuric_acid')*1000)
                .fluidOutputs(fluid('water')*1000)
                .duration(200)
                .EUt(190)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSodiumDichromate')* 5)
                .fluidInputs(fluid('water')*1000)
                .outputs(metaitem('dustChromiumTrioxide')* 3)
                .fluidOutputs(fluid('soda_ash_solution')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister()

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('soda_ash_solution')*1000)
                .fluidOutputs(fluid('water')*1000)
                .outputs(metaitem('dustSodaAsh')* 3)
                .duration(200)
                .EUt(80)
                .buildAndRegister()

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('dustSodaAsh')* 3)
                .fluidOutputs(fluid('soda_ash_solution')*1000)
                .duration(400)
                .EUt(280)
                .buildAndRegister()

        BURNER_REACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustChromiumTrioxide')* 5)
                .inputs(metaitem('dustAluminium')* 2)
                .outputs(metaitem('dustAlumina')* 5)
                .outputs(metaitem('dustChrome')* 2)
                .duration(200)
                .EUt(180)
                .buildAndRegister()

// Iron Dust * 1
mods.gregtech.electrolyzer.removeByInput(60, [metaitem('dustChromite') * 7], null)
// Chrome Dust * 1
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustChromiumTrioxide') * 4], null)

// Potassium Dust * 2
mods.gregtech.electrolyzer.removeByInput(60, [metaitem('dustPotassiumDichromate') * 11], null)

        ROASTER_RECIPES.recipeBuilder()
                .EUt(800)
                .duration(200)
                .inputs(metaitem('dustPotassiumDichromate') * 11)
                .fluidOutputs(fluid('oxygen')*7000)
                .outputs(metaitem('dustChrome')*2)
                .outputs(metaitem('dustPotassium')*2)
                .buildAndRegister();