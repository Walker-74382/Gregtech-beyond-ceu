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

CUTTER_RECIPES.recipeBuilder()
    .inputs(metaitem('ga_as_boule'))
    .outputs(metaitem('ga_as_wafer')*16)
    .outputs(metaitem('ga_as_seed_crystal'))
    .fluidInputs(fluid('distilled_water')*16)
    .EUt(400)
    .duration(500)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(metaitem('ga_as_boule'))
    .outputs(metaitem('ga_as_wafer')*16)
    .outputs(metaitem('ga_as_seed_crystal'))
    .fluidInputs(fluid('water')*20)
    .EUt(400)
    .duration(900)
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

PVD_UNIT_RECIPES.recipeBuilder()
    .fluidInputs(fluid('helium')*1000)
    .fluidInputs(fluid('silane')*1000)
    .fluidInputs(fluid('ammonia')*1000)
    .inputs(metaitem('plateReinforcedEpoxyResin'))
    .inputs(metaitem('passivated_epitaxial_ga_as_wafer'))
    .outputs(metaitem('nano_smd_diode_wafer'))
    .EUt(180)
    .duration(400)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(metaitem('nano_smd_diode_wafer'))
    .fluidInputs(fluid('lubricant')*12)
    .outputs(metaitem('nano_smd_diode')*32)
    .EUt(240)
    .duration(600)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(metaitem('nano_smd_diode_wafer'))
    .fluidInputs(fluid('distilled_water')*18)
    .outputs(metaitem('nano_smd_diode')*32)
    .EUt(240)
    .duration(800)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(metaitem('nano_smd_diode_wafer'))
    .fluidInputs(fluid('water')*22)
    .outputs(metaitem('nano_smd_diode')*32)
    .EUt(240)
    .duration(1200)
    .buildAndRegister();

MOCVD_UNIT_RECIPES.recipeBuilder() //Aluminium Gallium Arsenide 300
    .inputs(metaitem('dustGalliumArsenide'))
    .inputs(metaitem('dustIndiumGalliumArsenide'))
    .fluidInputs(fluid('ozone')*1000)
    .fluidInputs(fluid('ammonia')*1000)
    .inputs(metaitem('ga_as_wafer'))
    .outputs(metaitem('layered_ga_as_wafer'))
    .duration(400)
    .EUt(128)
    .buildAndRegister();

SPINCOATER_RECIPES.recipeBuilder()
    .inputs(metaitem('layered_ga_as_wafer'))
    .fluidInputs(fluid('novolacs_photoresist')*100)
    .outputs(metaitem('coated_layered_ga_as_wafer'))
    .duration(300)
    .EUt(400)
    .buildAndRegister();

LASER_ENGRAVER_RECIPES.recipeBuilder()
    .inputs(metaitem('coated_layered_ga_as_wafer'))
    .outputs(metaitem('masked_ga_as_wafer'))
    .notConsumable(metaitem('transistor_lithography_mask'))
    .duration(900)
    .EUt(428)
    .buildAndRegister();

CVD_UNIT_RECIPES.recipeBuilder()
    .inputs(metaitem('plateMagnalium'))
    .inputs(metaitem('wireFinePalladium')*8)
    .fluidInputs(fluid('helium')*1000)
    .inputs(metaitem('masked_ga_as_wafer'))
    .outputs(metaitem('sputtered_ga_as_wafer'))
    .duration(600)
    .EUt(600)
    .buildAndRegister();

SPINCOATER_RECIPES.recipeBuilder()
    .inputs(metaitem('sputtered_ga_as_wafer'))
    .fluidInputs(fluid('novolacs_photoresist')*100)
    .outputs(metaitem('spincoated_ga_as_wafer'))
    .duration(300)
    .EUt(400)
    .buildAndRegister();

REACTIVE_ION_ETCHER_RECIPES.recipeBuilder()
    .inputs(metaitem('spincoated_ga_as_wafer'))
    .fluidInputs(fluid('bcl_cl_2_ar')*1000)
    .outputs(metaitem('etched_spincoated_ga_as_wafer'))
    .duration(300)
    .EUt(400)
    .buildAndRegister();

CVD_UNIT_RECIPES.recipeBuilder()
    .fluidInputs(fluid('nitrogen')*1000)
    .inputs(metaitem('dustSiliconDioxide'))
    .inputs(metaitem('etched_spincoated_ga_as_wafer'))
    .outputs(metaitem('passivated_spincoated_ga_as_wafer'))
    .duration(300)
    .EUt(400)
    .buildAndRegister();

