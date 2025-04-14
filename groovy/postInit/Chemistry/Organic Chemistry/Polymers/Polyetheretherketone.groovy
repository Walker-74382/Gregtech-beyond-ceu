import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

CHEMICAL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('carbon_dioxide')*1000)
    .fluidInputs(fluid('methanol')*1000)
    .fluidOutputs(fluid('methyl_formate')*1000)
    .duration(500)
    .EUt(320)
    .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder()
    .fluidOutputs(fluid('dimethylformamide')*1000)
    .fluidInputs(fluid('dimethylamine')*1000)
    .fluidInputs(fluid('methyl_formate')*1000)
    .duration(500)
    .EUt(320)
    .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('bromine')*1000)
    .notConsumable(metaitem('dustAluminiumBromide'))
    .fluidInputs(fluid('toluene')*1000)
    .fluidOutputs(fluid('bromotoluene')*1000) //
    .duration(500)
    .EUt(320)
    .buildAndRegister();

MIXER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('bromotoluene')*1000)
    .fluidInputs(fluid('dimethylformamide')*1000)
    .fluidOutputs(fluid('fluorotoluene_mixture')*2000) //
    .inputs(metaitem('dustPotassiumFluoride'))
    .outputs(metaitem('dustPotassiumBromide'))
    .duration(400)
    .EUt(620)
    .buildAndRegister();

DISTILLATION_RECIPES.recipeBuilder()
    .fluidInputs(fluid('fluorotoluene_mixture')*2000)
    .fluidOutputs(fluid('dimethylformamide')*1000)
    .fluidOutputs(fluid('fluorotoluene')*1000)
    .duration(700)
    .EUt(520)
    .buildAndRegister();


CHEMICAL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('fluorotoluene')*1000)
    .fluidInputs(fluid('water')*1000)
    .notConsumable(metaitem('dustPotassiumPermanganate'))
    .fluidOutputs(fluid('fluorobenzoic_acid')*1000)
    .duration(80)
    .EUt(220)
    .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder()
    .fluidInputs(fluid('fluorobenzoic_acid')*1000)
    .fluidInputs(fluid('thionyl_chloride')*1000)
    .fluidOutputs(fluid('fluorobenzoyl_chloride')*1000)
    .fluidOutputs(fluid('hydrogen_chloride')*1000)
    .fluidOutputs(fluid('sulfur_dioxide')*1000)
    .duration(400)
    .EUt(420)
    .buildAndRegister();

//Friedel-Crafts Acylation

MIXER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('fluorobenzene')*500)
    .fluidInputs(fluid('carbon_disulfide')*1500)
    .fluidOutputs(fluid('fluorobenzene_mixture')*1000)
    .duration(500)
    .EUt(130)
    .buildAndRegister();

CHEMICAL_RECIPES.recipeBuilder() //CSTR
    .fluidInputs(fluid('fluorobenzene_mixture')*1000)
    .fluidInputs(fluid('fluorobenzoyl_chloride')*1000)
    .notConsumable(metaitem('dustAluminiumChloride'))
    .notConsumable(fluid('nitrogen')*2000)
    .fluidOutputs(fluid('difluorobenzophenone')*1000)
    .duration(300)
    .EUt(20)
    .buildAndRegister();


//OVERALL REACTION
//C 38       //C 38
//H 30       //H 30
//O 8        //O 8
//2(C6H4(OH)2) + 2(C13H8OF2) -> 4HF + 2(C19H12O3)

    //2(C6H4(OH)2) + 2(C13H8OF2) + 2(K2CO3) + 4(C12H10O2S) -> 12(C6H4(OH)2)(C13H8OF2)(K2CO3)(C12H10O2S)
CHEMICAL_RECIPES.recipeBuilder() //CSTR TODO
    .fluidInputs(fluid('hydroquinone') * 2000)
    .fluidInputs(fluid('difluorobenzophenone')*2000)
    .inputs(metaitem('dustPotassiumCarbonate')*2)
    .fluidInputs(fluid('diphenyl_sulfone')*4000) //
    .fluidOutputs(fluid('peek_reaction_mixture')*12000) //
    .duration(200)
    .EUt(400)
    .buildAndRegister();
    
    //(C6H4(OH)2)(C13H8OF2)(K2CO3)(C12H10O2S) + 2(N) -> [(C6H4(OH)2)(C13H8OF2)(K2CO3)(C12H10O2S)]n
POLYMERIZATION_TANK_RECIPES.recipeBuilder()
    .fluidInputs(fluid('peek_reaction_mixture')*1000)
    .fluidInputs(fluid('nitrogen')*2000)
    .notConsumable(metaitem('dustZieglerNattaCatalyst'))
    .fluidOutputs(fluid('post_polymerization_peek_mixture')*1000) //
    .duration(200)
    .EUt(500)
    .buildAndRegister();

    //6[(C6H4(OH)2)(C13H8OF2)(K2CO3)(C12H10O2S)]n -> 2(C12H10O2S) + 4[(C6H4(OH)2)(C13H8OF2)(K2CO3)]n

VACUUM_RECIPES.recipeBuilder()
    .fluidInputs(fluid('post_polymerization_peek_mixture')*5000) 
    .fluidOutputs(fluid('diphenyl_sulfone')*2000) //
    .fluidOutputs(fluid('precipitated_peek_mixture')*3000) //
    .duration(200)
    .EUt(500)
    .buildAndRegister();

    //4[[(C6H4(OH)2)(C13H8OF2)(K2CO3)]n + CH4O -> 2 (K2CO3) + 2[(C6H4(OH)2)(C13H8OF2)(CH4O)]n

CENTRIFUGE_RECIPES.recipeBuilder()
    .fluidInputs(fluid('precipitated_peek_mixture')*3000)
    .outputs(metaitem('dustPotassiumCarbonate'))
    .fluidInputs(fluid('methanol')*1000)
    .fluidOutputs(fluid('purified_peek_mixture')*3000)
    .duration(400)
    .EUt(400)
    .buildAndRegister();

DRYER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('purified_peek_mixture')*3000)
    .fluidOutputs(fluid('polyetheretherketone')*2000)
    .fluidOutputs(fluid('polyetheretherketone_waste')*1000)
    .duration(400)
    .EUt(400)
    .buildAndRegister();

DISTILLATION_RECIPES.recipeBuilder()
    .fluidInputs(fluid('polyetheretherketone_waste')*1000)
    .fluidOutputs(fluid('methanol')*1000)
    .fluidOutputs(fluid('hydrogen_fluoride')*2000)
    .duration(600)
    .EUt(400)
    .buildAndRegister();

// Polycaprolactam Bar * 1
mods.gregtech.extruder.removeByInput(28, [metaitem('dustPolycaprolactam'), metaitem('shape.extruder.ingot')], null)



