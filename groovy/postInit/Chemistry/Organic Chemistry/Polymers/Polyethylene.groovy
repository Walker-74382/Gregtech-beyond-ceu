import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('air')*1000)
                .fluidInputs(fluid('ethylene')*144)
                .fluidInputs(fluid('plastic')*144)
                .duration(500)
                .EUt(800)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*1000)
                .fluidInputs(fluid('ethylene')*144)
                .fluidInputs(fluid('plastic')*144)
                .duration(500)
                .EUt(800)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustKaminskyCatalyst'))
                .fluidInputs(fluid('ethylene')*144)
                .fluidInputs(fluid('plastic')*576)
                .duration(500)
                .EUt(800)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPhilipsCatalyst'))
                .fluidInputs(fluid('ethylene')*144)
                .fluidInputs(fluid('plastic')*288)
                .duration(500)
                .EUt(800)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustZieglerNattaCatalyst'))
                .fluidInputs(fluid('ethylene')*144)
                .fluidInputs(fluid('plastic')*432)
                .duration(500)
                .EUt(800)
                .buildAndRegister();