SPINCOATER_RECIPES.recipeBuilder()
    .inputs(metaitem('passivated_spincoated_ga_as_wafer'))
    .fluidInputs(fluid('novolacs_photoresist')*100)
    .outputs(metaitem('bonded_ga_as_wafer'))
    .duration(300)
    .EUt(400)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('bonded_ga_as_wafer'))
    .inputs(metaitem('frameLead'))
    .outputs(metaitem('ga_as_wafer_die'))
    .EUt(800)
    .duration(200)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(metaitem('ga_as_wafer_die'))
    .fluidInputs(fluid('lubricant')*12)
    .outputs(metaitem('nano_smd_transistor')*32)
    .EUt(800)
    .duration(200)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(metaitem('ga_as_wafer_die'))
    .fluidInputs(fluid('distilled_water')*16)
    .outputs(metaitem('nano_smd_transistor')*32)
    .EUt(800)
    .duration(500)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(metaitem('ga_as_wafer_die'))
    .fluidInputs(fluid('water')*20)
    .outputs(metaitem('nano_smd_transistor')*32)
    .EUt(800)
    .duration(800)
    .buildAndRegister();

MIXER_RECIPES.recipeBuilder()
    .inputs(metaitem('dustAluminium')*2)
    .fluidInputs(fluid('concrete')*144)
    .fluidOutputs(fluid('dielectric_paste')*2000)
    .duration(400)
    .EUt(170)
    .buildAndRegister();

FLUID_SOLIDFICATION_RECIPES.recipeBuilder()
    .fluidInputs(fluid('dielectric_paste')*2000)
    .notConsumable(metaitem('shape.mold.cylinder'))
    .outputs(metaitem('dielectric_film')*4)
    .duration(400)
    .EUt(170)
    .buildAndRegister();

SONICATOR_RECIPES.recipeBuilder()
    .fluidInputs(fluid('isopropyl_alcohol')*100)
    .inputs(metaitem('plateGalliumArsenide'))
    .outputs(metaitem('gallium_arsenide_substrate'))
    .duration(300)
    .EUt(150)
    .buildAndRegister();

CVD_UNIT_RECIPES.recipeBuilder()
    .inputs(metaitem('dustSiliconNitride'))
    .inputs(metaitem('gallium_arsenide_substrate'))
    .fluidInputs(fluid('methane')*100)
    .outputs(metaitem('sputtered_ga_as_substrate'))
    .duration(300)
    .EUt(150)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('piranha_solution')*200)
    .inputs(metaitem('sputtered_ga_as_substrate'))
    .outputs(metaitem('removed_ga_as_substrate'))
    .duration(300)
    .EUt(150)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('novolacs_photoresist')*100)
    .inputs(metaitem('removed_ga_as_substrate'))
    .outputs(metaitem('coated_ga_as_substrate'))
    .duration(300)
    .EUt(150)
    .buildAndRegister();

ELECTRON_BEAM_LITHOGRAPHER_RECIPES_MULTI.recipeBuilder()
    .inputs(metaitem('coated_ga_as_substrate'))
    .inputs(metaitem('gold_electrode'))
    .inputs(metaitem('silver_electrode'))
    .outputs(metaitem('electrode_deposited_ga_as_substrate'))
    .duration(300)
    .EUt(150)
    .buildAndRegister();

SPINCOATER_RECIPES.recipeBuilder()
    .inputs(metaitem('electrode_deposited_ga_as_substrate'))
    .outputs(metaitem('spincoated_ga_as_substrate'))
    .fluidInputs(fluid('novolacs_photoresist')*100)
    .duration(300)
    .EUt(150)
    .buildAndRegister();

ASSEMBLER_RECIPES.recipeBuilder()
    .inputs(metaitem('spincoated_ga_as_substrate'))
    .inputs(metaitem('dielectric_film'))
    .inputs(metaitem('foilTitanium')*4)
    .fluidInputs(fluid('plastic')*144)
    .outputs(metaitem('nano_smd_capacitor')*32)
    .duration(300)
    .EUt(150)
    .buildAndRegister();

DRYER_RECIPES.recipeBuilder()
    .inputs(metaitem('gallium_arsenide_substrate'))
    .fluidInputs(fluid('nitrogen')*1000)
    .outputs(metaitem('dried_ga_as_substrate'))
    .duration(300)
    .EUt(150)
    .buildAndRegister();

ELECTRON_BEAM_LITHOGRAPHER_RECIPES.recipeBuilder()
    .inputs(metaitem('dried_ga_as_substrate'))
    .notConsumable(metaitem('chromium_shadow_mask'))
    .outputs(metaitem('exposed_ga_as_substrate'))
    .duration(300)
    .EUt(150)
    .buildAndRegister();

ELECTRON_BEAM_LITHOGRAPHER_RECIPES_MULTI.recipeBuilder()
    .inputs(metaitem('dried_ga_as_substrate'))
    .notConsumable(metaitem('chromium_shadow_mask'))
    .outputs(metaitem('exposed_ga_as_substrate'))
    .duration(300)
    .EUt(150)
    .buildAndRegister();

SPINCOATER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('pyromellitic_dianhydride_oxydianilin')*200)
    .inputs(metaitem('exposed_ga_as_substrate'))
    .outputs(metaitem('spincoated_dried_ga_as_substrate'))
    .duration(300)
    .EUt(150)
    .buildAndRegister();

