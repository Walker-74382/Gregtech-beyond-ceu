import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('redstone')*1000)
                .inputs(metaitem('wafer.ultra_high_power_integrated_circuit'))
                .outputs(metaitem('plate.ultra_high_power_integrated_circuit'))
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('novolacs_photoresist')*144)
                .inputs(metaitem('photocoated_hassium_wafer'))
                .outputs(metaitem('treated_photocoated_hassium_wafer'))
                .duration(200)
                .EUt(90000)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('uhpic_base_wafer'))
                .outputs(metaitem('uhpic_base')*16)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('barium_titanate_seed_crystal'))
                .inputs(metaitem('ingotBariumTitanate')* 4)
                .outputs(metaitem('barium_titanate_boule'))
                .blastFurnaceTemp(2000)
                .duration(200)
                .EUt(1200)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('barium_titanate_boule'))
                .outputs(metaitem('barium_titanate_substrate_wafer')*16)
                .outputs(metaitem('barium_titanate_seed_crystal'))
                .duration(200)
                .EUt(1299)
                .fluidInputs(fluid('extra_distilled_water')*1000)
                .buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('silicon_carbide')*144)
                .circuitMeta(1)
                .fluidOutputs(fluid('silicon_carbide_vapor')*144)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('wired_substrate_wafer'))
                .fluidInputs(fluid('liquid_xenon')*1000)
                .outputs(metaitem('uhpic_base_wafer'))
                .duration(80)
                .EUt(120)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .notConsumable(metaitem('ram_lithography_mask'))
                .inputs(metaitem('wafer.silicon'))
                .outputs(metaitem('engraved_ram_wafer'))
                .duration(20)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .inputs(metaitem('wireGtSingleUraniumTriplatinum')* 2)
                .inputs(metaitem('uhpic_base'))
                .inputs(metaitem('field.generator.uv'))
                .inputs(metaitem('platePolytetrafluoroethylene'))
                .inputs(metaitem('plateDuranium'))
                .inputs(metaitem('wireFineNaquadah'))
                .fluidInputs(fluid('naquadah_alloy')*144)
                .outputs(metaitem('plate.ultra_high_power_integrated_circuit'))
                .duration(200)
                .EUt(12000)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('doped_power_ic_wafer'))
                .fluidInputs(fluid('very_hot_nitrogen')*1000)
                .outputs(metaitem('wafer.power_integrated_circuit'))
                .duration(80)
                .EUt(120)
                .buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nitrogen')*1000)
                .circuitMeta(1)
                .fluidOutputs(fluid('very_hot_nitrogen')*1000)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .inputs(metaitem('wafer.silicon'))
                .outputs(metaitem('engraved_ram_wafer'))
                .duration(20)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('doped_ram_wafer'))
                .fluidInputs(fluid('very_hot_nitrogen')*1000)
                .outputs(metaitem('wafer.random_access_memory'))
                .duration(80)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('doped_cpu_wafer'))
                .fluidInputs(fluid('very_hot_nitrogen')*1000)
                .outputs(metaitem('wafer.central_processing_unit'))
                .duration(80)
                .EUt(120)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .notConsumable(metaitem('cpu_lithography_mask'))
                .inputs(metaitem('wafer.silicon'))
                .outputs(metaitem('engraved_cpu_wafer'))
                .duration(20)
                .EUt(12)
                .buildAndRegister();

        BENDER_RECIPES.recipeBuilder()
                .inputs(metaitem('platePhotopolymer'))
                .outputs(metaitem('foilMica')* 16)
                .duration(80)
                .EUt(8000)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('cela_silicon_boule'))
                .outputs(metaitem('celauwafer')*16)
                .fluidInputs(fluid('water')*64)
                .duration(800)
                .EUt(90000)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('cela_silicon_boule'))
                .outputs(metaitem('celauwafer')*16)
                .fluidInputs(fluid('distilled_water')*32)
                .duration(600)
                .EUt(90000)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('cela_silicon_boule'))
                .outputs(metaitem('celauwafer')*16)
                .fluidInputs(fluid('lubricant')*16)
                .duration(400)
                .EUt(90000)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('celauwafer'))
                .fluidInputs(fluid('acetone')*1000)
                .outputs(metaitem('fcelauwafer'))
                .duration(400)
                .EUt(1200)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('fcelauwafer'))
                .fluidInputs(fluid('methanol')*1000)
                .outputs(metaitem('celawafer'))
                .duration(400)
                .EUt(1200)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('celawafer'))
                .fluidInputs(fluid('photopolymer_solution')*1000)
                .outputs(metaitem('photogenally_enhanced_wafer'))
                .fluidOutputs(fluid('used_photopolymer_solution')*1000)
                .duration(800)
                .EUt(24000)
                .buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('used_photopolymer_solution')*1000)
                .circuitMeta(1)
                .fluidOutputs(fluid('photopolymer_solution')*500)
                .duration(1000)
                .EUt(24000)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('plateAluminium'))
                .inputs(metaitem('ingotBorosilicateGlass'))
                .circuitMeta(1)
                .outputs(metaitem('lithography_base_mask'))
                .duration(20)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('lithography_base_mask')).inputs(ore('dyeBlack'))
                .circuitMeta(1)
                .outputs(metaitem('pic_lithography_mask'))
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('lithography_base_mask')).inputs(ore('dyeBlack'))
                .circuitMeta(2)
                .outputs(metaitem('cpu_lithography_mask'))
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('lithography_base_mask')).inputs(ore('dyeBlack'))
                .circuitMeta(3)
                .outputs(metaitem('ram_lithography_mask'))
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('lithography_base_mask')).inputs(ore('dyeBlack'))
                .circuitMeta(4)
                .outputs(metaitem('single_josephson_junction_lithography_mask'))
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('lithography_base_mask')).inputs(ore('dyeBlack'))
                .circuitMeta(5)
                .outputs(metaitem('lpic_lithography_mask'))
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('lithography_base_mask')).inputs(ore('dyeBlack'))
                .circuitMeta(6)
                .outputs(metaitem('integrated_circuit_lithography_mask'))
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('lithography_base_mask'))
                .inputs(ore('dyeBlack'))
                .circuitMeta(7)
                .outputs(metaitem('nanocpu_lithography_mask'))
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('xenon')*1000)
                .fluidOutputs(fluid('very_hot_xenon')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(metaitem('ram_lithography_mask')).inputs(metaitem('wafer.silicon'))
                .outputs(metaitem('engraved_ram_wafer')).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(metaitem('ram_lithography_mask')).inputs(metaitem('wafer.phosphorus'))
                .outputs(metaitem('engraved_ram_wafer')*4).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(metaitem('ram_lithography_mask')).inputs(metaitem('wafer.naquadah'))
                .outputs(metaitem('engraved_ram_wafer')*8).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(metaitem('ram_lithography_mask')).inputs(metaitem('wafer.neutronium'))
                .outputs(metaitem('engraved_ram_wafer')*12).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(metaitem('pic_lithography_mask')).inputs(metaitem('polysilicon_wafer'))
                .outputs(metaitem('engraved_power_ic_wafer')).duration(20).EUt(12).buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(metaitem('cpu_lithography_mask')).inputs(metaitem('wafer.silicon'))
                .outputs(metaitem('engraved_cpu_wafer')).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(metaitem('cpu_lithography_mask')).inputs(metaitem('wafer.phosphorus'))
                .outputs(metaitem('engraved_cpu_wafer')*4).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(metaitem('cpu_lithography_mask')).inputs(metaitem('wafer.naquadah'))
                .outputs(metaitem('engraved_cpu_wafer')*8).duration(20).EUt(12).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().notConsumable(metaitem('cpu_lithography_mask')).inputs(metaitem('wafer.neutronium'))
                .outputs(metaitem('engraved_cpu_wafer')*12).duration(20).EUt(12).buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('very_hot_argon')*1000)
                .inputs(metaitem('doped_high_power_ic_wafer'))
                .outputs(metaitem('wafer.high_power_integrated_circuit'))
                .fluidOutputs(fluid('argon')*1000)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('dustGraphite')* 3)
                .fluidInputs(fluid('graphene_oxidation_solution')*100)
                .outputs(metaitem('dustGraphiteOxide'))
                .chancedOutput(metaitem('dustGrapheneOxidationResidues')*1 , 8000, 100)
                .duration(200)
                .EUt(2000)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('dustGraphiteOxide'))
                .notConsumable(metaitem('nickel_breeding_bed'))
                .fluidInputs(fluid('methane')*1000)
                .outputs(metaitem('dustGrapheneOxide'))
                .duration(200)
                .EUt(2000)
                .buildAndRegister();

        EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustGrapheneOxidationResidues'))
                .fluidOutputs(fluid('graphene_oxidation_solution')*100)
                .duration(120)
                .EUt(900)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('engraved_titanate_substrate_wafer'))
                .inputs(metaitem('dustEnrichedNaquadahTriniumEuropiumDuranide'))
                .fluidInputs(fluid('silicon_carbide_vapor')*144)
                .outputs(metaitem('superconductor_coated_substrate_wafer'))
                .duration(800)
                .EUt(1800)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('wafer.power_integrated_circuit'))
                .inputs(metaitem('dustSilverBromide'))
                .inputs(metaitem('dustIndiumGalliumPhosphide'))
                .outputs(metaitem('doped_high_power_ic_wafer'))
                .duration(400)
                .EUt(200)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*1000)
                .inputs(metaitem('wafer.silicon'))
                .outputs(metaitem('silicon_dioxide_wafer'))
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*2000)
                .inputs(metaitem('wafer.phosphorus'))
                .outputs(metaitem('silicon_dioxide_wafer')*2)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*4000)
                .inputs(metaitem('wafer.naquadah'))
                .outputs(metaitem('silicon_dioxide_wafer')*4)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*6000)
                .inputs(metaitem('wafer.neutronium'))
                .outputs(metaitem('silicon_dioxide_wafer')*6)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('silane')*1000)
                .inputs(metaitem('n_doped_silicon_dioxide_wafer'))
                .outputs(metaitem('polysilicon_wafer'))
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder().inputs(metaitem('wafer.silicon'))
                .notConsumable(metaitem('integrated_circuit_lithography_mask')).outputs(metaitem('engraved_ic_wafer')).duration(400).EUt(12)
                .buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().inputs(metaitem('wafer.phosphorus'))
                .notConsumable(metaitem('integrated_circuit_lithography_mask')).outputs(metaitem('engraved_ic_wafer')*4).duration(400).EUt(12)
                .buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().inputs(metaitem('wafer.naquadah'))
                .notConsumable(metaitem('integrated_circuit_lithography_mask')).outputs(metaitem('engraved_ic_wafer')*8).duration(400).EUt(12)
                .buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().inputs(metaitem('wafer.neutronium'))
                .notConsumable(metaitem('integrated_circuit_lithography_mask')).outputs(metaitem('engraved_ic_wafer')*12).duration(400).EUt(12)
                .buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().inputs(metaitem('wafer.silicon'))
                .notConsumable(metaitem('nanocpu_lithography_mask')).outputs(metaitem('engraved_nanocpu_wafer')).duration(400)
                .EUt(480).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().inputs(metaitem('wafer.phosphorus'))
                .notConsumable(metaitem('nanocpu_lithography_mask')).outputs(metaitem('engraved_nanocpu_wafer')*4).duration(400)
                .EUt(480).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().inputs(metaitem('wafer.naquadah'))
                .notConsumable(metaitem('nanocpu_lithography_mask')).outputs(metaitem('engraved_nanocpu_wafer')*8).duration(400)
                .EUt(480).buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().inputs(metaitem('wafer.neutronium'))
                .notConsumable(metaitem('nanocpu_lithography_mask')).outputs(metaitem('engraved_nanocpu_wafer')*12).duration(400)
                .EUt(480).buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('doped_nanocpu_wafer'))
                .fluidInputs(fluid('trichlorosilane')*1000)
                .outputs(metaitem('gated_nanocpu_wafer'))
                .duration(499)
                .EUt(80)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('gated_nanocpu_wafer'))
                .fluidInputs(fluid('trichlorosilane')*1000)
                .fluidInputs(fluid('oxygen')*1000)
                .outputs(metaitem('insulated_nanocpu_wafer'))
                .duration(499)
                .EUt(80)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder().inputs(metaitem('insulated_nanocpu_wafer'))
                .notConsumable(metaitem('glass_lens.red'))
                .outputs(metaitem('trenched_insulated_nanocpu_wafer')).duration(200).EUt(12).buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('trenched_insulated_nanocpu_wafer'))
                .inputs(metaitem('dustCopper'))
                .outputs(metaitem('unplanarized_nanocpu_wafer'))
                .duration(20)
                .EUt(900)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('unplanarized_nanocpu_wafer'))
                .fluidInputs(fluid('diluted_sulfuric_acid')*1000)
                .outputs(metaitem('nano_cpu_wafer'))
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('engraved_nand_wafer'))
                .fluidInputs(fluid('diluted_sulfuric_acid')*1000)
                .outputs(metaitem('wafer.nand_memory_chip'))
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('engraved_nor_wafer'))
                .fluidInputs(fluid('diluted_sulfuric_acid')*1000)
                .outputs(metaitem('wafer.nor_memory_chip'))
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder().inputs(metaitem('wafer.silicon'))
                .notConsumable(metaitem('integrated_circuit_lithography_mask')).outputs(metaitem('engraved_ic_wafer')).duration(400).EUt(12)
                .buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().inputs(metaitem('wafer.phosphorus'))
                .notConsumable(metaitem('integrated_circuit_lithography_mask')).outputs(metaitem('engraved_ic_wafer')*4).duration(400).EUt(12)
                .buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().inputs(metaitem('wafer.naquadah'))
                .notConsumable(metaitem('integrated_circuit_lithography_mask')).outputs(metaitem('engraved_ic_wafer')*8).duration(400).EUt(12)
                .buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().inputs(metaitem('wafer.neutronium'))
                .notConsumable(metaitem('integrated_circuit_lithography_mask')).outputs(metaitem('engraved_ic_wafer')*12).duration(400).EUt(12)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder().inputs(metaitem('nickel_nitride_wafer'))
                .notConsumable(metaitem('nor_photolithography_mask')).outputs(metaitem('engraved_nor_wafer')).duration(400).EUt(12)
                .buildAndRegister();
        LASER_ENGRAVER_RECIPES.recipeBuilder().inputs(metaitem('nickel_nitride_wafer'))
                .notConsumable(metaitem('nand_photolithography_mask')).outputs(metaitem('engraved_nand_wafer')).duration(400)
                .EUt(12).buildAndRegister();

        // ASOC chain

        // Chloronaquadic acid

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('aqua_regia')*1000)
                .fluidOutputs(fluid('very_hot_aqua_regia')*1000)
                .circuitMeta(1)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustNaquadah'))
                .fluidInputs(fluid('very_hot_aqua_regia')*1000)
                .fluidOutputs(fluid('chloronaquadic_acid')*1000)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        // Naquadah Dioxide

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chloronaquadic_acid')*1000)
                .inputs(metaitem('dustSodiumNitrate'))
                .outputs(metaitem('dustNaquadahDioxide'))
                .fluidOutputs(fluid('salt_water')*1000)
                .fluidOutputs(fluid('nitrogen_dioxide')*1000)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        // Naquadah Dioxide Seed Crystal

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSmallBariumTitanate'))
                .outputs(metaitem('barium_titanate_seed_crystal'))
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('lithography_base_mask')).inputs(ore('dyeBlack'))
                .circuitMeta(7)
                .outputs(metaitem('nor_photolithography_mask'))
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('lithography_base_mask')).inputs(ore('dyeBlack'))
                .circuitMeta(8)
                .outputs(metaitem('nand_photolithography_mask'))
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('lithography_base_mask')).inputs(ore('dyeBlack'))
                .circuitMeta(9)
                .outputs(metaitem('soc_lithography_mask'))
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('lithography_base_mask')).inputs(ore('dyeBlack'))
                .circuitMeta(10)
                .outputs(metaitem('pre_engraving_oganesson_lithography_mask'))
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('lithography_base_mask')).inputs(ore('dyeBlack'))
                .circuitMeta(11)
                .outputs(metaitem('uhasoc_lithography_mask'))
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('plateNaquadahEnriched'))
                .inputs(metaitem('plateGlass'))
                .circuitMeta(1)
                .outputs(metaitem('enriched_naquadah_photolithography_mask'))
                .duration(50)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen_chloride')*1000)
                .inputs(metaitem('dustFlerovium'))
                .fluidOutputs(fluid('trichloroflerane')*1000).fluidOutputs(fluid('hydrogen')*1000)
                .EUt(120)
                .duration(800)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('trichloroflerane')*100)
                .fluidOutputs(fluid('hydrogen_chloride')*100)
                .inputs(metaitem('pre_engraved_nqo2_wafer'))
                .outputs(metaitem('flerovium_layered_wafer'))
                .duration(200)
                .EUt(900)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('very_hot_krypton')*1000)
                .inputs(metaitem('doped_aram_wafer'))
                .outputs(metaitem('aram_wafer'))
                .fluidOutputs(fluid('krypton')*1000)
                .duration(90)
                .EUt(6000)
                .buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('krypton')*1000)
                .fluidOutputs(fluid('very_hot_krypton')*1000)
                .circuitMeta(1)
                .duration(80)
                .EUt(12000)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSmallNaquadahDioxide'))
                .outputs(metaitem('naquadah_dioxide_seed_crystal'))
                .blastFurnaceTemp(1800)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        // Naquadah Dioxide Boule

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('naquadah_dioxide_seed_crystal'))
                .inputs(metaitem('dustNaquadahDioxide'))
                .blastFurnaceTemp(1800)
                .outputs(metaitem('naquadah_dioxide_boule'))
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        // Naquadah Dioxide Wafer

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('naquadah_dioxide_boule'))
                .outputs(metaitem('naquadah_dioxide_wafer')* 16)
                .outputs(metaitem('naquadah_dioxide_seed_crystal'))
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        // Pre-engraved Naquadah Dioxide Wafer

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('super_fluid_helium_4')*1000)
                .fluidOutputs(fluid('helium_4')*1000)
                .inputs(metaitem('naquadah_dioxide_wafer'))
                .outputs(metaitem('trenched_naquadah_dioxide_wafer'))
                .duration(200)
                .EUt(129)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .inputs(metaitem('trenched_naquadah_dioxide_wafer'))
                .notConsumable(metaitem('soc_lithography_mask'))
                .outputs(metaitem('pre_engraved_nqo2_wafer'))
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        // Superfluid helium 4

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('liquid_enriched_helium_4')*1000)
                .fluidInputs(fluid('liquid_nitrogen')*1000)
                .fluidOutputs(fluid('super_fluid_helium_4')*1000)
                .fluidOutputs(fluid('helium_3')*1000)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        // Liquid Enriched helium 4

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('helium_4')*1000)
                .fluidInputs(fluid('helium')*1000)
                .fluidOutputs(fluid('liquid_enriched_helium_4')*1000)
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        // Engraved ASOC wafer

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .inputs(metaitem('pre_engraved_nqo2_wafer'))
                .notConsumable(metaitem('enriched_naquadah_photolithography_mask'))
                .outputs(metaitem('engraved_asoc_wafer'))
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        // ASOC wafer

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('doped_asoc_wafer'))
                .fluidInputs(fluid('very_hot_xenon')*1000)
                .outputs(metaitem('wafer.advanced_system_on_chip'))
                .duration(200)
                .EUt(100)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('boule.silicon'))
                .outputs(metaitem('wafer.silicon')*16)
                .outputs(metaitem('monocrystalline_seed_crystal'))
                .fluidInputs(fluid('water')*12)
                .duration(300)
                .EUt(8)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('boule.silicon'))
                .outputs(metaitem('wafer.silicon')*16)
                .outputs(metaitem('monocrystalline_seed_crystal'))
                .fluidInputs(fluid('distilled_water')*6)
                .duration(150)
                .EUt(8)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('boule.silicon'))
                .outputs(metaitem('wafer.silicon')*16)
                .outputs(metaitem('monocrystalline_seed_crystal'))
                .fluidInputs(fluid('lubricant')*5)
                .duration(50)
                .EUt(8)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nitrogen')*1000)
                .inputs(metaitem('dustNickel'))
                .outputs(metaitem('dustNickelNitride'))
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidOutputs(fluid('nitrogen')*1000)
                .outputs(metaitem('dustNickel'))
                .inputs(metaitem('dustNickelNitride'))
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*1000)
                .inputs(metaitem('dustNickelNitride'))
                .inputs(metaitem('doped_polysilicon_wafer'))
                .outputs(metaitem('nickel_nitride_wafer'))
                .duration(80)
                .EUt(90)
                .buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('argon')*1000)
                .fluidOutputs(fluid('very_hot_argon')*1000)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSmallSapphire'))
                .outputs(metaitem('sapphire_seed_crystal'))
                .duration(40)
                .EUt(80)
                .blastFurnaceTemp(900)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('sapphire_seed_crystal'))
                .inputs(metaitem('dustSapphire')* 4)
                .outputs(metaitem('sapphire_boule'))
                .fluidInputs(fluid('argon')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('sapphire_boule'))
                .outputs(metaitem('monocrystalline_sapphire_ingot')* 32)
                .fluidInputs(fluid('water')*12)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('sapphire_boule'))
                .outputs(metaitem('monocrystalline_sapphire_ingot')*32)
                .fluidInputs(fluid('distilled_water')*8)
                .duration(100)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('sapphire_boule'))
                .outputs(metaitem('monocrystalline_sapphire_ingot')*32)
                .fluidInputs(fluid('lubricant')*6)
                .duration(60)
                .EUt(60)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('monocrystalline_sapphire_ingot'))
                .outputs(metaitem('sapphire_wafer'))
                .fluidInputs(fluid('water')*12)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('monocrystalline_sapphire_ingot'))
                .outputs(metaitem('sapphire_wafer'))
                .fluidInputs(fluid('distilled_water')*8)
                .duration(100)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('monocrystalline_sapphire_ingot'))
                .outputs(metaitem('sapphire_wafer'))
                .fluidInputs(fluid('lubricant')*6)
                .duration(60)
                .EUt(60)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder().inputs(metaitem('sapphire_wafer')).notConsumable(metaitem('qbit_cpu_lithography_mask'))
                .outputs(metaitem('engraved_qbit_cpu_wafer')).duration(80).EUt(900).buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('engraved_cpu_wafer'))
                .inputs(metaitem('dustVanadiumTrichloride'))
                .inputs(metaitem('dustIndiumChloride'))
                .outputs(metaitem('doped_qbit_cpu_wafer'))
                .duration(800)
                .EUt(1000)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('very_hot_argon')*1000)
                .inputs(metaitem('doped_qbit_cpu_wafer'))
                .fluidOutputs(fluid('argon')*1000)
                .outputs(metaitem('superconductor_coated_qbit_cpu_wafer'))
                .duration(200)
                .EUt(900)
                .buildAndRegister();

        ION_IMPLANTER_RECIPES.recipeBuilder()
                .inputs(metaitem('superconductor_coated_qbit_cpu_wafer'))
                .inputs(metaitem('u_twofourty_electron_source'))
                .outputs(metaitem('wafer.qbit_central_processing_unit'))
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('wafer.qbit_central_processing_unit'))
                .outputs(metaitem('qbit_cpu_die')*5)
                .fluidInputs(fluid('water')*12)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('plate.qbit_central_processing_unit'))
                .outputs(metaitem('qbit_cpu_die')*5)
                .fluidInputs(fluid('distilled_water')*8)
                .duration(100)
                .EUt(80)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('plate.qbit_central_processing_unit'))
                .outputs(metaitem('qbit_cpu_die')*5)
                .fluidInputs(fluid('lubricant')*6)
                .duration(60)
                .EUt(60)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('qbit_cpu_die'))
                .inputs(metaitem('platePolytetrafluoroethylene'))
                .outputs(metaitem('covered_qbit_cpu'))
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('liquid_helium')*1000)
                .fluidOutputs(fluid('helium')*1000)
                .inputs(metaitem('covered_qbit_cpu'))
                .outputs(metaitem('plate.qbit_central_processing_unit'))
                .duration(120)
                .EUt(70)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSmallMetastableOganesson'))
                .circuitMeta(1)
                .outputs(metaitem('oganesson_seed_crystal'))
                .duration(200)
                .EUt(500000)
                .blastFurnaceTemp(8000)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('oganesson_seed_crystal'))
                .inputs(metaitem('dustMetastableOganesson')* 4)
                .outputs(metaitem('oganesson_boule'))
                .duration(200)
                .EUt(500000)
                .blastFurnaceTemp(8000)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder().inputs(metaitem('oganesson_boule')).outputs(metaitem('monocrystalline_oganesson_ingot')*16)
                .outputs(metaitem('oganesson_seed_crystal'))
                .fluidInputs(fluid('water')*12).duration(2000).EUt(80000).buildAndRegister();
        CUTTER_RECIPES.recipeBuilder().inputs(metaitem('oganesson_boule')).outputs(metaitem('monocrystalline_oganesson_ingot')*16)
                .outputs(metaitem('oganesson_seed_crystal'))
                .fluidInputs(fluid('distilled_water')*6).duration(1000).EUt(80000).buildAndRegister();
        CUTTER_RECIPES.recipeBuilder().inputs(metaitem('oganesson_boule')).outputs(metaitem('monocrystalline_oganesson_ingot')*16)
                .outputs(metaitem('oganesson_seed_crystal'))
                .fluidInputs(fluid('lubricant')*6).duration(600).EUt(60000).buildAndRegister();

        CUTTER_RECIPES.recipeBuilder().outputs(metaitem('oganesson_wafer'))
                .inputs(metaitem('monocrystalline_oganesson_ingot')).fluidInputs(fluid('water')*12).duration(2000).EUt(80000)
                .buildAndRegister();
        CUTTER_RECIPES.recipeBuilder().outputs(metaitem('oganesson_wafer'))
                .inputs(metaitem('monocrystalline_oganesson_ingot')).fluidInputs(fluid('distilled_water')*6).duration(1000)
                .EUt(80000).buildAndRegister();
        CUTTER_RECIPES.recipeBuilder().outputs(metaitem('oganesson_wafer'))
                .inputs(metaitem('monocrystalline_oganesson_ingot')).fluidInputs(fluid('lubricant')*6).duration(600).EUt(60000)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('trichloroflerane')*1000)
                .inputs(metaitem('oganesson_wafer'))
                .outputs(metaitem('treated_oganesson_wafer'))
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('super_fluid_helium_4')*1000)
                .fluidOutputs(fluid('liquid_helium')*1000)
                .inputs(metaitem('treated_oganesson_wafer'))
                .outputs(metaitem('bathed_treated_oganesson_wafer'))
                .duration(800)
                .EUt(9000)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .inputs(metaitem('bathed_treated_oganesson_wafer'))
                .outputs(metaitem('engraved_oganesson_wafer'))
                .notConsumable(metaitem('pre_engraving_oganesson_lithography_mask'))
                .duration(1200)
                .EUt(800)
                .buildAndRegister();

        ION_IMPLANTER_RECIPES.recipeBuilder()
                .inputs(metaitem('engraved_oganesson_wafer'))
            //    .inputs(metaitem('dustUEVSuperconductor')) //TODO
                .outputs(metaitem('raw_oganesson_wafer'))
                .duration(800)
                .EUt(77000)
                .buildAndRegister();

        POLARIZER_RECIPES.recipeBuilder()
                .inputs(metaitem('unpolarized_hasoc_wafer'))
                .outputs(metaitem('wafer.highly_advanced_system_on_chip'))
                .duration(7000)
                .EUt(8112)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('wafer.highly_advanced_system_on_chip'))
                .outputs(metaitem('hasoc_die')* 6)
                .fluidInputs(fluid('water')*12)
                .duration(2000)
                .EUt(80000)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder().inputs(metaitem('wafer.highly_advanced_system_on_chip')).outputs(metaitem('hasoc_die')*6)
                .fluidInputs(fluid('distilled_water')*6).duration(1000).EUt(80000).buildAndRegister();
        CUTTER_RECIPES.recipeBuilder().inputs(metaitem('wafer.highly_advanced_system_on_chip')).outputs(metaitem('hasoc_die')*6)
                .fluidInputs(fluid('lubricant')*6).duration(600).EUt(60000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .inputs(metaitem('hasoc_die')).inputs(metaitem('neurological_life_support_unit')).inputs(metaitem('platePolybenzimidazole'))
                .inputs(metaitem('wireFineNaquadahAlloy')*4).inputs(metaitem('stem_cells'))
                .fluidInputs(fluid('sterilized_growth_medium')*144)
                .outputs(metaitem('neural_implanted_hasoc_die'))
                .duration(200)
                .EUt(280000)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sterilized_growth_medium')*1000)
                .inputs(metaitem('dustNaquadahEnriched')*1)
                .fluidOutputs(fluid('naquadah_rich_sterile_growth_medium')*1000)
                .duration(80)
                .EUt(120000)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*1000)
                .inputs(metaitem('grown_hasoc_die'))
                .outputs(metaitem('clean_hasoc_die'))
                .duration(800)
                .EUt(90080)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('naquadah_rich_sterile_growth_medium')*144)
                .inputs(metaitem('neural_implanted_hasoc_die'))
                .outputs(metaitem('grown_hasoc_die'))
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('biosafe_protective_plating'))
                .inputs(metaitem('clean_hasoc_die'))
                .outputs(metaitem('plate.highly_advanced_system_on_chip'))
                .duration(8000)
                .EUt(1200)
                .buildAndRegister();

        FORMING_PRESS_RECIPES.recipeBuilder()
                .inputs(metaitem('plateHighDensityPolyethylene')).inputs(metaitem('plateTritanium')).inputs(metaitem('plateNaquadahAlloy'))
                .inputs(metaitem('plateIridium')).inputs(metaitem('plateOsmium'))
                .outputs(metaitem('biosafe_protective_plating'))
                .duration(129)
                .EUt(80)
                .buildAndRegister();

        POLARIZER_RECIPES.recipeBuilder()
                .inputs(metaitem('raw_oganesson_wafer'))
                .outputs(metaitem('doped_oganesson_wafer'))
                .duration(800)
                .EUt(90)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('engraved_qbit_cpu_wafer')).inputs(metaitem('dustVanadiumTrichloride'))
                .inputs(metaitem('dustIndiumChloride')* 1)
                .outputs(metaitem('doped_qbit_cpu_wafer'))
                .duration(280)
                .EUt(120)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('very_hot_krypton')*1000)
                .inputs(metaitem('pre_engraved_nqo2_wafer'))
                .outputs(metaitem('soc_wafer_base'))
                .fluidOutputs(fluid('krypton')*1000)
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('very_hot_krypton')*1000)
                .inputs(metaitem('doped_soc_wafer'))
                .outputs(metaitem('wafer.system_on_chip'))
                .fluidOutputs(fluid('krypton')*1000)
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('engraved_oganesson_wafer')).inputs(metaitem('dustRutheniumTriniumAmericiumNeutronate')* 1)
                .outputs(metaitem('superconductor_layered_uhasoc_wafer'))
                .duration(800)
                .EUt(2000001)
                .buildAndRegister();

        ION_IMPLANTER_RECIPES.recipeBuilder()
                .inputs(metaitem('superconductor_layered_uhasoc_wafer'))
                .inputs(metaitem('dustElectronDegenerateRhenium')) //TODO Ingot
                .outputs(metaitem('degenerate_uhasoc_wafer'))
                .duration(80000)
                .EUt(700)
                .buildAndRegister();

        ION_IMPLANTER_RECIPES.recipeBuilder()
                .inputs(metaitem('degenerate_uhasoc_wafer')).inputs(metaitem('controlled_shaped_naquadria_charge_casing'))
                .inputs(metaitem('shaped_high_energy_gamma_shield'))
                .outputs(metaitem('celled_uhasoc_wafer'))
                .duration(80000)
                .EUt(700)
                .buildAndRegister();

        POLARIZER_RECIPES.recipeBuilder()
                .inputs(metaitem('celled_uhasoc_wafer'))
                .outputs(metaitem('spin_aligned_uhasoc_wafer'))
                .duration(1200)
                .EUt(90000)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('spin_aligned_uhasoc_wafer'))
                .inputs(metaitem('dustElectronDegenerateRhenium'))
                .outputs(metaitem('relayered_uhasoc_wafer'))
                .duration(1200)
                .EUt(90000)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('plateMetastableOganesson'))
                .inputs(metaitem('glass_lens.yellow'))
                .circuitMeta(1)
                .outputs(metaitem('uhasoc_post_engraving_mask'))
                .duration(90)
                .EUt(120000)
                .buildAndRegister();

        VACUUM_RECIPES.recipeBuilder()
                .inputs(metaitem('fully_connected_uhasoc_wafer'))
                .outputs(metaitem('supercooled_uhasoc_wafer'))
                .duration(799)
                .EUt(1800)
                .buildAndRegister();

        POLARIZER_RECIPES.recipeBuilder()
                .inputs(metaitem('supercooled_uhasoc_wafer'))
                .outputs(metaitem('uhasoc_wafer'))
                .duration(80000)
                .EUt(7200)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSmallIndium'))
                .inputs(metaitem('dustSmallPhosphate'))
                .outputs(metaitem('monocrystalline_inp_seed_crystal'))
                .circuitMeta(1)
                .duration(800)
                .EUt(1200)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustIndiumPhosphide')* 4) //TODO ingot
                .inputs(metaitem('monocrystalline_inp_seed_crystal'))
                .outputs(metaitem('monocrystalline_inp_boule'))
                .circuitMeta(1)
                .duration(800)
                .EUt(1200)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('monocrystalline_inp_boule'))
                .outputs(metaitem('monocrystalline_inp_ingot')*16)
                .outputs(metaitem('monocrystalline_inp_seed_crystal'))
                .fluidInputs(fluid('water')*12)
                .duration(300)
                .EUt(8)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('monocrystalline_inp_boule'))
                .outputs(metaitem('monocrystalline_inp_ingot')*16)
                .outputs(metaitem('monocrystalline_inp_seed_crystal'))
                .fluidInputs(fluid('distilled_water')*9)
                .duration(150)
                .EUt(8)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('monocrystalline_inp_boule'))
                .outputs(metaitem('monocrystalline_inp_ingot')*16)
                .outputs(metaitem('monocrystalline_inp_seed_crystal'))
                .fluidInputs(fluid('lubricant')*5)
                .duration(50)
                .EUt(8)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('monocrystalline_inp_ingot'))
                .outputs(metaitem('indium_phosphide_wafer'))
                .fluidInputs(fluid('water')*12)
                .duration(300)
                .EUt(89012)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('monocrystalline_inp_ingot'))
                .outputs(metaitem('indium_phosphide_wafer'))
                .fluidInputs(fluid('distilled_water')*9)
                .duration(150)
                .EUt(89012)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('monocrystalline_inp_ingot'))
                .outputs(metaitem('indium_phosphide_wafer'))
                .fluidInputs(fluid('lubricant')*5)
                .duration(50)
                .EUt(89012)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('indium_phosphide_wafer'))
                .inputs(metaitem('dustZblan')) //TODO INGOT
                .outputs(metaitem('zblan_layered_inp_wafer'))
                .duration(80)
                .EUt(71232890)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('ingotBorosilicateGlass')) //TODO Plate
                .inputs(ore('circuitLuv'))
                .outputs(metaitem('optical_lithography_mask'))
                .duration(890)
                .EUt(78004523)
                .buildAndRegister();

        ION_IMPLANTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustDopedNanotubeDepositionMixture'))
                .inputs(metaitem('interconnected_inp_wafer'))
                .outputs(metaitem('resonant_inp_wafer'))
                .duration(560)
                .EUt(12864590)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('resonant_inp_wafer')).inputs(metaitem('dustNanotubeDepositionMix'))
                .outputs(metaitem('insulated_inp_wafer'))
                .duration(720)
                .EUt(8134590)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCarbonNanotubes'))
                .fluidInputs(fluid('xenon')*2000)
                .outputs(metaitem('dustDopedNanotubeDepositionMix'))
                .EUt(8003490)
                .duration(120)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('dustDopedNanotubeDepositionMix')).inputs(metaitem('re_exposed_inp_wafer'))
                .outputs(metaitem('electroluminescent_inp_wafer'))
                .duration(1200)
                .EUt(80901234)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('electroluminescent_inp_wafer')).inputs(metaitem('dustDopedNanotubeDepositionMixture'))
                .outputs(metaitem('recoated_inp_wafer'))
                .duration(1200)
                .EUt(80129012)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('contact_ready_inp_wafer'))
                .fluidInputs(fluid('tritanium')*144)
                .outputs(metaitem('optical_soc_wafer'))
                .duration(120)
                .EUt(70901212)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('optical_soc_wafer'))
                .outputs(metaitem('uninsulated_optical_soc')* 4)
                .duration(2009)
                .EUt(891282)
                .buildAndRegister();

        CVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('uninsulated_optical_soc'))
                .inputs(metaitem('plateFullerenePolymerMatrix'))
                .inputs(metaitem('plateFullerenePolymerTetrix'))
                .fluidInputs(fluid('liquid_crystal_detector')*144)
                .outputs(metaitem('insulated_optical_soc'))
                .duration(2009)
                .EUt(891282)
                .buildAndRegister();

        ION_IMPLANTER_RECIPES.recipeBuilder()
                .inputs(metaitem('contactless_optical_soc'))
                .inputs(metaitem('dustNaquadriaticTaranium'))
                .outputs(metaitem('optical_soc'))
                .duration(1202)
                .EUt(2096012)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustChromaticGlass'))
                .fluidInputs(fluid('xenon')*1000)
                .fluidInputs(fluid('seaborgium_doped_nanotubes')*1000)
                .outputs(metaitem('dustDopedNanotubeDepositionMix'))
                .duration(400)
                .EUt(52450)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCarbonNanotubes')) // Todo Fine Wire
                .fluidInputs(fluid('xenon')*1000)
                .outputs(metaitem('dustNanotubeDepositionMix'))
                .duration(400)
                .EUt(52450)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCarbonNanotubes')) // Todo Fine Wire
                .fluidInputs(fluid('krypton')*1000)
                .outputs(metaitem('dustDopedNanotubeDepositionMixture'))
                .duration(400)
                .EUt(52450)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .inputs(metaitem('gemExquisiteGlass'))
                .notConsumable(metaitem('glass_lens.magenta'))
                .outputs(metaitem('gemExquisiteChromaticGlass'))
                .duration(800)
                .EUt(901275)
                .buildAndRegister();

        ENGRAVING_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('super_fluid_helium_4')*4000)
                .fluidOutputs(fluid('helium')*4000)
                .duration(1200)
                .EUt(8000)
                .inputs(metaitem('barium_titanate_substrate_wafer'))
                .outputs(metaitem('engraved_titanate_substrate_wafer'))
                .notConsumable(metaitem('uhpic_lithography_mask'))
                .buildAndRegister();

        ENGRAVING_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('super_fluid_helium_4')*4000)
                .fluidOutputs(fluid('helium')*4000)
                .duration(1200)
                .EUt(8000)
                .inputs(metaitem('superconductor_coated_substrate_wafer'))
                .outputs(metaitem('wired_substrate_wafer'))
                .notConsumable(metaitem('uhpic_lithography_mask'))
                .buildAndRegister();

        ENGRAVING_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('super_fluid_helium_4')*4000)
                .fluidOutputs(fluid('helium')*4000)
                .duration(1200)
                .EUt(8000)
                .inputs(metaitem('flerovium_layered_wafer'))
                .outputs(metaitem('spinorial_memory_wafer'))
                .buildAndRegister();

        ENGRAVING_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('super_fluid_helium_4')*4000)
                .fluidOutputs(fluid('helium')*4000)
                .duration(1200)
                .EUt(8000)
                .inputs(metaitem('soc_wafer_base'))
                .outputs(metaitem('engraved_soc_wafer'))
                .notConsumable(metaitem('soc_lithography_mask'))
                .buildAndRegister();

        ENGRAVING_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('super_fluid_helium_4')*4000)
                .fluidOutputs(fluid('helium')*4000)
                .duration(1200)
                .EUt(8000)
                .inputs(metaitem('doped_oganesson_wafer'))
                .outputs(metaitem('engraved_hasoc_wafer'))
                .notConsumable(metaitem('uhasoc_lithography_mask'))
                .buildAndRegister();

        ENGRAVING_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('super_fluid_helium_4')*4000)
                .fluidOutputs(fluid('helium')*4000)
                .duration(1200)
                .EUt(8000)
                .inputs(metaitem('relayered_uhasoc_wafer'))
                .outputs(metaitem('fully_connected_uhasoc_wafer'))
                .notConsumable(metaitem('uhasoc_post_engraving_mask'))
                .buildAndRegister();

        ENGRAVING_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('super_fluid_helium_4')*4000)
                .fluidOutputs(fluid('helium')*4000)
                .duration(1200)
                .EUt(8000)
                .inputs(metaitem('zblan_layered_inp_wafer'))
                .outputs(metaitem('interconnected_inp_wafer'))
                .notConsumable(metaitem('optical_lithography_mask'))
                .buildAndRegister();

        ENGRAVING_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('super_fluid_helium_4')*4000)
                .fluidOutputs(fluid('helium')*4000)
                .duration(1200)
                .EUt(8000)
                .inputs(metaitem('insulated_inp_wafer'))
                .notConsumable(metaitem('optical_lithography_mask'))
                .outputs(metaitem('re_exposed_inp_wafer'))
                .buildAndRegister();

        ENGRAVING_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('super_fluid_helium_4')*4000)
                .fluidOutputs(fluid('helium')*4000)
                .duration(1200)
                .EUt(8000)
                .inputs(metaitem('recoated_inp_wafer'))
                .outputs(metaitem('contact_ready_inp_wafer'))
                .buildAndRegister();

        ENGRAVING_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('super_fluid_helium_4')*4000)
                .fluidOutputs(fluid('helium')*4000)
                .duration(1200)
                .EUt(8000)
                .inputs(metaitem('insulated_optical_soc'))
                .outputs(metaitem('contactless_optical_soc'))
                .buildAndRegister();

