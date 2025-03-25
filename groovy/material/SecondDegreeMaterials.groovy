package material;

import static material.GTBMaterial.*;

import gregtech.api.unification.material.Material;
import gregtech.api.GregTechAPI;
import gregtech.api.fluids.attribute.FluidAttributes;
import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.properties.*;
import gtb.api.utils.GTBUtil;

import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.Materials.*;
import static gtb.api.unification.materials.info.GTBMaterialFlags.*;


public class SecondDegreeMaterials {
        
  public static void register() {

        log.infoMC('Registering Second Degree Materials!');


        StyreneSuspension = new Material.Builder(10001, GTBUtil.gtb("styrene_suspension"))
                .liquid(new FluidBuilder())
                .color(0x898685)
                .build();

        StyreneSuspension.setFormula("C8H8(H2O)", true)

        PolystyreneSuspension = new Material.Builder(10002, GTBUtil.gtb("polystyrene_suspension"))
                .liquid(new FluidBuilder())
                .color(0x7A7474)
                .build();

        PolystyreneSuspension.setFormula("[(C8H8)(H2O)]n", true)

        PolyvinylAcetateSolution = new Material.Builder(10003, GTBUtil.gtb("polyvinyl_acetate_solution"))
                .liquid(new FluidBuilder())
                .color(0xC88B79)
                .build();

        PolyvinylAcetateSolution.setFormula("[(C4H6O2)(H2O)]n", true)

        PolyvinylChlorideSolution = new Material.Builder(10004, GTBUtil.gtb("polyvinyl_chloride_solution"))
                .liquid(new FluidBuilder())
                .color(0xB7D4D8)
                .build();

        PolyvinylChlorideSolution.setFormula("[(C2H3Cl)(H2O)]n", true)

        PeekReactionMixture = new Material.Builder(10005, GTBUtil.gtb("peek_reaction_mixture"))
                .liquid(new FluidBuilder())
                .color(0x808687)
                .build();

        PeekReactionMixture.setFormula("(C6H6O2)(C13H8OF2)(K2CO3)(C12H10O2S)", true)

        PostPolymerizationPeekMixture = new Material.Builder(10006, GTBUtil.gtb("post_polymerization_peek_mixture"))
                .liquid(new FluidBuilder())
                .color(0x6A6D6D)
                .build();

        PostPolymerizationPeekMixture.setFormula("[(C6H6O2)(C13H8OF2)(K2CO3)(C12H10O2S)]n", true)

        FluorobenzeneMixture = new Material.Builder(10007, GTBUtil.gtb("fluorobenzene_mixture"))
                .liquid(new FluidBuilder())
                .color(0x4F6466)
                .build();

        FluorobenzeneMixture.setFormula("(CS2)(C6H5F)", true)

        PrecipitatedPeekMixture = new Material.Builder(10008, GTBUtil.gtb("precipitated_peek_mixture"))
                .liquid(new FluidBuilder())
                .color(0x323333)
                .build();

        PrecipitatedPeekMixture.setFormula("[(C6H6O2)(C13H8OF2)(K2CO3)]n", true)

        PolyetheretherketoneWaste = new Material.Builder(10009, GTBUtil.gtb("polyetheretherketone_waste"))
                .liquid(new FluidBuilder())
                .color(0x333636)
                .build();

        PolyetheretherketoneWaste.setFormula("2((HF)(CH3OH))", true)
    }

}