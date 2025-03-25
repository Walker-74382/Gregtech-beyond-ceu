import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustBauxite'))
                .outputs(metaitem('dustRoastedBauxite'))
                .fluidInputs(fluid('steam')*1000)
                .duration(200)
                .EUt(2)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRoastedBauxite')* 5)
                .fluidInputs(fluid('oxygen')*1000)
                .outputs(metaitem('ingotAluminium')*2)
                .blastFurnaceTemp(1200)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nitrogen')*1000)
                .circuitMeta(2)
                .inputs(metaitem('dustAluminium'))
                .outputs(metaitem('ingotAluminium'))
                .duration(360)
                .EUt(140)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .circuitMeta(1)
                .inputs(metaitem('dustAluminium'))
                .outputs(metaitem('ingotAluminium'))
                .duration(580)
                .EUt(190)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRoastedBauxite')*2)
                .fluidInputs(fluid('hydrochloric_acid')*1000)
                .outputs(metaitem('dustLeachedBauxite'))
                .chancedOutput(metaitem('dustRedMudConcentrate') * 1, 200, 20)
                .chancedOutput(metaitem('dustAluminiumHydroxide')* 2, 400, 0)
                .duration(200)
                .EUt(300)
                .buildAndRegister();

        CRYSTALLIZATION_RECIPES.recipeBuilder()
                .inputs(metaitem('dustLeachedBauxite')* 2)
                .fluidInputs(fluid('hydrogen')*4000)
                .fluidOutputs(fluid('hydrogen_chloride')*2000)
                .outputs(metaitem('dustAluminiumHydroxide')* 7)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('dustSodiumAluminate')* 3)
                .fluidOutputs(fluid('sodium_aluminate_solution')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CRYSTALLIZATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_aluminate_solution')*1000)
                .fluidInputs(fluid('water')*1000)
                .fluidOutputs(fluid('sodium_hydroxide_solution')*1000)
                .outputs(metaitem('dustAluminiumHydroxide')* 7)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustAluminiumHydroxide')* 4)
                .outputs(metaitem('ingotAluminium'))
                .fluidOutputs(fluid('steam')*2000)
                .duration(200)
                .EUt(400)
                .blastFurnaceTemp(1800)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustAluminiumHydroxide')* 5)
                .outputs(metaitem('dustAlumina')* 2)
                .fluidOutputs(fluid('steam')*2000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustAlumina'))
                .fluidOutputs(fluid('alumina')*144)
                .duration(60)
                .EUt(7)
                .buildAndRegister();

// Aluminium Dust * 6
mods.gregtech.electrolyzer.removeByInput(60, [metaitem('dustBauxite') * 15], null)

