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


        StyreneSuspension = new Material.Builder(12000, GTBUtil.gtb("styrene_suspension"))
                .fluid()
                .colorAverage()
                .build();

        StyreneSuspension.setFormula("C8H8(H2O)", true)




  }
  

}