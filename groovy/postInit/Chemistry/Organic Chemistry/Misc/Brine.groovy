import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('iodized_oil')*2000)
                .fluidOutputs(fluid('oil')*1000)
                .fluidOutputs(fluid('iodized_brine')*1000)
                .duration(129)
                .EUt(80)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('iodized_brine')*1300)
                .fluidOutputs(fluid('brominated_brine')*1000)
                .fluidOutputs(fluid('iodine_slurry')*300)
                .duration(130)
                .EUt(650)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('iodine_slurry')*1000)
                .outputs(metaitem('dustIodine'))
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .fluidInputs(fluid('water')*1000)
                .fluidInputs(fluid('brominated_brine')*1000)
                .fluidOutputs(fluid('crude_bromine_solution')*1000)
                .fluidOutputs(fluid('brine')*1000)
                .duration(2000)
                .EUt(80)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('brominated_brine')*3000)
                .fluidOutputs(fluid('sulfuric_acid')*1000)
                .fluidOutputs(fluid('water')*1000)
                .fluidOutputs(fluid('chlorine')*1000)
                .fluidOutputs(fluid('damp_bromine')*1000)
                .duration(600)
                .EUt(7120)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('damp_bromine')*1000)
                .fluidOutputs(fluid('bromine')*1000)
                .duration(1200)
                .EUt(4800)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('brine')*1000)
                .fluidOutputs(fluid('concentrated_brine')*800)
                .duration(120)
                .EUt(700)
                .buildAndRegister();

        CRYSTALLIZATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('concentrated_brine')*1000)
                .notConsumable(item('zbgt:zbgt_meta_item', 140))
                .outputs(metaitem('dustPotassiumMagnesiumSalts')*30)
                .outputs(metaitem('dustSodiumSalts')*4)
                .outputs(metaitem('dustCalciumSalts')*13)
                .fluidOutputs(fluid('salt_free_brine')*1000)
                .duration(1200)
                .EUt(420)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('salt_free_brine')*1000)
                .fluidOutputs(fluid('boron_free_solution')*1000)
                .inputs(metaitem('boron_retaining_yarn'))
                .outputs(metaitem('boron_saturated_yarn'))
                .duration(120)
                .EUt(500)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('lithium_sieve'))
                .outputs(metaitem('lithium_saturated_sieve_lithium'))
                .fluidInputs(fluid('boron_free_solution')*1000)
                .fluidOutputs(fluid('salt_water')*1000)
                .duration(1200)
                .EUt(670)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('lithium_saturated_sieve_lithium'))
                .outputs(metaitem('lithium_sieve'))
                .fluidInputs(fluid('hydrochloric_acid')*1000)
                .fluidOutputs(fluid('lithium_chloride_solution')*1000)
                .duration(800)
                .EUt(850)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('lithium_chloride_solution')*1000)
                .fluidOutputs(fluid('chlorine')*1000)
                .outputs(metaitem('dustLithium'))
                .duration(210)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .inputs(metaitem('boron_saturated_yarn'))
                .inputs(metaitem('dustSodiumHydroxide')*6)
                .outputs(metaitem('boron_retaining_yarn'))
                .fluidOutputs(fluid('boric_acid')*1000)
                .fluidOutputs(fluid('sodium_sulfide')*1000)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .fluidInputs(fluid('sodium_sulfide')*1000)
                .fluidOutputs(fluid('sodium_sulfide_solution')*2000)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_sulfide_solution')*1000)
                .outputs(metaitem('dustSodiumSulfide'))
                .duration(102)
                .EUt(800)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPotassiumMagnesiumSalts')*15)
                .outputs(metaitem('dustRockSalt')*2)
                .outputs(metaitem('dustMagnesiumSulfate')*6)
                .outputs(metaitem('dustPotassiumSulfate')*7)
                .chancedOutput(metaitem('dustPotassiumFluoride')*1, 880, 0)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPotassiumSulfate')*7)
                .outputs(metaitem('dustPotassium')*2)
                .outputs(metaitem('dustSulfur'))
                .fluidOutputs(fluid('oxygen')*4000)
                .duration(800)
                .EUt(12)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustMagnesiumSulfate')*6)
                .outputs(metaitem('dustMagnesium'))
                .outputs(metaitem('dustSulfur'))
                .fluidOutputs(fluid('oxygen')*4000)
                .duration(800)
                .EUt(12)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPotassiumFluoride')*2)
                .outputs(metaitem('dustPotassium'))
                .fluidOutputs(fluid('fluorine')*1000)
                .duration(800)
                .EUt(12)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSodiumSalts')*2)
                .outputs(metaitem('dustSalt')*2)
                .chancedOutput(metaitem('dustSodiumFluoride')*1, 33, 1)
                .duration(200)
                .EUt(60)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSodiumFluoride')*2)
                .outputs(metaitem('dustSodium'))
                .fluidOutputs(fluid('fluorine')*1000)
                .duration(60)
                .EUt(80)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCalciumSalts')*13)
                .outputs(metaitem('dustGypsum')*8)
                .outputs(metaitem('dustCalcite')*5)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('lithium_foam_base'))
                .fluidInputs(fluid('nomex')*1000)
                .outputs(metaitem('lithium_sieve'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();
