package material;


import static material.GTBMaterials.*;

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

public class FantasyMaterials {

  public static void register() {




        log.infoMC('Registering Fantasy Materials!');


        DegenerateRhenium = new Material.Builder(14001, GTBUtil.gtb("degenerate_rhenium"))
                .dust()
                .ingot()
                .fluid()
                .flags(GENERATE_FRAME, GENERATE_PLATE, GENERATE_ROD)
                .color(0x6A8D9F)
                .build();

        DegenerateRhenium.setFormula("Re*", true)
        
        AwakenedDraconium = new Material.Builder(14002, GTBUtil.gtb("awakened_draconium"))
                .ingot()
                .build().setFormula("AwDr", true);

        Adamantium = new Material.Builder(14003, GTBUtil.gtb("adamantium"))
                .ingot()
                .build().setFormula("Ad", true);

        CosmicNeutronium = new Material.Builder(14004, GTBUtil.gtb("cosmic_neutronium"))
                .ingot()
                .build().setFormula("SpNt", true);

        Infinity = new Material.Builder(14005, GTBUtil.gtb("infinity"))
                .ingot()
                .build().setFormula("If", true);

        Eternal = new Material.Builder(14006, GTBUtil.gtb("eternal"))
                .ingot()
                .build().setFormula("Et*", true);

        TemporallyConstrainedAntiMatter = new Material.Builder(14007,
                GTBUtil.gtb("temporally_constrained_anti_matter"))
                        .ingot()
                        .build().setFormula("Am**", true);

        CataclysmInducedMixedMatter = new Material.Builder(14008,
                GTBUtil.gtb("cataclysm_induced_mixed_matter"))
                        .ingot()
                        .build().setFormula("Mm***", true);

        NaquadahWaste = new Material.Builder(14009,
                GTBUtil.gtb("naquadah_waste"))
                        .fluid()
                        .color(0x2d690b).build().setFormule("Nq?");

        RareNaquadahWaste = new Material.Builder(14010,
                GTBUtil.gtb("rare_naquadah_waste"))
                        .fluid()
                        .color(0x0c2100).setFormule("Nq*?").build();

        NaqHydrochloricAcid = new Material.Builder(14011,
                GTBUtil.gtb("naq_hydrochloric_acid"))
                        .fluid()
                        .color(0x1d4f00).setFormule("Nq(HCl)").build();

        RareNaqFluoroantimonicAcid = new Material.Builder(14012,
                GTBUtil.gtb("rare_naq_fluoroantimonic_acid"))
                        .fluid()
                        .color(0xa1c9a5).setFormule("Nq*H2SbF7").build();







  }}