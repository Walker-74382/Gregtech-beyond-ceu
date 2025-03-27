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


public class OreMaterials {
        
  public static void register() {


        AluminiumSalt = new Material.Builder(16001, GTBUtil.gtb("aluminium_salt"))
                .dust()
                .ore()
                .color(0x81C784)
                .build().setFormula('Al(NaCl)', true);

        AluminiumSaltSolution = new Material.Builder(16002, GTBUtil.gtb("aluminium_salt_solution"))
                .liquid(new FluidBuilder())
                .color(0x81C784)
                .build().setFormula('Al(NaCl)(H2O)', true);

        Hematite = new Material.Builder(16003, GTBUtil.gtb("hematite"))
                .ore()
                .dust()
                .color(0x81C784)
                .build().setFormula('Al(NaCl)(H2O)', true);

        Enargite = new Material.Builder(16004, GTBUtil.gtb("enargite"))
                .ore()
                .dust()
                .color(0x81C784)
                .build().setFormula('Cu3AsS4', true);

        Carrolite = new Material.Builder(16005, GTBUtil.gtb("carrolite"))
                .ore()
                .dust()
                .color(0x81C784)
                .build().setFormula('CuCo2SO4', true);

        RoastedCarrolite = new Material.Builder(16006, GTBUtil.gtb("roasted_carrolite"))
                .dust()
                .color(0x81C784)
                .build().setFormula('CuCo2SO4', true);

        CarroliteSulfuricSolution = new Material.Builder(16007, GTBUtil.gtb("carrolite_sulfuric_solution"))
                .liquid(new FluidBuilder())
                .color(0x81C784)
                .build().setFormula('(CuCo2SO2)(HSO4)', true);

        ImpureCobaltSulfideSolution = new Material.Builder(16008, GTBUtil.gtb("impure_cobalt_sulfide_solution"))
                .liquid(new FluidBuilder())
                .color(0x81C784)
                .build().setFormula('(CuCo2SO2)(HSO4)', true);

        SodiumHydrosulfide = new Material.Builder(16009, GTBUtil.gtb("sodium_hydrosulfide"))
                .dust()
                .color(0x81C784)
                .build().setFormula('(CuCo2SO2)(HSO4)', true);

        CobaltOxideHydroxide = new Material.Builder(16010, GTBUtil.gtb("cobalt_oxide_hydroxide"))
                .dust()
                .color(0x81C784)
                .build().setFormula('(CuCo2SO2)(HSO4)', true);

        Vermiculite = new Material.Builder(16011, GTBUtil.gtb("vermiculite"))
                .dust()
                .ore()
                .color(0x81C784)
                .build().setFormula('Fe3Al4Si4H2(H2O)4O12', true);

        Dolomite = new Material.Builder(16012, GTBUtil.gtb("dolomite"))
                .dust()
                .ore()
                .color(0x81C784)
                .build().setFormula('CaMgC2O6', true);

        Wollastonite = new Material.Builder(16013, GTBUtil.gtb("wollastonite"))
                .dust()
                .ore()
                .color(0x81C784)
                .build().setFormula('CaSiO3', true);

        NickelferousLimonite = new Material.Builder(16014, GTBUtil.gtb("nickelferous_limonite"))
                .dust()
                .ore()
                .color(0x81C784)
                .build().setFormula('CaSiO3', true);

        Serpentine = new Material.Builder(16015, GTBUtil.gtb("serpentine"))
                .dust()
                .ore()
                .color(0x81C784)
                .build().setFormula('CaSiO3', true);

        Prasolite = new Material.Builder(16016, GTBUtil.gtb("prasolite"))
                .dust()
                .ore()
                .color(0x81C784)
                .build().setFormula('Si5O10Fe', true);

        Tennanite = new Material.Builder(16017, GTBUtil.gtb("tennanite"))
                .dust()
                .ore()
                .color(0x81C784)
                .build().setFormula('Cu12As4S13', true);

        BariumCarbonate = new Material.Builder(16018, GTBUtil.gtb("barium_carbonate"))
                .dust()
                .color(0x81C784)
                .build().setFormula('BaCO3', true);

        BariumAluminate = new Material.Builder(16019, GTBUtil.gtb("barium_aluminate"))
                .dust()
                .color(0x81C784)
                .build().setFormula('BaAl2O4', true);

        Tenorite = new Material.Builder(16020, GTBUtil.gtb("tenorite"))
                .dust()
                .ore()
                .color(0x81C784)
                .build().setFormula('CuO', true);

        Cuprite = new Material.Builder(16021, GTBUtil.gtb("cuprite"))
                .dust()
                .ore()
                .color(0x81C784)
                .build().setFormula('Cu2O', true);

        Witherite = new Material.Builder(16022, GTBUtil.gtb("witherite"))
                .dust()
                .ore()
                .color(0x81C784)
                .build().setFormula('Cu2O', true);





  }
  
}