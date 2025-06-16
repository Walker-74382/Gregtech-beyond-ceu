import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


    POLYMERIZATION_TANK_RECIPES.recipeBuilder()
        .fluidInputs(fluid('divinylbenzene')*1000)
        .notConsumable(fluid('rock_salt_solution'))
        .fluidInputs(fluid('benzoyl_chloride')*1000)
        .fluidInputs(fluid('styrene')*1000)
        .fluidOutputs(fluid('dowex_50_suspension')*1000)
        .EUt(180)
        .duration(300)
        .buildAndRegister()

    ELECTROLYZER_RECIPES.recipeBuilder()
        .fluidOutputs(fluid('water')*1000)
        .fluidInputs(fluid('rock_salt_solution')*1000)
        .outputs(metaitem('dustRockSalt')*3)
        .EUt(12)
        .duration(30)
        .buildAndRegister()

    MIXER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('water')*1000)
        .fluidOutputs(fluid('rock_salt_solution')*1000)
        .inputs(metaitem('dustRockSalt')*3)
        .EUt(12)
        .duration(30)
        .buildAndRegister()

    DRYER_RECIPES.recipeBuilder()
        .fluidInputs(fluid('dowex_50_suspension')*1000)
        .fluidOutputs(fluid('dried_dowex_50_suspension')*1000)
        .EUt(380)
        .duration(400)
        .buildAndRegister()

    CHEMICAL_RECIPES.recipeBuilder()
        .fluidInputs(fluid('oleum')*1000)
        .fluidInputs(fluid('sulfuric_acid')*1000)
        .fluidInputs(fluid('dried_dowex_50_suspension')*1000)
        .fluidOutputs(fluid('dowex_50_solution')*1000)
        .EUt(380)
        .duration(400)
        .buildAndRegister()

    DISTILLATION_RECIPES.recipeBuilder()
        .fluidInputs(fluid('dowex_50_solution')*1000)
        .fluidOutputs(fluid('dowex_50')*1000)
        .fluidOutputs(fluid('divinylbenzene')*1000)
        .fluidOutputs(fluid('benzoyl_chloride')*1000)
        .EUt(180)
        .duration(300)
        .buildAndRegister()

    CONDENSATION_UNIT_RECIPES.recipeBuilder()
        .fluidInputs(fluid('dowex_50')*1000)
        .outputs(metaitem('condensated_dowex_50'))
        .EUt(180)
        .duration(300)
        .buildAndRegister();

    EXTRUDER_RECIPES.recipeBuilder()
        .inputs(metaitem('condensated_dowex_50'))
        .outputs(metaitem('dowex_50_exchange_beads'))
        .notConsumable(metaitem('shape.extruder.bolt'))   
        .EUt(180)
        .duration(300)
        .buildAndRegister();    
