import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;
        
        CRYOGENIC_DISTILLATION_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('cold_air')*1000)
                .fluidInputs(fluid('air')*1000)
                .fluidOutputs(fluid('untreated_liquid_oxygen')*50)
                .fluidOutputs(fluid('cold_waste_gaseous_nitrogen')*5440)
                .fluidOutputs(fluid('argon_rich_gas')*200)
                .duration(400)
                .EUt(116)
                .buildAndRegister();

        CRYOGENIC_DISTILLATION_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('argon_rich_gas')*500)
                .fluidOutputs(fluid('crude_argon_vapor')*600)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CRYOGENIC_DISTILLATION_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nitrogen_stripped_rare_gas_mixture')*10000)
                .fluidOutputs(fluid('crude_xenon')*90)
                .fluidOutputs(fluid('crude_krypton')*144)
                .fluidOutputs(fluid('crude_helium')*524)
                .fluidOutputs(fluid('crude_neon')*1818)
                .fluidOutputs(fluid('crude_argon_vapor')*7454)
                .duration(200)
                .EUt(84)
                .buildAndRegister();

        CRYOGENIC_DISTILLATION_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('liquid_nitrogen')*200)
                .fluidInputs(fluid('cold_gaseous_oxygen')*200)
                .fluidInputs(fluid('crude_argon')*1000)
                .fluidOutputs(fluid('cold_gaseous_nitrogen')*200)
                .fluidOutputs(fluid('liquid_ozone')*200)
                .fluidOutputs(fluid('partially_liquid_argon')*1000)
                .duration(800)
                .EUt(12)
                .buildAndRegister();

        CRYOGENIC_DISTILLATION_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('liquid_nitrogen')*200)
                .fluidInputs(fluid('cold_gaseous_oxygen')*200)
                .fluidInputs(fluid('crude_xenon')*1000)
                .fluidOutputs(fluid('cold_gaseous_nitrogen')*200)
                .fluidOutputs(fluid('liquid_oxygen')*200)
                .fluidOutputs(fluid('partially_liquid_xenon')*1000)
                .duration(800)
                .EUt(12)
                .buildAndRegister();

        CRYOGENIC_DISTILLATION_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('liquid_nitrogen')*200)
                .fluidInputs(fluid('cold_gaseous_oxygen')*200)
                .fluidInputs(fluid('crude_krypton')*1000)
                .fluidOutputs(fluid('cold_gaseous_nitrogen')*200)
                .fluidOutputs(fluid('liquid_oxygen')*200)
                .fluidOutputs(fluid('partially_liquid_krypton')*1000)
                .duration(800)
                .EUt(12)
                .buildAndRegister();

        CRYOGENIC_DISTILLATION_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('liquid_nitrogen')*200)
                .fluidInputs(fluid('cold_gaseous_oxygen')*200)
                .fluidInputs(fluid('crude_helium')*1000)
                .fluidOutputs(fluid('cold_gaseous_nitrogen')*200)
                .fluidOutputs(fluid('liquid_oxygen')*200)
                .fluidOutputs(fluid('partially_liquid_helium')*1000)
                .duration(800)
                .EUt(12)
                .buildAndRegister();

        CRYOGENIC_DISTILLATION_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('liquid_nitrogen')*200)
                .fluidInputs(fluid('cold_gaseous_oxygen')*200)
                .fluidInputs(fluid('crude_neon')*1000)
                .fluidOutputs(fluid('cold_gaseous_nitrogen')*200)
                .fluidOutputs(fluid('liquid_oxygen')*200)
                .fluidOutputs(fluid('partially_liquid_neon')*1000)
                .duration(800)
                .EUt(12)
                .buildAndRegister();

        PHASE_SEPARATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('partially_liquid_argon')*1000)
                .fluidOutputs(fluid('liquid_argon')*200)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        PHASE_SEPARATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('partially_liquid_helium')*1000)
                .fluidOutputs(fluid('liquid_helium')*200)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        PHASE_SEPARATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('partially_liquid_krypton')*1000)
                .fluidOutputs(fluid('liquid_krypton')*200)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        PHASE_SEPARATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('partially_liquid_neon')*1000)
                .fluidOutputs(fluid('liquid_neon')*200)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        PHASE_SEPARATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('partially_liquid_xenon')*1000)
                .fluidOutputs(fluid('liquid_xenon')*200)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        PRESSURE_SWING_ADSORBER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('syngas')*10000)
                .fluidOutputs(fluid('hydrogen')*6000)
                .fluidOutputs(fluid('carbon_monoxide')*4000)
                .duration(400)
                .EUt(80)
                .buildAndRegister();

        PRESSURE_SWING_ADSORBER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('air')*10000)
                .fluidOutputs(fluid('nitrogen')*7780)
                .fluidOutputs(fluid('oxygen')*2200)
                .duration(400)
                .EUt(120)
                .buildAndRegister();

        PRESSURE_SWING_ADSORBER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('salt_water')*1000)
                .fluidOutputs(fluid('water')*1000)
                .outputs(metaitem('dustSalt')* 4)
                .duration(160)
                .EUt(70)
                .buildAndRegister();

        RARE_GAS_STRIPPING_COLUMN_RECIPES.recipeBuilder()
                .fluidInputs(fluid('crude_argon_vapor')*1000)
                .fluidInputs(fluid('liquid_oxygen')*1000)
                .fluidInputs(fluid('liquid_nitrogen')*1000)
                .fluidOutputs(fluid('oxygen')*1000)
                .fluidOutputs(fluid('rare_gas_rich_gaseous_nitrogen')*2000)
                .duration(800)
                .EUt(90)
                .buildAndRegister();

        CONDENSATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('rare_gas_rich_gaseous_nitrogen')*1000)
                .fluidOutputs(fluid('crude_krypton')*100)
                .fluidOutputs(fluid('cold_gaseous_oxygen')*200)
                .fluidOutputs(fluid('rare_gas_mixture')*700)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CONDENSATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('rare_gas_mixture')*1000)
                .fluidInputs(fluid('liquid_nitrogen')*500)
                .fluidOutputs(fluid('nitrogen')*1000)
                .fluidOutputs(fluid('nitrogen_stripped_rare_gas_mixture')*500)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CONDENSATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('crude_argon_vapor')*1000)
                .fluidInputs(fluid('supercooled_oxygen')*1000)
                .fluidOutputs(fluid('crude_argon')*200)
                .fluidOutputs(fluid('liquid_oxygen')*1800)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CONDENSATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('cold_waste_gaseous_nitrogen') * 1000)
                .fluidOutputs(fluid('liquid_waste_nitrogen')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        PHASE_SEPARATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('liquid_helium')*1000)
                .fluidOutputs(fluid('helium')*1000)
                .duration(800)
                .EUt(8)
                .buildAndRegister();

        PHASE_SEPARATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('liquid_argon')*1000)
                .fluidOutputs(fluid('argon')*1000)
                .duration(800)
                .EUt(8)
                .buildAndRegister();

        PHASE_SEPARATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('liquid_xenon')*1000)
                .fluidOutputs(fluid('xenon')*1000)
                .duration(800)
                .EUt(8)
                .buildAndRegister();

        PHASE_SEPARATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('liquid_neon')*1000)
                .fluidOutputs(fluid('neon')*1000)
                .duration(800)
                .EUt(8)
                .buildAndRegister();

        PHASE_SEPARATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('liquid_krypton')*1000)
                .fluidOutputs(fluid('krypton')*1000)
                .duration(800)
                .EUt(8)
                .buildAndRegister();

        PHASE_SEPARATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('liquid_nitrogen')*1000)
                .fluidOutputs(fluid('nitrogen')*1000)
                .duration(800)
                .EUt(8)
                .buildAndRegister();

        PHASE_SEPARATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('liquid_oxygen')*1000)
                .fluidOutputs(fluid('oxygen')*1000)
                .duration(800)
                .EUt(8)
                .buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .fluidInputs(fluid('air')*1000)
                .circuitMeta(1)
                .fluidOutputs(fluid('cold_air')*1000)
                .duration(120)
                .EUt(70)
                .buildAndRegister();

        DRYER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('air')*1000)
                .fluidOutputs(fluid('dry_air')*1000)
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustAlumina')*3)
                .fluidInputs(fluid('methylcellulose')*1000)
                .outputs(metaitem('dustAluminaCeramic'))
                .duration(200)
                .EUt(8)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('dustAluminaCeramic'))
                .notConsumable(metaitem('shape.mold.plate'))
                .outputs(metaitem('plateAluminaCeramic'))
                .duration(200)
                .EUt(28)
                .buildAndRegister();
        
        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*6000)
                .notConsumable(metaitem('plateAluminaCeramic'))
                .fluidOutputs(fluid('ozone')*2000)
                .duration(200)
                .EUt(28)
                .buildAndRegister();
        
        VACUUM_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nitrogen')*1000)
                .fluidOutputs(fluid('liquid_nitrogen')*1000)
                .duration(200)
                .EUt(28)
                .buildAndRegister();