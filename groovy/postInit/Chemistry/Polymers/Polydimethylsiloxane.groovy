import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .fluidInputs(fluid('dimethyldichlorosilane')*1000)
                .outputs(metaitem('dustDimethylsiloxane')* 3)
                .fluidOutputs(fluid('diluted_hydrochloric_acid')*1000)
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        THERMAL_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPolydimethylsiloxane')* 9)
                .inputs(metaitem('dustSulfur'))
                .fluidOutputs(fluid('silicone_rubber')*1296)
                .EUt(700)
                .duration(100)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustDimethylsiloxane'))
                .notConsumable(metaitem('dustKaminskyCatalyst'))
                .outputs(metaitem('dustPolydimethylsiloxane'))
                .duration(120)
                .EUt(120)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustDimethylsiloxane'))
                .notConsumable(metaitem('dustPhilipsCatalyst'))
                .outputs(metaitem('dustPolydimethylsiloxane'))
                .duration(120)
                .EUt(120)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustDimethylsiloxane'))
                .notConsumable(metaitem('dustZieglerNattaCatalyst'))
                .outputs(metaitem('dustPolydimethylsiloxane'))
                .duration(120)
                .EUt(120)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustDimethylsiloxane'))
                .fluidInputs(fluid('oxygen')*1000)
                .outputs(metaitem('dustPolydimethylsiloxane'))
                .duration(120)
                .EUt(120)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustDimethylsiloxane'))
                .fluidInputs(fluid('air')*1000)
                .outputs(metaitem('dustPolydimethylsiloxane'))
                .duration(120)
                .EUt(120)
                .buildAndRegister();