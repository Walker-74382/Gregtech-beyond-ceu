package material;

import static material.GTBMaterials.*;

import gregtech.api.unification.material.Material;
import gregtech.api.GregTechAPI;
import gregtech.api.fluids.attribute.FluidAttributes;
import gregtech.api.fluids.FluidBuilder;
import gregtech.api.unification.material.properties.*

import gtb.api.utils.GTBUtil;

import static gregtech.api.unification.material.info.MaterialIconSet.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.Materials.*;
import static gtb.api.unification.materials.info.GTBMaterialFlags.*;


public class SecondDegreeMaterials {
  public static void register() {

        log.infoMC('Registering Second Degree Materials!');


        StyreneSuspension = new Material.Builder(14000, GTBUtil.gtb("styrene_suspension"))
                .fluid()
                .color(0x898685)
                .build();

        StyreneSuspension.setFormula("C8H8(H2O)", true)

        PolystyreneSuspension = new Material.Builder(14001, GTBUtil.gtb("polystyrene_suspension"))
                .fluid()
                .color(0x7A7474)
                .build();

        PolystyreneSuspension.setFormula("(C8H8(H2O))n", true)

        PolyvinylAcetateSolution = new Material.Builder(14002, GTBUtil.gtb("polyvinyl_acetate_solution"))
                .fluid()
                .color(0xC88B79)
                .build();

        PolyvinylAcetateSolution.setFormula("(C4H6O2(H2O))n", true)

        PolyvinylChlorideSolution = new Material.Builder(14003, GTBUtil.gtb("polyvinyl_chloride_solution"))
                .fluid()
                .color(0xB7D4D8)
                .build();

        PolyvinylChlorideSolution.setFormula("(C2H3Cl(H2O))n", true)







  }
  

}