import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustIsophthalicAcid')*18)
                .fluidInputs(fluid('phosgene')*2000)
                .outputs(metaitem('dustIsophthaloylChloride')*16)
                .fluidOutputs(fluid('carbon_dioxide')*2000)
                .fluidOutputs(fluid('hydrogen_chloride')*2000)
                .duration(200)
                .EUt(890)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustOneThreeDinitrobenzene'))
                .fluidInputs(fluid('hydrogen')*4000)
                .notConsumable(metaitem('dustActivatedRaneyNickel'))
                .outputs(metaitem('dustmPhenyleneDiamine')*16)
                .duration(100)
                .EUt(80)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustNickel'))
                .fluidInputs(fluid('aluminium')*144)
                .outputs(metaitem('dustRaneyNickel'))
                .duration(600)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRaneyNickel')* 4)
                .inputs(metaitem('dustSodiumHydroxide')*6)
                .fluidInputs(fluid('water')*6000)
                .fluidOutputs(fluid('hydrogen')*6000)
                .outputs(metaitem('dustSodiumAluminate')*20)
                .outputs(metaitem('dustActivatedRaneyNickel')*4)
                .duration(900)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nitrobenzene')*1000)
                .fluidInputs(fluid('nitrationMixture')*1000)
                .outputs(metaitem('dustdinitrobenzeneMixture')*2)
                .duration(120)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_hydroxide_solution')*100)
                .inputs(metaitem('dustDinitrobenzeneMixture'))
                .outputs(metaitem('dustOneThreeDinitrobenzene'))
                .EUt(80)
                .duration(120)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustm_phenylene_diamine')*4)
                .inputs(metaitem('dustisophthaloyl_chloride')*4)
                .fluidOutputs(fluid('nomex_polymerization_base')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        TEXTILE_FACTORY_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nomex_polymerization_base')*1000)
                .input(ROTARRY_SPINNING_WHISKER)
                .outputs(metaitem('dustplateNomex'))
                .duration(200)
                .EUt(1200)
                .buildAndRegister();