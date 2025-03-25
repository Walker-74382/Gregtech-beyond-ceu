import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        MIXER_RECIPES.recipeBuilder()
                .duration(160)
                .EUt(960)
                .notConsumable(metaitem('dustNickel'))
                .fluidInputs(fluid('methanol')*1000)
                .fluidInputs(fluid('ammonia')*1000)
                .fluidOutputs(fluid('amine_mixture')*2000)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .duration(200)
                .EUt(480)
                .fluidInputs(fluid('amine_mixture')*2000)
                .fluidOutputs(fluid('trimethylamine')*500)
                .fluidOutputs(fluid('dimethylamine')*800)
                .fluidOutputs(fluid('methylamine')*700)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .duration(180)
                .EUt(1920)
                .fluidInputs(fluid('sodium_tungstate')*12000)
                .fluidInputs(fluid('phosphoric_acid')*1000)
                .outputs(metaitem('dustSodiumPhosphotungstate')* 56)
                .outputs(metaitem('dustSodiumHydroxide')* 3)
                .outputs(metaitem('dustSodiumOxide')* 30)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(160)
                .EUt(480)
                .fluidInputs(fluid('propene')*1000)
                .fluidInputs(fluid('water')*1000)
                .fluidOutputs(fluid('isopropyl_alcohol')*1000)
                .notConsumable(metaitem('dustSodiumPhosphomolybdate'))
                .notConsumable(metaitem('dustSodiumPhosphotungstate'))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(100)
                .EUt(120)
                .inputs(metaitem('dustIridiumChloride')* 8)
                .fluidInputs(fluid('cyclooctadiene')*2000)
                .outputs(metaitem('dustIridiumCyclooctadienylChlorideDimer')* 44)
                .fluidOutputs(fluid('chlorine')*4000)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(140)
                .EUt(500)
                .inputs(metaitem('dustLithium')* 4)
                .fluidInputs(fluid('water')*2000)
                .fluidInputs(fluid('phosphorus_trichloride')*1000)
                .fluidInputs(fluid('isopropyl_alcohol')*2000)
                .outputs(metaitem('dustLithiumChloride')* 4)
                .fluidOutputs(fluid('lithium_hydroxide_solution')*2000)
                .fluidOutputs(fluid('chlorodiisopropyl_phosphine')*1000)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .duration(200)
                .EUt(1200)
                .inputs(metaitem('dustIridiumCyclooctadienylChlorideDimer')* 22)
                .fluidInputs(fluid('chlorodiisopropyl_phosphine')*2000)
                .fluidInputs(fluid('mercaptophenol')*1000)
                .notConsumable(metaitem('dustBerylliumFluoride'))
                .outputs(metaitem('dustDehydrogenationCatalyst')* 56)
                .fluidOutputs(fluid('cyclooctadiene')*2000)
                .fluidOutputs(fluid('hydrochloric_acid')*2000)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(190)
                .EUt(120)
                .notConsumable(metaitem('dustDehydrogenationCatalyst'))
                .fluidInputs(fluid('butene')*1000)
                .fluidInputs(fluid('octane')*1000)
                .fluidOutputs(fluid('butane')*1000)
                .fluidOutputs(fluid('oct_1_ene')*1000)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .duration(300)
                .EUt(480)
                .fluidInputs(fluid('trimethylamine')*1000)
                .fluidInputs(fluid('bromine')*1000)
                .fluidInputs(fluid('octane')*1000)
                .fluidInputs(fluid('oct_1_ene')*1000)
                .fluidOutputs(fluid('cetane_trimethyl_ammonium_bromide')*1000)
                .fluidOutputs(fluid('hydrogen')*1000)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('styrene')*1000)
                .fluidInputs(fluid('cetane_trimethyl_ammonium_bromide')*20)
                .notConsumable(metaitem('dustAmmoniumPersulfate'))
                .outputs(metaitem('dustPolystyreneNanoParticles'))
                .EUt(480)
                .duration(50)
                .buildAndRegister();