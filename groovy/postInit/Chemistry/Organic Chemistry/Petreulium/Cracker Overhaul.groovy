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

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('kerosene')*1000)
            .fluidInputs(fluid('hydrogen')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('hydro_cracked_kerosene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('heavy_fuel')*1000)
            .fluidInputs(fluid('hydrogen')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .circuitMeta(1)
            .fluidOutputs(fluid('lightly_hydrocracked_heavy_fuel')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('heavy_fuel')*1000)
            .fluidInputs(fluid('hydrogen')*6000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('severely_hydrocracked_heavy_fuel')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('light_fuel')*1000)
            .fluidInputs(fluid('hydrogen')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .circuitMeta(1)
            .fluidOutputs(fluid('lightly_hydrocracked_light_fuel')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('light_fuel')*1000)
            .fluidInputs(fluid('hydrogen')*6000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('severely_hydrocracked_light_fuel')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('naphtha')*1000)
            .fluidInputs(fluid('hydrogen')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .circuitMeta(1)
            .fluidOutputs(fluid('lightly_hydrocracked_naphtha')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('naphtha')*1000)
            .fluidInputs(fluid('hydrogen')*6000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('severely_hydrocracked_naphtha')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('refinery_gas')*1000)
            .fluidInputs(fluid('hydrogen')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .circuitMeta(1)
            .fluidOutputs(fluid('lightly_hydrocracked_gas')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('refinery_gas')*1000)
            .fluidInputs(fluid('hydrogen')*6000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('severely_hydrocracked_gas')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('ethane')*1000)
            .fluidInputs(fluid('hydrogen')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('hydrocracked_ethane')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('ethylene')*1000)
            .fluidInputs(fluid('hydrogen')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('hydrocracked_ethylene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('butane')*1000)
            .fluidInputs(fluid('hydrogen')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('hydrocracked_butane')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('butene')*1000)
            .fluidInputs(fluid('hydrogen')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('hydrocracked_butene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('butadiene')*1000)
            .fluidInputs(fluid('hydrogen')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('hydrocracked_butadiene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('propene')*1000)
            .fluidInputs(fluid('hydrogen')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('hydrocracked_propene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
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

    

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('kerosene')*1000)
            .fluidInputs(fluid('steam')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('steam_cracked_kerosene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('heavy_fuel')*1000)
            .fluidInputs(fluid('steam')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .circuitMeta(1)
            .fluidOutputs(fluid('lightly_steamcracked_heavy_fuel')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('heavy_fuel')*1000)
            .fluidInputs(fluid('steam')*6000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(3)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('severely_steamcracked_heavy_fuel')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();


    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('light_fuel')*1000)
            .fluidInputs(fluid('steam')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .circuitMeta(1)
            .fluidOutputs(fluid('lightly_steamcracked_light_fuel')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('light_fuel')*1000)
            .fluidInputs(fluid('steam')*6000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(3)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('severely_steamcracked_light_fuel')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();


    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('naphtha')*1000)
            .fluidInputs(fluid('steam')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .circuitMeta(1)
            .fluidOutputs(fluid('lightly_steamcracked_naphtha')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('naphtha')*1000)
            .fluidInputs(fluid('steam')*6000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(3)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('severely_steamcracked_naphtha')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();


    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('refinery_gas')*1000)
            .fluidInputs(fluid('steam')*2000)
            .inputs(metaitem('cracking_catalyst'))
            .outputs(metaitem('used_cracking_catalyst'))
            .circuitMeta(1)
            .fluidOutputs(fluid('lightly_steamcracked_gas')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('refinery_gas')*1000)
            .fluidInputs(fluid('steam')*6000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(3)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('severely_steamcracked_gas')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('ethane')*1000)
            .fluidInputs(fluid('steam')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('steamcracked_ethane')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('ethylene')*1000)
            .fluidInputs(fluid('steam')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('steamcracked_ethylene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('butane')*1000)
            .fluidInputs(fluid('steam')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('steamcracked_butane')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('butene')*1000)
            .fluidInputs(fluid('steam')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('steamcracked_butene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('butadiene')*1000)
            .fluidInputs(fluid('steam')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('steamcracked_butadiene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('propene')*1000)
            .fluidInputs(fluid('steam')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('steamcracked_propene')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('propane')*1000)
            .fluidInputs(fluid('steam')*4000)
            .inputs(metaitem('cracking_catalyst'))
            .circuitMeta(2)
            .outputs(metaitem('used_cracking_catalyst'))
            .fluidOutputs(fluid('steamcracked_propane')*1000)
            .duration(200)
            .EUt(300)
            .buildAndRegister();
    
    CRACKING_RECIPES.recipeBuilder()
            .fluidInputs(fluid('dimethylformamide')*750)
            .fluidInputs(fluid('hydrogen')*250)
            .fluidOutputs(fluid('formaldehyde')*120)
            .fluidOutputs(fluid('dimethylamine')*160)
            .duration(200)
            .EUt(300)
            .buildAndRegister();

// Hydro-Cracked Ethane Gas * 250
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('ethane') * 500 * 500, fluid('hydrogen') * 2000 * 2000])
// Steam-Cracked Ethane Gas * 500
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('ethane') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Steam-Cracked Ethylene Gas * 500
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('ethylene') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Hydro-Cracked Ethylene Gas * 250
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('ethylene') * 500 * 500, fluid('hydrogen') * 2000 * 2000])
// Hydro-Cracked Propene Gas * 250
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('propene') * 500 * 500, fluid('hydrogen') * 2000 * 2000])
// Hydro-Cracked Propane Gas * 250
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('propane') * 500 * 500, fluid('hydrogen') * 2000 * 2000])
// Steam-Cracked Propene Gas * 500
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('propene') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Steam-Cracked Propane Gas * 500
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('propane') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Steam-Cracked Butane Gas * 500
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('butane') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Steam-Cracked Butadiene Gas * 500
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('butadiene') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Lightly Steam-Cracked Heavy Fuel * 500
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('heavy_fuel') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Severely Steam-Cracked Heavy Fuel * 500
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('heavy_fuel') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Lightly Steam-Cracked Light Fuel * 500
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('light_fuel') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Severely Steam-Cracked Light Fuel * 500
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('light_fuel') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Lightly Steam-Cracked Naphtha * 500
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('naphtha') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Severely Steam-Cracked Naphtha * 500
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('naphtha') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Lightly Steam-Cracked Refinery Gas Gas * 500
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('refinery_gas') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Severely Steam-Cracked Refinery Gas Gas * 500
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('refinery_gas') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Severely Hydro-Cracked Light Fuel * 250
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('light_fuel') * 500 * 500, fluid('hydrogen') * 3000 * 3000])
// Severely Hydro-Cracked Naphtha * 250
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('naphtha') * 500 * 500, fluid('hydrogen') * 3000 * 3000])
// Hydro-Cracked Butene Gas * 250
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('butene') * 500 * 500, fluid('hydrogen') * 2000 * 2000])
// Hydro-Cracked Butadiene Gas * 250
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('butadiene') * 500 * 500, fluid('hydrogen') * 2000 * 2000])
// Lightly Hydro-Cracked Light Fuel * 250
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('light_fuel') * 500 * 500, fluid('hydrogen') * 1000 * 1000])
// Lightly Hydro-Cracked Refinery Gas Gas * 250
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('refinery_gas') * 500 * 500, fluid('hydrogen') * 1000 * 1000])
// Severely Hydro-Cracked Refinery Gas Gas * 250
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('refinery_gas') * 500 * 500, fluid('hydrogen') * 3000 * 3000])
// Hydro-Cracked Butane Gas * 250
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('butane') * 500 * 500, fluid('hydrogen') * 2000 * 2000])
// Lightly Hydro-Cracked Heavy Fuel * 250
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('heavy_fuel') * 500 * 500, fluid('hydrogen') * 1000 * 1000])
// Lightly Hydro-Cracked Naphtha * 250
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('naphtha') * 500 * 500, fluid('hydrogen') * 1000 * 1000])
// Severely Hydro-Cracked Heavy Fuel * 250
mods.gregtech.chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('heavy_fuel') * 500 * 500, fluid('hydrogen') * 3000 * 3000])

