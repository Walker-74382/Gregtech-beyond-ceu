import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        //DIP 8 Microcontroller

        UV_LIGHT_RECIPES.recipeBuilder()
                .inputs(metaitem('wafer.silicon'))
                .fluidInputs(fluid('novolacs_photoresist') *100)
                .notConsumable(metaitem('chromium_shadow_mask'))
                .outputs(metaitem('gdsii_masked_wafer'))
                .duration(400)
                .EUt(460)
                .buildAndRegister()

        ION_IMPLANTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustBoron'))
                .inputs(metaitem('dustWhitePhosphorus'))
                .inputs(metaitem('gdsii_masked_wafer'))
                .outputs(metaitem('doped_gdsii_wafer'))
                .duration(400)
                .EUt(580)
                .buildAndRegister()

        MOCVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('thin_copper_sheet')* 4)
                .inputs(metaitem('doped_gdsii_wafer'))
                .outputs(metaitem('connected_gdsii_wafer'))
                .duration(500)
                .EUt(480)
                .buildAndRegister()

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('foilCopper'))
                .outputs(metaitem('thin_copper_sheet')* 16)
                .duration(400)
                .EUt(580)
                .buildAndRegister()

        PLASMA_ETCHER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('piranha_solution')* 100)
                .inputs(metaitem('connected_gdsii_wafer'))
                .outputs(metaitem('etched_gdsii_wafer'))
                .duration(500)
                .EUt(380)
                .buildAndRegister()

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('etched_gdsii_wafer'))
                .outputs(metaitem('gdsii_chip')* 16)
                .duration(500)
                .EUt(380)
                .buildAndRegister()

        PACKER_RECIPES.recipeBuilder()
                .inputs(metaitem('dip_8_package'))
                .inputs(metaitem('gdsii_chip'))
                .outputs(metaitem('dip_8_microcontroller'))
                .duration(500)
                .EUt(380)
                .buildAndRegister()

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('frameLead'))
                .inputs(metaitem('boltTin'))
                .fluidInputs(fluid('soldering_alloy')* 144)
                .outputs(metaitem('dip_8_package')* 16)
                .duration(300)
                .EUt(490)
                .buildAndRegister()

        //Quantum Dots

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oleic_acid')*1000)
                .inputs(metaitem('dustCadmium'))
                .fluidOutputs(fluid('cadmium_oleate')*1000)
                .duration(300)
                .EUt(410)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('trioctylphosphine')*1000)
                .inputs(metaitem('dustSelenium'))
                .fluidInputs(fluid('cadmium_oleate')*1000)
                .fluidOutputs(fluid('quantum_dots')*1000)
                .duration(320)
                .EUt(420)
                .buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .fluidInputs(fluid('quantum_dots')*1000)
                .fluidOutputs(fluid('monodisperse_quantum_dots')*1000)
                .duration(350)
                .EUt(600)
                .buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()    
                .inputs(metaitem('dustArsenic'))
                .fluidOutputs(fluid('arsenic')*144)
                .duration(350)
                .EUt(600)
                .buildAndRegister();

