MIXER_RECIPES = recipemap('mixer')
DRYER_RECIPES = recipemap('dryer_recipes')
POLYMERIZATION_TANK_RECIPES = recipemap('polymerization_tank_recipes')
DEHYDRATOR_RECIPES = recipemap('dehydrator_recipes')
THERMAL_PRESS_RECIPES = recipemap('thermal_press_recipes')


// Raw Styrene-Butadiene Rubber Dust * 27
mods.gregtech.large_chemical_reactor.removeByInput(240, null, [fluid('butadiene') * 3000 * 3000, fluid('styrene') * 1000 * 1000, fluid('air') * 15000 * 15000])
// Raw Styrene-Butadiene Rubber Dust * 41
mods.gregtech.large_chemical_reactor.removeByInput(240, null, [fluid('butadiene') * 3000 * 3000, fluid('styrene') * 1000 * 1000, fluid('oxygen') * 15000 * 15000])

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethanol')*1000)
                .fluidInputs(fluid('butadiene')*3000)
                .fluidInputs(fluid('styrene')*1000)
                .fluidOutputs(fluid('styrene_butadiene_solution')*5000)
                .duration(800)
                .EUt(640)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('polymerized_styrene_butadiene_solution')*5000)
                .fluidOutputs(fluid('diluted_sulfuric_acid')*1000)
                outputs(metaitem('dustRawStyreneButadieneRubber')* 12)
                .duration(1200)
                .EUt(20)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('styrene_butadiene_solution')*1000)
                .notConsumable(fluid('n_butyllithium')*50)
                .fluidOutputs(fluid('polymerized_styrene_butadiene_solution')*1000)
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        THERMAL_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRawStyreneButadieneRubber')* 4)
                .inputs(metaitem('dustSulfur'))
                .notConsumable(metaitem('dustZincite'))
                .outputs(metaitem('ingotStyreneButadieneRubber')* 4)
                .duration(900)
                .EUt(270)
                .buildAndRegister();

        THERMAL_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRawStyreneButadieneRubber')* 4)
                .inputs(metaitem('dustSulfur'))
                .notConsumable(metaitem('dustMagnesia'))
                .outputs(metaitem('ingotStyreneButadieneRubber')* 4)
                .duration(900)
                .EUt(270)
                .buildAndRegister();