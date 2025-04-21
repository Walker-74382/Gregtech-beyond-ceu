import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .fluidInputs(fluid('sodium_formate')*1000)
                .fluidOutputs(fluid('formic_acid')*1000)
                .outputs(metaitem('dustSodiumFormate')* 7)
                .duration(80).EUt(120).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidOutputs(fluid('water')*2000)
                .inputs(metaitem('dustCalciumHydroxide')*5)
                .outputs(metaitem('dustCalciumChloride')*3)
                .fluidInputs(fluid('hydrochloric_acid')*2000)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen_chloride')*1000)
                .inputs(metaitem('dustSilicon'))
                .fluidOutputs(fluid('chloro_silane')*1000)
                .duration(600)
                .EUt(48)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chloro_silane')*1000)
                .notConsumable(metaitem('dustAluminiumChloride'))
                .fluidOutputs(fluid('disproportionated_chloro_silane')*1000)
                .duration(120)
                .EUt(70)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidOutputs(fluid('silane')*1000)
                .fluidOutputs(fluid('chloro_silane')*1000)
                .fluidInputs(fluid('disproportionated_chloro_silane')*2000)
                .duration(120)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('toluene')*1000)
                .fluidInputs(fluid('bromine')*1000)
                .fluidOutputs(fluid('benzyl_bromide')*1000)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustMagnesium')*2)
                .fluidInputs(fluid('benzyl_bromide')*1000)
                .notConsumable(fluid('nitrogen')*1000)
                .notConsumable(metaitem('dustIodine'))
                .fluidInputs(fluid('diethyl_ether')*1000)
                .fluidOutputs(fluid('arylmagnesium_halides')*2000)
                .duration(1287)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('arylmagnesium_halides')*1000)
                .inputs(metaitem('dustPhosphorusTrichloride')*2)
                .inputs(metaitem('dustSodiumHydroxide')*3)
                .fluidInputs(fluid('diethyl_ether')*1000)
                .fluidOutputs(fluid('triaryl_phosphine_solution')*4000)
                .duration(1200)
                .EUt(80)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('triaryl_phosphine_solution')*4000)
                .fluidOutputs(fluid('diethyl_ether')*1000)
                .fluidOutputs(fluid('hydrochloric_acid')*1000)
                .outputs(metaitem('dustSodium'))
                .fluidOutputs(fluid('triaryl_phosphine')*1000)
                .duration(100)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(fluid('triaryl_phosphine')*1000)
                .fluidInputs(fluid('propene')*1000)
                .fluidOutputs(fluid('butanal')*1000)
                .inputs(metaitem('dustRhodium'))
                .duration(890)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethanol')*1000)
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .fluidOutputs(fluid('diethyl_ether')*1000)
                .circuitMeta(2)
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethanol')*1000)
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .fluidOutputs(fluid('ether')*1000)
                .circuitMeta(1)
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(metaitem('dustZeolite'))
                .fluidInputs(fluid('ammonia')*1000)
                .fluidInputs(fluid('nbutanol')*1000)
                .fluidOutputs(fluid('tributylamine')*1000)
                .duration(120)
                .EUt(600)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPotassiumBromide'))
                .outputs(metaitem('dustPotassium'))
                .fluidOutputs(fluid('bromine')*1000)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustBoron'))
                .fluidInputs(fluid('fluorine')*2000)
                .fluidOutputs(fluid('boron_fluoride')*3000)
                .duration(212)
                .EUt(78)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chloroform')*1000)
                .inputs(metaitem('dustSodiumHydroxide')*4)
                .outputs(metaitem('dustSodiumFormate'))
                .outputs(metaitem('dustSalt')*3)
                .fluidOutputs(fluid('water')*2000)
                .duration(200)
                .EUt(780)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen_chloride')*3000)
                .inputs(metaitem('dustPhosphorus'))
                .fluidInputs(fluid('oxygen')*1000)
                .fluidOutputs(fluid('water')*2000)
                .outputs(metaitem('dustPhosphorusTrichloride')*3)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CATALYTIC_REFORMATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*1000)
                .fluidInputs(fluid('ortho_xylene')*1000)
                .notConsumable(metaitem('dustVanadiumPentoxide'))
                .fluidOutputs(fluid('oxidized_ortho_xylene_mixture')*1000)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxidized_ortho_xylene_mixture')*1000)
                .fluidOutputs(fluid('cooled_ortho_xylene_mixture')*1000)
                .duration(200)
                .EUt(670)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('cooled_ortho_xylene_mixture')*1000)
                .outputs(metaitem('dustPhthalicAnhydride')*3)
                .fluidOutputs(fluid('phthalic_acid')*600)
                .duration(500)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*5000)
                .inputs(metaitem('dustVanadium'))
                .outputs(metaitem('dustVanadiumPentoxide'))
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_hydroxide_solution')*1000)
                .fluidOutputs(fluid('water')*1000)
                .outputs(metaitem('dustSodiumHydroxide')*3)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chlorobenzene')*1000)
                .inputs(metaitem('dustPotassiumFluoride'))
                .fluidOutputs(fluid('fluorobenzene')*1000)
                .outputs(metaitem('dustRockSalt'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder() // CSTR
                .fluidInputs(fluid('hydrofluoric_acid')*2000)
                .inputs(metaitem('dustPotassiumCarbonate'))
                .outputs(metaitem('dustPotassiumFluoride')*2)
                .fluidOutputs(fluid('water')*1000)
                .fluidOutputs(fluid('carbon_dioxide')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

// Hydrochloric Acid * 1000
mods.gregtech.chemical_reactor.removeByInput(7, null, [fluid('chlorine') * 1000 * 1000, fluid('hydrogen') * 1000 * 1000])


        //Ethyl Benzene

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethylene')*1000)
                .fluidInputs(fluid('benzene')*1000)
                .notConsumable(metaitem('dustZsm5'))
                .notConsumable(metaitem('fume_hood'))
                .fluidOutputs(fluid('ethyl_benzene')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        //Ethylbenzene Reduction for Styrene

        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(1100)
                .duration(300)
                .EUt(80)
                .fluidInputs(fluid('ethyl_benzene')*1000)
                .notConsumable(metaitem('dustIronOxide'))
                .fluidOutputs(fluid('hydrogen')*2000)
                .fluidOutputs(fluid('styrene')*1000)
                .buildAndRegister();