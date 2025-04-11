import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('diluted_oil')*1000)
                .fluidOutputs(fluid('salt_water')*200)
                .fluidOutputs(fluid('desalted_oil')*800)
                .EUt(20)
                .duration(120)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('desalted_oil')*1000)
                .fluidOutputs(fluid('sulfuric_gas')*500)
                .fluidOutputs(fluid('sulfuric_gasoline')*100)
                .fluidOutputs(fluid('sulfuric_naphtha')*200)
                .fluidOutputs(fluid('sulfuric_oil_residues')*150)
                .fluidOutputs(fluid('sulfuric_kerosene')*100)
                .fluidOutputs(fluid('sulfuric_diesel')*200)
                .duration(250)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().fluidInputs(fluid('sulfuric_kerosene')*1000)
                .fluidInputs(fluid('hydrogen')*1000).fluidOutputs(fluid('kerosene')*1000)
                .fluidOutputs(fluid('hydrogen_sulfide')*1000).EUt(12).duration(20).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().fluidInputs(fluid('sulfuric_gasoline')*1000)
                .fluidInputs(fluid('hydrogen')*1000).fluidOutputs(fluid('gasoline')*1000)
                .fluidOutputs(fluid('hydrogen_sulfide')*1000).EUt(12).duration(20).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().fluidInputs(fluid('sulfuric_fuel_oil')*1000)
                .fluidInputs(fluid('hydrogen')*1000).fluidOutputs(fluid('fuel_oil')*1000)
                .fluidOutputs(fluid('hydrogen_sulfide')*1000).EUt(12).duration(20).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().fluidInputs(fluid('sulfuric_diesel')*1000)
                .fluidInputs(fluid('hydrogen')*1000).fluidOutputs(fluid('diesel')*1000)
                .fluidOutputs(fluid('hydrogen_sulfide')*1000).EUt(12).duration(20).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(fluid('gasoline')*1000).fluidOutputs(fluid('propane')*200)
                .fluidOutputs(fluid('ethane')*300).fluidOutputs(fluid('methane')*350)
                .fluidOutputs(fluid('butane')*150).EUt(70).duration(200).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(fluid('steamcracked_butane')*1000)
                .fluidOutputs(fluid('ethylene')*350).fluidOutputs(fluid('methane')*150)
                .fluidOutputs(fluid('hydrogen')*100).fluidOutputs(fluid('butadiene')*150)
                .fluidOutputs(fluid('propene')*250).duration(200).EUt(70).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(fluid('steamcracked_ethane')*2000)
                .fluidOutputs(fluid('ethylene')*500).fluidOutputs(fluid('propylene')*200)
                .fluidOutputs(fluid('butane')*100).fluidOutputs(fluid('hydrogen')*200)
                .fluidOutputs(fluid('methane')*500).fluidOutputs(fluid('ethane')*300)
                .fluidOutputs(fluid('nonene')*200).duration(200).EUt(800).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(fluid('fuel_oil')*1000)
                .fluidOutputs(fluid('propane')*150).fluidOutputs(fluid('ethane')*100)
                .fluidOutputs(fluid('methane')*100).fluidOutputs(fluid('hexane')*300)
                .fluidOutputs(fluid('pentane')*250).fluidOutputs(fluid('butane')*250).duration(200)
                .EUt(480).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder().fluidInputs(fluid('kerosene')*1000)
                .fluidInputs(fluid('steam')*1000).fluidOutputs(fluid('steam_cracked_kerosene')*1000)
                .duration(200).EUt(12).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder().fluidInputs(fluid('kerosene')*1000)
                .fluidInputs(fluid('hydrogen')*1000).fluidOutputs(fluid('hydro_cracked_kerosene')*1000)
                .duration(200).EUt(12).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(fluid('hydro_cracked_kerosene')*1000)
                .fluidOutputs(fluid('propane')*100).fluidOutputs(fluid('ethane')*75)
                .fluidOutputs(fluid('methane')*75).fluidOutputs(fluid('gasoline')*600)
                .fluidOutputs(fluid('naphtha')*100).fluidOutputs(fluid('butane')*100).duration(200).EUt(80)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(fluid('steam_cracked_kerosene')*1000)
                .fluidOutputs(fluid('ethylene')*150).fluidOutputs(fluid('methane')*150)
                .fluidOutputs(fluid('propane')*150).fluidOutputs(fluid('propene')*100)
                .fluidOutputs(fluid('ethane')*15).fluidOutputs(fluid('benzene')*125).fluidOutputs(fluid('butene')*80)
                .fluidOutputs(fluid('butadiene')*50).fluidOutputs(fluid('gasoline')*100)
                .fluidOutputs(fluid('naphtha')*125).fluidOutputs(fluid('toluene')*80).duration(200).EUt(80)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(fluid('lightly_steamcracked_naphtha')*1000)
                .fluidOutputs(fluid('ethane')*35)
                .fluidOutputs(fluid('ethylene')*200)
                .fluidOutputs(fluid('methane')*200)
                .fluidOutputs(fluid('butadiene')*150)
                .fluidOutputs(fluid('propane')*15)
                .fluidOutputs(fluid('propene')*200)
                .fluidOutputs(fluid('benzene')*150)
                .fluidOutputs(fluid('fraction_c_5')*150)
                .fluidOutputs(fluid('butene')*80)
                .fluidOutputs(fluid('kerosene')*75)
                .fluidOutputs(fluid('gasoline')*150)
                .fluidOutputs(fluid('toluene')*40)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(fluid('severely_steamcracked_naphtha')*1000)
                .fluidOutputs(fluid('ethane')*65)
                .fluidOutputs(fluid('ethylene')*500)
                .fluidOutputs(fluid('methane')*500)
                .fluidOutputs(fluid('butadiene')*50)
                .fluidOutputs(fluid('propane')*15)
                .fluidOutputs(fluid('propene')*300)
                .fluidOutputs(fluid('benzene')*100)
                .fluidOutputs(fluid('fraction_c_5')*350)
                .fluidOutputs(fluid('butene')*50)
                .fluidOutputs(fluid('kerosene')*25)
                .fluidOutputs(fluid('gasoline')*50)
                .fluidOutputs(fluid('toluene')*20)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder().fluidInputs(fluid('fraction_c_5')*1000)
                .fluidOutputs(fluid('dicyclopentadiene')*200)
                .fluidOutputs(fluid('pentane')*400)
                .fluidOutputs(fluid('isoprene')*400).duration(200).EUt(12).buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('dicyclopentadiene')*1000)
                .fluidOutputs(fluid('cyclopentadiene')*2000)
                .duration(80).EUt(90).buildAndRegister();

        // Desulfurization with CoMoAl Catalyst

        // Dilution of oil

        DILUTION_TANK_RECIPES.recipeBuilder().fluidInputs(fluid('water')*2000)
                .fluidInputs(fluid('oil_heavy')*500).fluidOutputs(fluid('diluted_oil')*2500).EUt(80)
                .duration(100).buildAndRegister();
        DILUTION_TANK_RECIPES.recipeBuilder().fluidInputs(fluid('water')*1500).fluidInputs(fluid('oil_medium')*1000)
                .fluidOutputs(fluid('diluted_oil')*2500).EUt(80).duration(100).buildAndRegister();
        DILUTION_TANK_RECIPES.recipeBuilder().fluidInputs(fluid('water')*1300)
                .fluidInputs(fluid('oil_light')*1200).fluidOutputs(fluid('diluted_oil')*2500).EUt(80)
                .duration(100).buildAndRegister();
        DILUTION_TANK_RECIPES.recipeBuilder().fluidInputs(fluid('water')*1500).fluidInputs(fluid('oil')*1000)
                .fluidOutputs(fluid('diluted_oil')*2500).EUt(80).duration(100).buildAndRegister();

        MIXER_RECIPES.recipeBuilder().fluidInputs(fluid('water')*1500).fluidInputs(fluid('oil_heavy')*500)
                .fluidOutputs(fluid('diluted_oil')*2000).EUt(10).duration(100).buildAndRegister();
        MIXER_RECIPES.recipeBuilder().fluidInputs(fluid('water')*1000).fluidInputs(fluid('oil_medium')*1000)
                .fluidOutputs(fluid('diluted_oil')*2000).EUt(10).duration(100).buildAndRegister();
        MIXER_RECIPES.recipeBuilder().fluidInputs(fluid('water')*800).fluidInputs(fluid('oil_light')*1200)
                .fluidOutputs(fluid('diluted_oil')*2000).EUt(10).duration(100).buildAndRegister();
        MIXER_RECIPES.recipeBuilder().fluidInputs(fluid('water')*1000).fluidInputs(fluid('oil')*1000)
                .fluidOutputs(fluid('diluted_oil')*2000).EUt(10).duration(100).buildAndRegister();

        FISCHER_TROPSCH_REACTOR_RECIPES.recipeBuilder().fluidInputs(fluid('distilled_water')*2000)
                .fluidInputs(fluid('refinery_gas')*8000).notConsumable(metaitem('dustCobaltOxide')* 1)
                .outputs(metaitem('paraffin_wax')* 1).fluidOutputs(fluid('diesel')*1000)
                .fluidOutputs(fluid('gasoline')*500).fluidOutputs(fluid('water')*2000)
                .fluidOutputs(fluid('sulfuric_acid')*1000).fluidOutputs(fluid('ethylene')*1500)
                .fluidOutputs(fluid('ethanol')*1500).fluidOutputs(fluid('methane')*2000)
                .fluidOutputs(fluid('formaldehyde')*500).duration(200).EUt(5000).buildAndRegister();

        VACUUM_DISTILLATION_TOWER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_oil_residues')*1000)
                .fluidOutputs(fluid('lubricant_mixture')*850)
                .fluidOutputs(fluid('sulfuric_fuel_oil')*200)
                .outputs(metaitem('bituminous_residues')* 1)
                .fluidOutputs(fluid('sulfuric_diesel')*200)
                .fluidOutputs(fluid('sulfuric_kerosene')*150)
                .fluidOutputs(fluid('sulfuric_naphtha')*100)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('lubricant_mixture')*1000)
                .fluidOutputs(fluid('slack_wax')*350)
                .fluidOutputs(fluid('lubricant')*650)
                .duration(20)
                .EUt(12)
                .buildAndRegister();

        EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('paraffin_wax'))
                .fluidOutputs(fluid('resin')*1000)
                .duration(20)
                .EUt(8)
                .buildAndRegister();

        CRYSTALLIZATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('slack_wax')*1000)
                .outputs(metaitem('paraffin_wax')* 4)
                .fluidOutputs(fluid('lubricant')*250)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        DISTILLERY_RECIPES.recipeBuilder()
                .fluidInputs(fluid('resin')*100)
                .fluidOutputs(fluid('glue')*100)
                .duration(200)
                .EUt(9)
                .buildAndRegister();

        FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('resin')*100)
                .outputs(metaitem('rubber_drop')* 1)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .inputs(metaitem('rubber_drop')* 1)
                .fluidOutputs(fluid('resin')*100)
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        COKER_RECIPES.recipeBuilder()
                .inputs(metaitem('bituminous_residues')* 1)
                .fluidInputs(fluid('steam')*1000)
                .fluidOutputs(fluid('sulfuric_oil_residues')*150)
                .outputs(metaitem('dustCoke')* 4)
                .duration(200)
                .EUt(99)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethanolamine')*500)
                .fluidInputs(fluid('refinery_gas')*1000)
                .fluidOutputs(fluid('rich_amine')*1500)
                .duration(400)
                .EUt(380)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('rich_amine')*1500)
                .fluidOutputs(fluid('ethanolamine')*500)
                .fluidOutputs(fluid('hydrogen_sulfide')*1000)
                .duration(500)
                .EUt(480)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('severely_steamcracked_naphtha')*1000)
                .fluidOutputs(fluid('ethylene')*500)
                .fluidOutputs(fluid('methane')*500)
                .fluidOutputs(fluid('propene')*300)
                .fluidOutputs(fluid('propane')*15)
                .fluidOutputs(fluid('ethane')*65)
                .fluidOutputs(fluid('benzene')*100)
                .fluidOutputs(fluid('butene')*50)
                .fluidOutputs(fluid('butadiene')*50)
                .fluidOutputs(fluid('heavy_fuel')*25)
                .fluidOutputs(fluid('light_fuel')*50)
                .fluidOutputs(fluid('toluene')*20)
                .fluidOutputs(fluid('cyclooctadiene')*75)
                .duration(500)
                .EUt(480)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('lightly_steamcracked_naphtha')*1000)
                .fluidOutputs(fluid('ethylene')*200)
                .fluidOutputs(fluid('methane')*200)
                .fluidOutputs(fluid('propene')*200)
                .fluidOutputs(fluid('propane')*15)
                .fluidOutputs(fluid('ethane')*35)
                .fluidOutputs(fluid('benzene')*150)
                .fluidOutputs(fluid('butene')*80)
                .fluidOutputs(fluid('butadiene')*150)
                .fluidOutputs(fluid('heavy_fuel')*75)
                .fluidOutputs(fluid('light_fuel')*150)
                .fluidOutputs(fluid('toluene')*40)
                .fluidOutputs(fluid('cyclooctadiene')*100)
                .duration(500)
                .EUt(480)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('gasoline')*1000)
                .fluidOutputs(fluid('nheptane')*150)
                .fluidOutputs(fluid('toluene')*50)
                .fluidOutputs(fluid('noctane')*150)
                .fluidOutputs(fluid('ethylbenzene')*50)
                .fluidOutputs(fluid('mxylene')*50)
                .fluidOutputs(fluid('nhexadecane')*50)
                .fluidOutputs(fluid('propane')*100)
                .fluidOutputs(fluid('ethane')*100)
                .fluidOutputs(fluid('methane')*200)
                .fluidOutputs(fluid('butane')*150)
                .duration(500)
                .EUt(480)
                .buildAndRegister();

        SINTERING_OVEN_RECIPES.recipeBuilder()
                .inputs(metaitem('bituminous_residues')* 1)
                .outputs(metaitem('bitumen_crystal')* 1)
                .duration(500)
                .EUt(480)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*288)
                .inputs(metaitem('dustQuartzSand')* 2)
                .inputs(metaitem('bitumen_crystal')* 2)
                .outputs(metaitem('asphalt')* 6)
                .duration(500)
                .EUt(480)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*288)
                .inputs(metaitem('dustAndesite')* 1)
                .inputs(metaitem('bitumen_crystal')* 1)
                .outputs(metaitem('asphalt')*2)
                .duration(500)
                .EUt(480)
                .buildAndRegister();

        // Sulfuric Heavy Fuel * 15
mods.gregtech.distillation_tower.removeByInput(96, null, [fluid('oil') * 50 * 50])
// Butane Gas * 60
mods.gregtech.distillation_tower.removeByInput(120, null, [fluid('refinery_gas') * 1000 * 1000])




// Fixed Bed Reactor for Hydrotreating Carbons Co-Mo Catalyst




// Fuel Oil Processing
        
        VIS_BREAKER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('fuel_oil')*1000)
                .fluidOutputs(fluid('slack_wax')*600)
                .fluidOutputs(fluid('heavy_oil_residues')*400)
                .duration(400)
                .EUt(70)
                .buildAndRegister();

        VIS_BREAKER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('heavy_oil_residues')*1000)
                .fluidOutputs(fluid('fraction_c_5')*400)
                .fluidOutputs(fluid('desalted_oil')*600)
                .duration(600)
                .EUt(170)
                .buildAndRegister();

//Removals

// Heavy Fuel * 75
mods.gregtech.distillation_tower.removeByInput(120, null, [fluid('lightly_steamcracked_naphtha') * 1000 * 1000])
// Heavy Fuel * 25
mods.gregtech.distillation_tower.removeByInput(120, null, [fluid('severely_steamcracked_naphtha') * 1000 * 1000])