class PDopant {
    String metaItemName
    int efficiency
    public static ArrayList<PDopant> pdopants = new ArrayList<PDopant>();

    public PDopant(String metaItemName, int efficiency) {
        this.metaItemName = metaItemName
        this.efficiency = efficiency
        pdopants.add(this)
    }
}

class NDopant {
    String metaItemName
    int efficiency
    public static ArrayList<NDopant> ndopants = new ArrayList<NDopant>();

    public NDopant(String metaItemName, int efficiency) {
        this.metaItemName = metaItemName
        this.efficiency = efficiency
        ndopants.add(this)
    }
}

new NDopant("dustBoron", 1)
new NDopant("dustGallium", 2)
new NDopant("dustAluminium", 2)
new NDopant("dustTinyIndium", 1)

new PDopant("dustAntimony", 1)
new PDopant("dustPhosphorus", 2)
new PDopant("dustArsenic", 2)


for (ndopant in NDopant.ndopants) {

for (pdopant in PDopant.pdopants) {
                        int batchSize = pdopant.efficiency * ndopant.efficiency


                CVD_UNIT_RECIPES.recipeBuilder()
                        .inputs(metaitem('engraved_power_ic_wafer') * batchSize)
                        .inputs(metaitem(ndopant.metaItemName))
                        .inputs(metaitem(pdopant.metaItemName))
                        .outputs(metaitem('doped_power_ic_wafer') * batchSize)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                CVD_UNIT_RECIPES.recipeBuilder()
                        .inputs(metaitem('polysilicon_wafer'))
                        .inputs(metaitem(ndopant.metaItemName))
                        .inputs(metaitem(pdopant.metaItemName))
                        .outputs(metaitem('doped_polysilicon_wafer'))
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                CVD_UNIT_RECIPES.recipeBuilder()
                        .inputs(metaitem('engraved_ram_wafer') * batchSize)
                        .inputs(metaitem(ndopant.metaItemName))
                        .inputs(metaitem(pdopant.metaItemName))
                        .outputs(metaitem('doped_ram_wafer') * batchSize)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                CVD_UNIT_RECIPES.recipeBuilder()
                        .inputs(metaitem('engraved_cpu_wafer') * batchSize)
                        .inputs(metaitem(ndopant.metaItemName))
                        .inputs(metaitem(pdopant.metaItemName))
                        .outputs(metaitem('doped_cpu_wafer') * batchSize)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                CVD_UNIT_RECIPES.recipeBuilder()
                        .inputs(metaitem('engraved_ic_wafer') * batchSize)
                        .inputs(metaitem(ndopant.metaItemName))
                        .inputs(metaitem(pdopant.metaItemName) )
                        .outputs(metaitem('doped_power_ic_wafer') * batchSize)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                CHEMICAL_BATH_RECIPES.recipeBuilder()
                        .fluidInputs(fluid('very_hot_nitrogen')*1000)
                        .fluidOutputs(fluid('nitrogen')*1000)
                        .inputs(metaitem('doped_power_ic_wafer'))
                        .outputs(metaitem('wafer.integrated_logic_circuit'))
                        .duration(200)
                        .EUt(12)
                        .buildAndRegister();

                ION_IMPLANTER_RECIPES.recipeBuilder()
                        .inputs(metaitem('engraved_nanocpu_wafer') * batchSize)
                        .fluidInputs(fluid('very_hot_argon')*1000 * batchSize)
                        .fluidOutputs(fluid('argon')*1000 * batchSize)
                        .inputs(metaitem(ndopant.metaItemName))
                        .inputs(metaitem(pdopant.metaItemName))
                        .outputs(metaitem('doped_nanocpu_wafer') * batchSize)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                ION_IMPLANTER_RECIPES.recipeBuilder()
                        .inputs(metaitem('engraved_spinorial_memory_wafer') * batchSize)
                        .inputs(metaitem(ndopant.metaItemName))
                        .inputs(metaitem(pdopant.metaItemName))
                        .outputs(metaitem('doped_aram_wafer') * batchSize)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                ION_IMPLANTER_RECIPES.recipeBuilder()
                        .inputs(metaitem('engraved_hasoc_wafer') * batchSize)
                        .inputs(metaitem('dustNaquadah') * batchSize)
                        .inputs(metaitem(ndopant.metaItemName))
                        .inputs(metaitem(pdopant.metaItemName))
                        .outputs(metaitem('unpolarized_hasoc_wafer') * batchSize)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                ION_IMPLANTER_RECIPES.recipeBuilder()
                        .inputs(metaitem('engraved_asoc_wafer') * batchSize)
                        .inputs(metaitem(ndopant.metaItemName))
                        .inputs(metaitem(pdopant.metaItemName))
                        .outputs(metaitem('doped_asoc_wafer') * batchSize)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                ION_IMPLANTER_RECIPES.recipeBuilder()
                        .inputs(metaitem('engraved_soc_wafer') * batchSize)
                        .inputs(metaitem(ndopant.metaItemName))
                        .inputs(metaitem(pdopant.metaItemName))
                        .outputs(metaitem('doped_soc_wafer') * batchSize)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

                ION_IMPLANTER_RECIPES.recipeBuilder()
                        .inputs(metaitem('silicon_dioxide_wafer') * batchSize)
                        .inputs(metaitem(ndopant.metaItemName))
                        .outputs(metaitem('n_doped_silicon_dioxide_wafer') * batchSize)
                        .duration(800)
                        .EUt(100)
                        .buildAndRegister();

            }
}
        FUSION_RECIPES.recipeBuilder()
                .EUToStart(160000000)
                .fluidInputs(fluid('helium_3')*12)
                .fluidInputs(fluid('helium_3')*12)
                .fluidOutputs(fluid('helium_4')*12)
                .duration(200)
                .EUt(820)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .inputs(metaitem('spinorial_memory_wafer'))
                .notConsumable(metaitem('glass_lens.yellow'))
                .outputs(metaitem('engraved_spinorial_memory_wafer'))
                .duration(120)
                .EUt(900)
                .buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('tritanium')*1296)
                .inputs(metaitem('plateElectronDegenerateRhenium'))
                .inputs(metaitem('field.generator.luv'))
                .inputs(metaitem('plateOsmiridium'))
                .inputs(metaitem('plateRhodiumPlatedPalladium'))
                .outputs(metaitem('controlled_shaped_naquadria_charge_casing'))
                .duration(800)
                .EUt(612)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('controlled_shaped_naquadria_charge_casing'))
                .inputs(item('gtb:gtb_explosive'))
                .outputs(metaitem('controlled_shaped_naquadria_charge_casing'))
                .EUt(800000)
                .duration(120)
                .circuitMeta(2)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustTitanium'))
                .inputs(metaitem('dustBarium'))
                .fluidInputs(fluid('oxygen')*2000)
                .outputs(metaitem('dustBariumTitanate')* 4)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSilicon'))
                .inputs(metaitem('dustCarbon'))
                .fluidOutputs(fluid('silicon_carbide')*1000)
                .EUt(120)
                .duration(600)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*2000)
                .inputs(metaitem('dustPhosphorus')* 2)
                .fluidOutputs(fluid('phosphorus_solution')*2000)
                .duration(120)
                .EUt(80)
                .buildAndRegister();

        CRYSTALLIZATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('phosphorus_solution')*1000)
                .outputs(metaitem('dustWhitePhosphorus'))
                .fluidOutputs(fluid('water')*1000)
                .duration(90)
                .EUt(70)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen_chloride')*2000)
                .fluidInputs(fluid('chloro_silane')*1000)
                .fluidOutputs(fluid('trichlorosilane')*2000)
                .fluidOutputs(fluid('hydrogen')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chlorine')*1000)
                .fluidInputs(fluid('hydrogen')*1000)
                .circuitMeta(3)
                .fluidOutputs(fluid('hydrogen_chloride')*2000)
                .duration(500)
                .EUt(8)
                .buildAndRegister();
        VACUUM_DISTILLATION_TOWER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSilicon'))
                .outputs(metaitem('dustHighPuritySilicon'))
                .EUt(10000)
                .duration(200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chlorine')*4000)
                .inputs(metaitem('dustSilicon'))
                .fluidOutputs(fluid('silicon_tetrachloride')*1000)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('silicon_tetrachloride')*1000)
                .fluidInputs(fluid('hydrogen')*4000)
                .fluidOutputs(fluid('hydrochloric_acid')*4000)
                .outputs(metaitem('dustHighPuritySilicon'))
                .duration(120)
                .EUt(8)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('trichlorosilane')*1000)
                .outputs(metaitem('dustHighPuritySilicon'))
                .fluidInputs(fluid('hydrogen')*2000)
                .fluidOutputs(fluid('hydrochloric_acid')*2000)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        VACUUM_EJECTION_RECIPES.recipeBuilder()
                .inputs(metaitem('dustHighPuritySilicon'))
                .outputs(metaitem('monocrystalline_seed_crystal'))
                .duration(400)
                .EUt(2)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('lubricant')*20)
                .inputs(metaitem('boule.silicon'))
                .outputs(metaitem('wafer.silicon')*16)
                .outputs(metaitem('monocrystalline_seed_crystal'))
                .duration(400)
                .EUt(64)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*40)
                .inputs(metaitem('boule.silicon'))
                .outputs(metaitem('wafer.silicon')*16)
                .outputs(metaitem('monocrystalline_seed_crystal'))
                .duration(600)
                .EUt(68)
                .buildAndRegister();

        CUTTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*60)
                .inputs(metaitem('boule.silicon'))
                .outputs(metaitem('wafer.silicon')*16)
                .outputs(metaitem('monocrystalline_seed_crystal'))
                .duration(800)
                .EUt(70)
                .buildAndRegister();

