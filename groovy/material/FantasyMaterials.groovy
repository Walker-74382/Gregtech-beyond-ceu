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

        NaquadahWaste = new Material.Builder(14009,
                GTBUtil.gtb("naquadah_waste"))
                        .fluid()
                        .color(0x2d690b).build().setFormula("Nq?");

        RareNaquadahWaste = new Material.Builder(14010, GTBUtil.gtb("rare_naquadah_waste"))
                        .fluid()
                        .color(0x0c2100)
                        .build().setFormula("Nq*?");

        NaqHydrochloricAcid = new Material.Builder(14011, GTBUtil.gtb("naq_hydrochloric_acid"))
                        .fluid()
                        .color(0x1d4f00)
                        .build().setFormula("Nq(HCl)");

        RareNaqFluoroantimonicAcid = new Material.Builder(14012, GTBUtil.gtb("rare_naq_fluoroantimonic_acid"))
                        .fluid()
                        .color(0xa1c9a5)
                        .build().setFormula("Nq*H2SbF7");

        CrystalFluix = new Material.Builder(14013, "crystal_fluix")
                        .gem().fluid()
                        .color(0x975CF7).iconSet("certus") //make it a bit brighter
                        .components(material('silicon')*1, material('redstone')*1, material('nether_quartz')*1, material('certus_quartz')*1)
                        .flags("generate_plate", "no_smelting", "crystallizable", "generate_bolt_screw")
                        .build()





  }
 
 }