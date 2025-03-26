import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('phosphorus_pentoxide')*1000)
                .fluidInputs(fluid('chlorine')*1000)
                .fluidOutputs(fluid('phosphoric_anihydride')*2000)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('phosphoric_anihydride')*1000)
                .fluidInputs(fluid('chlorine')*1000)
                .fluidOutputs(fluid('orthophosphoric_acid_solution')*2000)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('orthophosphoric_acid_solution')*2000)
                .fluidOutputs(fluid('hydrochloric_acid')*1000)
                .fluidOutputs(fluid('orthophosphoric_acid')*1000)
                .duration(400)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustFormaldehyde')* 1)
                .fluidOutputs(fluid('methylene_diphosphoric_acid')*1000)
                .fluidInputs(fluid('orthophosphoric_acid')*1000)
                .duration(200)
                .EUt(7000)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidOutputs(fluid('ethylenediamine')*1000)
                .fluidOutputs(fluid('Water')*1000)
                .fluidInputs(fluid('ammonia')*1000)
                .fluidInputs(fluid('ethanolamine')*1000)
                .notConsumable(metaitem('dustPalladium')* 1)
                .duration(90)
                .EUt(1280)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethylene_oxide')*1000)
                .fluidInputs(fluid('ammonia')*1000)
                .fluidOutputs(fluid('ethanolamine')*1000)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethylenediamine')*1000)
                .fluidInputs(fluid('sodium_hydroxide_solution')*1000)
                .fluidInputs(fluid('methylene_diphosphoric_acid')*1000)
                .fluidOutputs(fluid('edetic_acid')*1000)
                .duration(200)
                .EUt(1280)
                .circuitMeta(1)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustGlucose')* 1)
                .notConsumable(metaitem('dustCupriavidusNecator'))
                .fluidInputs(fluid('palm_oil')*20)
                .fluidInputs(fluid('y_butyrolacetone')*20)
                .fluidOutputs(fluid('polyhydroxyl_alkanoate')*100)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('polyhydroxyl_alkanoate')*1000)
                .outputs(metaitem('plateBioPlastic'))
                .notConsumable(metaitem('shape.mold.plate'))
                .duration(240)
                .EUt(500)
                .buildAndRegister();