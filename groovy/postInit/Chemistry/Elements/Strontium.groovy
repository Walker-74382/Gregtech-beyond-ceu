import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        GRAVITY_SEPARATOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCelestine'))
                .outputs(metaitem('siftedCelestine'))
                .duration(140)
                .EUt(70)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*1000)
                .inputs(metaitem('siftedCelestine')*4)
                .fluidOutputs(fluid('impure_celestine_slurry')*1000)
                .duration(180)
                .EUt(90)
                .buildAndRegister();

        FROTH_FLOTATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('impure_celestine_slurry')*1000)
                .notConsumable(fluid('methyl_isobutyl_carbonyl')*1000)
                .notConsumable(metaitem('dustSodiumAcetate')* 2)
                .notConsumable(metaitem('dustSodiumIsobutylXanthate')* 2)
                .fluidOutputs(fluid('celestine_slurry')*1000)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CLARIFIER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('celestine_slurry')*1000)
                .outputs(metaitem('floatedCelestine')* 16)
                .fluidOutputs(fluid('waste_water')*1000)
                .duration(400)
                .EUt(50)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .inputs(metaitem('floatedCelestine')* 1)
                .outputs(metaitem('dustSiliconDioxide'))
                .fluidOutputs(fluid('strontium_sulfide_solution')*1000)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('strontium_sulfide_solution')*1000)
                .inputs(metaitem('dustSodiumHydroxide')*3)
                .fluidOutputs(fluid('sodium_hydroxide_solution')*1000)
                .outputs(metaitem('dustStrontiumCarbonate')*2)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        BURNER_REACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustStrontiumCarbonate')* 2)
                .fluidInputs(fluid('oxygen')*1000)
                .outputs(metaitem('dustStrontium'))
                .duration(200)
                .EUt(90)
                .buildAndRegister();