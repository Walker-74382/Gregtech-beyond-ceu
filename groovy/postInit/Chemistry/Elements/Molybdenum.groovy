import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustMolybdenite')*3)
                .fluidInputs(fluid('oxygen')*8000)
                .outputs(metaitem('dustMolybdenumTrioxide')*4)
                .fluidOutputs(fluid('sulfur_dioxide')*2000)
                .fluidOutputs(fluid('molybdenum_flue')*1000)
                .duration(200)
                .EUt(110)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustMolybdenumTrioxide')*4)
                .fluidInputs(fluid('hydrogen')*6000)
                .outputs(metaitem('dustMolybdenum'))
                .fluidOutputs(fluid('water')*3000)
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPowellite')*6)
                .fluidInputs(fluid('hydrochloric_acid')*2000)
                .outputs(metaitem('dustMolybdenumTrioxide')*4)
                .outputs(metaitem('dustCalciumChloride')*3)
                .fluidOutputs(fluid('water')*1000)
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('dustWulfenite')*6)
                .fluidInputs(fluid('hydrochloric_acid')*2000)
                .outputs(metaitem('dustMolybdenumTrioxide')*4)
                .outputs(metaitem('dustLeadChloride')*3)
                .fluidOutputs(fluid('water')*1000)
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('molybdenum_flue')*1000)
                .outputs(metaitem('dustMolybdenumTrioxide'))
                .fluidOutputs(fluid('trace_rhenium_flue')*500)
                .duration(200)
                .EUt(60)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSodaAsh')*6)
                .inputs(metaitem('dustSodiumHydroxide')*3)
                .fluidInputs(fluid('trace_rhenium_flue')*1000)
                .fluidInputs(fluid('chlorine')*3000)
                .outputs(metaitem('dustPerrhenicAcid')*6)
                .outputs(metaitem('dustSalt')*6)
                .fluidOutputs(fluid('carbon_dioxide')*1000)
                .duration(100)
                .EUt(5000)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPerrhenicAcid')*6)
                .fluidInputs(fluid('ammonia')*1000)
                .outputs(metaitem('dustAmmoniumPerrhenate')*10)
                .duration(100)
                .EUt(1600)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustAmmoniumPerrhenate')*10)
                .fluidInputs(fluid('hydrogen_sulfide')*1000)
                .fluidInputs(fluid('chlorine')*1000)
                .outputs(metaitem('dustRhenium'))
                .outputs(metaitem('dustAmmoniumChloride')*2)
                .fluidOutputs(fluid('sulfuric_acid')*1000)
                .duration(100)
                .EUt(1600)
                .buildAndRegister();