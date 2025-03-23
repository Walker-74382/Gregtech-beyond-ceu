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
                .fluidOutputs(fluid('orthophosphoric_acid')*2000)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('orthophosphoric_acid')*2000)
                .fluidOutputs(fluid('hydrochloric_acid')*1000)
                .fluidOutputs(fluid('OrthophosphoricAcid')*1000)
                .duration(400)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .input(dust, Formaldehyde, 1)
                .fluidOutputs(fluid('MethyleneDiphosphoricAcid')*1000)
                .fluidInputs(fluid('OrthophosphoricAcid')*1000)
                .duration(200)
                .EUt(7000)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidOutputs(fluid('Ethylenediamine')*1000)
                .fluidOutputs(fluid('Water')*1000)
                .fluidInputs(fluid('Ammonia')*1000)
                .fluidInputs(fluid('Ethanolamine')*1000)
                .notConsumable(dust, Palladium, 1)
                .duration(90)
                .EUt(1280)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('EthyleneOxide')*1000)
                .fluidInputs(fluid('Ammonia')*1000)
                .fluidOutputs(fluid('Ethanolamine')*1000)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('Ethylenediamine')*1000)
                .fluidInputs(fluid('SodiumHydroxideSolution')*1000)
                .fluidInputs(fluid('MethyleneDiphosphoricAcid')*1000)
                .fluidOutputs(fluid('EdeticAcid')*1000)
                .duration(200)
                .EUt(1280)
                .circuitMeta(1)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .input(dust, Glucose, 1)
                .notConsumable(dust, CupriavidusNecator)
                .fluidInputs(fluid('PalmOil')*20))
                .fluidInputs(fluid('YButyrolacetone')*20))
                .fluidOutputs(fluid('PolyhydroxylAlkanoate')*100)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('PolyhydroxylAlkanoate')*1000)
                .output(plate, BioPlastic)
                .notConsumable(SHAPE_MOLD_PLATE)
                .duration(240)
                .EUt(500)
                .buildAndRegister();