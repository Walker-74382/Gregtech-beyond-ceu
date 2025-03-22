import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('coal_tar')*1000)
                .fluidOutputs(fluid('phenol')*100)
                .fluidOutputs(fluid('naphthalene')*400)
                .fluidOutputs(fluid('anthracene')*100)
                .fluidOutputs(fluid('hydrogen_sulfide')*200)
                .chancedOutput(metaitem('dustCoke')*1, 2000, 20)
                .duration(100)
                .EUt(780)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethyl_benzene')*1000)
                .inputs(metaitem('dustPhthalicAnhydride')* 15)
                .fluidOutputs(fluid('ethylanthraquinone')*1000)
                .fluidOutputs(fluid('water')*1000)
                .duration(200)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethylanthraquinone')*1000)
                .fluidInputs(fluid('hydrogen')*1000)
                .fluidOutputs(fluid('ethylanthrahydroquinone')*1000)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethylanthrahydroquinone')*1000)
                .notConsumable(fluid('anthracene')*1000)
                .fluidInputs(fluid('oxygen')*2000)
                .fluidOutputs(fluid('hydrogen_peroxide')*2000)
                .fluidOutputs(fluid('ethylanthraquinone')*1000)
                .duration(299)
                .EUt(800)
                .buildAndRegister();