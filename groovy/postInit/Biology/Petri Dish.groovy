import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;



        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('one_four_butanediol')*1000)
                .fluidOutputs(fluid('y_butyrolacetone')*1000)
                .notConsumable(metaitem('dustCucrmgbaCatalyst')* 1)
                .EUt(210)
                .duration(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen')*4000)
                .fluidOutputs(fluid('one_four_butanediol')*1000)
                .fluidInputs(fluid('one_four_butynediol')*1000)
                .notConsumable(metaitem('dustPalladium')*1)
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('acetylene')*1000)
                .circuitMeta(1)
                .notConsumable(metaitem('dustCopper'))
                .fluidInputs(fluid('formaldehyde')*1000)
                .fluidOutputs(fluid('one_four_butynediol')*1000)
                .duration(400)
                .EUt(1200)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .fluidInputs(fluid('hydrogen_peroxide')*1000)
                .fluidOutputs(fluid('piranha_solution')*1000)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('piranha_solution')*100)
                .input(CONTAMINATED_STERILIZED_PETRI_DISH)
                .output(MetaItems.PETRI_DISH)
                .duration(800)
                .EUt(900)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*1000)
                .fluidInputs(fluid('hydrochloric_acid')*1000)
                .fluidInputs(fluid('sulfuric_acid')*2000)
                .fluidOutputs(fluid('sulfur_trioxide')*1000)
                .fluidOutputs(fluid('chlorosulfonic_acid')*2000)
                .fluidOutputs(fluid('water')*2000)
                .duration(240)
                .EUt(800)
                .buildAndRegister();