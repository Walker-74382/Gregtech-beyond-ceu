import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('air')*1000)
                .fluidInputs(fluid('ethylene')*144)
                .fluidInputs(fluid('polyethylene')*144)
                .duration(500)
                .EUt(800)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*1000)
                .fluidInputs(fluid('ethylene')*144)
                .fluidInputs(fluid('polyethylene')*144)
                .duration(500)
                .EUt(800)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('KaminskyCatalyst'))
                .fluidInputs(fluid('ethylene')*144)
                .fluidInputs(fluid('polyethylene')*576)
                .duration(500)
                .EUt(800)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('PhilipsCatalyst'))
                .fluidInputs(fluid('ethylene')*144)
                .fluidInputs(fluid('polyethylene')*288)
                .duration(500)
                .EUt(800)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('ZieglerNattaCatalyst'))
                .fluidInputs(fluid('ethylene')*144)
                .fluidInputs(fluid('polyethylene')*432)
                .duration(500)
                .EUt(800)
                .buildAndRegister();
