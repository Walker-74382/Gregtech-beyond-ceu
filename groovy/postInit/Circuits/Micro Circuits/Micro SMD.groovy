import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;



        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('polytetrafluoroethylene')*144)
                .inputs(metaitem('silicon_dioxide_wafer'))
                .outputs(metaitem('thick_film_wafer'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('thick_film_wafer'))
                .outputs(metaitem('thick_film_resistor_base_wafer'))
                .duration(200)
                .fluidInputs(fluid('lubricant')*100)
                .EUt(80)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('wireFineTantalum')*2)
                .inputs(metaitem('thick_film_resistor_base_wafer'))
                .inputs(metaitem('dustCarbon'))
                .outputs(metaitem('thick_film_resistor_wafer')*2)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('wireFineElectrum')* 2)
                .inputs(metaitem('thick_film_resistor_base_wafer'))
                .inputs(metaitem('dustCarbon'))
                .outputs(metaitem('thick_film_resistor_wafer'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('thick_film_resistor_wafer'))
                .outputs(metaitem('component.smd.resistor')*16)
                .fluidInputs(fluid('lubricant')*20)
                .duration(80)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('silicon_dioxide_wafer'))
                .inputs(metaitem('wireFineCopper')* 8)
                .outputs(metaitem('transistor_base_wafer'))
                .duration(20)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('silicon_dioxide_wafer'))
                .inputs(metaitem('wireFineAluminium')* 8)
                .outputs(metaitem('transistor_base_wafer'))
                .duration(20)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('silicon_dioxide_wafer'))
                .inputs(metaitem('wireFineTantalum')* 6)
                .outputs(metaitem('transistor_base_wafer'))
                .duration(20)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('silicon_dioxide_wafer'))
                .inputs(metaitem('wireFinePlatinum')* 5)
                .outputs(metaitem('transistor_base_wafer'))
                .duration(20)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('silicon_dioxide_wafer'))
                .inputs(metaitem('wireFineTitanium')* 4)
                .outputs(metaitem('transistor_base_wafer'))
                .duration(20)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('silicon_dioxide_wafer'))
                .inputs(metaitem('wireFineTungsten')*2)
                .outputs(metaitem('transistor_base_wafer'))
                .duration(20)
                .EUt(70)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('transistor_wafer'))
                .outputs(metaitem('component.smd.transistor')*16)
                .fluidInputs(fluid('lubricant')*60)
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        ARC_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustFerriteMixture'))
                .fluidInputs(fluid('oxygen')*1000)
                .outputs(metaitem('dustNickelZincFerrite'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        ELECTRON_BEAM_LITHOGRAPHER_RECIPES.recipeBuilder()
                .inputs(metaitem('n_doped_silicon_dioxide_wafer'))
                .fluidInputs(fluid('novolacs_photoresist')*144)
                .outputs(metaitem('patterend_silicon_dioxide_wafer'))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .inputs(metaitem('n_doped_silicon_dioxide_wafer'))
                .notConsumable(metaitem('inductor_lithography_mask'))
                .fluidInputs(fluid('novolacs_photoresist')*144)
                .outputs(metaitem('patterend_silicon_dioxide_wafer'))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('patterend_silicon_dioxide_wafer'))
                .fluidInputs(fluid('nitric_acid')*100)
                .outputs(metaitem('etched_inductor_wafer'))
                .duration(90)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('etched_inductor_wafer'))
                .inputs(metaitem('wireFineCupronickel')* 4)
                .inputs(metaitem('ringNickelZincFerrite'))
                .outputs(metaitem('inductor_wafer'))
                .fluidInputs(fluid('plastic')*144)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('inductor_wafer'))
                .fluidInputs(fluid('lubricant')*72)
                .outputs(metaitem('component.smd.inductor')*16)
                .duration(90)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('n_doped_silicon_dioxide_wafer'))
                .inputs(metaitem('foilMolybdenum'))
                .outputs(metaitem('reinforced_base_wafer'))
                .duration(200)
                .EUt(78)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('n_doped_silicon_dioxide_wafer'))
                .inputs(metaitem('foilPalladium'))
                .outputs(metaitem('reinforced_base_wafer')*2)
                .duration(200)
                .EUt(78)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .inputs(metaitem('reinforced_base_wafer'))
                .fluidInputs(fluid('novolacs_photoresist')*144)
                .outputs(metaitem('patterened_base_wafer'))
                .duration(80)
                .EUt(90)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('patterened_base_wafer'))
                .inputs(metaitem('wireFineCopper')* 4)
                .outputs(metaitem('diode_wafer'))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('lubricant')*80)
                .inputs(metaitem('diode_wafer'))
                .outputs(metaitem('component.smd.diode')*16)
                .duration(200)
                .EUt(249)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('foilAluminium')* 4)
                .inputs(item('minecraft:paper'))
                .outputs(metaitem('raw_capacitor_roll')*8)
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('boric_acid')*72)
                .inputs(metaitem('raw_capacitor_roll')*8)
                .outputs(metaitem('aluminium_capacitor')*8)
                .duration(240)
                .EUt(180)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('aluminium_capacitor')*16)
                .inputs(metaitem('ringSiliconeRubber')* 2)
                .inputs(metaitem('foilAluminium')* 2)
                .outputs(metaitem('component.smd.capacitor')*16)
                .duration(800)
                .EUt(270)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('aluminium_capacitor')*16)
                .inputs(metaitem('ringRubber')* 8)
                .inputs(metaitem('foilAluminium')* 2)
                .outputs(metaitem('component.smd.capacitor')*16)
                .duration(800)
                .EUt(270)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('dustGalliumArsenide'))
                .inputs(metaitem('dustSilicon')* 32)
                .inputs(metaitem('monocrystalline_seed_crystal'))
                .outputs(metaitem('unbaked_monocrystalline_silicon_boule'))
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .blastFurnaceTemp(800)
                .inputs(metaitem('unbaked_monocrystalline_silicon_boule'))
                .outputs(metaitem('boule.silicon'))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('plastic')*288)
                .inputs(metaitem('transistor_base_wafer'))
                .inputs(metaitem('foilGallium')* 8)
                .outputs(metaitem('transistor_wafer'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('polytetrafluoroethylene')*144)
                .inputs(metaitem('transistor_base_wafer'))
                .inputs(metaitem('foilGallium')* 4)
                .outputs(metaitem('transistor_wafer'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('formaldehyde')*1000)
                .fluidInputs(fluid('phenol')*1000)
                .fluidOutputs(fluid('novolacs_photoresist')*1000)
                .circuitMeta(1)
                .duration(200)
                .EUt(70)
                .buildAndRegister();