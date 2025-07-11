import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

//Vermiculite processing
        DRYER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustVermiculite')*2)
                .outputs(metaitem('dustDriedVermiculite'))
                .fluidOUtputs(fluid('steam')*1000)
                .circuitMeta(0)
                .duration(80)
                .EUt(10)
                .buildAndRegister()
    
        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustDriedVermiculite'))
                .outputs(metaitem('dustExfoliatedVermiculite')*8)
                .circuitMeta(0)
                .duration(160)
                .EUt(20)
                .buildAndRegister()

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*600)
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('dustExfoliatedVermiculite')*32)
                .outputs(metaitem('dustIron3Sulfate')*3)
                .outputs(metaitem('dustAluminiumSulfate')*2)
                .fluidOutputs(fluid('silicicacid')*1200)
                .duration(400)
                .EUt(80)
                .buildAndRegister()

        BLAST_RECIPES.recipeBuilder() 
            .blastFurnaceTemp(1200)
            .EUt(200)
            .duration(160)
            .inputs(metaitem('dustIron3Sulfate'))
            .inputs(metaitem('dustCarbon')*3)
            .outputs(material('iron')*2)
            .fluidOutputs(fluid('sulfur_dioxide')*3000)
            .fluidOutputs(fluid('carbon_dioxide')*3000)
            .buildAndRegister();

        BLAST_RECIPES.recipeBuilder() //TO DO THERMAL DECOMPOSE
            .blastFurnaceTemp(1200)
            .EUt(200)
            .duration(160)
            .outputs(metaitem('dustSiliconDioxide'))
            .fluidInputs(fluid('silicicacid')*2400)
            .fluidOutputs(fluid('water')*1400)
            .buildAndRegister();

//Sylvanite processing

        GRAVITY_SEPARATOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSylvanite'))
                .outputs(metaitem('siftedSylvanite'))
                .duration(200)
                .EUt(180)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('siftedSylvanite')*4)
                .fluidOutputs(fluid('impure_sylvanite_slurry')*1000)
                .duration(240)
                .EUt(90)
                .buildAndRegister();

        FROTH_FLOTATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('impure_sylvanite_slurry')*1000)
                .fluidOutputs(fluid('sylvanite_slurry')*1000)
                .notConsumable(metaitem('dustSodiumSilicate')*3)
                .notConsumable(metaitem("dustsodiumhexametaphosphate")*2)
                .notConsumable(metaitem('dustQuicklime')*2)
                .notConsumable(fluid('sodiumdiisobutyldithiophosphinate')*1000)
                .notConsumable(fluid('methylisobutylcarbinol')*1000)
                .notConsumable(fluid('sodium_isopropyl_xanthate')*100)
                .duration(300)
                .EUt(800)
                .buildAndRegister();

        CLARIFIER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sylvanite_slurry')*1000)
                .outputs(metaitem('dustFloatedSylvanite')*15)
                .chancedOutput(metaitem('dustBismuth')*1, 40, 0)
                .chancedOutput(metaitem('dustAntimony')*1, 20, 0)
                .chancedOutput(metaitem('dustManganese')*1, 20, 0)
                .chancedOutput(metaitem('dustSelenium')*1, 10, 0)
                .fluidOutputs(fluid('waste_water') * 1000)
                .duration(300)
                .EUt(800)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustFloatedSylvanite'))
                .outputs(metaitem('dustRoatedSylvanite'))
                .circuitMeta(0)
                .duration(320)
                .EUt(1200)
                .buildAndRegister()

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_hydroxide_solution') * 2000)
                .inputs(metaitem('dustRoatedSylvanite'))
                .outputs(metaitem('dustSodiumTellurite')*4)
                .outputs(metaitem('dustElectrum'))
                .fluidOutputs(fluid('water')*1000)
                .duration(400)
                .EUt(80)
                .buildAndRegister()

        