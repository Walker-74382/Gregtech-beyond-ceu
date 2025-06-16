import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;




        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('dustSphalerite'))
                .inputs(metaitem('dustCoke'))
                .outputs(metaitem('dustZincOreCokePellets')* 3)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*6000)
                .inputs(metaitem('dustZincOreCokePellets')* 6)
                .outputs(metaitem('dustZincite')* 4)
                .outputs(metaitem('dustZincResidualSlag'))
                .fluidOutputs(fluid('zinc_exhaust_mixture')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('zinc_exhaust_mixture')*1000)
                .chancedOutput(metaitem('dustZincFlue')*1, 4500, 750)
                .chancedOutput(metaitem('dustDarkAsh')*1, 2500, 120)
                .fluidOutputs(fluid('carbon_monoxide')*1000)
                .fluidOutputs(fluid('sulfur_dioxide')*1000)
                .EUt(120)
                .duration(70)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .inputs(metaitem('dustZincFlue'))
                .outputs(metaitem('dustCadmiumZinc'))
                .duration(200)
                .EUt(960)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('mercury')*1000)
                .inputs(metaitem('dustCadmiumZinc')* 3)
                .fluidOutputs(fluid('cadmium_thalliun_liqour')*1000)
                .fluidOutputs(fluid('zinc_amalgam')*1000)
                .duration(120)
                .EUt(700)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('zinc_amalgam')*1000)
                .fluidOutputs(fluid('mercury')*1000)
                .outputs(metaitem('dustZinc'))
                .duration(600)
                .EUt(80)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('cadmium_thalliun_liqour')*1000)
                .outputs(metaitem('dustThalliumResidues'))
                .fluidOutputs(fluid('cadmium_sulfate_solution')*1000)
                .duration(290)
                .EUt(129)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('cadmium_sulfate_solution')*9000)
                .outputs(metaitem('dustCadmium')* 1)
                .fluidOutputs(fluid('sulfuric_acid')*9000)
                .duration(200)
                .EUt(780)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('dustThalliumResidues'))
                .fluidOutputs(fluid('thallium_sulfate_solution')*1000)
                .duration(600)
                .EUt(580)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrochloric_acid')*1000)
                .fluidOutputs(fluid('water')*1000)
                .fluidOutputs(fluid('sulfuric_acid')*1000)
                .fluidInputs(fluid('thallium_sulfate_solution')*1000)
                .outputs(metaitem('dustThalliumChloride')* 4)
                .duration(500)
                .EUt(700)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustZinc'))
                .outputs(metaitem('dustZincChloride')* 3)
                .inputs(metaitem('dustThalliumChloride')* 4)
                .outputs(metaitem('dustThallium')* 2)
                .duration(200)
                .EUt(67)
                .buildAndRegister();

        MACERATOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustZincResidualSlag'))
                .outputs(metaitem('dustFineZincSlag'))
                .duration(60)
                .EUt(17)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*1000)
                .inputs(metaitem('dustFineZincSlag'))
                .fluidOutputs(fluid('zinc_slag_slurry')*1000)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('zinc_slag_slurry')*1000)
                .chancedOutput(metaitem('dustZincResidualSlag')*1,2500, 200)
                .fluidOutputs(fluid('metal_rich_slag_slurry')*1000)
                .duration(120)
                .EUt(60)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('phosphoric_acid')*1000)
                .fluidInputs(fluid('metal_rich_slag_slurry')*1000)
                .fluidOutputs(fluid('acidic_metal_rich_slag_slurry')*1000)
                .duration(600)
                .EUt(570)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('phosphoric_acid')*1000)
                .fluidInputs(fluid('acidic_metal_rich_slag_slurry')*2000)
                .fluidOutputs(fluid('separated_metal_rich_slag_slurry')*1000)
                .fluidOutputs(fluid('metal_rich_slag_slurry')*1000)
                .duration(200)
                .EUt(900)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('separated_metal_rich_slag_slurry') * 1000)
                .inputs(metaitem('dustSodiumHydroxide')* 18)
                .outputs(metaitem('dustDisodiumPhosphate')* 24)
                .fluidOutputs(fluid('metal_hydroxide_mix')*1000)
                .fluidOutputs(fluid('water')*1000)
                .duration(200)
                .EUt(1200)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('metal_hydroxide_mix')*1000)
                .notConsumable(metaitem('wireFineZinc'))
                .chancedOutput(metaitem('dustZinc')*1, 5000, 0)
                .fluidOutputs(fluid('zinc_poor_mixture')*1000)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('zinc_poor_mixture')*1000)
                .notConsumable(metaitem('wireFineIron'))
                .chancedOutput(metaitem('dustIron')*1, 5000, 0)
                .fluidOutputs(fluid('iron_poor_mixture')*1000)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('iron_poor_mixture')*1000)
                .notConsumable(metaitem('wireFineCopper'))
                .chancedOutput(metaitem('dustCopper')*1, 5000, 0)
                .fluidOutputs(fluid('indium_hydroxide_concentrate')*1000)
                .duration(200)
                .EUt(70)
                .buildAndRegister();

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('indium_hydroxide_concentrate')*1000)
                .outputs(metaitem('dustIndiumHydroxide')* 7)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .outputs(metaitem('dustIndium'))
                .inputs(metaitem('dustIndiumHydroxide')* 7)
                .fluidInputs(fluid('hydrogen')*3000)
                .fluidOutputs(fluid('steam')*3000)
                .duration(760)
                .EUt(1200)
                .buildAndRegister();

// Indium Concentrate * 1000
mods.gregtech.mixer.removeByInput(150, [metaitem('crushedPurifiedSphalerite'), metaitem('crushedPurifiedGalena')], [fluid('sulfuric_acid') * 4000 * 4000])
// Small Pile of Indium Dust * 1
mods.gregtech.chemical_reactor.removeByInput(600, [metaitem('circuit.integrated').withNbt(['Configuration': 1]), metaitem('dustAluminium') * 4], [fluid('indium_concentrate') * 1000 * 1000])
// Indium Dust * 1
mods.gregtech.chemical_reactor.removeByInput(600, [metaitem('circuit.integrated').withNbt(['Configuration': 4]), metaitem('dustAluminium') * 16], [fluid('indium_concentrate') * 4000 * 4000])
// Lead Dust * 1
mods.gregtech.centrifuge.removeByInput(30, null, [fluid('lead_zinc_solution') * 1000 * 1000])

// Indium Dust * 1
mods.gregtech.large_chemical_reactor.removeByInput(600, [metaitem('circuit.integrated').withNbt(['Configuration': 4]), metaitem('dustAluminium') * 16], [fluid('indium_concentrate') * 4000 * 4000])
// Small Pile of Indium Dust * 1
mods.gregtech.large_chemical_reactor.removeByInput(600, [metaitem('circuit.integrated').withNbt(['Configuration': 1]), metaitem('dustAluminium') * 4], [fluid('indium_concentrate') * 1000 * 1000])