// RAM Wafer * 1
mods.gregtech.laser_engraver.removeByInput(120, [metaitem('wafer.silicon'), metaitem('glass_lens.green')], null)
// RAM Wafer * 4
mods.gregtech.laser_engraver.removeByInput(480, [metaitem('wafer.phosphorus'), metaitem('glass_lens.green')], null)
// RAM Wafer * 8
mods.gregtech.laser_engraver.removeByInput(1920, [metaitem('wafer.naquadah'), metaitem('glass_lens.green')], null)
// RAM Wafer * 16
mods.gregtech.laser_engraver.removeByInput(7680, [metaitem('wafer.neutronium'), metaitem('glass_lens.green')], null)
// Integrated Logic Circuit Wafer * 1
mods.gregtech.laser_engraver.removeByInput(120, [metaitem('wafer.silicon'), metaitem('glass_lens.red')], null)
// Integrated Logic Circuit Wafer * 4
mods.gregtech.laser_engraver.removeByInput(480, [metaitem('wafer.phosphorus'), metaitem('glass_lens.red')], null)
// Integrated Logic Circuit Wafer * 8
mods.gregtech.laser_engraver.removeByInput(1920, [metaitem('wafer.naquadah'), metaitem('glass_lens.red')], null)
// Integrated Logic Circuit Wafer * 16
mods.gregtech.laser_engraver.removeByInput(7680, [metaitem('wafer.neutronium'), metaitem('glass_lens.red')], null)
// CPU Wafer * 1
mods.gregtech.laser_engraver.removeByInput(120, [metaitem('wafer.silicon'), metaitem('glass_lens.light_blue')], null)
// CPU Wafer * 4
mods.gregtech.laser_engraver.removeByInput(480, [metaitem('wafer.phosphorus'), metaitem('glass_lens.light_blue')], null)
// CPU Wafer * 8
mods.gregtech.laser_engraver.removeByInput(1920, [metaitem('wafer.naquadah'), metaitem('glass_lens.light_blue')], null)
// CPU Wafer * 16
mods.gregtech.laser_engraver.removeByInput(7680, [metaitem('wafer.neutronium'), metaitem('glass_lens.light_blue')], null)
// Simple SoC Wafer * 1
mods.gregtech.laser_engraver.removeByInput(120, [metaitem('wafer.silicon'), metaitem('glass_lens.cyan')], null)
// Simple SoC Wafer * 4
mods.gregtech.laser_engraver.removeByInput(480, [metaitem('wafer.phosphorus'), metaitem('glass_lens.cyan')], null)
// Simple SoC Wafer * 8
mods.gregtech.laser_engraver.removeByInput(1920, [metaitem('wafer.naquadah'), metaitem('glass_lens.cyan')], null)
// Simple SoC Wafer * 16
mods.gregtech.laser_engraver.removeByInput(7680, [metaitem('wafer.neutronium'), metaitem('glass_lens.cyan')], null)
// ULPIC Wafer * 1
mods.gregtech.laser_engraver.removeByInput(120, [metaitem('wafer.silicon'), metaitem('glass_lens.blue')], null)
// ULPIC Wafer * 4
mods.gregtech.laser_engraver.removeByInput(480, [metaitem('wafer.phosphorus'), metaitem('glass_lens.blue')], null)
// ULPIC Wafer * 8
mods.gregtech.laser_engraver.removeByInput(1920, [metaitem('wafer.naquadah'), metaitem('glass_lens.blue')], null)
// ULPIC Wafer * 16
mods.gregtech.laser_engraver.removeByInput(7680, [metaitem('wafer.neutronium'), metaitem('glass_lens.blue')], null)
// LPIC Wafer * 1
mods.gregtech.laser_engraver.removeByInput(120, [metaitem('wafer.silicon'), metaitem('glass_lens.orange')], null)
// LPIC Wafer * 4
mods.gregtech.laser_engraver.removeByInput(480, [metaitem('wafer.phosphorus'), metaitem('glass_lens.orange')], null)
// LPIC Wafer * 8
mods.gregtech.laser_engraver.removeByInput(1920, [metaitem('wafer.naquadah'), metaitem('glass_lens.orange')], null)
// LPIC Wafer * 16
mods.gregtech.laser_engraver.removeByInput(7680, [metaitem('wafer.neutronium'), metaitem('glass_lens.orange')], null)
// NAND Wafer * 1
mods.gregtech.laser_engraver.removeByInput(480, [metaitem('wafer.phosphorus'), metaitem('glass_lens.gray')], null)
// NAND Wafer * 4
mods.gregtech.laser_engraver.removeByInput(1920, [metaitem('wafer.naquadah'), metaitem('glass_lens.gray')], null)
// NAND Wafer * 8
mods.gregtech.laser_engraver.removeByInput(7680, [metaitem('wafer.neutronium'), metaitem('glass_lens.gray')], null)

