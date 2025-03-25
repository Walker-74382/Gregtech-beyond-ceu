import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('dustSodiumSulfide')* 3)
                .fluidOutputs(fluid('sodium_sulfide_solution')*1000)
                .duration(120)
                .EUt(400)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_sulfide_solution')*1000)
                .fluidInputs(fluid('dichlorobenzene')*1000)
                .fluidOutputs(fluid('sodium_sulfide_solution_dichloro_benzene_mixture')*2000)
                .duration(900)
                .EUt(780)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidOutputs(fluid('phenylene_sulfide_pre_polymer_mixture')*1000)
                .fluidInputs(fluid('sodium_sulfide_solution_dichloro_benzene_mixture')*1000)
                .notConsumable(metaitem('dustAluminiumChloride'))
                .outputs(metaitem('dustSalt')* 4)
                .duration(120)
                .EUt(280)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('air')*1000)
                .fluidInputs(fluid('phenylene_sulfide_pre_polymer_mixture')*144)
                .fluidInputs(fluid('polyphenylene_sulfide')*144)
                .duration(500)
                .EUt(800)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*1000)
                .fluidInputs(fluid('phenylene_sulfide_pre_polymer_mixture')*144)
                .fluidInputs(fluid('polyphenylene_sulfide')*144)
                .duration(500)
                .EUt(800)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustKaminskyCatalyst'))
                .fluidInputs(fluid('phenylene_sulfide_pre_polymer_mixture')*144)
                .fluidInputs(fluid('polyphenylene_sulfide')*576)
                .duration(500)
                .EUt(800)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPhilipsCatalyst'))
                .fluidInputs(fluid('phenylene_sulfide_pre_polymer_mixture')*144)
                .fluidInputs(fluid('polyphenylene_sulfide')*288)
                .duration(500)
                .EUt(800)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustZieglerNattaCatalyst'))
                .fluidInputs(fluid('phenylene_sulfide_pre_polymer_mixture')*144)
                .fluidInputs(fluid('polyphenylene_sulfide')*432)
                .duration(500)
                .EUt(800)
                .buildAndRegister();