//LCR



// Hydro-Cracked Ethane Gas * 250
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('ethane') * 500 * 500, fluid('hydrogen') * 2000 * 2000])
// Steam-Cracked Ethane Gas * 500
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('ethane') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Steam-Cracked Ethylene Gas * 500
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('ethylene') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Hydro-Cracked Ethylene Gas * 250
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('ethylene') * 500 * 500, fluid('hydrogen') * 2000 * 2000])
// Hydro-Cracked Propene Gas * 250
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('propene') * 500 * 500, fluid('hydrogen') * 2000 * 2000])
// Hydro-Cracked Propane Gas * 250
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('propane') * 500 * 500, fluid('hydrogen') * 2000 * 2000])
// Steam-Cracked Propene Gas * 500
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('propene') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Steam-Cracked Propane Gas * 500
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('propane') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Steam-Cracked Butane Gas * 500
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('butane') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Steam-Cracked Butadiene Gas * 500
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('butadiene') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Lightly Steam-Cracked Heavy Fuel * 500
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('heavy_fuel') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Severely Steam-Cracked Heavy Fuel * 500
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('heavy_fuel') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Lightly Steam-Cracked Light Fuel * 500
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('light_fuel') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Severely Steam-Cracked Light Fuel * 500
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('light_fuel') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Lightly Steam-Cracked Naphtha * 500
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('naphtha') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Severely Steam-Cracked Naphtha * 500
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('naphtha') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Lightly Steam-Cracked Refinery Gas Gas * 500
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('refinery_gas') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Severely Steam-Cracked Refinery Gas Gas * 500
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('refinery_gas') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Severely Hydro-Cracked Light Fuel * 250
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('light_fuel') * 500 * 500, fluid('hydrogen') * 3000 * 3000])
// Severely Hydro-Cracked Naphtha * 250
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('naphtha') * 500 * 500, fluid('hydrogen') * 3000 * 3000])
// Hydro-Cracked Butene Gas * 250
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('butene') * 500 * 500, fluid('hydrogen') * 2000 * 2000])
// Hydro-Cracked Butadiene Gas * 250
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('butadiene') * 500 * 500, fluid('hydrogen') * 2000 * 2000])
// Lightly Hydro-Cracked Light Fuel * 250
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('light_fuel') * 500 * 500, fluid('hydrogen') * 1000 * 1000])
// Lightly Hydro-Cracked Refinery Gas Gas * 250
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('refinery_gas') * 500 * 500, fluid('hydrogen') * 1000 * 1000])
// Severely Hydro-Cracked Refinery Gas Gas * 250
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('refinery_gas') * 500 * 500, fluid('hydrogen') * 3000 * 3000])
// Hydro-Cracked Butane Gas * 250
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('butane') * 500 * 500, fluid('hydrogen') * 2000 * 2000])
// Lightly Hydro-Cracked Heavy Fuel * 250
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('heavy_fuel') * 500 * 500, fluid('hydrogen') * 1000 * 1000])
// Lightly Hydro-Cracked Naphtha * 250
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('naphtha') * 500 * 500, fluid('hydrogen') * 1000 * 1000])
// Severely Hydro-Cracked Heavy Fuel * 250
mods.gregtech.large_chemical_reactor.removeByInput(30, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('heavy_fuel') * 500 * 500, fluid('hydrogen') * 3000 * 3000])