BLAST_RECIPES.recipeBuilder()
    .fluidInputs(fluid('oxygen')*1000)
    .inputs(metaitem('spincoated_dried_ga_as_substrate'))
    .inputs(metaitem('wireFineCerium')*4)
    .outputs(metaitem('cured_ga_as_substrate'))
    .duration(240)
    .EUt(350)
    .buildAndRegister();

HIGH_VACUUM_EVAPORATION_RECIPES.recipeBuilder()
    .inputs(metaitem('cured_ga_as_substrate'))
    .inputs(metaitem('foilPolytetrafluoroethylene'))
    .outputs(metaitem('nano_smd_resistor_substrate'))
    .duration(500)
    .EUt(450)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(metaitem('nano_smd_resistor_substrate'))
    .outputs(metaitem('nano_smd_resistor')*32)
    .fluidInputs(fluid('lubricant')*12)
    .duration(500)
    .EUt(450)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(metaitem('nano_smd_resistor_substrate'))
    .outputs(metaitem('nano_smd_resistor')*32)
    .fluidInputs(fluid('distilled_water')*16)
    .duration(700)
    .EUt(450)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(metaitem('nano_smd_resistor_substrate'))
    .outputs(metaitem('nano_smd_resistor')*32)
    .fluidInputs(fluid('water')*22)
    .duration(1000)
    .EUt(450)
    .buildAndRegister();

CVD_UNIT_RECIPES.recipeBuilder()
    .inputs(metaitem('silicon_dioxide_wafer'))
    .inputs(metaitem('dustAlumina'))
    .fluidInputs(fluid('methane')*40)
    .outputs(metaitem('alumina_based_sio2_wafer'))
    .duration(350)
    .EUt(150)
    .buildAndRegister();

HIGH_VACUUM_EVAPORATION_RECIPES.recipeBuilder()
    .inputs(metaitem('alumina_based_sio2_wafer'))
    .inputs(metaitem('plateGold'))
    .outputs(metaitem('deposited_alumina_wafer'))
    .duration(300)
    .EUt(180)
    .buildAndRegister();

UV_LIGHT_RECIPES.recipeBuilder()
    .inputs(metaitem('deposited_alumina_wafer'))
    .notConsumable(metaitem('inductor_lithography_mask'))
    .outputs(metaitem('patterned_alumina_wafer'))
    .duration(500)
    .EUt(380)
    .buildAndRegister();

LASER_ENGRAVER_RECIPES.recipeBuilder()
    .inputs(metaitem('patterned_alumina_wafer'))
    .fluidInputs(fluid('novolacs_photoresist')*100)
    .outputs(metaitem('exposed_alumina_wafer'))
    .duration(400)
    .EUt(480)
    .buildAndRegister();

REACTIVE_ION_ETCHER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('sulfuric_acid')*1000)
    .inputs(metaitem('exposed_alumina_wafer'))
    .outputs(metaitem('etched_alumina_wafer'))
    .duration(440)
    .EUt(450)
    .buildAndRegister();

CHEMICAL_BATH_RECIPES.recipeBuilder()
    .fluidInputs(fluid('copper')*288)
    .inputs(metaitem('etched_alumina_wafer'))
    .outputs(metaitem('electroplated_alumina_wafer'))
    .duration(440)
    .EUt(450)
    .buildAndRegister();

CVD_UNIT_RECIPES.recipeBuilder()    
    .fluidInputs(fluid('nitrogen')*1000)
    .inputs(metaitem('dustSiliconDioxide'))
    .inputs(metaitem('electroplated_alumina_wafer'))
    .outputs(metaitem('passivated_alumina_wafer'))
    .duration(460)
    .EUt(420)
    .buildAndRegister();

ELECTRON_BEAM_LITHOGRAPHER_RECIPES.recipeBuilder()
    .inputs(metaitem('plateKaptonK'))
    .inputs(metaitem('passivated_alumina_wafer'))
    .outputs(metaitem('insulated_alumina_wafer'))
    .duration(460)
    .EUt(420)
    .buildAndRegister();

ELECTRON_BEAM_LITHOGRAPHER_RECIPES_MULTI.recipeBuilder()
    .inputs(metaitem('plateKaptonK'))
    .inputs(metaitem('passivated_alumina_wafer'))
    .outputs(metaitem('insulated_alumina_wafer'))
    .duration(460)
    .EUt(420)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(metaitem('insulated_alumina_wafer'))
    .outputs(metaitem('nano_smd_inductor')*32)
    .fluidInputs(fluid('lubricant')*12)
    .duration(400)
    .EUt(500)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(metaitem('insulated_alumina_wafer'))
    .outputs(metaitem('nano_smd_inductor')*32)
    .fluidInputs(fluid('distilled_water')*16)
    .duration(600)
    .EUt(500)
    .buildAndRegister();

CUTTER_RECIPES.recipeBuilder()
    .inputs(metaitem('insulated_alumina_wafer'))
    .outputs(metaitem('nano_smd_inductor')*32)
    .fluidInputs(fluid('water')*20)
    .duration(800)
    .EUt(500)
    .buildAndRegister();