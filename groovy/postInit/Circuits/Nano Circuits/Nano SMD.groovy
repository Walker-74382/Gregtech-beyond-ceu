import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('plateGermanium'))
    .inputs(metaitem('plateGold'))
    .inputs(metaitem('plateNickel'))
    .fluidInputs(fluid('soldering_alloy')*144)
    .outputs(metaitem('au_ge_ni_alloy_stack'))
    .EUt(180)
    .duration(300)
    .buildAndRegister();

CVD_UNIT_RECIPES.recipeBuilder()
    .fluidInputs(fluid('gallium_vapor')*1000)
    .fluidInputs(fluid('arsenic')*1000)
    .notConsumable(metaitem('platePlatinum'))
    .inputs(metaitem('ga_as_seed_crystal'))
    .outputs(metaitem('ga_as_boule'))
    .EUt(280)
    .duration(320)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(metaitem('ga_as_boule'))
    .outputs(metaitem('ga_as_wafer')*16)
    .outputs(metaitem('ga_as_seed_crystal'))
    .fluidInputs(fluid('lubricant')*12)
    .EUt(400)
    .duration(300)
    .buildAndRegister();

VACUUM_EJECTION_RECIPES.recipeBuilder()
    .inputs(metaitem('plateGalliumArsenide'))
    .outputs(metaitem('ga_as_seed_crystal'))
    .EUt(360)
    .duration(390)
    .buildAndRegister();

MOCVD_UNIT_RECIPES.recipeBuilder()
    .fluidInputs(fluid('dimethylzinc')*1000)
    .fluidInputs(fluid('hydrogen')*1000)
    .fluidInputs(fluid('trimethylgallium')*1000)
    .inputs(metaitem('ga_as_wafer'))
    .outputs(metaitem('p_doped_ga_as_wafer'))
    .EUt(360)
    .duration(390)
    .buildAndRegister();

MOCVD_UNIT_RECIPES.recipeBuilder()
    .fluidInputs(fluid('arsine')*1000)
    .fluidInputs(fluid('hydrogen')*1000)
    .fluidInputs(fluid('trimethylgallium')*1000)
    .inputs(metaitem('p_doped_ga_as_wafer'))
    .inputs(metaitem('dustCaesium'))
    .outputs(metaitem('doped_ga_as_wafer'))
    .EUt(360)
    .duration(390)
    .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('arsenic_trichloride')*1000)
    .fluidInputs(fluid('hydrogen')*1000)
    .notConsumable(metaitem('dustPalladium'))
    .fluidOutputs(fluid('arsine')*1000)
    .EUt(460)
    .duration(400)
    .buildAndRegister();

ROASTER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('hydrogen_chloride')*1000)
    .fluidInputs(fluid('hydrogen')*2000)
    .inputs(metaitem('dustArsenicTrioxide')*5)
    .fluidOutputs(fluid('water')*2000)
    .fluidOutputs(fluid('arsenic_trichloride')*1000)
    .EUt(460)
    .duration(400)
    .buildAndRegister();

ENGRAVING_UNIT_RECIPES.recipeBuilder()
    .fluidInputs(fluid('novolacs_photoresist')*100)
    .notConsumable(metaitem('diode_lithography_mask'))
    .inputs(metaitem('doped_ga_as_wafer'))
    .outputs(metaitem('engraved_ga_as_wafer'))
    .EUt(360)
    .duration(400)
    .buildAndRegister();

REACTIVE_ION_ETCHER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('bcl_cl_2_ar')*1000)
    .inputs(metaitem('engraved_ga_as_wafer'))
    .outputs(metaitem('etched_ga_as_wafer'))
    .duration(400)
    .EUt(80)
    .buildAndRegister();

ELECTRON_BEAM_LITHOGRAPHER_RECIPES.recipeBuilder()
    .inputs(metaitem('etched_ga_as_wafer'))
    .inputs(metaitem('au_ge_ni_alloy_stack'))
    .outputs(metaitem('passivated_epitaxial_ga_as_wafer'))
    .duration(400)
    .EUt(80)
    .buildAndRegister();

