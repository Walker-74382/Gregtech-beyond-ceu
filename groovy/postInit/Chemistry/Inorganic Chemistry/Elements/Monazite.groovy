import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        DIGESTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nitric_acid')*1000)
                .inputs(metaitem('dustMonazite'))
                .outputs(metaitem('dustSiliconDioxide'))
                .fluidOutputs(fluid('muddy_monazite_solution')*1000)
                .duration(800)
                .EUt(2000)
                .buildAndRegister();

        DISSOLUTION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('muddy_monazite_solution')*1000)
                .fluidInputs(fluid('distilled_water')*2000)
                .outputs(metaitem('dustMuddyMonaziteOreByproducts'))
                .fluidOutputs(fluid('monazite_solution')*2000)
                .EUt(700)
                .duration(200)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('monazite_solution')*1000)
                .outputs(metaitem('dustMonaziteSulfide'))
                .chancedOutput(metaitem('dustSiliconDioxide') * 1, 3220, 0)
                .chancedOutput(metaitem('dustRutile')* 1, 4000, 0)
                .chancedOutput(metaitem('dustIlmenite')* 1, 800, 90)
                .chancedOutput(metaitem('dustHafniumZirconiumBlend')*1, 4000, 20)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        DILUTION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustMonaziteSulfide'))
                .fluidInputs(fluid('water')*2000)
                .fluidOutputs(fluid('diluted_monazite_sulfide')*2000)
                .EUt(1200)
                .duration(500)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('diluted_monazite_sulfide')*1000)
                .outputs(metaitem('dustThoriumPhoshpateCake')* 2)
                .outputs(metaitem('dustRareEarthFiltrate')* 2)
                .duration(700)
                .EUt(600)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustThoriumPhoshpateCake'))
                .outputs(metaitem('dustThoriumConcentrate'))
                .duration(200)
                .blastFurnaceTemp(1900)
                .EUt(800)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustThoriumConcentrate'))
                .outputs(metaitem('dustThorium'))
                .outputs(metaitem('dustPhosphate'))
                .duration(200)
                .EUt(1700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ammonium_nitrate')*1000)
                .inputs(metaitem('dustRareEarthFiltrate')* 2)
                .fluidOutputs(fluid('neutralized_rare_earth_filtrate')*1000)
                .outputs(metaitem('dustCeriumOxideFiltrate'))
                .duration(200)
                .EUt(900)
                .buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .fluidInputs(fluid('neutralized_rare_earth_filtrate')*1000)
                .fluidOutputs(fluid('cooled_rare_earth_filtrate')*1000)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('cooled_rare_earth_filtrate')*1000)
                .chancedOutput(metaitem('dustEuropiumOxide')*1, 2000, 20)
                .outputs(metaitem('dustMonaziteRarerEarthFiltrate'))
                .duration(800)
                .EUt(200)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustMonaziteRarerEarthFiltrate'))
                .fluidInputs(fluid('chlorine')*1000)
                .outputs(metaitem('dustChlorinatedMonaziteFiltrate'))
                .duration(800)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSalt'))
                .inputs(metaitem('dustChlorinatedMonaziteFiltrate'))
                .outputs(metaitem('dustSaturatedChlorinatedMonaziteFiltrate'))
                .duration(200)
                .EUt(1800)
                .buildAndRegister();

        DRYER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSaturatedChlorinatedMonaziteFiltrate'))
                .outputs(metaitem('dustDriedMonaziteFiltrate'))
                .fluidOutputs(fluid('water')*1000)
                .duration(400)
                .EUt(800)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustDriedMonaziteFiltrate')* 3)
                .outputs(metaitem('dustSamariumOxide')* 2)
                .outputs(metaitem('dustGadoliniumOxide'))
                .duration(90)
                .EUt(700)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustGadoliniumOxide')* 3)
                .outputs(metaitem('dustGadolinium'))
                .fluidOutputs(fluid('oxygen')*2000)
                .duration(200)
                .EUt(780)
                .buildAndRegister();

        DILUTION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCeriumOxideFiltrate'))
                .fluidInputs(fluid('distilled_water')*2000)
                .fluidOutputs(fluid('diluted_cerium_filtrate')*2000)
                .duration(900)
                .EUt(780)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('diluted_cerium_filtrate')*1000)
                .fluidOutputs(fluid('cerium_solution')*1000)
                .outputs(metaitem('dustUraniumFiltrate')*2)
                .duration(190)
                .EUt(700)
                .buildAndRegister();

        SIFTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustUraniumFiltrate'))
                .chancedOutput(metaitem('dustUranium')*1, 3000, 200)
                .chancedOutput(metaitem('dustUranium')*1, 2000, 100)
                .chancedOutput(metaitem('dustUranium')*1, 1200, 200)
                .chancedOutput(metaitem('dustUranium235')*1, 1600, 150)
                .chancedOutput(metaitem('dustUranium235')*1, 1300, 90)
                .chancedOutput(metaitem('dustUranium235')*1, 900, 20)
                .duration(700)
                .EUt(120)
                .buildAndRegister();

        ARC_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustHafniumZirconiumBlend'))
                .outputs(metaitem('dustRoastedHafniumZirconiumSlag'))
                .fluidInputs(fluid('oxygen')*1200)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRoastedHafniumZirconiumSlag'))
                .fluidInputs(fluid('water')*1000)
                .outputs(metaitem('dustWetHafniumZirconiumBlend'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        DRYER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustWetHafniumZirconiumBlend'))
                .fluidOutputs(fluid('water')*1000)
                .outputs(metaitem('dustHafniumOxide')* 2)
                .outputs(metaitem('dustZirconiumOxide')* 2)
                .duration(900)
                .EUt(780)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('dustMuddyMonaziteOreByproducts'))
                .fluidOutputs(fluid('impure_monazite_ore_byproduct_slurry')*1000)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        FROTH_FLOTATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('impure_monazite_ore_byproduct_slurry')*1000)
                .notConsumable(fluid('methyl_isobutyl_carbonyl') * 200)
                .notConsumable(fluid('amido_ethyl_alkyl_imidazole')*200)
                .fluidOutputs(fluid('monazite_ore_byproduct_slurry')*1000)
                .duration(2000)
                .EUt(70)
                .buildAndRegister();

        CLARIFIER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('monazite_ore_byproduct_slurry')*1000)
                .chancedOutput(metaitem('dustThoriumPhoshpateCake')* 2, 3300, 0)
                .chancedOutput(metaitem('dustUraniumFiltrate')* 2, 3300, 0)
                .chancedOutput(metaitem('dustRutherfordiumOxide')* 2, 3300, 0)
                .chancedOutput(metaitem('dustMonaziteSulfide')* 2, 3300, 0)
                .duration(200)
                .EUt(1080)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethylene')*1000)
                .fluidInputs(fluid('palmatic_acid')*1000)
                .fluidOutputs(fluid('steam')*1000)
                .fluidOutputs(fluid('amido_ethyl_alkyl_imidazole') * 1000)
                .duration(700)
                .EUt(800)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethylene')*1000)
                .fluidInputs(fluid('caprylic_acid')*1000)
                .fluidOutputs(fluid('steam')*1000)
                .fluidOutputs(fluid('amido_ethyl_alkyl_imidazole') * 1000)
                .duration(700)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('octanol')*1500)
                .fluidInputs(fluid('acetone')*500)
                .fluidOutputs(fluid('caprylic_acid')*1000)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ziegler_alfol_mixture')*1000)
                .fluidOutputs(fluid('nbutanol')*200)
                .fluidOutputs(fluid('ethanol')*300)
                .fluidOutputs(fluid('hexanol')*150)
                .fluidOutputs(fluid('decanol')*100)
                .fluidOutputs(fluid('octanol')*100)
                .fluidOutputs(fluid('tetradecanol')*50)
                .fluidOutputs(fluid('dodecanol')*60)
                .fluidOutputs(fluid('hexadecanol')*40)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('triethylaluminium')*1000)
                .fluidInputs(fluid('ethylene')*6000)
                .fluidInputs(fluid('ether')*1000)
                .fluidOutputs(fluid('ziegler_alfol_mixture')*1000)
                .outputs(metaitem('dustAluminiumHydroxide')* 7)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('acetone')*1000)
                .fluidInputs(fluid('distilled_water')*15000)
                .fluidInputs(fluid('hexadecanol')*3000)
                .fluidOutputs(fluid('palmatic_acid')*3000)
                .duration(200)
                .EUt(800)
                .buildAndRegister();
                
        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustHafniumOxide')* 2)
                .outputs(metaitem('dustHafnium'))
                .fluidOutputs(fluid('oxygen')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

mods.gregtech.centrifuge.removeByInput(20, [metaitem('dustRareEarth')], null)

// Rare Earth * 1
mods.gregtech.electrolyzer.removeByInput(30, [metaitem('dustMonazite') * 2], null)
// Rare Earth * 1
mods.gregtech.packer.removeByInput(12, [metaitem('dustTinyRareEarth') * 9, metaitem('circuit.integrated').withNbt(['Configuration': 1])], null)
// Rare Earth * 1
mods.gregtech.packer.removeByInput(12, [metaitem('dustSmallRareEarth') * 4, metaitem('circuit.integrated').withNbt(['Configuration': 1])], null)
