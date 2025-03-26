import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;



        FORMING_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('foilCopper')*4)
                .inputs(metaitem('platePlastic'))
                .outputs(metaitem('board.plastic'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('foilCopper')*4)
                .inputs(metaitem('platePolyvinylChloride'))
                .outputs(metaitem('board.plastic')*2)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('foilCopper')*4)
                .inputs(metaitem('platePolytetrafluoroethylene'))
                .outputs(metaitem('board.plastic')*4)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('foilCopper')*4)
                .inputs(metaitem('platePolybenzimidazole'))
                .outputs(metaitem('board.plastic')*8)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('iron_iii_chloride') * 100)
                .inputs(metaitem('board.plastic'))
                .outputs(metaitem('circuit_board.plastic'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_bisulfate_solution')*100)
                .inputs(metaitem('board.plastic'))
                .outputs(metaitem('circuit_board.plastic'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        
        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('dustSodiumBisulfate')*3)
                .fluidOutputs(fluid('sodium_bisulfate_solution')*1000)
                .duration(190)
                .EUt(70)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_bisulfate_solution')*1000)
                .outputs(metaitem('dustSodiumBisulfate')*3)
                .fluidOutputs(fluid('water')*1000)
                .duration(120)
                .EUt(90)
                .buildAndRegister();

