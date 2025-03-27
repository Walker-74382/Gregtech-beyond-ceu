import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


// Ruby Slurry * 3000
mods.gregtech.mixer.removeByInput(1920, [metaitem('crushedRuby') * 2], [fluid('aqua_regia') * 3000])

// Sapphire Slurry * 3000
mods.gregtech.mixer.removeByInput(1920, [metaitem('crushedSapphire') * 2], [fluid('aqua_regia') * 3000])

// Green Sapphire Slurry * 3000
mods.gregtech.mixer.removeByInput(1920, [metaitem('crushedGreenSapphire') * 2], [fluid('aqua_regia') * 3000])


    MIXER_RECIPES.recipeBuilder()
            .inputs(metaitem('crushedGreenSapphire') * 2)
            .fluidInputs(fluid('aqua_regia')*3000)
            .fluidOutputs(fluid('impure_green_sapphire_slurry')*3000)
            .duration(200)
            .EUt(1800)
            .buildAndRegister();

    MIXER_RECIPES.recipeBuilder()
            .inputs(metaitem('crushedSapphire') * 2)
            .fluidInputs(fluid('aqua_regia')*3000)
            .fluidOutputs(fluid('impure_sapphire_slurry')*3000)
            .duration(200)
            .EUt(1800)
            .buildAndRegister();

    MIXER_RECIPES.recipeBuilder()
            .inputs(metaitem('crushedRuby') * 2)
            .fluidInputs(fluid('aqua_regia')*3000)
            .fluidOutputs(fluid('impure_ruby_slurry')*3000)
            .duration(200)
            .EUt(1800)
            .buildAndRegister();

    FROTH_FLOTATION_UNIT_RECIPES.recipeBuilder()
            .fluidInputs(fluid('impure_ruby_slurry')*3000)
            .fluidOutputs(fluid('ruby_slurry')*3000)
            .notConsumable(metaitem('dustSodiumEthylXanthate'))
            .notConsumable(fluid('methyl_isobutyl_carbonyl') * 1000)
            .duration(300)
            .EUt(800)
            .buildAndRegister();

    FROTH_FLOTATION_UNIT_RECIPES.recipeBuilder()
            .fluidInputs(fluid('impure_sapphire_slurry')*3000)
            .fluidOutputs(fluid('sapphire_slurry')*3000)
            .notConsumable(metaitem('dustSodiumEthylXanthate'))
            .notConsumable(fluid('methyl_isobutyl_carbonyl') * 1000)
            .duration(300)
            .EUt(800)
            .buildAndRegister();

    FROTH_FLOTATION_UNIT_RECIPES.recipeBuilder()
            .fluidInputs(fluid('impure_green_sapphire_slurry')*3000)
            .fluidOutputs(fluid('green_sapphire_slurry')*3000)
            .notConsumable(metaitem('dustSodiumEthylXanthate'))
            .notConsumable(fluid('methyl_isobutyl_carbonyl') * 1000)
            .duration(300)
            .EUt(800)
            .buildAndRegister();

    CLARIFIER_RECIPES.recipeBuilder()
            .fluidInputs(fluid('green_sapphire_slurry')*3000)
            .outputs(metaitem('dustAluminium')*2)
            .chancedOutput(metaitem('dustTitanium')*1, 20, 0)
            .chancedOutput(metaitem('dustBeryllium')*1, 20, 0)
            .chancedOutput(metaitem('dustVanadium')*1, 20, 0)
            .chancedOutput(metaitem('dustIron')*1, 20, 0)
            .fluidOutputs(fluid('diluted_hydrochloric_acid')*2000)
            .duration(300)
            .EUt(800)
            .buildAndRegister();

    CLARIFIER_RECIPES.recipeBuilder()
            .fluidInputs(fluid('sapphire_slurry')*3000)
            .outputs(metaitem('dustAluminium')*2)
            .chancedOutput(metaitem('dustTitanium')*1, 20, 0)
            .chancedOutput(metaitem('dustVanadium')*1, 20, 0)
            .chancedOutput(metaitem('dustIron')*1, 20, 0)
            .fluidOutputs(fluid('diluted_hydrochloric_acid')*2000)
            .duration(300)
            .EUt(800)
            .buildAndRegister();

    CLARIFIER_RECIPES.recipeBuilder()
            .fluidInputs(fluid('ruby_slurry')*3000)
            .outputs(metaitem('dustAluminium')*2)
            .outputs(metaitem('dustChrome'))
            .chancedOutput(metaitem('dustTitanium')*1, 20, 0)
            .chancedOutput(metaitem('dustVanadium')*1, 20, 0)
            .chancedOutput(metaitem('dustIron')*1, 20, 0)
            .fluidOutputs(fluid('diluted_hydrochloric_acid')*2000)
            .duration(300)
            .EUt(800)
            .buildAndRegister();


//Methyl Isobutyl Carbonyl production

    CHEMICAL_RECIPES.recipeBuilder()     //TODO TBR
            .fluidInputs(fluid('air')*1000)
            .fluidInputs(fluid('1_butene')*1000)
            .fluidOutputs(fluid('methyl_isobutyl_carbonyl')*1000)
            .duration(300)
            .EUt(800)
            .buildAndRegister();