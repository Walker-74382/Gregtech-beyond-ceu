import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('tetrafluoroethylene')*144)
                .notConsumable(metaitem('dustKaminskyCatalyst'))
                .fluidOutputs(fluid('polytetrafluoroethylene')*576)
                .duration(120)
                .EUt(670)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('tetrafluoroethylene')*144)
                .notConsumable(metaitem('dustPhilipsCatalyst'))
                .fluidOutputs(fluid('polytetrafluoroethylene')*288)
                .duration(120)
                .EUt(670)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('tetrafluoroethylene')*144)
                .notConsumable(metaitem('dustZieglerNattaCatalyst'))
                .fluidOutputs(fluid('polytetrafluoroethylene')*432)
                .duration(120)
                .EUt(670)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('tetrafluoroethylene')*144)
                .fluidInputs(fluid('oxygen')*1000)
                .fluidOutputs(fluid('polytetrafluoroethylene')*144)
                .duration(120)
                .EUt(670)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('tetrafluoroethylene')*144)
                .fluidInputs(fluid('air')*1000)
                .fluidOutputs(fluid('polytetrafluoroethylene')*144)
                .duration(120)
                .EUt(670)
                .buildAndRegister();