// Arsenic Vapor * 144
mods.gregtech.extractor.removeByInput(30, [metaitem('dustArsenic')], null)

        FLUID_HEATER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustGallium'))
                .fluidOutputs(fluid('gallium_vapor')*144)
                .duration(350)
                .EUt(600)
                .buildAndRegister();

        SONICATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('isoamyl_alcohol')*100)
                .inputs(metaitem('plateSiliconDioxide'))
                .outputs(metaitem('silicon_dioxide_substrate'))
                .duration(150)
                .EUt(200)
                .buildAndRegister();

        SPINCOATER_RECIPES.recipeBuilder()      
                .fluidInputs(fluid('monodisperse_quantum_dots')*100)
                .inputs(metaitem('silicon_dioxide_substrate'))
                .outputs(metaitem('spincoated_silicon_dioxide_substrate'))
                .duration(240)
                .EUt(300)
                .buildAndRegister();

        ATOMIC_LAYER_DEPOSITION_RECIPES.recipeBuilder()
                .inputs(metaitem('spincoated_silicon_dioxide_substrate'))
                .fluidInputs(fluid('oxygen')*1000)
                .inputs(metaitem('dustHafnium'))
                .outputs(metaitem('deposited_silicon_dioxide_substrate'))
                .duration(220)
                .EUt(250)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('deposited_silicon_dioxide_substrate'))
                .inputs(metaitem('dustSilicon'))
                .outputs(metaitem('gated_silicon_dioxide_substrate'))
                .inputs(metaitem('wireGtSingleAluminium'))
                .duration(220)
                .EUt(250)
                .buildAndRegister();

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('gated_silicon_dioxide_substrate'))
                .outputs(metaitem('buffered_silicon_dioxide_substrate'))
                .inputs(metaitem('fet'))
                .inputs(metaitem('wireGtSingleAluminium'))
                .duration(220)
                .EUt(250)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('buffered_silicon_dioxide_substrate'))
                .outputs(metaitem('hv_voltage_regulator')*4)
                .fluidInputs(fluid('lubricant')*10)
                .duration(120)
                .EUt(100)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('buffered_silicon_dioxide_substrate'))
                .outputs(metaitem('hv_voltage_regulator')*4)
                .fluidInputs(fluid('water')*20)
                .duration(400)
                .EUt(200)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('buffered_silicon_dioxide_substrate'))
                .outputs(metaitem('hv_voltage_regulator')*4)
                .fluidInputs(fluid('distilled_water')*15)
                .duration(250)
                .EUt(150)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('fet_wafer'))
                .outputs(metaitem('fet')*8)
                .fluidInputs(fluid('lubricant')*10)
                .duration(220)
                .EUt(100)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('fet_wafer'))
                .outputs(metaitem('fet')*8)
                .fluidInputs(fluid('water')*20)
                .duration(600)
                .EUt(200)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('fet_wafer'))
                .outputs(metaitem('fet')*8)
                .fluidInputs(fluid('distilled_water')*15)
                .duration(450)
                .EUt(150)
                .buildAndRegister();

        ELECTRON_BEAM_LITHOGRAPHER_RECIPES.recipeBuilder()
                .inputs(metaitem('silicon_dioxide_wafer'))
                .inputs(metaitem('stickPlatinum'))
                .inputs(metaitem('stickGold'))
                .outputs(metaitem('electrode_placed_sio_wafer'))
                .duration(210)
                .EUt(150)
                .buildAndRegister();

        ENGRAVING_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('electrode_placed_sio_wafer'))
                .outputs(metaitem('lifted_sio_wafer'))
                .fluidInputs(fluid('novolacs_photoresist')*200)
                .duration(200)
                .EUt(170)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCarbonNanotubes'))
                .inputs(metaitem('lifted_sio_wafer'))
                .outputs(metaitem('deposited_sio_wafer'))
                .fluidInputs(fluid('nitrogen')*1000)
                .duration(150)
                .EUt(140)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSiliconDioxide'))
                .inputs(metaitem('deposited_sio_wafer'))
                .outputs(metaitem('gated_sio_wafer'))
                .fluidInputs(fluid('nitrogen')*1000)
                .duration(410)
                .EUt(120)
                .buildAndRegister();

        VACUUM_EJECTION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('pmma')*10)
                .inputs(metaitem('gated_sio_wafer'))
                .outputs(metaitem('fet_wafer'))
                .duration(310)
                .EUt(180)
                .buildAndRegister();

        VACUUM_FURNACE_RECIPES.recipeBuilder() //TODO TUBE FURNACE
                .inputs(metaitem('dustCobalt'))
                .inputs(metaitem('wafer.silicon'))
                .fluidInputs(fluid('argon')*100)
                .fluidInputs(fluid('methane')*1000)
                .outputs(metaitem('carbon_nanotube_grown_substrate'))
                .duration(210)
                .EUt(150)
                .buildAndRegister();

        PLASMA_ETCHER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrochloric_acid')*1000)
                .inputs(metaitem('carbon_nanotube_grown_substrate'))
                .chancedOutput(metaitem('dustCobalt')*1, 8000, 100)
                .outputs(metaitem('dustCarbonNanotubes')*4)
                .duration(210)
                .EUt(150)
                .buildAndRegister();

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('methyl_methacrylate')*1000)
                .fluidInputs(fluid('benzoyl_peroxide')*1000)
                .fluidInputs(fluid('nitrogen')*1000)
                .fluidInputs(fluid('toluene')*1000)
                .notConsumable(metaitem('dustZieglerNattaCatalyst'))
                .fluidOutputs(fluid('pmma_polymerization_mix')*4000)
                .duration(210)
                .EUt(150)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('pmma_polymerization_mix')*4000)
                .fluidOutputs(fluid('pmma')*1000)
                .fluidOutputs(fluid('benzoyl_peroxide')*1000)
                .fluidOutputs(fluid('nitrogen')*1000)
                .fluidOutputs(fluid('toluene')*1000)
                .duration(410)
                .EUt(150)
                .buildAndRegister();
