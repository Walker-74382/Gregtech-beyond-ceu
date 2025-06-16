import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;




        BIO_REACTOR_RECIPES.recipeBuilder()
                .notConsumable(fluid('yeem_solution')*1000)
                .notConsumable(fluid('bacterial_growth_medium')*1000)
                .fluidOutputs(fluid('depleted_bacterial_growth_medium')*1000)
                .inputs(metaitem('dustCupriavidusNecator')* 1)
                .outputs(metaitem('dustCupriavidusNecator')* 2)
                .duration(800)
                .EUt(20000)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .notConsumable(fluid('yeem_solution')*1000)
                .notConsumable(fluid('bacterial_growth_medium')*1000)
                .fluidOutputs(fluid('depleted_bacterial_growth_medium')*1000)
                .inputs(metaitem('dustIriditus')* 1)
                .outputs(metaitem('dustIriditus')* 2)
                .duration(800)
                .EUt(20000)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .notConsumable(fluid('yeem_solution')*1000)
                .notConsumable(fluid('bacterial_growth_medium')*1000)
                .fluidOutputs(fluid('depleted_bacterial_growth_medium')*1000)
                .inputs(metaitem('dustEschericiaColi')* 1)
                .outputs(metaitem('dustEschericiaColi')* 2)
                .duration(800)
                .EUt(20000)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .notConsumable(fluid('yeem_solution')*1000)
                .notConsumable(fluid('bacterial_growth_medium')*1000)
                .fluidOutputs(fluid('depleted_bacterial_growth_medium')*1000)
                .inputs(metaitem('dustRhizobium')* 1)
                .outputs(metaitem('dustRhizobium')* 2)
                .duration(800)
                .EUt(20000)
                .buildAndRegister();

        MICROSCOPE_RECIPES.recipeBuilder()
                .inputs(item('minecraft:dirt', 2))
                .outputs(metaitem('dustDirt'))
                .chancedOutput(metaitem('dustCupriavidusNecatorBacteriaSample')*1, 200, 0)
                .duration(1200)
                .EUt(400)
                .buildAndRegister();