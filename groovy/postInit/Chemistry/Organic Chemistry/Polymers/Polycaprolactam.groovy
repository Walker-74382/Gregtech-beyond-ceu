import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCaprolactam'))
                .fluidInputs(fluid('nitrogen')*1000)
                .outputs(metaitem('dustNitrogenizedCaprolactam'))
                .duration(900)
                .EUt(780)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustNitrogenizedCaprolactam'))
                .notConsumable(fluid('butanal')*1000)
                .outputs(metaitem('dustPrePolymerizedCaprolactam'))
                .blastFurnaceTemp(1500)
                .EUt(800)
                .duration(120)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPrePolymerizedCaprolactam'))
                .notConsumable(metaitem('dustKaminskyCatalyst'))
                .outputs(metaitem('dustPolycaprolactam'))
                .duration(120)
                .EUt(670)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPrePolymerizedCaprolactam'))
                .notConsumable(metaitem('dustPhilipsCatalyst'))
                .outputs(metaitem('dustPolycaprolactam'))
                .duration(120)
                .EUt(670)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPrePolymerizedCaprolactam'))
                .notConsumable(metaitem('dustZieglerNattaCatalyst'))
                .outputs(metaitem('dustPolycaprolactam'))
                .duration(120)
                .EUt(670)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPrePolymerizedCaprolactam'))
                .fluidInputs(fluid('oxygen')*1000)
                .outputs(metaitem('dustPolycaprolactam'))
                .duration(120)
                .EUt(670)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPrePolymerizedCaprolactam'))
                .fluidInputs(fluid('air')*1000)
                .outputs(metaitem('dustPolycaprolactam'))
                .duration(120)
                .EUt(670)
                .buildAndRegister();