//CRACKER

// Hydro-Cracked Propene Gas * 1000
mods.gregtech.cracker.removeByInput(180, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('propene') * 1000 * 1000, fluid('hydrogen') * 4000 * 4000])
// Hydro-Cracked Propane Gas * 1000
mods.gregtech.cracker.removeByInput(180, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('propane') * 1000 * 1000, fluid('hydrogen') * 4000 * 4000])
// Steam-Cracked Propene Gas * 1000
mods.gregtech.cracker.removeByInput(360, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('propene') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Steam-Cracked Propane Gas * 1000
mods.gregtech.cracker.removeByInput(360, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('propane') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Steam-Cracked Butane Gas * 1000
mods.gregtech.cracker.removeByInput(360, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('butane') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Steam-Cracked Butene Gas * 1000
mods.gregtech.cracker.removeByInput(360, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('butene') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Steam-Cracked Butadiene Gas * 1000
mods.gregtech.cracker.removeByInput(360, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('butadiene') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Lightly Steam-Cracked Heavy Fuel * 1000
mods.gregtech.cracker.removeByInput(240, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('heavy_fuel') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Severely Steam-Cracked Heavy Fuel * 1000
mods.gregtech.cracker.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('heavy_fuel') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Lightly Steam-Cracked Light Fuel * 1000
mods.gregtech.cracker.removeByInput(240, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('light_fuel') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Severely Steam-Cracked Light Fuel * 1000
mods.gregtech.cracker.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('light_fuel') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Lightly Steam-Cracked Naphtha * 1000
mods.gregtech.cracker.removeByInput(240, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('naphtha') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Severely Steam-Cracked Naphtha * 1000
mods.gregtech.cracker.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('naphtha') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Lightly Steam-Cracked Refinery Gas Gas * 1000
mods.gregtech.cracker.removeByInput(240, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('refinery_gas') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Severely Steam-Cracked Refinery Gas Gas * 1000
mods.gregtech.cracker.removeByInput(480, [metaitem('circuit.integrated').withNbt(['Configuration': 3])], [fluid('refinery_gas') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Hydro-Cracked Butane Gas * 1000
mods.gregtech.cracker.removeByInput(180, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('butane') * 1000 * 1000, fluid('hydrogen') * 4000 * 4000])
// Lightly Hydro-Cracked Heavy Fuel * 1000
mods.gregtech.cracker.removeByInput(120, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('heavy_fuel') * 1000 * 1000, fluid('hydrogen') * 2000 * 2000])
// Lightly Hydro-Cracked Naphtha * 1000
mods.gregtech.cracker.removeByInput(120, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('naphtha') * 1000 * 1000, fluid('hydrogen') * 2000 * 2000])
// Severely Hydro-Cracked Heavy Fuel * 1000
mods.gregtech.cracker.removeByInput(240, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('heavy_fuel') * 1000 * 1000, fluid('hydrogen') * 6000 * 6000])
// Hydro-Cracked Ethane Gas * 1000
mods.gregtech.cracker.removeByInput(180, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('ethane') * 1000 * 1000, fluid('hydrogen') * 4000 * 4000])
// Steam-Cracked Ethane Gas * 1000
mods.gregtech.cracker.removeByInput(360, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('ethane') * 1000 * 1000, fluid('steam') * 1000 * 1000])
// Hydro-Cracked Ethylene Gas * 1000
mods.gregtech.cracker.removeByInput(180, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('ethylene') * 1000 * 1000, fluid('hydrogen') * 4000 * 4000])
// Steam-Cracked Ethylene Gas * 1000
mods.gregtech.cracker.removeByInput(360, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('ethylene') * 1000 * 1000, fluid('steam') * 1000 * 1000])



// Hydro-Cracked Butene Gas * 1000
mods.gregtech.cracker.removeByInput(180, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('butene') * 1000 * 1000, fluid('hydrogen') * 4000 * 4000])
// Hydro-Cracked Butadiene Gas * 1000
mods.gregtech.cracker.removeByInput(180, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('butadiene') * 1000 * 1000, fluid('hydrogen') * 4000 * 4000])
// Lightly Hydro-Cracked Light Fuel * 1000
mods.gregtech.cracker.removeByInput(120, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('light_fuel') * 1000 * 1000, fluid('hydrogen') * 2000 * 2000])
// Severely Hydro-Cracked Light Fuel * 1000
mods.gregtech.cracker.removeByInput(240, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('light_fuel') * 1000 * 1000, fluid('hydrogen') * 6000 * 6000])
// Severely Hydro-Cracked Naphtha * 1000
mods.gregtech.cracker.removeByInput(240, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('naphtha') * 1000 * 1000, fluid('hydrogen') * 6000 * 6000])
// Lightly Hydro-Cracked Refinery Gas Gas * 1000
mods.gregtech.cracker.removeByInput(120, [metaitem('circuit.integrated').withNbt(['Configuration': 1])], [fluid('refinery_gas') * 1000 * 1000, fluid('hydrogen') * 2000 * 2000])
// Severely Hydro-Cracked Refinery Gas Gas * 1000
mods.gregtech.cracker.removeByInput(240, [metaitem('circuit.integrated').withNbt(['Configuration': 2])], [fluid('refinery_gas') * 1000 * 1000, fluid('hydrogen') * 6000 * 6000])
