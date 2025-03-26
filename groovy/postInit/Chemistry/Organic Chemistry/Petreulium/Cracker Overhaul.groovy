import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

    //Cracking Catalyst 

    MIXER_RECIPES.recipeBuilder()
            .inputs(metaitem('dustSilicaGel'))
            .inputs(metaitem('dustAlumina')*2)
            .inputs(metaitem('dustClay'))
            .outputs(metaitem('dustCrackingCatalystPreparation')*4)
            .duration(200)
            .EUt(300)
            .buildAndRegister(); 

    ROASTER_RECIPES.recipeBuilder()
            .inputs(metaitem('dustCrackingCatalystPreparation'))
            .outputs(metaitem('cracking_catalyst'))
            .duration(200)
            .EUt(300)
            .buildAndRegister(); 

    //Recycling

    BLAST_RECIPES.recipeBuilder()
            .inputs(metaitem('used_cracking_catalyst'))
            .outputs(metaitem('cracking_catalyst'))
            .fluidInputs(fluid('oxygen')*1000)
            .blastFurnaceTemp(1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    //Hydrocracking

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('kerosene')*1000)
            .fluidInputs(fluid('hydrogen')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('hydro_cracked_kerosene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('heavy_fuel')*1000)
            .fluidInputs(fluid('hydrogen')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .circuitMeta(1)
            .fluidOutputs(fluid('lightly_hydrocracked_heavy_fuel')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('heavy_fuel')*1000)
            .fluidInputs(fluid('hydrogen')*6000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('severely_hydrocracked_heavy_fuel')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('light_fuel')*1000)
            .fluidInputs(fluid('hydrogen')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .circuitMeta(1)
            .fluidOutputs(fluid('lightly_hydrocracked_light_fuel')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('light_fuel')*1000)
            .fluidInputs(fluid('hydrogen')*6000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('severely_hydrocracked_light_fuel')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('naphtha')*1000)
            .fluidInputs(fluid('hydrogen')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .circuitMeta(1)
            .fluidOutputs(fluid('lightly_hydrocracked_naphtha')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('naphtha')*1000)
            .fluidInputs(fluid('hydrogen')*6000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('severely_hydrocracked_naphtha')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('refinery_gas')*1000)
            .fluidInputs(fluid('hydrogen')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .circuitMeta(1)
            .fluidOutputs(fluid('lightly_hydrocracked_gas')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('refinery_gas')*1000)
            .fluidInputs(fluid('hydrogen')*6000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('severely_hydrocracked_gas')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('ethane')*1000)
            .fluidInputs(fluid('hydrogen')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('hydrocracked_ethane')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('ethylene')*1000)
            .fluidInputs(fluid('hydrogen')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('hydrocracked_ethylene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('butane')*1000)
            .fluidInputs(fluid('hydrogen')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('hydrocracked_butane')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('butene')*1000)
            .fluidInputs(fluid('hydrogen')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('hydrocracked_butene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('butadiene')*1000)
            .fluidInputs(fluid('hydrogen')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('hydrocracked_butadiene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('propene')*1000)
            .fluidInputs(fluid('hydrogen')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('hydrocracked_propene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('propane')*1000)
            .fluidInputs(fluid('hydrogen')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('hydrocracked_propane')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

        //Steam cracking

    

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('kerosene')*1000)
            .fluidInputs(fluid('steam')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('steam_cracked_kerosene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('heavy_fuel')*1000)
            .fluidInputs(fluid('steam')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .circuitMeta(1)
            .fluidOutputs(fluid('lightly_steamcracked_heavy_fuel')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('heavy_fuel')*1000)
            .fluidInputs(fluid('steam')*6000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(3)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('severely_steamcracked_heavy_fuel')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();


    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('light_fuel')*1000)
            .fluidInputs(fluid('steam')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .circuitMeta(1)
            .fluidOutputs(fluid('lightly_steamcracked_light_fuel')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('light_fuel')*1000)
            .fluidInputs(fluid('steam')*6000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(3)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('severely_steamcracked_light_fuel')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();


    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('naphtha')*1000)
            .fluidInputs(fluid('steam')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .circuitMeta(1)
            .fluidOutputs(fluid('lightly_steamcracked_naphtha')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('naphtha')*1000)
            .fluidInputs(fluid('steam')*6000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(3)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('severely_steamcracked_naphtha')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();


    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('refinery_gas')*1000)
            .fluidInputs(fluid('steam')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .circuitMeta(1)
            .fluidOutputs(fluid('lightly_steamcracked_gas')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('refinery_gas')*1000)
            .fluidInputs(fluid('steam')*6000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(3)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('severely_steamcracked_gas')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('ethane')*1000)
            .fluidInputs(fluid('steam')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('steamcracked_ethane')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('ethylene')*1000)
            .fluidInputs(fluid('steam')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('steamcracked_ethylene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('butane')*1000)
            .fluidInputs(fluid('steam')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('steamcracked_butane')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('butene')*1000)
            .fluidInputs(fluid('steam')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('steamcracked_butene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('butadiene')*1000)
            .fluidInputs(fluid('steam')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('steamcracked_butadiene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('propene')*1000)
            .fluidInputs(fluid('steam')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('steamcracked_propene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('propane')*1000)
            .fluidInputs(fluid('steam')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('steamcracked_propane')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();
    
    CATALYTIC_CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('dimethylformamide')*750)
            .fluidInputs(fluid('hydrogen')*250)
            .fluidOutputs(fluid('formaldehyde')*120)
            .fluidOutputs(fluid('dimethylamine')*160)
            .duration(200)
            .EUt(300)
            .buildAndRegister();