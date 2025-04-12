import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;



        GRAVITY_SEPARATOR_RECIPES.recipeBuilder()   
                .inputs(metaitem('dustXenotime'))
                .outputs(metaitem('siftedXenotime'))
                .chancedOutput(metaitem('dustZircon')*1, 1000, 0)
                .chancedOutput(metaitem('dustNetherQuartz')*1, 2500, 0)
                .duration(400)
                .EUt(180)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('siftedXenotime')*4)
                .fluidInputs(fluid('distilled_water')*1000)
                .fluidOutputs(fluid('impure_xenotime_slurry')*1000)
                .duration(300)
                .EUt(70)
                .buildAndRegister();

        FROTH_FLOTATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('impure_xenotime_slurry')*1000)
                .notConsumable(metaitem('dustSodiumOleate')*2)
                .notConsumable(fluid('methyl_isobutyl_carbonyl')*500)
                .inputs(metaitem('dustSodiumHydroxide')*2)
                .inputs(metaitem('dustLeadNitrate')*3)
                .notConsumable(metaitem('dustSodiumSilicate')*2)
                .fluidOutputs(fluid('purified_xenotime_slurry')*1000)
                .duration(1300)
                .EUt(570)
                .buildAndRegister();

        CLARIFIER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('purified_xenotime_slurry')*1000)
                .outputs(metaitem('dustSodiumHydroxide')*2)
                .outputs(metaitem('dustLeadNitrate')*3)
                .outputs(metaitem('floatedXenotime')*16)
                .duration(300)
                .EUt(570)
                .buildAndRegister();

        ELECTROMAGNETIC_SEPARATOR_RECIPES.recipeBuilder()
                .inputs(metaitem('floatedXenotime'))
                .outputs(metaitem('concentrateXenotime'))
                .chancedOutput(metaitem('dustMonazite')*1, 2000, 100)
                .duration(300)
                .EUt(570)
                .buildAndRegister();