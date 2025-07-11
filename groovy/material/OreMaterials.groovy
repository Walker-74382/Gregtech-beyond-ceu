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
                .color(0x4793B6)
                .build().setFormula('Al(NaCl)', true);

        AluminiumSaltSolution = new Material.Builder(16002, GTBUtil.gtb("aluminium_salt_solution"))
                .liquid(new FluidBuilder())
                .color(0x368EB6)
                .build().setFormula('Al(NaCl)(H2O)', true);

        Hematite = new Material.Builder(16003, GTBUtil.gtb("hematite"))
                .ore()
                .dust()
                .color(0x8A7975)
                .build().setFormula('Fe2O3', true);

        Enargite = new Material.Builder(16004, GTBUtil.gtb("enargite"))
                .ore()
                .dust()
                .color(0x7D7D7D)
                .build().setFormula('Cu3AsS4', true);

        Carrolite = new Material.Builder(16005, GTBUtil.gtb("carrolite"))
                .ore()
                .dust()
                .color(0xCC7960)
                .build().setFormula('CuCo2SO4', true);

        RoastedCarrolite = new Material.Builder(16006, GTBUtil.gtb("roasted_carrolite"))
                .dust()
                .color(0xA26755)
                .build().setFormula('CuCo2SO4', true);

        CarroliteSulfuricSolution = new Material.Builder(16007, GTBUtil.gtb("carrolite_sulfuric_solution"))
                .liquid(new FluidBuilder())
                .color(0xEB6A42)
                .build().setFormula('(CuCo2SO2)(HSO4)', true);

        ImpureCobaltSulfideSolution = new Material.Builder(16008, GTBUtil.gtb("impure_cobalt_sulfide_solution"))
                .liquid(new FluidBuilder())
                .color(0x667791)
                .build().setFormula('(CuCo2SO2)(HSO4)', true);

        SodiumHydrosulfide = new Material.Builder(16009, GTBUtil.gtb("sodium_hydrosulfide"))
                .dust()
                .color(0xE2D59D)
                .build().setFormula('(CuCo2SO2)(HSO4)', true);

        CobaltOxideHydroxide = new Material.Builder(16010, GTBUtil.gtb("cobalt_oxide_hydroxide"))
                .dust()
                .color(0x236DC2)
                .build().setFormula('(CuCo2SO2)(HSO4)', true);

        Vermiculite = new Material.Builder(16011, GTBUtil.gtb("vermiculite"))
                .dust()
                .ore()
                .color(0xCFAD58)
                .build().setFormula('Fe3Al4Si4H2(H2O)4O12', true);

        Dolomite = new Material.Builder(16012, GTBUtil.gtb("dolomite"))
                .dust()
                .ore()
                .color(0xEAE2E5)
                .build().setFormula('CaMgC2O6', true);

        Wollastonite = new Material.Builder(16013, GTBUtil.gtb("wollastonite"))
                .dust()
                .ore()
                .color(0xC8C4C5)
                .build().setFormula('CaSiO3', true);

        NickeliferousLimonite = new Material.Builder(16014, GTBUtil.gtb("nickeliferous_limonite"))
                .dust()
                .ore()
                .color(0xAFAEA0)
                .build().setFormula('Ni?', true);

        Serpentine = new Material.Builder(16015, GTBUtil.gtb("serpentine"))
                .dust()
                .ore()
                .color(0xBCC3B3)
                .build().setFormula('CaSiO3', true);

        Prasolite = new Material.Builder(16016, GTBUtil.gtb("prasolite"))
                .dust()
                .ore()
                .color(0xABC093)
                .build().setFormula('Si5O10Fe', true);

        BariumCarbonate = new Material.Builder(16018, GTBUtil.gtb("barium_carbonate"))
                .dust()
                .color(0x3D3E3D)
                .build().setFormula('BaCO3', true);

        BariumAluminate = new Material.Builder(16019, GTBUtil.gtb("barium_aluminate"))
                .dust()
                .color(0xCACBCA)
                .build().setFormula('BaAl2O4', true);

        Tenorite = new Material.Builder(16020, GTBUtil.gtb("tenorite"))
                .dust()
                .ore()
                .color(0x5D5E5D)
                .build().setFormula('CuO', true);

        Cuprite = new Material.Builder(16021, GTBUtil.gtb("cuprite"))
                .dust()
                .ore()
                .color(0x903030)
                .build().setFormula('Cu2O', true);

        Witherite = new Material.Builder(16022, GTBUtil.gtb("witherite"))
                .dust()
                .ore()
                .color(0xD5D5C7)
                .build().setFormula('Cu2O', true);

        DriedNickeliferousLimonite = new Material.Builder(16024, GTBUtil.gtb("dried_nickeliferous_limonite"))
                .dust()
                .color(0xBEAEA0)
                .build().setFormula('Ni?', true);

        PregnantCobaltLeachSolution = new Material.Builder(16025, GTBUtil.gtb("pregnant_cobalt_leach_solution"))
                .fluid()
                .color(0x5E7B98)
                .build().setFormula('CoNi?', true);

        HematiteCokePellets = new Material.Builder(16026, GTBUtil.gtb("hematite_coke_pellets"))
                .dust()
                .color(0x8F8E83)
                .build().setFormula('(Fe2O3)(SiO2)C', true);

        PigIron = new Material.Builder(16027, GTBUtil.gtb("pig_iron"))
                .dust()
                .ingot()
                .color(0xCCC2CD)
                .build().setFormula('Fe', true);

        CopperSulfateSolution = new Material.Builder(16028, GTBUtil.gtb("copper_sulfate_solution"))
                .fluid()
                .color(0xDDAF86)
                .build().setFormula('(CuO2)(SO4)', true);

        ImpurePrasoliteSlurry = new Material.Builder(16029, GTBUtil.gtb("impure_prasolite_slurry"))
                .fluid()
                .color(0x859779)
                .build().setFormula('?', true);

        PurifiedPrasoliteSlurry = new Material.Builder(16030, GTBUtil.gtb("purified_prasolite_slurry"))
                .fluid()
                .color(0x677E57)
                .build().setFormula('?', true);

        LigniteCoal = new Material.Builder(16031, GTBUtil.gtb("lignite_coal"))
                .ore()
                .dust()
                .color(0x956C5F)
                .build().setFormula('C39H35O10NS', true);

        Anthracite = new Material.Builder(16032, GTBUtil.gtb("anthracite"))
                .ore()
                .dust()
                .color(0x646261)
                .build().setFormula('C240H90O4NS', true);

        Kaolinite = new Material.Builder(16033, GTBUtil.gtb("kaolinite"))
                .ore()
                .dust()
                .color(0x5E90AA)
                .build().setFormula('Al2Si2O5(OH)4', true);

        Sylvanite = new Material.Builder(16034, GTBUtil.gtb("sylvanite"))
                .ore()
                .dust()
                .flags(GENERATE_FLOATED, GENERATE_SIFTED)
                .color(0x717171)
                .build().setFormula('AuAgTe4', true);

        BeneficatedKaolinite = new Material.Builder(16035, GTBUtil.gtb("beneficated_kaolinite"))
                .dust()
                .color(0x7294B5)
                .build().setFormula('Al2Si2O5(OH)4*', true);

        Cryolite = new Material.Builder(16036, GTBUtil.gtb("cryolite"))
                .fluid()
                .color(0x58D0E0)
                .build().setFormula('Na3AlF6', true);

        FusedMetakaolin = new Material.Builder(16037, GTBUtil.gtb("fused_metakaolin"))
                .dust()
                .color(0x84AABB)
                .build().setFormula('Al2O3⋅2SiO', true);

        Metakaolin = new Material.Builder(16038, GTBUtil.gtb("metakaolin"))
                .dust()
                .color(0x7C9CAB)
                .build().setFormula('Al2O3', true);

        ImpureXenotimeSlurry = new Material.Builder(16039, GTBUtil.gtb("impure_xenotime_slurry"))
                .fluid()
                .color(0xDD6C2E)
                .build().setFormula('REE*', true);

        PurifiedXenotimeSlurry = new Material.Builder(16040, GTBUtil.gtb("purified_xenotime_slurry"))
                .fluid()
                .color(0xD07341)
                .build().setFormula('REE*', true);

        Fluorite = new Material.Builder(16041, GTBUtil.gtb("fluorite"))
                .dust()
                .ore()
                .color(0x669969)
                .build().setFormula('CaF2', true);

        CalciumSulfate = new Material.Builder(16042, GTBUtil.gtb("calcium_sulfate"))
                .dust()
                .color(0xDD7520)
                .build().setFormula('CaSO4', true);

        DissolvedCalciumChloride = new Material.Builder(16043, GTBUtil.gtb("dissolved_calcium_chloride"))
                .fluid()
                .color(0x9BAFC3)
                .build().setFormula('(CaCl2)(H2O)', true);

        IronCalciumSilicaSlag = new Material.Builder(16044, GTBUtil.gtb("iron_calcium_silica_slag"))
                .dust()
                .color(0x8B8583)
                .build().setFormula('Fe?', true);

        AluminiumChromiumSulfate = new Material.Builder(16045, GTBUtil.gtb("aluminium_chromium_sulfate"))
                .dust()
                .color(0x878490)
                .build().setFormula('AlCrSO4?', true);

        ChromiumIIIOxide = new Material.Builder(16046, GTBUtil.gtb("chromium_iii_oxide"))
                .dust()
                .color(0x8CAF6C)
                .iconSet(ROUGH)
                .build().setFormula('Cr2O3', true);

        IronCalciumHydroxides = new Material.Builder(16047, GTBUtil.gtb("iron_calcium_hydroxides"))
                .dust()
                .iconSet(ROUGH)
                .color(0x3E3D3D)
                .build().setFormula('FeCaHO?', true);

        CalciumCarbide = new Material.Builder(16048, GTBUtil.gtb("calcium_carbide"))
                .dust()
                .iconSet(ROUGH)
                .color(0x3E3D3D)
                .build().setFormula('CaC2', true);

        DriedVermiculite = new Material.Builder(16049, GTBUtil.gtb("dried_vermiculite"))
                .dust()
                .iconSet(ROUGH)
                .color(0xCC9966)
                .build().setFormula('Fe3Al4Si4H2O12', true);

        ExfoliatedVermiculite = new Material.Builder(16050, GTBUtil.gtb("exfoliated_vermiculite"))
                .dust()
                .iconSet(ROUGH)
                .color(0xD4AF7F) 
                .build().setFormula('Fe3Al4Si4O12', true);

        ImpureSylvaniteSlurry = new Material.Builder(16051,GTBUtil.gtb("impure_sylvanite_slurry"))
                .fluid()
                .color(0xb8b8a0)
                .build().setFormula("?", true);

        SlyvaniteSlurry = new Material.Builder(16052,GTBUtil.gtb("sylvanite_slurry"))
                .fluid()
                .color(0x7f7f6b)
                .build().setFormula("?", true);

        FloatedSylvanite = new Material.Builder(16053,GTBUtil.gtb("slyvanite_floated"))
                .dust()
                .iconSet(METALLIC)
                .color(0x7f7f6b)
                .build().setFormula("AuAgTe4", true);

        RoatedSylvanite = new Material.Builder(16054,GTBUtil.gtb("sylvanite_roasted"))
                .dust()
                .iconSet(FINE)
                .color(0x7b7260)
                .build().setFormula("AuAg(TeO2)4", true);

        





  }
  
}