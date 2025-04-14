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

public class FirstDegreeMaterials {

  public static void register() {

        log.infoMC('Registering First Degree Materials!');


        PotassiumPersulfate = new Material.Builder(8000, GTBUtil.gtb("potassium_persulfate"))
                .dust()
                .color(0x6A8D9F)
                .build();

        PotassiumPersulfate.setFormula("K2S2O8", true)
        
        
        ParaPhenylenediamine = new Material.Builder(8001, GTBUtil.gtb("para_phenylenediamine"))
                .dust()
                .color(0x7AB8B2)
                .build();

        ParaPhenylenediamine.setFormula("C6H8N2", true)
        
      
        MethylFormate = new Material.Builder(8002, GTBUtil.gtb("methyl_formate"))
                .liquid(new FluidBuilder())
                .color(0xD8AAAA)
                .build();

        MethylFormate.setFormula("C2H4O2", true)

        Bromotoluene = new Material.Builder(8003, GTBUtil.gtb("bromotoluene"))
                .liquid(new FluidBuilder())
                .color(0xA68D86)
                .build();

        Bromotoluene.setFormula("C7H7Br", true)

        FluorotolueneMixture = new Material.Builder(8004, GTBUtil.gtb("fluorotoluene_mixture"))
                .liquid(new FluidBuilder())
                .color(0x89A3BA)
                .build();

        FluorotolueneMixture.setFormula("(C7H7F)(C3H7NO)", true)

        Fluorotoluene = new Material.Builder(8005, GTBUtil.gtb("fluorotoluene"))
                .liquid(new FluidBuilder())
                .color(0xBBC7D2)
                .build();

        Fluorotoluene.setFormula("C7H7F", true)

        FluorobenzoicAcid = new Material.Builder(8007, GTBUtil.gtb("fluorobenzoic_acid"))
                .liquid(new FluidBuilder())
                .color(0xD7CFAD)
                .build();

        FluorobenzoicAcid.setFormula("C7H5FO2", true)

        FluorobenzoylChloride = new Material.Builder(8008, GTBUtil.gtb("fluorobenzoyl_chloride"))
                .liquid(new FluidBuilder())
                .color(0x6BA3AA)
                .build();

        FluorobenzoylChloride.setFormula("FC6H4COCl", true)

        DiphenylSulfone = new Material.Builder(8009, GTBUtil.gtb("diphenyl_sulfone"))
                .liquid(new FluidBuilder())
                .color(0xBDBF9D)
                .build();

        DiphenylSulfone.setFormula("C8H10O2S", true)

        AluminiumBromide = new Material.Builder(8010, GTBUtil.gtb("aluminium_bromide"))
                .dust()
                .color(0x81A7C6)
                .build();

        AluminiumBromide.setFormula("AlBr3", true)

        Fluorobenzene = new Material.Builder(8011, GTBUtil.gtb("fluorobenzene"))
                .liquid(new FluidBuilder())
                .color(0x8C8C8C)
                .build();

        Fluorobenzene.setFormula("(C6H5F)", true)

        CarbonDisulfide = new Material.Builder(8012, GTBUtil.gtb("carbon_disulfide"))
                .liquid(new FluidBuilder())
                .color(0xC4BDA2)
                .build();

        CarbonDisulfide.setFormula("CS2", true)

        EthyleneGlycol = new Material.Builder(8013, GTBUtil.gtb("ethylene_glycol"))
                .liquid(new FluidBuilder())
                .color(0xC5E3C6)
                .build();

        EthyleneGlycol.setFormula("C2H6O2", true)

        PotassiumCarbonate = new Material.Builder(8014, GTBUtil.gtb("potassium_carbonate"))
                .dust()
                .color(0xC5E3C6)
                .build();

        PotassiumCarbonate.setFormula("K2CO3", true)

        HydrogenFluoride = new Material.Builder(8015, GTBUtil.gtb("hydrogen_fluoride"))
                .liquid(new FluidBuilder())
                .color(0xC5E3C6)
                .build();

        HydrogenFluoride.setFormula("HF2", true)

        VanadiumTrichloride = new Material.Builder(8016, GTBUtil.gtb("vanadium_trichloride"))
                .dust()
                .color(0xC5E3C6)
                .build();

        VanadiumTrichloride.setFormula("VaCl3", true)

        SilicaGel = new Material.Builder(8017, GTBUtil.gtb("silica_gel"))
                .dust()
                .color(0xC5E3C6)
                .build();

        SilicaGel.setFormula("SiO2", true)

        PotassiumDisulfate = new Material.Builder(8018, GTBUtil.gtb("potassium_disulfate"))
                .dust()
                .color(0xD84315)
                .build().setFormula("K2S2O7", true);

        SodiumRuthenate = new Material.Builder(8019, GTBUtil.gtb("sodium_ruthenate"))
                .dust()
                .color(0x9DA1C7)
                .build().setFormula("Na2O4Ru", true);

        RutheniumTetroxideLiquid = new Material.Builder(8020, GTBUtil.gtb("ruthenium_tetroxide_liquid"))
                .fluid()
                .color(0x5C6BC0)
                .build().setFormula("RuO4", true);

        IridiumDioxide = new Material.Builder(8021, GTBUtil.gtb("iridium_dioxide"))
                .dust()
                .color(0xEA8B56)
                .build().setFormula("IrO2", true);

        Nonene = new Material.Builder(8022, GTBUtil.gtb("nonene"))
                .fluid()
                .color(0xAF91B7)
                .build().setFormula("C9H18", true);

        Propylene = new Material.Builder(8023, GTBUtil.gtb("propylene"))
                .fluid()
                .color(0xE2DFC7)
                .build().setFormula("C3H6", true);

        Hexane = new Material.Builder(8024, GTBUtil.gtb("hexane"))
                .fluid()
                .color(0xBD89A5)
                .build().setFormula("C3H6", true);

        Pentane = new Material.Builder(8025, GTBUtil.gtb("pentane"))
                .fluid()
                .color(0xE9C6C6)
                .build().setFormula("C3H6", true);

        NHexadecane = new Material.Builder(8026, GTBUtil.gtb("nhexadecane"))
                .fluid()
                .color(0x8F8F8F)
                .build().setFormula("C16H34", true);

        NOctane = new Material.Builder(8006, GTBUtil.gtb("noctane"))
                .fluid()
                .color(0xE57373)
                .build().setFormula("C8H18", true);

        NHeptane = new Material.Builder(8027, GTBUtil.gtb("nheptane"))
                .fluid()
                .color(0xD57777)
                .build().setFormula("C7H16", true);

        ZSM5 = new Material.Builder(8028, GTBUtil.gtb("zsm_5"))
                .dust()
                .fluid()
                .color(0x7D967F)
                .build().setFormula("C7H16", true);

        MXylene = new Material.Builder(8029, GTBUtil.gtb("mxylene"))
                .fluid()
                .color(0x353535)
                .build().setFormula("C8H10", true);

        PXylene = new Material.Builder(8031, GTBUtil.gtb("pxylene"))
                .fluid()
                .color(0x353535)
                .build().setFormula("C8H10", true);

        MPXylene = new Material.Builder(8032, GTBUtil.gtb("opxylene"))
                .fluid()
                .color(0x353535)
                .build().setFormula("C8H10", true);

        NPropanol = new Material.Builder(8033, GTBUtil.gtb("npropanol"))
                .fluid()
                .color(0xF8EC7F)
                .build().setFormula("CH10O", true);

        NButanol = new Material.Builder(8034, GTBUtil.gtb("nbutanol"))
                .fluid()
                .color(0xC87A7A)
                .build().setFormula("C4H10O", true);

        IsoamylAlcohol = new Material.Builder(8035, GTBUtil.gtb("isoamyl_alcohol"))
                .fluid()
                .color(0x004D40)
                .build().setFormula("C5H12O", true);

        IsobutylAlcohol = new Material.Builder(8036, GTBUtil.gtb("isobutyl_alcohol"))
                .fluid()
                .color(0xF57F17)
                .build().setFormula("C5H12O", true);

        Formaldehyde = new Material.Builder(8037, GTBUtil.gtb("formaldehyde"))
                .fluid()
                .color(0x66BB6A)
                .build().setFormula("CH20", true);

        Dicyclopentadiene = new Material.Builder(8038, GTBUtil.gtb("dicyclopentadiene"))
                .fluid()
                .color(0xBA68C8)
                .build().setFormula("C10H12", true);

        Cyclopentadiene = new Material.Builder(8039, GTBUtil.gtb("cyclopentadiene"))
                .fluid()
                .color(0x625664)
                .build().setFormula("C5H6", true);

        TungstenTrioxide = new Material.Builder(8040, GTBUtil.gtb("tungsten_trioxide"))
                .dust()
                .color(0x6E9C46)
                .build().setFormula("WO3", true);

        HydrogenPeroxide = new Material.Builder(8041, GTBUtil.gtb("hydrogen_peroxide"))
                .fluid()
                .color(0x64B5F6)
                .build().setFormula("H2O2", true);

        LithiumHydroxide = new Material.Builder(8042, GTBUtil.gtb("lithium_hydroxide"))
                .dust()
                .build().setFormula("LiOH", true);

        SodiumTungstate = new Material.Builder(8043, GTBUtil.gtb("sodium_tungstate"))
                .fluid()
                .color(0x6A6A6A)
                .build().setFormula("Na2WO4", true);

        CalciumTungstate = new Material.Builder(8044, GTBUtil.gtb("calcium_tungstate"))
                .dust()
                .color(0x909393)
                .build().setFormula("WCaO4", true);

        LithiumFluoride = new Material.Builder(8045, GTBUtil.gtb("lithium_fluoride"))
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("LiF3", true);

        EthyleneOxide = new Material.Builder(8046, GTBUtil.gtb("ethylene_oxide"))
                .fluid()
                .color(0x9DD6D0)
                .build().setFormula("C2H4O", true);

        Methanol_100 = new Material.Builder(8047, GTBUtil.gtb("methanol_100"))
                .fluid()
                .color(0x888144)
                .build().setFormula("CH4O", true);

        Butanol_100 = new Material.Builder(8048, GTBUtil.gtb("butanol_100"))
                .fluid()
                .color(0xDD6565)
                .build().setFormula("C4H10O", true);

        Ethanol_100 = new Material.Builder(8049, GTBUtil.gtb("ethanol_100"))
                .fluid()
                .color(0xFF6F00)
                .build().setFormula("C2H6O", true);

        ActivatedCarbon = new Material.Builder(8050, GTBUtil.gtb("activated_carbon"))
                .dust()
                .color(0x313131)
                .build().setFormula("C", true);

        HotWater = new Material.Builder(8051, GTBUtil.gtb("hot_water"))
                .fluid()
                .color(0x9DD6D0)
                .build().setFormula("H2O", true);

        SodiumBorohydride = new Material.Builder(8052, GTBUtil.gtb("sodium_borohydride"))
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("NaBH4", true);

        SodiumHydride = new Material.Builder(8053, GTBUtil.gtb("sodium_hydride"))
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("NaH", true);

        BoricAcid = new Material.Builder(8054, GTBUtil.gtb("boric_acid"))
                .fluid()
                .color(0x9DD6D0)
                .build().setFormula("H3BO3", true);

        SodiumEthoxide = new Material.Builder(8055, GTBUtil.gtb("sodium_ethoxide"))
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("C2H5ONa", true);

        PotassiumManganate = new Material.Builder(8056, GTBUtil.gtb("potassium_manganate"))
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("K2MnO4", true);

        PotassiumHydroxide = new Material.Builder(8057, GTBUtil.gtb("potassium_hydroxide"))
                .fluid()
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("KOH", true);

        AluminiumChloride = new Material.Builder(8058, GTBUtil.gtb("aluminium_chloride"))
                .dust()
                .color(0x9DD6D0)
                .build().setFormula("AlCl3", true);

        CucrmgbaCatalyst = new Material.Builder(8059, GTBUtil.gtb("cucrmgba_catalyst"))
                .dust()
                .color(0x4A148C)
                .build().setFormula("CuCrMgBa", true);

        OneFourButanediol = new Material.Builder(8060, GTBUtil.gtb("one_four_butanediol"))
                .fluid()
                .color(0x4A148C)
                .build().setFormula("C4H10O2", true);

        OneFourButynediol = new Material.Builder(8061, GTBUtil.gtb("one_four_butynediol"))
                .fluid()
                .color(0x4A148C)
                .build().setFormula("C4H6O2", true);

        NaquadahDioxide = new Material.Builder(8062, GTBUtil.gtb("naquadah_dioxide"))
                .dust()
                .color(0x6A1B9A)
                .build().setFormula("NqO2", true);

        ElectronDegenerateRhenium = new Material.Builder(8063, GTBUtil.gtb("electron_degenerate_rhenium"))
                .dust()
                .flags(GENERATE_PLATE)
                .color(0xDCD4EA)
                .build().setFormula("Re-", true);

        ElectronDegenerateRheniumPlasma = new Material.Builder(8064,
                GTBUtil.gtb("electron_degenerate_rhenium_plasma"))
                        .fluid()
                        .color(0x7986CB)
                        .build().setFormula("Re-", true);

        HighPurityArsenic = new Material.Builder(8065, GTBUtil.gtb("high_purity_arsenic"))
                .dust()
                .color(0xD7CCC8)
                .build().setFormula("As", true);

        IndiumChloride = new Material.Builder(8066, GTBUtil.gtb("indium_chloride"))
                .dust()
                .color(0x8E24AA)
                .build().setFormula("InCl", true);

        WhitePhosphorus = new Material.Builder(8067, GTBUtil.gtb("white_phosphorus"))
                .dust()
                .fluid()
                .color(0xE6D9A0)
                .build().setFormula("P4", true);

        LiquidXenon = new Material.Builder(8068, GTBUtil.gtb("liquid_xenon"))
                .fluid()
                .color(0x29B6F6)
                .build().setFormula("Xe", true);

        SiliconCarbide = new Material.Builder(8069, GTBUtil.gtb("silicon_carbide"))
                .fluid()
                .color(0x43535A)
                .build().setFormula("SiC", true);

        SiliconCarbideVapor = new Material.Builder(8070, GTBUtil.gtb("silicon_carbide_vapor"))
                .fluid()
                .color(0x5A707A)
                .build().setFormula("SiC", true);

        VeryHotNitrogen = new Material.Builder(8071, GTBUtil.gtb("very_hot_nitrogen"))
                .fluid()
                .color(0x73CBF2)
                .build().setFormula("N", true);

        VeryHotXenon = new Material.Builder(8072, GTBUtil.gtb("very_hot_xenon"))
                .fluid()
                .color(0xAED5F5)
                .build().setFormula("Xe", true);

        VeryHotArgon = new Material.Builder(8073, GTBUtil.gtb("very_hot_argon"))
                .fluid()
                .color(0x7CB342)
                .build().setFormula("Ar", true);

        NickelNitride = new Material.Builder(8074, GTBUtil.gtb("nickel_nitride"))
                .dust()
                .fluid()
                .color(0xFFF176)
                .build().setFormula("NiN3", true);

        LiquidHelium = new Material.Builder(8075, GTBUtil.gtb("liquid_helium"))
                .fluid()
                .color(0xFDF8CC)
                .build().setFormula("He", true);

        MetastableOganesson = new Material.Builder(8076, GTBUtil.gtb("metastable_oganesson"))
                .fluid()
                .flags(GENERATE_PLATE)
                .dust()
                .color(0xB71C1C)
                .build().setFormula("Og", true);

        VeryHotKrypton = new Material.Builder(8077, GTBUtil.gtb("very_hot_krypton"))
                .fluid()
                .color(0x81C784)
                .build().setFormula("Kr", true);

        SuperFluidHelium_4 = new Material.Builder(8078, GTBUtil.gtb("super_fluid_helium_4"))
                .fluid()
                .color(0xFDD835)
                .build().setFormula("He-4", true);

        Helium_4 = new Material.Builder(8079, GTBUtil.gtb("helium_4"))
                .fluid()
                .color(0x928550)
                .build().setFormula("He-4", true);

        LiquidEnrichedHelium_4 = new Material.Builder(8080, GTBUtil.gtb("liquid_enriched_helium_4"))
                .fluid()
                .color(0xC0CA33)
                .build().setFormula("He-4", true);

        Trichloroflerane = new Material.Builder(8081, GTBUtil.gtb("trichloroflerane"))
                .fluid()
                .color(0x6C3090)
                .build().setFormula("Cl3HFl", true);

        HighDensityPolyethylene = new Material.Builder(8082, GTBUtil.gtb("high_density_polyethylene"))
                .fluid()
                .flags(GENERATE_PLATE)
                .dust()
                .color(0xBDBDBD)
                .build().setFormula("(C2H4)n", true);

        LiquidNitrogen = new Material.Builder(8083, GTBUtil.gtb("liquid_nitrogen"))
                .fluid()
                .color(0xA5C8DA)
                .build().setFormula("N", true);

        SilverBromide = new Material.Builder(8084, GTBUtil.gtb("silver_bromide"))
                .dust()
                .color(0xD19E9E)
                .build().setFormula("AgBr", true);

        Silane = new Material.Builder(8085, GTBUtil.gtb("silane"))
                .fluid()
                .color(0xA9A8A8)
                .build().setFormula("SiCl4", true);

        ChloronaquadicAcid = new Material.Builder(8086, GTBUtil.gtb("chloronaquadic_acid"))
                .fluid()
                .color(0x616161)
                .build().setFormula("SiCl4", true);

        SodiumNitrate = new Material.Builder(8087, GTBUtil.gtb("sodium_nitrate"))
                .dust()
                .color(0x65899A)
                .build().setFormula("NaN2", true);

        BariumTitanate = new Material.Builder(8088, GTBUtil.gtb("barium_titanate"))
                .dust()
                .ingot()
                .color(0x88B68A)
                .build().setFormula("BaTiO2", true);

        HydrogenChloride = new Material.Builder(8089, GTBUtil.gtb("hydrogen_chloride"))
                .fluid()
                .color(0xC5CAE9)
                .build().setFormula("HCl", true);

        DopedNanotubeDepositionMix = new Material.Builder(8090, GTBUtil.gtb("doped_nanotube_deposition_mix"))
                .dust()
                .color(0xFF9800)
                .build().setFormula("HCl", true);

        NanotubeDepositionMix = new Material.Builder(8091, GTBUtil.gtb("nanotube_deposition_mix"))
                .dust()
                .color(0xB71C1C)
                .build().setFormula("HCl", true);

        DopedNanotubeDepositionMixture = new Material.Builder(8092, GTBUtil.gtb("doped_nanotube_deposition_mixture"))
                        .dust()
                        .color(0x1B5E20)
                        .build().setFormula("HCl", true);

        CarbonNanotubes = new Material.Builder(8093, GTBUtil.gtb("carbon_nanotubes"))
                .dust()
                .color(0x1A1A1A)
                .build().setFormula("HCl", true);

        FullerenePolymerMatrix = new Material.Builder(8094, GTBUtil.gtb("fullerene_polymer_matrix"))
                .fluid()
                .dust()
                .ingot()
                .flags(GENERATE_PLATE, GENERATE_FRAME, GENERATE_FOIL)
                .color(0x313031)
                .build().setFormula("(PdFeC153C36NO2)n", true);

        FullerenePolymerTetrix = new Material.Builder(8095, GTBUtil.gtb("fullerene_polymer_tetrix"))
                .fluid()
                .dust()
                .ingot()
                .flags(GENERATE_PLATE, GENERATE_FRAME, GENERATE_FOIL)
                .color(0x1D181E)
                .build().setFormula("(C61HRhNO2)n", true);

        Tetrapropylammoniumbromide = new Material.Builder(8096, GTBUtil.gtb("tetrapropylammoniumbromide"))
                .fluid()
                .dust()
                .color(0xAD77C3)
                .build().setFormula("C12H28BrN", true);

        SeaborgiumDopedNanotubes = new Material.Builder(8097, GTBUtil.gtb("seaborgium_doped_nanotubes"))
                .fluid()
                .dust()
                .color(0x0D47A1)
                .build().setFormula("HCl", true);

        NaquadriaticTaranium = new Material.Builder(8098, GTBUtil.gtb("naquadriatic_taranium"))
                .fluid()
                .dust()
                .color(0x4A4B4B)
                .build().setFormula("NqTr", true);

        ExtraDistilledWater = new Material.Builder(8099, GTBUtil.gtb("extra_distilled_water"))
                .fluid()
                .color(0x265399)
                .build().setFormula("H20", true);

        Trichlorosilane = new Material.Builder(8100, GTBUtil.gtb("trichlorosilane"))
                .fluid()
                .color(0x444545)
                .build().setFormula("HCl4", true);

        SuperFluidHelium = new Material.Builder(8101, GTBUtil.gtb("super_fluid_helium"))
                .fluid()
                .color(0xFFC107)
                .build().setFormula("He", true);

        Ozone = new Material.Builder(8102, GTBUtil.gtb("ozone"))
                .fluid()
                .color(0x2182BC)
                .build().setFormula("O3", true);

        FluorodarmstadticAcid = new Material.Builder(8103, GTBUtil.gtb("fluorodarmstadtic_acid"))
                .fluid()
                .color(0x333537)
                .build().setFormula("Ad", true);

        AntimonyPentafluoride = new Material.Builder(8104, GTBUtil.gtb("antimony_pentafluoride"))
                .fluid()
                .color(0x333537)
                .build().setFormula("SbF5", true);

        SodiumIsobutylXanthate = new Material.Builder(8105, GTBUtil.gtb("sodium_isobutyl_xanthate"))
                .dust()
                .color(0xA7933D)
                .build().setFormula("C5H9NaOS2", true);

        Adamantane = new Material.Builder(8106, GTBUtil.gtb("adamantane"))
                .fluid()
                .color(0x0288D1)
                .build().setFormula("C10H16", true);

        IsoOctane = new Material.Builder(8107, GTBUtil.gtb("iso_octane"))
                .fluid()
                .color(0x33691E)
                .build().setFormula("C8H18", true);

        Tributylamine = new Material.Builder(8108, GTBUtil.gtb("tributylamine"))
                .fluid()
                .color(0xAD1457)
                .build().setFormula("C12H27N", true);

        CarbonSulfide = new Material.Builder(8109, GTBUtil.gtb("carbon_sulfide"))
                .fluid()
                .color(0x353222)
                .build().setFormula("CS2", true);

        SodiumSulfideDichloroBenzeneMixture = new Material.Builder(8110,
                GTBUtil.gtb("sodium_sulfide_solution_dichloro_benzene_mixture"))
                        .fluid()
                        .color(0x635E46)
                        .build().setFormula("(C6H4Cl2)(NaS2(H2O))", true);

        ChloroSilane = new Material.Builder(8111, GTBUtil.gtb("chloro_silane"))
                .fluid()
                .color(0xAFC9D5)
                .build().setFormula("HClSi", true);

        DisproportionatedChloroSilane = new Material.Builder(8112,
                GTBUtil.gtb("disproportionated_chloro_silane"))
                        .fluid()
                        .color(0xD7E8F0)
                        .build().setFormula("HClSi", true);

        Benzylbromide = new Material.Builder(8113, GTBUtil.gtb("benzyl_bromide"))
                .fluid()
                .color(0x4A4B4C)
                .build().setFormula("C8H8Br", true);

        Butanal = new Material.Builder(8114, GTBUtil.gtb("butanal"))
                .fluid()
                .color(0xEF9A9A)
                .build().setFormula("C4H8O", true);

        PhosphorusTrichloride = new Material.Builder(8115, GTBUtil.gtb("phosphorus_trichloride"))
                .fluid()
                .dust()
                .color(0xEF9A9A)
                .build().setFormula("PCl3", true);

        TolueneDiisocyanate = new Material.Builder(8116, GTBUtil.gtb("toluene_diisocyanate"))
                .fluid()
                .dust()
                .color(0xEF9A9A)
                .build().setFormula("C9H6N2O2", true);

        PrePolymerizedCaprolactam = new Material.Builder(8117, GTBUtil.gtb("pre_polymerized_caprolactam"))
                .dust()
                .color(0xEF9A9A)
                .build().setFormula("PCl3", true);

        Ether = new Material.Builder(8118, GTBUtil.gtb("ether"))
                .fluid()
                .color(0xEF9A9A)
                .build().setFormula("PCl3", true);

        Grisium = new Material.Builder(8119, GTBUtil.gtb("grisium"))
                .fluid()
                .dust()
                .ingot()
                .flags(GENERATE_PLATE, GENERATE_FRAME, GENERATE_FOIL)
                .color(0x575979)
                .build().setFormula("Ti9C9K9Li9S9H5", true);

        SodiumSulfideSolution = new Material.Builder(8120, GTBUtil.gtb("sodium_sulfide_solution"))
                .fluid()
                .color(0xF9A825)
                .build().setFormula("Na2S(H2O)", true);

        ZincOxide = new Material.Builder(8121, GTBUtil.gtb("zinc_oxide"))
                .dust()
                .color(0xB85C34)
                .build().setFormula("ZnO", true);

        GermaniumTetrachloride = new Material.Builder(8122, GTBUtil.gtb("germanium_tetrachloride"))
                .fluid()
                .color(0x787878)
                .build().setFormula("GeCl4", true);

        GermaniumDioxide = new Material.Builder(8123, GTBUtil.gtb("germanium_dioxide"))
                .dust()
                .color(0x666666)
                .build().setFormula("GeO2", true);

        RoastedSphalerite = new Material.Builder(8124, GTBUtil.gtb("roasted_sphalerite"))
                .dust()
                .color(0x666666)
                .build().setFormula("GeO2?", true);

        WaelzSlag = new Material.Builder(8125, GTBUtil.gtb("waelz_slag"))
                .dust()
                .color(0xAC8B5C)
                .iconSet(ROUGH)
                .build().setFormula("GaZnSO4", true);

        WaelzOxide = new Material.Builder(8126, GTBUtil.gtb("waelz_oxide"))
                .dust()
                .color(0xB8B8B8)
                .iconSet(FINE)
                .build();

        StannicChloride = new Material.Builder(8127, GTBUtil.gtb("stannic_chloride"))
                .fluid()
                .color(0x33BBF5)
                .build().setFormula("SnCl4", true);

        RubidiumChlorostannate = new Material.Builder(8128, GTBUtil.gtb("rubidium_chlorostannate"))
                .dust()
                .color(0xBD888A)
                .iconSet(METALLIC)
                .build().setFormula("Rb2SnCl6", true);

        CaesiumChlorostannate = new Material.Builder(8129, GTBUtil.gtb("caesium_chlorostannate"))
                .dust()
                .color(0xBDAD88)
                .iconSet(SHINY)
                .build().setFormula("Cs2SnCl6", true);

        TinFourChloride = new Material.Builder(8130, GTBUtil.gtb("tin_four_chloride"))
                .dust()
                .color(0xA9C6DE)
                .build().setFormula("SnCl2", true);

        ThalliumSulfate = new Material.Builder(8131, GTBUtil.gtb("thallium_sulfate"))
                .dust()
                .color(0x9C222C)
                .iconSet(METALLIC)
                .build().setFormula("Tl2SO4", true);

        MolybdenumTrioxide = new Material.Builder(8132, GTBUtil.gtb("molybdenum_trioxide"))
                .dust()
                .color(0xCBCFDA)
                .iconSet(ROUGH)
                .build().setFormula("MoO3", true);

        PerrhenicAcid = new Material.Builder(8133, GTBUtil.gtb("perrhenic_acid"))
                .dust()
                .color(0xE6DC70)
                .iconSet(SHINY)
                .build().setFormula("HReO4", true);

        AmmoniumPerrhenate = new Material.Builder(8134, GTBUtil.gtb("ammonium_perrhenate"))
                .dust()
                .color(0xA69970)
                .iconSet(METALLIC)
                .build().setFormula("NH4ReO4", true);

        LeadChloride = new Material.Builder(8135, GTBUtil.gtb("lead_chloride"))
                .dust()
                .color(0xF3F3F3)
                .iconSet(ROUGH)
                .color(0xC1A86B)
                .build().setFormula("PbCl2", true);

        MethylAluminoxane = new Material.Builder(8136, GTBUtil.gtb("methyl_aluminoxane"))
                .dust()
                .color(0x508B91)
                .build().setFormula("AlCH3O", true);

        RecrystallizedZirconiumDioxide = new Material.Builder(8137,
                GTBUtil.gtb("recrystallized_zirconium_dioxide"))
                        .dust()
                        .color(0xAA245F)
                        .build().setFormula("Zr*O2", true);

        ZirconiumChloride = new Material.Builder(8138, GTBUtil.gtb("zirconium_chlorine"))
                .fluid()
                .color(0x5A8882)
                .build().setFormula("ZrCl", true);

        ZirconiumDioxideSolution = new Material.Builder(8139, GTBUtil.gtb("zirconium_dioxide_solution"))
                .fluid()
                .color(0xAD1457)
                .build().setFormula("ZrO(H2O)", true);

        nButyllithium = new Material.Builder(8140, GTBUtil.gtb("n_butyllithium"))
                .fluid()
                .color(0x64817C)
                .build().setFormula("C4H9Li", true);

        OneButane = new Material.Builder(8141,
                GTBUtil.gtb("one_butane"))
                        .fluid()
                        .color(0x995C57)
                        .build().setFormula("C4H9", true);

        RhodiumNitrate = new Material.Builder(8142, GTBUtil.gtb("rhodium_nitrate"))
                .dust()
                .color(0xFAD28F)
                .build().setFormula("RhN", true);

        FluorohydrideAmmoniumCarbama = new Material.Builder(8143,
                GTBUtil.gtb("fluorohydride_ammonium_carbama"))
                        .fluid()
                        .color(0x729A74)
                        .build().setFormula("FH(NH3)N2O", true);

        HydrogenatedCarbontetrafluoride = new Material.Builder(8144,
                GTBUtil.gtb("hydrogenated_carbon_tetrafluoride"))
                        .fluid()
                        .color(0x788C79)
                        .build().setFormula("HCF4", true);

        PCBB = new Material.Builder(8145, GTBUtil.gtb("pcbb"))
                .fluid()
                .color(0x3C2A51)
                .build().setFormula("pcbb", true);

        Polyurethane = new Material.Builder(8146, GTBUtil.gtb("polyurethane"))
                .fluid()
                .dust()
                .ingot()
                .flags(GENERATE_PLATE)
                .color(0x809A9D)
                .build().setFormula("(C17H16N2O2)n", true);

        Polystyrene = new Material.Builder(8147, GTBUtil.gtb("polystyrene"))
                .fluid()
                .dust()
                .ingot()
                .flags(GENERATE_PLATE)
                .color(0x584643)
                .build().setFormula("(C8H8)n", true);

        LithiumTitanate = new Material.Builder(8148, GTBUtil.gtb("lithium_titanate"))
                .dust()
                .ingot()
                .color(0xAA48BA).build().setFormula("Li2TiO3", true);

        PolystyreneNanoParticles = new Material.Builder(8149, GTBUtil.gtb("polystyrene_nano_particles"))
                .dust()
                .color(0x7E6B67).build().setFormula("(C8H8)n", true);

        NitrogenPentoxide = new Material.Builder(8150, GTBUtil.gtb("nitrogen_pentoxide"))
                .fluid()
                .color(0x283593).build().setFormula("N2O5", true);

        OrthoXylene = new Material.Builder(8151, GTBUtil.gtb("ortho_xylene"))
                .fluid()
                .color(0x252525).build().setFormula("C8H10", true);

        ParaXylene = new Material.Builder(8152, GTBUtil.gtb("para_xylene"))
                .fluid()
                .color(0x3B3B3B).build().setFormula("C8H10", true);

        Dibromomethylbenzene = new Material.Builder(8153, GTBUtil.gtb("dibromomethylbenzene"))
                .fluid()
                .color(0x004D40).build().setFormula("C7H6Br2", true);

        AuPdCCatalyst = new Material.Builder(8154, GTBUtil.gtb("au_pd_c_catalyst"))
                .dust()
                .color(0xFDD835).build().setFormula("AuPdC", true);

        PdCCatalyst = new Material.Builder(8155, GTBUtil.gtb("pd_c_catalyst"))
                .dust()
                .color(0x9D8B3C).build().setFormula("PdC", true);

        Isochloropropane = new Material.Builder(8156, GTBUtil.gtb("isochloropropane"))
                .fluid()
                .color(0xD84315).build().setFormula("C3H7Cl", true);

        Resorcinol = new Material.Builder(8157, GTBUtil.gtb("resorcinol"))
                .fluid()
                .color(0x81C784).build().setFormula("C6H6O2", true);

        SodiumAcetate = new Material.Builder(8158, GTBUtil.gtb("sodium_acetate"))
                .dust()
                .fluid()
                .color(0xCE93D8).build().setFormula("CH3COONa", true);

        Zylon = new Material.Builder(8159, GTBUtil.gtb("zylon"))
                .fluid()
                .dust()
                .ingot()
                .flags(GENERATE_PLATE, GENERATE_FOIL)
                .color(0x584643)
                .build().setFormula("C8H8", true);

        PreZylon = new Material.Builder(8160, GTBUtil.gtb("pre_zylon"))
                .dust()
                .color(0xF57F17).build().setFormula("C20H22N2O2", true);

        Terephthalaldehyde = new Material.Builder(8161, GTBUtil.gtb("terephthalaldehyde"))
                .dust()
                .color(0xB0A0D3).build().setFormula("C8H6O2 ", true);

        Dinitrodipropanyloxybenzene = new Material.Builder(8162, GTBUtil.gtb("dinitrodipropanyloxybenzene"))
                .fluid()
                .color(0xDCEDC8).build().setFormula("C9H7NO3", true);

        SodiumOxide = new Material.Builder(8163, GTBUtil.gtb("sodium_oxide"))
                .dust()
                .color(0x88B0D8).build().setFormula("NaO2", true);

        AmineMixture = new Material.Builder(8164, GTBUtil.gtb("amine_mixture"))
                .fluid()
                .color(0x5B1F6C).build().setFormula("C9H13N", true);

        Trimethylamine = new Material.Builder(8165, GTBUtil.gtb("trimethylamine"))
                .fluid()
                .color(0xAE69C0).build().setFormula("C3H9N", true);

        SodiumPhosphotungstate = new Material.Builder(8166, GTBUtil.gtb("sodium_phosphotungstate"))
                .dust()
                .color(0xF2EAA1).build().setFormula("Na3O40PW12", true);

        AmmoniumPersulfate = new Material.Builder(8167, GTBUtil.gtb("ammonium_persulfate"))
                .dust()
                .color(0x8C95C7).build().setFormula("(NH4)2S2O8", true);

        CetaneTrimethylAmmoniumBromide = new Material.Builder(8168,
                GTBUtil.gtb("cetane_trimethyl_ammonium_bromide"))
                        .fluid()
                        .color(0xD81B60).build().setFormula("C19H42BrN", true);

        Oct_1_ene = new Material.Builder(8169, GTBUtil.gtb("oct_1_ene"))
                .fluid()
                .color(0xC62828).build().setFormula("C8H16", true);

        SodiumPhosphomolybdate = new Material.Builder(8170, GTBUtil.gtb("sodium_phosphomolybdate"))
                .dust()
                .color(0xFFB74D).build().setFormula("Mo12Na3O40P", true);

        BerylliumFluoride = new Material.Builder(8171, GTBUtil.gtb("beryllium_fluoride"))
                .dust()
                .color(0x66BB6A).build().setFormula("BeF2", true);

        Mercaptophenol = new Material.Builder(8172, GTBUtil.gtb("mercaptophenol"))
                .fluid()
                .color(0x827717).build().setFormula("C2H6OS", true);

        IridiumCyclooctadienylChlorideDimer = new Material.Builder(8173,
                GTBUtil.gtb("iridium_cyclooctadienyl_chloride_dimer"))
                        .dust()
                        .color(0x00897B).build().setFormula("C16H24Cl2Ir2", true);

        Cyclooctadiene = new Material.Builder(8174, GTBUtil.gtb("cyclooctadiene"))
                .fluid()
                .color(0x252525).build().setFormula("C8H12", true);

        IsophthalicAcid = new Material.Builder(8175, GTBUtil.gtb("isophthalic_acid"))
                .dust()
                .color(0x7DB880).build().setFormula("C8H6O4", true);

        IsophthaloylChloride = new Material.Builder(8176, GTBUtil.gtb("isophthaloyl_chloride"))
                .dust()
                .color(0x495749).build().setFormula("C8H4Cl2O2", true);

        OneThreeDinitrobenzene = new Material.Builder(8177, GTBUtil.gtb("one_three_dinitrobenzene"))
                .dust()
                .color(0x67697B).build().setFormula("C6H4N2O4", true);

        ActivatedRaneyNickel = new Material.Builder(8178, GTBUtil.gtb("activated_raney_nickel"))
                .dust()
                .color(0xCCCDD5).build().setFormula("AlNi", true);

        RaneyNickel = new Material.Builder(8179, GTBUtil.gtb("raney_nickel"))
                .dust()
                .color(0x94959F).build().setFormula("AlNi", true);

        mPhenyleneDiamine = new Material.Builder(8180, GTBUtil.gtb("m_phenyl_diamine"))
                .dust()
                .color(0x658BB2).build().setFormula("C6H8N2", true);

        SodiumAluminate = new Material.Builder(8181, GTBUtil.gtb("sodium_aluminate"))
                .dust()
                .color(0xAECDAF).build().setFormula("NaAlO2", true);

        Nomex = new Material.Builder(8182, GTBUtil.gtb("nomex"))
                .fluid()
                .dust()
                .ingot()
                .flags(GENERATE_PLATE)
                .color(0x584643)
                .build().setFormula("[COC6H4CONHC6H4NH]n", true);
        // fluid
        ThionylChloride = new Material.Builder(8183, GTBUtil.gtb("thionyl_chloride")).fluid().color(0x79A29F)
                .build().setFormula("SOCl2", true);
        SuccinicAcid = new Material.Builder(8184, GTBUtil.gtb("succinic_acid")).dust().color(0xEDCD3B)
                .build().setFormula("C4H6O4", true);
        EthylBenzene = new Material.Builder(8185, GTBUtil.gtb("ethyl_benzene")).fluid().color(0x7D7C79)
                .build().setFormula("C8H10", true);
        Naphthaldehyde = new Material.Builder(8186, GTBUtil.gtb("naphthaldehyde")).fluid().color(0xF3D036)
                .build().setFormula("C10H7CHO", true);
        HydrobromicAcid = new Material.Builder(8187, GTBUtil.gtb("hydrobromic_acid")).fluid().color(0xE89089)
                .build().setFormula("HBr", true);
        SodiumCyanide = new Material.Builder(8188, GTBUtil.gtb("sodium_cyanide")).fluid().color(0x3F51B5)
                .build().setFormula("NaCN", true);
        HydrogenCyanide = new Material.Builder(8189, GTBUtil.gtb("hydrogen_cyanide")).fluid().color(0xA4ABD2)
                .build().setFormula("HCN", true);
        Dimethylsulfide = new Material.Builder(8190, GTBUtil.gtb("dimethylsulfide")).fluid().color(0xCD9ED4)
                .build().setFormula("C2H6S", true);
        Methylamine = new Material.Builder(8191, GTBUtil.gtb("methylamine")).fluid().color(0x9C53A8).build()
                .setFormula("CH3NH2", true);
        Ferrocenylfulleropyrrolidine = new Material.Builder(8192,
                GTBUtil.gtb("ferrocenylfulleropyrrolidine")).fluid().color(0x151415).build().setFormula("RhN", true);
        Iron2Chloride = new Material.Builder(8193, GTBUtil.gtb("iron_2_chloride")).fluid().color(0x494553)
                .build().setFormula("FeCl2", true);
        AcryloNitrile = new Material.Builder(8194, GTBUtil.gtb("acrylo_nitrile")).fluid().color(0xC9C6A5)
                .build().setFormula("C3H3N", true);
        HydroiodicAcid = new Material.Builder(8195, GTBUtil.gtb("hydroiodic_acid")).fluid().color(0x666CA5)
                .build().setFormula("HI", true);
        Hydrazine = new Material.Builder(8196, GTBUtil.gtb("hydrazine")).fluid().color(0x7DB3E3).build()
                .setFormula("N2H4", true);
        BenzoylPeroxide = new Material.Builder(8197, GTBUtil.gtb("benzoyl_peroxide")).fluid().color(0x31516D)
                .build().setFormula("C14H10O4", true);
        BenzoylChloride = new Material.Builder(8198, GTBUtil.gtb("benzoyl_chloride")).fluid().color(0x324834)
                .build().setFormula("C7H5ClO", true);
        IronChloride = new Material.Builder(8199, GTBUtil.gtb("iron_chloride")).fluid().color(0x2A5170)
                .build().setFormula("FeCl", true);
        Dichloromethane = new Material.Builder(8200, GTBUtil.gtb("dichloromethane")).fluid().color(0x725E76)
                .build().setFormula("CH2Cl2", true);
        Dimethylaminopyridine = new Material.Builder(8201, GTBUtil.gtb("dimethylaminopyridine")).dust()
                .color(0xFFA000).build().setFormula("C7H10N2", true);
        Pyridine = new Material.Builder(8202, GTBUtil.gtb("pyridine")).fluid().color(0xFE9F01).build()
                .setFormula("C5H5N", true);
        Diisopropylcarbodiimide = new Material.Builder(8203, GTBUtil.gtb("diisopropylcarbodiimide")).fluid()
                .color(0xD32F2F).build().setFormula(" (CH3)2CHN=C=NCH(CH3)2", true);
        IsopropylAlcohol = new Material.Builder(8204, GTBUtil.gtb("isopropyl_alcohol")).fluid()
                .color(0xA4B1A5).build().setFormula("C3H8O", true);
        Silvertetrafluoroborate = new Material.Builder(8205, GTBUtil.gtb("silvertetrafluoroborate")).fluid()
                .color(0xDADBDA).build().setFormula("AgBF4", true);
        TrimethyltinChloride = new Material.Builder(8206, GTBUtil.gtb("trimethyl_tin_chloride")).fluid()
                .color(0x7986CB).build().setFormula("C3H9SnCl", true);
        Phenylpentanoicacid = new Material.Builder(8207, GTBUtil.gtb("phenylpentanoicacid")).fluid()
                .color(0xFCF2DC).build().setFormula("C11H14O2", true);

        // dusts
        Fullerene = new Material.Builder(8208, GTBUtil.gtb("fullerene")).dust().color(0xF9D16E).build()
                .setFormula("C60", true);
        TiAlChloride = new Material.Builder(8209, GTBUtil.gtb("ti_al_chloride")).dust().color(0x1E88E5)
                .build().setFormula("TiAlCl3", true);
        UnfoldedFullerene = new Material.Builder(8210, GTBUtil.gtb("unfolded_fullerene")).dust()
                .color(0x4527A0).build().setFormula("C60", true);
        Succinimide = new Material.Builder(8211, GTBUtil.gtb("succinimide")).dust().color(0x163217).build()
                .setFormula("C4H5NO2", true);
        PotassiumBromide = new Material.Builder(8212, GTBUtil.gtb("potassium_bromide")).dust()
                .color(0xDEBDBD).build().setFormula("KBr", true);
        Benzophenanthrenylacetonitrile = new Material.Builder(8213,
                GTBUtil.gtb("benzophenanthrenylacetonitrile")).dust().color(0xC62828).build().setFormula("?", true);
        Bromosuccinimide = new Material.Builder(8214, GTBUtil.gtb("bromosuccinimide")).dust().color(0x315458)
                .build().setFormula("C4H4BrNO2", true);
        PotassiumCyanide = new Material.Builder(8215, GTBUtil.gtb("potassium_cyanide")).dust()
                .color(0xFFCA28).build().setFormula("KCN", true);
        Methylbenzophenanthrene = new Material.Builder(8216, GTBUtil.gtb("methylbenzophenanthrene")).dust()
                .color(0x327F89).build().setFormula("RhN", true);
        TinChloride = new Material.Builder(8217, GTBUtil.gtb("tin_chloride")).dust().color(0x9A8FBA).build()
                .setFormula("TnCl", true);
        DisodiumPhosphate = new Material.Builder(8218, GTBUtil.gtb("disodium_phosphate")).dust()
                .color(0x3A77AD).build().setFormula("Na2HPO4", true);
        Cyanonaphthalene = new Material.Builder(8219, GTBUtil.gtb("cyanonaphthalene")).dust().color(0x554B67)
                .build().setFormula("C10H7CN", true);
        SodiumBromide = new Material.Builder(8220, GTBUtil.gtb("sodium_bromide")).dust().color(0x837798)
                .build().setFormula("NaBr", true);
        PotassiumPermanganate = new Material.Builder(8221, GTBUtil.gtb("potassium_permanganate")).dust()
                .color(0xE6EE9C).build().setFormula("KMnO4", true);
        PdFullereneMatrix = new Material.Builder(8222, GTBUtil.gtb("palladium_fullerene_matrix")).dust()
                .color(0x4527A0).build().setFormula("PdC73H15NFe", true);
        AluminoSilicateWool = new Material.Builder(8223, GTBUtil.gtb("alumino_silicate_wool")).dust()
                .color(0x4DD0E1).build().setFormula("Al2SiO5", true);
        Sarcosine = new Material.Builder(8224, GTBUtil.gtb("sarcosine")).dust().color(0x3D8540).build()
                .setFormula("C3H7NO2", true);
        Ferrocene = new Material.Builder(8225, GTBUtil.gtb("ferrocene")).fluid().color(0xD1C4E9).build()
                .setFormula("C10H10Fe", true);
        PdIrReOCeOS = new Material.Builder(8226, GTBUtil.gtb("pd_ir_re_o_ce_o_s")).dust().color(0xF9C528)
                .build().setFormula("PdIrReOCeOS", true);
        LithiumAluminiumHydride = new Material.Builder(8227, GTBUtil.gtb("lithium_aluminium_hydride")).dust()
                .color(0xFF5722).build().setFormula("LiAlH4", true);
        PCBS = new Material.Builder(8228, GTBUtil.gtb("pcbs")).fluid().color(0x113B61).build()
                .setFormula("RhN", true);
        Phosgene = new Material.Builder(8229, GTBUtil.gtb("phosgene")).fluid().color(0x2E7D32).build()
                .setFormula("COCl2", true);
        SilverOxide = new Material.Builder(8230, GTBUtil.gtb("silver_oxide")).dust().color(0xB5B4B7).build()
                .setFormula("AgO2", true);
        BoronFluoride = new Material.Builder(8231, GTBUtil.gtb("boron_fluoride")).fluid().color(0x170E32)
                .build().setFormula("BF2", true);
        SilverChloride = new Material.Builder(8232, GTBUtil.gtb("silver_chloride")).dust().color(0x2A632D)
                .build().setFormula("AgCl", true);
        PCBA = new Material.Builder(8233, GTBUtil.gtb("pcba")).fluid().color(0x8E711A).build()
                .setFormula("RhN", true);
        LithiumIodide = new Material.Builder(8234, GTBUtil.gtb("lithium_iodide")).dust().color(0xDEBDBD)
                .build().setFormula("LiI", true);
        AluminiumHydride = new Material.Builder(8235, GTBUtil.gtb("aluminium_hydride")).dust()
                .color(0x98BEE0).build().setFormula("AlH4", true);
        MagnesiumSulfate = new Material.Builder(8236, GTBUtil.gtb("magnesium_sulfate")).dust()
                .color(0x9A9997).build().setFormula("MgSO4", true);
        PotassiumSulfate = new Material.Builder(8237, GTBUtil.gtb("potassium_sulfate")).dust()
                .color(0xE2C647).build().setFormula("K2SO4", true);
        PotassiumFluoride = new Material.Builder(8238, GTBUtil.gtb("potassium_fluoride")).dust()
                .color(0x737373).build().setFormula("KF", true);
        SodiumFluoride = new Material.Builder(8239, GTBUtil.gtb("sodium_fluoride")).dust()
                .color(0x265583).build().setFormula("NaF", true);

        SodiumTellurite = new Material.Builder(8240, GTBUtil.gtb("sodium_tellurite"))
                .dust()
                .color(0xC6C9BE)
                .iconSet(ROUGH)
                .build().setFormula("Na2TeO3", true);

        TelluriumDioxide = new Material.Builder(8241, GTBUtil.gtb("tellurium_dioxide"))
                .dust()
                .color(0xE3DDB8)
                .iconSet(METALLIC)
                .build().setFormula("TeO2", true);

        SeleniumDioxide = new Material.Builder(8242, GTBUtil.gtb("selenium_dioxide"))
                .dust()
                .color(0xE0DDD8)
                .iconSet(METALLIC)
                .build().setFormula("SeO2", true);

        SelenousAcid = new Material.Builder(8243, GTBUtil.gtb("selenous_acid"))
                .dust()
                .color(0xE0E083)
                .iconSet(SHINY)
                .build().setFormula("H2SeO3", true);

        CalciumDioxide = new Material.Builder(8244, GTBUtil.gtb("calcium_dioxide"))
                .dust()
                .color(0xBA421D).build().setFormula("CaO2", true);

        SodiumNitride = new Material.Builder(8245, GTBUtil.gtb("sodium_nitride"))
                .dust()
                .color(0x2B4F77).build().setFormula("NaN2O", true);

        NeodymiumOxide = new Material.Builder(8246, GTBUtil.gtb("neodymium_oxide"))
                .dust()
                .color(0x4D4B4D).build().setFormula("NdO2", true);

        LanthanumOxide = new Material.Builder(8247, GTBUtil.gtb("lanthanum_oxide"))
                .dust()
                .color(0x667B78).build().setFormula("LaO2", true);

        SamariumOxide = new Material.Builder(8248, GTBUtil.gtb("samarium_oxide"))
                .dust()
                .color(0xB2B1A2).build().setFormula("SmO2", true);

        HolmiumOxide = new Material.Builder(8249, GTBUtil.gtb("holmium_oxide"))
                .dust()
                .color(0x351958).build().setFormula("HoO2", true);

        HolmiumFluoride = new Material.Builder(8250, GTBUtil.gtb("holmium_fluoride"))
                .dust()
                .color(0x654788).build().setFormula("HoF2", true);

        CalciumFluoride = new Material.Builder(8251, GTBUtil.gtb("calcium_fluoride"))
                .dust()
                .color(0xACBFBD).build().setFormula("CaF2", true);

        CeriumOxide = new Material.Builder(8252, GTBUtil.gtb("cerium_oxide"))
                .dust()
                .color(0x677753).build().setFormula("CeO2", true);

        ZincChloride = new Material.Builder(8253, GTBUtil.gtb("zinc_chloride"))
                .dust()
                .color(0x677753).build().setFormula("ZnCl2", true);

        EuropiumOxide = new Material.Builder(8254, GTBUtil.gtb("europium_oxide"))
                .dust()
                .color(0x58ABD4).build().setFormula("EuO2", true);

        GadoliniumOxide = new Material.Builder(8255, GTBUtil.gtb("gadolinium_oxide"))
                .dust()
                .color(0xCE8C2C).build().setFormula("GdO2", true);

        HafniumOxide = new Material.Builder(8256, GTBUtil.gtb("hafnium_oxide"))
                .dust()
                .color(0xFFA000).build().setFormula("HfO2", true);

        ZirconiumOxide = new Material.Builder(8257, GTBUtil.gtb("zirconium_oxide"))
                .dust()
                .color(0x818180).build().setFormula("ZrO2", true);

        RutherfordiumOxide = new Material.Builder(8258, GTBUtil.gtb("rutherfordium_oxide"))
                .dust()
                .color(0xC6AA68).build().setFormula("RfO2", true);

        DiacetoneAlcohol = new Material.Builder(8259, GTBUtil.gtb("diacetone_alcohol"))
                .fluid()
                .color(0x442A62).build().setFormula("C6H12O2", true);

        Hexadecanol = new Material.Builder(8260, GTBUtil.gtb("hexadecanol"))
                .fluid()
                .color(0x8F4923).build().setFormula("C16H34O", true);

        PalmaticAcid = new Material.Builder(8261, GTBUtil.gtb("palmatic_acid"))
                .fluid()
                .color(0x79A0A4).build().setFormula("C16H32O2", true);

        Octanol = new Material.Builder(8262, GTBUtil.gtb("octanol"))
                .fluid()
                .color(0xBB5D40).build().setFormula("C8H18O", true);

        Dodecanol = new Material.Builder(8263, GTBUtil.gtb("dodecanol"))
                .fluid()
                .color(0xB43C17).build().setFormula("C12H26O", true);

        Decanol = new Material.Builder(8264, GTBUtil.gtb("decanol"))
                .fluid()
                .color(0xA34C32).build().setFormula("C10H22O", true);

        Hexanol = new Material.Builder(8265, GTBUtil.gtb("hexanol"))
                .fluid()
                .color(0xE65100).build().setFormula("C6H14O", true);

        CaprylicAcid = new Material.Builder(8266, GTBUtil.gtb("caprylic_acid"))
                .fluid()
                .color(0xB71C1C).build().setFormula("C8H16O2", true);

        MethylIsobutylCarbonyl = new Material.Builder(8267, GTBUtil.gtb("methyl_isobutyl_carbonyl"))
                .fluid()
                .color(0x388E3C).build().setFormula("C6H14O", true);

        Tetradecanol = new Material.Builder(8268, GTBUtil.gtb("tetradecanol"))
                .fluid()
                .color(0x7D311A).build().setFormula("C14H29OH", true);

        PotassiumMagnesiumSalts = new Material.Builder(8269, GTBUtil.gtb("potassium_magnesium_salts"))
                .dust()
                .color(0xD7D6D6)
                .build().setFormula("KClMgSO4K2SO4KF", true);

        Anthracene = new Material.Builder(8270, GTBUtil.gtb("anthracene"))
                .fluid()
                .color(0xBFBEBE).build().setFormula("C14H10", true);

        Ethylanthrahydroquinone = new Material.Builder(8271, GTBUtil.gtb("ethylanthrahydroquinone"))
                .fluid()
                .color(0xFDD835).build().setFormula("(C16H12O2)H2", true);

        Ethylanthraquinone = new Material.Builder(8272, GTBUtil.gtb("ethylanthraquinone"))
                .fluid()
                .color(0xFFEB3B).build().setFormula("(C16H12O2)", true);

        PiranhaSolution = new Material.Builder(8273, GTBUtil.gtb("piranha_solution"))
                .fluid()
                .color(0x4A148C).build().setFormula("(C16H12O2)", true);

        Gadolinite = new Material.Builder(8274, GTBUtil.gtb("gadolinite"))
                .dust()
                .fluid()
                .ingot()
                .ore()
                .color(0x4A148C).build().setFormula("GdS3O2", true);

        ScandiumOxide = new Material.Builder(8275, GTBUtil.gtb("scandium_oxide"))
                .dust()
                .color(0xF4511E).build().setFormula("ScO2", true);

        DysprosiumOxide = new Material.Builder(8276, GTBUtil.gtb("dysprosium_oxide"))
                .dust()
                .color(0x00ACC1).build().setFormula("DsO2", true);

        ErbiumOxide = new Material.Builder(8277, GTBUtil.gtb("erbium_oxide"))
                .dust()
                .color(0x3949AB).build().setFormula("ErO2", true);

        YttriumOxide = new Material.Builder(8278, GTBUtil.gtb("yttrium_oxide"))
                .dust()
                .color(0x81B384).build().setFormula("YtO2", true);

        DysprosiumOxideSolution = new Material.Builder(8279, GTBUtil.gtb("dysprosium_oxide_solution"))
                .fluid()
                .color(0xB0A19B).build().setFormula("DsO2(H2O)", true);

        RarestEarthMixture = new Material.Builder(8280, GTBUtil.gtb("rarer_earth_mixture"))
                .fluid()
                .color(0x6A3F32).build();

        PurifiedScandiumLeachResidues = new Material.Builder(8281,
                GTBUtil.gtb("purified_scandium_leach_residues"))
                        .fluid()
                        .color(0x7E57C2).build().setFormula("Sc?", true);

        ExquisiteScandiumLeachResidues = new Material.Builder(8282,
                GTBUtil.gtb("exquisite_scandium_leach_solution"))
                        .fluid()
                        .color(0x58447B).build().setFormula("Sc*?", true);

        LanthanumLeachSolution = new Material.Builder(8283, GTBUtil.gtb("lanthanum_leach_solution"))
                .fluid()
                .color(0x413061).build().setFormula("La?", true);

        LanthanumLeachEmulsion = new Material.Builder(8284, GTBUtil.gtb("lanthanum_leach_emulsion"))
                .fluid()
                .color(0x494353).build().setFormula("La?", true);

        REEGroupMud = new Material.Builder(8285, GTBUtil.gtb("ree_group_mud"))
                .fluid()
                .color(0x3A1A11).build();

        SulfuricResidues = new Material.Builder(8286, GTBUtil.gtb("sulfuric_residues"))
                .fluid()
                .color(0xFDD835).build().setFormula("SO2?", true);

        GadoliniumLeach = new Material.Builder(8287, GTBUtil.gtb("gadolinium_leach"))
                .fluid()
                .color(0xEEDBDB).build().setFormula("Gd?", true);

        RoastedGadoliniteLeachSolution = new Material.Builder(8288,
                GTBUtil.gtb("roasted_gadolinite_leach_solution"))
                        .fluid()
                        .color(0x5A4F4D).build().setFormula("Gd(H2O)?", true);

        GadoliniumSolution = new Material.Builder(8289, GTBUtil.gtb("gadolinium_solution"))
                .fluid()
                .color(0x6D4C41).build().setFormula("Gd(H2O)", true);

        CooledGadoliniteLeachSolution = new Material.Builder(8290,
                GTBUtil.gtb("cooled_gadolinite_leach_solution"))
                        .fluid()
                        .color(0x8D6E63).build().setFormula("(GdS2)(H2O)", true);

        GadoliniteLeachSolution = new Material.Builder(8291, GTBUtil.gtb("gadolinite_leach_solution"))
                .fluid()
                .color(0x605856).build().setFormula("(GdS2)(H2O)", true);

        SilverAlloy = new Material.Builder(8292, GTBUtil.gtb("silver_alloy"))
                .fluid()
                .dust()
                .ingot()
                .flags(GENERATE_FOIL, GENERATE_PLATE)
                .color(0x605856).build().setFormula("AgCuAu", true);

        SinteredSilver = new Material.Builder(8293, GTBUtil.gtb("sintered_silver"))
                .dust()
                .ingot()
                .flags(GENERATE_ROD)
                .color(0x9D9A9A).build().setFormula("Ag", true);

        VanadiumPentoxide = new Material.Builder(8294, GTBUtil.gtb("vanadium_pentoxide"))
                .dust()
                .color(0x8500A3).build().setFormula("VaO5", true);

        TitaniumDioxide = new Material.Builder(8295, GTBUtil.gtb("titanium_dioxide"))
                .dust()
                .color(0xBA68C8).build().setFormula("TiO2", true);

        GaseousTitaniumTetrachloride = new Material.Builder(8296,
                GTBUtil.gtb("gaseous_titanium_tetrachloride"))
                        .gas()
                        .color(0xBA68C8).build().setFormula("TiCl4", true);

        RedMudConcentrate = new Material.Builder(8297, GTBUtil.gtb("red_mud_concentrate"))
                .dust()
                .color(0xE53935).build().setFormula("HCl?", true);

        SodiumAluminateSolution = new Material.Builder(8298, GTBUtil.gtb("sodium_aluminate_solution"))
                .fluid()
                .color(0x1E88E5).build();

        RoastedBauxite = new Material.Builder(8299, GTBUtil.gtb("roasted_bauxite"))
                .dust()
                .color(0x46271D).build().setFormula("Al2O3", true);

        LeachedBauxite = new Material.Builder(8300, GTBUtil.gtb("leached_bauxite"))
                .dust()
                .color(0x8B371C).build();

        TitanylSulfate = new Material.Builder(8301, GTBUtil.gtb("titanyl_sulfate"))
                .fluid()
                .color(0xe66adb).build().setFormula("TiO(SO4)", true);

        RedSlurry = new Material.Builder(8302, GTBUtil.gtb("red_slurry"))
                .fluid()
                .color(0xc91243).build().setFormula("TiO2?", true);

        NeutralisedRedMud = new Material.Builder(8303, GTBUtil.gtb("neutralised_red_mud"))
                .fluid()
                .color(0x700c27).build().setFormula("Fe??", true);

        IronChlorideSolution = new Material.Builder(8304, GTBUtil.gtb("iron_chloride_solution"))
                .fluid()
                .color(0x706f70).build().setFormula("FeCl(H2O)?", true);

        CrystallizedTitanylSulfate = new Material.Builder(8305, GTBUtil.gtb("crystallized_titanyl_sulfate"))
                .dust()
                .color(0xe66adb).build().setFormula("TiO(SO4)", true);

        SodiumChromateSolution = new Material.Builder(8306, GTBUtil.gtb("sodium_chromate_solution"))
                .fluid()
                .color(0xFDD835).build().setFormula("Na2CrO4(H2O)", true);

        SodiumDichromateSolution = new Material.Builder(8307, GTBUtil.gtb("sodium_dichromate_solution"))
                .fluid()
                .color(0xF78A37).build().setFormula("Na2Cr2O7(H2O)", true);

        SodiumDichromate = new Material.Builder(8308, GTBUtil.gtb("sodium_dichromate"))
                .dust()
                .color(0xFF6F00).build().setFormula("Na2Cr2O7", true);

        SodaAshSolution = new Material.Builder(8309, GTBUtil.gtb("soda_ash_solution"))
                .fluid()
                .color(0x455A64).build().setFormula("Na2CO3", true);

        RoastedBornite = new Material.Builder(8310, GTBUtil.gtb("roasted_bornite"))
                .dust()
                .color(0x455A64).build().setFormula("Cu5FeS4", true);

        MalachiteSlag = new Material.Builder(8311, GTBUtil.gtb("malachite_slag"))
                .dust()
                .color(0x68856A).build().setFormula("Cu5FeS4", true);

        SinteredMalachiteSlag = new Material.Builder(8312, GTBUtil.gtb("sintered_malachite_slag"))
                .dust()
                .color(0x4D6B4F).build().setFormula("Cu5FeS4", true);

        SodiumCarbonateSolution = new Material.Builder(8313, GTBUtil.gtb("sodium_carbonate_solution"))
                .fluid()
                .color(0x4D6B4F).build().setFormula("Cu5FeS4", true);

        RealgarSolution = new Material.Builder(8314, GTBUtil.gtb("realgar_solution"))
                .fluid()
                .color(0xB83431).build().setFormula("As4S4(H2O)", true);

        RecrystallizedRealgar = new Material.Builder(8315, GTBUtil.gtb("recrystallized_realgar"))
                .dust()
                .color(0xD83F3B).build().setFormula("As4S4(H2O)*", true);

        ArsenicHydroxide = new Material.Builder(8316, GTBUtil.gtb("arsenic_hydroxide"))
                .dust()
                .color(0xD83F3B).build().setFormula("AsOH", true);

        MoltenGalena = new Material.Builder(8317, GTBUtil.gtb("molten_galena"))
                .fluid()
                .color(0x846392).build().setFormula("PbS", true);

        MoltenOxidizedGalena = new Material.Builder(8318, GTBUtil.gtb("molten_oxidized_galena"))
                .fluid()
                .color(0x7E5F8C).build().setFormula("(PbS)O2", true);

        DesulfurizedMoltenGalena = new Material.Builder(8319, GTBUtil.gtb("desulfurized_molten_galena"))
                .fluid()
                .color(0x77528E).build().setFormula("Pb?", true);

        CopperSulfide = new Material.Builder(8320, GTBUtil.gtb("copper_sulfide"))
                .dust()
                .color(0xDF7351).build().setFormula("CuSO2", true);

        CopperSulfideSolution = new Material.Builder(8321, GTBUtil.gtb("copper_sulfide_solution"))
                .fluid()
                .color(0xDF7351).build().setFormula("CuSO2(H2O)", true);

        SodiumIodate = new Material.Builder(8322, GTBUtil.gtb("sodium_iodate"))
                .dust()
                .color(0x303F9F).build().setFormula("NaIO", true);

        NickelSulfuricSolution = new Material.Builder(8323, GTBUtil.gtb("nickel_sulfuric_solution"))
                .fluid()
                .color(0xD8843E).build().setFormula("NiS2?", true);

        NickelRareResidue = new Material.Builder(8324, GTBUtil.gtb("nickel_rare_residue"))
                .dust()
                .color(0x633426).build().setFormula("NiS2?", true);

        SodiumArsenateSulfuricSolution = new Material.Builder(8325,
                GTBUtil.gtb("sodium_arsenate_sulfuric_solution"))
                        .fluid()
                        .color(0x596D78).build().setFormula("NiS2?", true);

        SodiumIodide = new Material.Builder(8326, GTBUtil.gtb("sodium_iodide"))
                .dust()
                .color(0x07384F).build().setFormula("NaI", true);

        NickelSulfatePrecipitate = new Material.Builder(8327, GTBUtil.gtb("nickel_sulfate_precipitate"))
                .dust()
                .color(0x591B09).build().setFormula("NiS?", true);

        AmmoniaMetalSulfuricSolution = new Material.Builder(8328,
                GTBUtil.gtb("ammonia_metal_sulfuric_solution"))
                        .fluid()
                        .color(0x7F67AF).build().setFormula("(NH3)?", true);

        ImpurePitchblendeSlurry = new Material.Builder(8329,
                GTBUtil.gtb("impure_pitchblende_slurry"))
                        .fluid()
                        .color(0xE1C441).build();

        SodiumIsopropylXanthate = new Material.Builder(8330,
                GTBUtil.gtb("sodium_isopropyl_xanthate"))
                        .fluid()
                        .color(0x8D7924).build();

        PitchblendeSlurry = new Material.Builder(8331,
                GTBUtil.gtb("pitchblende_slurry"))
                        .fluid()
                        .color(0xC9BA79).build();

        UraniumExtractionMixture = new Material.Builder(8332,
                GTBUtil.gtb("uranium_extraction_mixture"))
                        .fluid()
                        .color(0x388E3C).build();

        UraniniteExtract = new Material.Builder(8333,
                GTBUtil.gtb("uraninite_extract"))
                        .fluid()
                        .color(0x445045).build();

        UranylSulfide = new Material.Builder(8334,
                GTBUtil.gtb("uranyl_sulfide"))
                        .fluid()
                        .color(0x99A043).build();

        AmmoniaSulfateSolution = new Material.Builder(8335,
                GTBUtil.gtb("ammonia_sulfate_solution"))
                        .fluid()
                        .color(0xE4B86C).build().setFormula("(NH3)(H2O)S", true);

        PitchblendeFiltrate = new Material.Builder(8336,
                GTBUtil.gtb("pitchblende_filtrate"))
                        .dust()
                        .color(0xAFB42B).build().setFormula("?", true);

        UraniumThoriumFiltrate = new Material.Builder(8337,
                GTBUtil.gtb("uranium_thorium_filtrate"))
                        .dust()
                        .color(0x4CAF50).build().setFormula("(UO2)(ThO2)?", true);

        LeadMetallicPowder = new Material.Builder(8338,
                GTBUtil.gtb("lead_metallic_powder"))
                        .dust()
                        .color(0x977C9E).build().setFormula("Pb?", true);

        UraniumMetallicPowder = new Material.Builder(8339,
                GTBUtil.gtb("uranium_metallic_powder"))
                        .dust()
                        .color(0x456D47).build().setFormula("U??", true);

        UraniumResidues = new Material.Builder(8340,
                GTBUtil.gtb("uranium_residues"))
                        .dust()
                        .color(0x36736B).build().setFormula("U?", true);

        UraniumDioxide = new Material.Builder(8341,
                GTBUtil.gtb("uranium_dioxide"))
                        .dust()
                        .color(0x68886A).build().setFormula("UO2", true);

        CobaltSulfide = new Material.Builder(8342,
                GTBUtil.gtb("cobalt_sulfide"))
                        .dust()
                        .color(0x616AA2).build().setFormula("CoSO2", true);

        NickelSulfide = new Material.Builder(8343,
                GTBUtil.gtb("nickel_sulfide"))
                        .dust()
                        .color(0x628CB1).build().setFormula("NiSO2", true);

        UraniumSolution = new Material.Builder(8344,
                GTBUtil.gtb("uranium_solution"))
                        .fluid()
                        .color(0x58935B).build().setFormula("U?", true);

        ThoriumPhosphateCakeSolution = new Material.Builder(8345,
                GTBUtil.gtb("thorium_phosphate_cake_solution"))
                        .fluid()
                        .color(0x426845).build().setFormula("Th?", true);

        Alumina = new Material.Builder(8346,
                GTBUtil.gtb("alumina"))
                        .fluid()
                        .ingot()
                        .ore()
                        .dust()
                        .color(0x8FABC2).build().setFormula("Al2O3", true);

        Zircon = new Material.Builder(8347,
                GTBUtil.gtb("zircon"))
                        .fluid()
                        .flags(GENERATE_FLOATED, GENERATE_SIFTED)
                        .ore()
                        .gem()
                        .dust()
                        .color(0x903939).build().setFormula("ZrSiO4", true);

        DigestedPyrochlore = new Material.Builder(8348,
                GTBUtil.gtb("digested_pyrochlore"))
                        .dust()
                        .color(0x3B1F17).build().setFormula("Ca2Nb2O7", true);

        PyrochloreSlurry = new Material.Builder(8349,
                GTBUtil.gtb("pyrochlore_slurry"))
                        .fluid()
                        .color(0x48190B).build().setFormula("Ca2Nb2O7", true);

        ImpurePyrochloreSlurry = new Material.Builder(8350,
                GTBUtil.gtb("impure_pyrochlore_slurry"))
                        .fluid()
                        .color(0x541907).build().setFormula("Ca2Nb2O7", true);

        ImpureZirconSlurry = new Material.Builder(8351,
                GTBUtil.gtb("impure_zircon_slurry"))
                        .fluid()
                        .color(0xB35B5B).build().setFormula("ZrSiO4", true);

        SodiumEthylXanthate = new Material.Builder(8352,
                GTBUtil.gtb("sodium_ethyl_xanthate"))
                        .dust()
                        .color(0xBFB669).build().setFormula("CH3CH2OCS2Na", true);

        ZirconSlurry = new Material.Builder(8353,
                GTBUtil.gtb("zircon_slurry"))
                        .fluid()
                        .color(0xB25656).build().setFormula("ZrSiO4", true);

        FusedZircon = new Material.Builder(8354,
                GTBUtil.gtb("fused_zircon"))
                        .dust()
                        .color(0x842222).build().setFormula("ZrSiO4", true);

        ZirconylChlorideSolution = new Material.Builder(8355,
                GTBUtil.gtb("zirconyl_chloride_solution"))
                        .fluid()
                        .color(0x4CAF50).build().setFormula("(ZrOCl2)(HCl)2(H2O)2", true);

        HafniumExtractionMixture = new Material.Builder(8356,
                GTBUtil.gtb("hafnium_extraction_mixture"))
                        .fluid()
                        .color(0xEC407A).build();

        PurifiedZirconylChlorideSolution = new Material.Builder(8357,
                GTBUtil.gtb("purified_zirconyl_chloride_solution"))
                        .fluid()
                        .color(0x43A047).build().setFormula("(ZrOCl2)(HCl)2(H2O)2", true);

        HafniumExtract = new Material.Builder(8358,
                GTBUtil.gtb("hafnium_extract"))
                        .fluid()
                        .color(0xC9A3CF).build();

        HafniumSulfateSolution = new Material.Builder(8359,
                GTBUtil.gtb("hafnium_sulfate_solution"))
                        .fluid()
                        .color(0xE1BEE7).build().setFormula("[Hf(SO4)2](H2O)2", true);

        HafniumDioxide = new Material.Builder(8360,
                GTBUtil.gtb("hafnium_dioxide"))
                        .dust()
                        .color(0xCAC3CC).build().setFormula("HfO2", true);

        ZirconiumBase = new Material.Builder(8361,
                GTBUtil.gtb("zirconium_base"))
                        .dust()
                        .color(0xFAF4C2).build().setFormula("Zr?", true);

        ImpureCelestineSlurry = new Material.Builder(8362,
                GTBUtil.gtb("impure_celestine_slurry"))
                        .fluid()
                        .color(0x709BBD).build().setFormula("((?)(SrS))(H2O)(SiO2)", true);

        CelestineSlurry = new Material.Builder(8363,
                GTBUtil.gtb("celestine_slurry"))
                        .fluid()
                        .color(0x81A4BF).build();

        StrontiumSulfideSolution = new Material.Builder(8364,
                GTBUtil.gtb("strontium_sulfide_solution"))
                        .fluid()
                        .color(0x4F5A63).build().setFormula("(SrS)(H2O)", true);

        StrontiumCarbonate = new Material.Builder(8365,
                GTBUtil.gtb("strontium_carbonate"))
                        .dust()
                        .color(0x4CAF50).build().setFormula("SrCO3", true);

        ImpureTantaliteSlurry = new Material.Builder(8366,
                GTBUtil.gtb("impure_tantalite_slurry"))
                        .fluid()
                        .color(0x74321D).build().setFormula("MnTa2O6(H2O)?", true);

        TantaliteSlurry = new Material.Builder(8367,
                GTBUtil.gtb("tantalite_slurry"))
                        .fluid()
                        .color(0x593428).build().setFormula("MnTa2O6(H2O)", true);

        SodiumBisulfateSolution = new Material.Builder(8368,
                GTBUtil.gtb("sodium_bisulfate_solution"))
                        .fluid()
                        .color(0x3F51B5).build().setFormula("(NaHSO4)(H2O)", true);

        EpoxidPCBBase = new Material.Builder(8369,
                GTBUtil.gtb("epoxid_pcb_base"))
                        .fluid()
                        .dust()
                        .ingot()
                        .flags(GENERATE_PLATE)
                        .color(0xFDD835).build();

        AluminoSilicateWoolSolution = new Material.Builder(8370,
                GTBUtil.gtb("alumino_silicate_wool_solution"))
                        .fluid()
                        .color(0x6B757F).build().setFormula("(Al2SiO5)(H2O)", true);

        HighPuritySilicon = new Material.Builder(8371,
                GTBUtil.gtb("high_purity_silicon"))
                        .dust()
                        .color(0x574E4E).build().setFormula("Si*", true);

        SiliconTetrachloride = new Material.Builder(8372,
                GTBUtil.gtb("silicon_tetrachloride"))
                        .fluid()
                        .color(0x79847A).build().setFormula("SiCl4", true);

        IndiumHydroxide = new Material.Builder(8030,
                GTBUtil.gtb("indium_hydroxide"))
                        .dust()
                        .color(0x652F6E).build().setFormula("In(HO)3", true);

        IndiumHydroxideConcentrate = new Material.Builder(8373,
                GTBUtil.gtb("indium_hydroxide_concentrate"))
                        .fluid()
                        .color(0x855D8B).build().setFormula("InHO", true);

        IronPoorMixture = new Material.Builder(8374,
                GTBUtil.gtb("iron_poor_mixture"))
                        .fluid()
                        .color(0xF4511E).build().setFormula("?In", true);

        ZincPoorMixture = new Material.Builder(8375,
                GTBUtil.gtb("zinc_poor_mixture"))
                        .fluid()
                        .color(0x7E57C2).build().setFormula("?Fe", true);

        MetalHydroxideMix = new Material.Builder(8376,
                GTBUtil.gtb("metal_hydroxide_mix"))
                        .fluid()
                        .color(0xF5AE52).build().setFormula("?ZnOH", true);

        SeparatedMetalRichSlagSlurry = new Material.Builder(8377,
                GTBUtil.gtb("separated_metal_rich_slag_slurry"))
                        .fluid()
                        .color(0x848B91).build().setFormula("H3PO4?", true);

        AcidicMetalRichSlagSlurry = new Material.Builder(8378,
                GTBUtil.gtb("acidic_metal_rich_slag_slurry"))
                        .fluid()
                        .color(0x96856C).build().setFormula("H3PO4?", true);

        MetalRichSlagSlurry = new Material.Builder(8379,
                GTBUtil.gtb("metal_rich_slag_slurry"))
                        .fluid()
                        .color(0xD9A899).build().setFormula("?", true);

        ZincSlagSlurry = new Material.Builder(8380,
                GTBUtil.gtb("zinc_slag_slurry"))
                        .fluid()
                        .color(0xB5B2AE).build().setFormula("?", true);

        ZincResidualSlag = new Material.Builder(8381,
                GTBUtil.gtb("zinc_residual_slag"))
                        .dust()
                        .color(0xB8B7B7).build().setFormula("?", true);

        FineZincSlag = new Material.Builder(8382,
                GTBUtil.gtb("fine_zinc_slag"))
                        .dust()
                        .color(0xADADAD).build().setFormula("?", true);

        ThalliumSulfateSolution = new Material.Builder(8383,
                GTBUtil.gtb("thallium_sulfate_solution"))
                        .fluid()
                        .color(0x8A8F94).build().setFormula("Tl2SO4?", true);

        ThalliumChloride = new Material.Builder(8384,
                GTBUtil.gtb("thallium_chloride"))
                        .dust()
                        .color(0xE3F2FD).build().setFormula("TlCl2", true);

        ThalliumResidues = new Material.Builder(8385,
                GTBUtil.gtb("thallium_residues"))
                        .dust()
                        .color(0xA970C1).build().setFormula("Tl?", true);

        CadmiumSulfateSolution = new Material.Builder(8386,
                GTBUtil.gtb("cadmium_sulfate_solution"))
                        .fluid()
                        .color(0xCFB091).build().setFormula("CdSO4?", true);

        CadmiumThalliumLiqour = new Material.Builder(8387,
                GTBUtil.gtb("cadmium_thalliun_liqour"))
                        .fluid()
                        .color(0xA6B5A7).build().setFormula("(H2SO4)CdTl", true);

        ZincAmalgam = new Material.Builder(8388,
                GTBUtil.gtb("zinc_amalgam"))
                        .fluid()
                        .color(0x999999).build().setFormula("ZnHg", true);

        CadmiumZinc = new Material.Builder(8389,
                GTBUtil.gtb("cadmium_zinc"))
                        .dust()
                        .color(0x726E7E).build().setFormula("(H2SO4)CdZn?", true);

        ZincFlue = new Material.Builder(8390,
                GTBUtil.gtb("zinc_flue"))
                        .dust()
                        .iconSet(SAND)
                        .color(0xA1A1A0).build().setFormula("?", true);

        ZincExhaustMixture = new Material.Builder(8391,
                GTBUtil.gtb("zinc_exhaust_mixture"))
                        .fluid()
                        .color(0x7D7D7C).build().setFormula("(SO2)(CO2)?", true);

        ZincOreCokePellets = new Material.Builder(8392,
                GTBUtil.gtb("zinc_ore_coke_pellets"))
                        .dust()
                        .iconSet(ROUGH)
                        .color(0x61605A).build().setFormula("(H2O)(ZnS)C", true);

        PreciousMetal = new Material.Builder(8393,
                GTBUtil.gtb("precious_metal"))
                        .dust()
                        .ingot()
                        .ore()
                        .fluid()
                        .color(0xAD9B49).build().setFormula("Au?", true);

        StreptococcusPyogenes = new Material.Builder(8394,
                GTBUtil.gtb("streptococcus_pyogenes"))
                        .dust()
                        .color(0x61605A).build().setFormula("Bacteria", true);

        EglinSteel = new Material.Builder(8395,
                GTBUtil.gtb("eglin_steel"))
                        .dust()
                        .ingot()
                        .blast(2900)
                        .flags(GENERATE_PLATE, GENERATE_FRAME)
                        .color(0xA14919).build().setFormula("(Fe4(FeAlCr)(Fe2Ni)5)10SSiC", true);

        EglinSteelBase = new Material.Builder(8396,
                GTBUtil.gtb("eglin_steel_base"))
                        .dust()
                        .color(0xAD7150).build().setFormula("Fe4(FeAlCr)(Fe2Ni)5", true);

        LowQualitySteel = new Material.Builder(8397,
                GTBUtil.gtb("low_quality_steel"))
                        .dust()
                        .ingot()
                        .flags(GENERATE_PLATE, GENERATE_FRAME)
                        .color(0x434343).build().setFormula("Fe20C", true);

        PurifiedSiliconCarbide = new Material.Builder(8398, GTBUtil.gtb("purified_silicon_carbide"))
                        .dust()
                        .ingot()
                        .flags(GENERATE_PLATE, GENERATE_FRAME)
                        .color(0x434343).build().setFormula("SiC", true);

        Hydroquinone = new Material.Builder(8399,
                GTBUtil.gtb("hydroquinone"))
                        .fluid()
                        .color(0x9e3123).build().setFormula("C6H4(OH)2", true);

        DeionizedPalladium = new Material.Builder(8400,
                GTBUtil.gtb("deionized_palladium"))
                        .dust()
                        .iconSet(SHINY)
                        .color(0xDFDFDF).build().setFormula("Pd(NH3)H2O", true);

        DriedPalladium = new Material.Builder(8401,
                GTBUtil.gtb("dried_palladium"))
                        .dust()
                        .iconSet(DULL)
                        .color(0xDFDFDF).build().setFormula("Pd(NH3)", true);

        RichAmine = new Material.Builder(8402,
                GTBUtil.gtb("rich_amine"))
                        .fluid()
                        .color(0x3C3C3C).build().setFormula("?", true);

        DeionizedWater = new Material.Builder(8403,
                GTBUtil.gtb("deionized_water"))
                        .fluid()
                        .color(0x1C5480).build().setFormula("H2O", true);

        DeaeratedWater = new Material.Builder(8404,
                GTBUtil.gtb("deaerated_water"))
                        .fluid()
                        .color(0x7FABCE).build().setFormula("H2O", true);

        DemineralizedWater = new Material.Builder(8405,
                GTBUtil.gtb("demineralized_water"))
                        .fluid()
                        .color(0x7AA1C0).build().setFormula("H2O", true);

        WaterPlasma = new Material.Builder(8406,
                GTBUtil.gtb("water_plasma"))
                        .plasma()
                        .color(0xB3D1EC).build().setFormula("H2O", true);

        UltrapureWater = new Material.Builder(8407,
                GTBUtil.gtb("ultrapure_water"))
                        .fluid()
                        .color(0xC3DFF5).build().setFormula("H2O", true);

        HighPressureUltrapureWaterGrade1 = new Material.Builder(8408,
                GTBUtil.gtb("high_pressure_ultrapure_water_grade_1"))
                        .fluid()
                        .color(0x73A6D8).build().setFormula("H2O", true);

        SupercriticalUltrapureWaterGrade1 = new Material.Builder(8409,
                GTBUtil.gtb("supercritical_ultrapure_water_grade_1"))
                        .fluid()
                        .color(0x98BDE4).build().setFormula("H2O", true);

        UltrapureWaterGrade1 = new Material.Builder(8410,
                GTBUtil.gtb("ultrapure_water_grade_1"))
                        .fluid()
                        .color(0xB6D1ED).build().setFormula("H2O", true);

        UltrapureWaterGrade2 = new Material.Builder(8411,
                GTBUtil.gtb("ultrapure_water_grade_2"))
                        .fluid()
                        .color(0xBBD4EE).build().setFormula("H2O", true);

        UltrapureWaterGrade3 = new Material.Builder(8412,
                GTBUtil.gtb("ultrapure_water_grade_3"))
                        .fluid()
                        .color(0xC3DAF1).build().setFormula("H2O", true);

        UltrapureWaterGrade4 = new Material.Builder(8413,
                GTBUtil.gtb("ultrapure_water_grade_4"))
                        .fluid()
                        .color(0xC7DCF0).build().setFormula("H2O", true);

        UltrapureWaterGrade5 = new Material.Builder(8414,
                GTBUtil.gtb("ultrapure_water_grade_5"))
                        .fluid()
                        .color(0xCEE1F4).build().setFormula("H2O", true);

        UltrapureWaterGrade6 = new Material.Builder(8415,
                GTBUtil.gtb("ultrapure_water_grade_6"))
                        .fluid()
                        .color(0xD2E2F3).build().setFormula("H2O", true);

        UltrapureWaterGrade7 = new Material.Builder(8416,
                GTBUtil.gtb("ultrapure_water_grade_7"))
                        .fluid()
                        .color(0xD9E7F5).build().setFormula("H2O", true);

        UltrapureWaterGrade8 = new Material.Builder(8417,
                GTBUtil.gtb("ultrapure_water_grade_8"))
                        .fluid()
                        .color(0xE5EDF3).build().setFormula("H2O", true);

        SterilizedWater = new Material.Builder(8418,
                GTBUtil.gtb("sterilized_water"))
                        .fluid()
                        .color(0x81B5DC).build().setFormula("H2O", true);

        MolecularSieve = new Material.Builder(8419,
                GTBUtil.gtb("molecular_sieve"))
                        .dust()
                        .iconSet(SHINY)
                        .color(0x666666).build();

        ImpurePolluciteSlurry = new Material.Builder(8420,
                GTBUtil.gtb("impure_pollucite_slurry"))
                        .fluid()
                        .color(0xC5C0BE).build();

        Oleic_Acid = new Material.Builder(8421,
                GTBUtil.gtb("oleic_acid"))
                        .fluid()
                        .dust()
                        .color(0xA9C885).build().setFormula("C18H34O2", true);

        SodiumSilicate = new Material.Builder(8422, GTBUtil.gtb("sodium_silicate"))
                        .dust()
                        .color(0x8E9798).build().setFormula("Na2OSiO2", true);

        PolluciteSlurry = new Material.Builder(8423, GTBUtil.gtb("pollucite_slurry"))
                        .fluid()
                        .color(0xC5C0BE).build();

        Difluorobenzophenone = new Material.Builder(8424, GTBUtil.gtb("difluorobenzophenone"))
                        .fluid()
                        .color(0x31AABA).build().setFormula("C13H8OF2", true);

        BoronOxide = new Material.Builder(8425, GTBUtil.gtb("boron_oxide"))
                .dust()
                .iconSet(DULL)
                .color(0xCBD1D4)
                .build().setFormula("BO2", true);

        
        FormicAcid = new Material.Builder(8426, GTBUtil.gtb("formic_acid"))
                .liquid(new FluidBuilder())
                .color(0xD15918)
                .build().setFormula("CH20H2", true);

        SodiumFormate = new Material.Builder(8427, GTBUtil.gtb("sodium_formate"))
                .liquid(new FluidBuilder())
                .dust()
                .color(0x3F415F)
                .build().setFormula("HCOONa", true);

        Tripropylamine = new Material.Builder(8428, GTBUtil.gtb("tripropylamine"))
                .liquid(new FluidBuilder())
                .color(0x8D8D8E)
                .build().setFormula("C8H10", true);
        
        Tetrabromoethane = new Material.Builder(8429, GTBUtil.gtb("tetrabromoethane"))
                .fluid()
                .color(0x5AAADA)
                .build().setFormula("C2H2Br4", true);

        GammaButyrolactone = new Material.Builder(8430, GTBUtil.gtb("gamma_butyrolactone"))
                .fluid()
                .color(0xAF04D6)
                .build().setFormula("C4H6O2", true);

        NMethylPyrrolidone = new Material.Builder(8431, GTBUtil.gtb("n_methyl_pyrrolidone"))
                .fluid()
                .color(0xA504D6)
                .build().setFormula("C5H9NO", true);

        Aminophenol = new Material.Builder(8432, GTBUtil.gtb("aminophenol"))
                .fluid()
                .color(0xFF7F50)
                .build().setFormula("HOC6H4NH2", true);

        Nitroaniline = new Material.Builder(8433, GTBUtil.gtb("nitroaniline"))
                .fluid()
                .color(0x2A6E68)
                .build().setFormula("H2NC6H4NO2", true);

        PhosphorusOxychloride = new Material.Builder(8434, GTBUtil.gtb("phosphorus_oxychloride"))
                .fluid()
                .color(0xD9D086)
                .build().setFormula("POCl3", true);

        MethylIsobutylKetone = new Material.Builder(8435, GTBUtil.gtb("methyl_isobutyl_ketone"))
                .fluid()
                .color(0x20FF2E).build().setFormula("C6H12O", true);

        NbTaSeparationMixture = new Material.Builder(8436, GTBUtil.gtb("nb_ta_separation_mixture"))
                .fluid()
                .color(0xFFA078).build().setFormula("C18H39O5P", true);

        Oxypentafluoroniobate = new Material.Builder(8437, GTBUtil.gtb("oxypentafluoroniobate"))
                .fluid()
                .color(0x70FF5E).build().setFormula("H2NbOF5", true);

        Heptafluorotantalate = new Material.Builder(8438, GTBUtil.gtb("heptafluorotantalate"))
                .fluid()
                .color(0x2AFF5E).build().setFormula("H2TaF7", true);

        PotassiumFluorotantalate = new Material.Builder(8439, GTBUtil.gtb("potassium_fluorotantalate"))
                .dust()
                .color(0x00DC51).build().setFormula("K2TaF7", true);

        IronSulfate = new Material.Builder(8440, GTBUtil.gtb("iron_sulfate"))
                .dust()
                .color(0xFFF176).build().setFormula("FeSO4", true);

        SodiumSulfate = new Material.Builder(8441, GTBUtil.gtb("sodium_sulfate"))
                .dust()
                .color(0x2A6E8D).build().setFormula("Na2SO4", true);
        
        FluoroniobicAcid = new Material.Builder(8442, GTBUtil.gtb("fluoroniobic_acid"))
                .fluid()
                .color(0x7CB342).build().setFormula("NbHF7", true);

        CubicZirconia = new Material.Builder(8443, GTBUtil.gtb("cubic_zirconia"))
                .dust()
                .gem()
                .iconSet(SHINY)
                .color(0xDECAE1).build().setFormula("ZrO2", true);

        PotassiumFluoroniobate = new Material.Builder(8444, GTBUtil.gtb("potassium_fluoroniobate"))
                .dust()
                .color(0x72FF86).build().setFormula("K2NbF7", true);

        FluorotantalicAcid = new Material.Builder(8445, GTBUtil.gtb("fluorotantalic_acid"))
                .fluid()
                .color(0x7CB342).build().setFormula("TaHF7", true);

        
        BariumOxide = new Material.Builder(8446, GTBUtil.gtb("barium_oxide"))
                .dust()
                .color(0xC86B69).build().setFormula("BaO2", true);

        BariumPeroxide = new Material.Builder(8447, GTBUtil.gtb("barium_peroxide"))
                .dust()
                .color(0x9C3734).build().setFormula("BaO5", true);

        Columbite = new Material.Builder(8448, GTBUtil.gtb("columbite"))
                .dust()
                .iconSet(METALLIC)
                .ore()
                .flags(GENERATE_FLOATED, GENERATE_SIFTED)
                .color(0xFDD835).build().setFormula("FeNb2O6", true);

        Celestine = new Material.Builder(8449, GTBUtil.gtb("celestine"))
                .dust()
                .iconSet(SHINY)
                .ore()
                .flags(GENERATE_FLOATED, GENERATE_SIFTED)
                .color(0xA7CFF1).build().setFormula("SrSO4", true);

        ManganeseSulfate = new Material.Builder(8450, GTBUtil.gtb("manganese_sulfate"))
                .dust()
                .color(0xDBD180).build().setFormula("MgSO2", true);

        Rhodocrosite = new Material.Builder(8451, GTBUtil.gtb("rhodocrosite"))
                .dust()
                .iconSet(SHINY)
                .ore()
                .color(0xC62828).build().setFormula("MnCO3", true);

        CassiteriteCokePellets = new Material.Builder(8452, GTBUtil.gtb("cassiterite_coke_pellets"))
                .dust()
                .color(0x414040).build().setFormula("SnO2C?", true);

        TinSlag = new Material.Builder(8453, GTBUtil.gtb("tin_slag"))
                .dust()
                .iconSet(ROUGH)
                .color(0xADAAAA).build().setFormula("NbTa?", true);

        NbTaContainingDust = new Material.Builder(8454, GTBUtil.gtb("nb_ta_containing_dust"))
                .dust()
                .iconSet(ROUGH)
                .color(0x8E7C7C).build().setFormula("NbTa?", true);

        AluminiumTrifluoride = new Material.Builder(8455, GTBUtil.gtb("aluminium_trifluoride"))
                .dust()
                .color(0x1976D2).build().setFormula("AlF3", true);

        SiliconFluoride = new Material.Builder(8456, GTBUtil.gtb("silicon_fluoride"))
                .fluid()
                .color(0x818A91).build().setFormula("SiF2", true);

        CrudeHelium = new Material.Builder(8457, GTBUtil.gtb("crude_helium"))
                .fluid()
                .color(0xDCE775)
                .build().setFormula("He", true);

        CrudeXenon = new Material.Builder(8458, GTBUtil.gtb("crude_xenon"))
                .fluid()
                .color(0xD32F2F)
                .build().setFormula("Xe", true);

        CrudeArgon = new Material.Builder(8459, GTBUtil.gtb("crude_argon"))
                .fluid()
                .color(0x9CCC65)
                .build().setFormula("Ar", true);

        PartiallyLiquidKrypton = new Material.Builder(8460, GTBUtil.gtb("partially_liquid_krypton"))
                .fluid()
                .color(0x81C784)
                .build().setFormula("Kr", true);

        PartiallyLiquidNeon = new Material.Builder(8461, GTBUtil.gtb("partially_liquid_neon"))
                .fluid()
                .color(0xF9A825)
                .build().setFormula("Ne", true);

        PartiallyLiquidHelium = new Material.Builder(8462, GTBUtil.gtb("partially_liquid_helium"))
                .fluid()
                .color(0xDCE775)
                .build().setFormula("He", true);

        PartiallyLiquidXenon = new Material.Builder(8463, GTBUtil.gtb("partially_liquid_xenon"))
                .fluid()
                .color(0xD32F2F)
                .build().setFormula("Xe", true);

        PartiallyLiquidArgon = new Material.Builder(8464, GTBUtil.gtb("partially_liquid_argon"))
                .fluid()
                .color(0x9CCC65)
                .build().setFormula("Ar", true);

        LiquidArgon = new Material.Builder(8465, GTBUtil.gtb("liquid_argon"))
                .fluid()
                .color(0x689F38)
                .build().setFormula("Ar", true);

        LiquidNeon = new Material.Builder(8466, GTBUtil.gtb("liquid_neon"))
                .fluid()
                .color(0xFF8F00)
                .build().setFormula("Ne", true);

        ColdGaseousOxygen = new Material.Builder(8467, GTBUtil.gtb("cold_gaseous_oxygen"))
                .fluid()
                .color(0xFF8F00)
                .build().setFormula("O2", true);

        LiquidOxygen = new Material.Builder(8468, GTBUtil.gtb("liquid_oxygen"))
                .fluid()
                .color(0x2196F3)
                .build().setFormula("O2", true);

        CrudeNeon = new Material.Builder(8469, GTBUtil.gtb("crude_neon"))
                .fluid()
                .color(0xF9A825)
                .build().setFormula("Ne", true);

        
        ColdAir = new Material.Builder(8470, GTBUtil.gtb("cold_air"))
                .fluid()
                .color(0xBBDEFB)
                .build().setFormula('N70O22(CO2)5He2Ar(H2O)', true);

        SupercooledLiquidNitrogen = new Material.Builder(8471, GTBUtil.gtb("supercooled_liquid_nitrogen"))
                .fluid()
                .color(0x4FC3F7)
                .build().setFormula('N2', true);

        UntreatedLiquidOxygen = new Material.Builder(8472, GTBUtil.gtb("untreated_liquid_oxygen"))
                .fluid()
                .color(0x6CA4BE)
                .build().setFormula('O2', true);

        ColdWasteGasouesNitrogen = new Material.Builder(8473, GTBUtil.gtb("cold_waste_gaseous_nitrogen"))
                .fluid()
                .color(0x5C7884)
                .build().setFormula('N2', true);

        ColdGasouesNitrogen = new Material.Builder(8474, GTBUtil.gtb("cold_gaseous_nitrogen"))
                .fluid()
                .color(0x5C7884)
                .build().setFormula('N2', true);

        ArgonRichGas = new Material.Builder(8475, GTBUtil.gtb("argon_rich_gas"))
                .fluid()
                .color(0x6B976D)
                .build().setFormula('Ar', true);

        CrudeArgonVapor = new Material.Builder(8476, GTBUtil.gtb("crude_argon_vapor"))
                .fluid()
                .color(0x388E3C)
                .build().setFormula('Ar', true);

        SupercooledOxygen = new Material.Builder(8477, GTBUtil.gtb("supercooled_oxygen"))
                .fluid()
                .color(0x32312F)
                .build().setFormula('Kr', true);

        LiquidWasteNitrogen = new Material.Builder(8478, GTBUtil.gtb("liquid_waste_nitrogen"))
                .fluid()
                .color(0x29B6F6)
                .build().setFormula('N2', true);

        LiquidKrypton = new Material.Builder(8479, GTBUtil.gtb("liquid_krypton"))
                .fluid()
                .color(0x0277BD)
                .build().setFormula('Kr', true);

        CrudeKrypton = new Material.Builder(8480, GTBUtil.gtb("crude_krypton"))
                .fluid()
                .color(0x81C784)
                .build().setFormula('Kr', true);

        Adamantium = new Material.Builder(8481, GTBUtil.gtb("adamantium"))
                .fluid()
                .dust()
                .flags(GENERATE_PLATE, GENERATE_FRAME)
                .iconSet(SHINY)
                .color(0x333537)
                .build().setFormula("Ad", true);

        OneButene = new Material.Builder(8482, GTBUtil.gtb("1_butene"))
                .fluid()
                .color(0xBA8B7D)
                .build().setFormula("C4H8", true);
        
        AmmoniumBisulfate = new Material.Builder(8483, GTBUtil.gtb("ammonium_bisulfate"))
                .fluid()
                .dust()
                .color(0x65798D)
                .build().setFormula("NH4HSO4", true);

        SlightlyEnrichedWater = new Material.Builder(8484, GTBUtil.gtb("slightly_enriched_water"))
                .fluid()
                .color(0x6296C4)
                .build().setFormula("H*DO", true);

        SlightlyDepletedHydrogenSulfide = new Material.Builder(8485, GTBUtil.gtb("slightly_depleted_hydrogen_sulfide"))
                .fluid()
                .color(0xE28C41)
                .build().setFormula("H2S", true);

        ModeratelyEnrichedHydrogenSulfide = new Material.Builder(8486, GTBUtil.gtb("moderately_enriched_hydrogen_sulfide"))
                .fluid()
                .color(0xC2722B)
                .build().setFormula("H*DS", true);

        ModeratelyDepletedSteam = new Material.Builder(8487, GTBUtil.gtb("moderately_depleted_steam"))
                .fluid()
                .color(0xC5D1DA)
                .build().setFormula("H2S", true);

        HeavilyEnrichedWater = new Material.Builder(8488, GTBUtil.gtb("heavily_enriched_water"))
                .fluid()
                .color(0x4183BD)
                .build().setFormula("HD*O", true);

        HeavilyDepletedHydrogenSulfide = new Material.Builder(8489, GTBUtil.gtb("heavily_depleted_hydrogen_sulfide"))
                .fluid()
                .color(0xC07E44)
                .build().setFormula("H2S", true);

        SeverelyEnrichedHydrogenSulfide = new Material.Builder(8490, GTBUtil.gtb("severely_enriched_hydrogen_sulfide"))
                .fluid()
                .color(0xB56A28)
                .build().setFormula("HD**S", true);

        SeverelyDepletedSteam = new Material.Builder(8491, GTBUtil.gtb("severely_depleted_steam"))
                .fluid()
                .color(0xD2D9DE)
                .build().setFormula("H2O", true);

        DepletedHydrogenSulfide = new Material.Builder(8492, GTBUtil.gtb("depleted_hydrogen_sulfide"))
                .fluid()
                .color(0xC47E40)
                .build().setFormula("H2-S", true);

        HeavyWater = new Material.Builder(8493, GTBUtil.gtb("heavy_water"))
                .fluid()
                .color(0x215B8E)
                .build().setFormula("D2O", true);

        SodiumOleate = new Material.Builder(8494, GTBUtil.gtb("sodium_oleate"))
                .dust()
                .color(0x4DAFBA)
                .build().setFormula("C18H33O2Na", true);

        LeadNitrate = new Material.Builder(8495, GTBUtil.gtb("lead_nitrate"))
                .dust()
                .color(0xA586AD)
                .iconSet(METALLIC)
                .build().setFormula("Pb(NO3)2", true);

        MesitylOxide = new Material.Builder(8496, GTBUtil.gtb("mesityl_oxide"))
                .fluid()
                .color(0x989898)
                .build().setFormula("C6H10O", true);

        PhosphorylChloride = new Material.Builder(8497, GTBUtil.gtb("phosphoryl_chloride"))
                .fluid()
                .color(0xC0C1BF)
                .build().setFormula("POCl3", true);

        TantalumOxide = new Material.Builder(8498, GTBUtil.gtb("tantalum_oxide"))
                .dust()
                .color(0x9C27B0)
                .iconSet(SHINY)
                .build().setFormula("Ta2O5", true);

        NiobiumOxide = new Material.Builder(8499, GTBUtil.gtb("niobium_oxide"))
                .dust()
                .color(0x646FB1)
                .iconSet(SHINY)
                .build().setFormula("Nb2O5", true);

        PotassiumFluorotantalateSolution = new Material.Builder(8500, GTBUtil.gtb("potassium_fluorotantalate_solution"))
                .fluid()
                .color(0x6EAE71)
                .build().setFormula("(K2TaF7)20(H2O)9", true);

        PotassiumFluoroniobateSolution = new Material.Builder(8501, GTBUtil.gtb("potassium_fluoroniobate_solution"))
                .fluid()
                .color(0x99CF9C)
                .build().setFormula("(K2NbF7)20(H2O)9", true);
        
        RawPlatinumSolution = new Material.Builder(8502, GTBUtil.gtb("raw_platinum_solution"))
                .fluid()
                .color(0xD6CFAF)
                .build().setFormula("(PtCl2)(H2O)", true);

        BlackPlatinum  = new Material.Builder(8503, GTBUtil.gtb("black_platinum"))
                .dust()
                .color(0x4F4F4F)
                .iconSet(SHINY)
                .build().setFormula("Pt", true);

        HighPurityCadmium  = new Material.Builder(8504, GTBUtil.gtb("high_purity_cadmium"))
                .dust()
                .color(0x2A2A2A)
                .iconSet(SHINY)
                .build().setFormula("Cd*", true);

        PropargylChlorideSolution  = new Material.Builder(8505, GTBUtil.gtb("propargyl_chloride_solution"))
                .fluid()
                .color(0xBBB07E)
                .build().setFormula("(HC2CH2Cl)(HCL)(SO2)", true);

        AluminaCeramic  = new Material.Builder(8506, GTBUtil.gtb("alumina_ceramic"))
                .dust()
                .flags(GENERATE_PLATE)
                .color(0xA9B9C2)
                .build().setFormula("Al2O3", true);

        DryAir = new Material.Builder(8507, GTBUtil.gtb("dry_air"))
                .fluid()
                .color(0xC5CBCF)
                .build().setFormula("N78O21Ar9", true);

        Methylcellulose = new Material.Builder(8508, GTBUtil.gtb("methylcellulose"))
                .fluid()
                .color(0xC5CBCF)
                .build().setFormula("N78O21Ar9", true);






    }

}