package material;


import static material.GTBMaterial.*;

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

public class BiologicalMaterials {

  public static void register() {

        log.infoMC('Registering Biological Materials!');

        CupriavidusNecator = new Material.Builder(12001, gregtechId("cupriavidus_necator"))
                .dust()
                .color(0x6B8D6E)
                .build().setFormula("Bacteria", true);

        BacterialGrowthMedium = new Material.Builder(12002, gregtechId("bacterial_growth_medium"))
                .fluid()
                .color(0x1B5E20)
                .build().setFormula("For Bacteria", true);

        DepletedBacterialGrowthMedium = new Material.Builder(12003,
                gregtechId("depleted_bacterial_growth_medium"))
                .fluid()
                .color(0x376B3B)
                .build().setFormula("For Bacteria", true);

        Blood = new Material.Builder(12004, gregtechId("blood"))
                .fluid()
                .color(0xAA2424)
                .build();

        BloodCells = new Material.Builder(12005, gregtechId("blood_cells"))
                .fluid()
                .color(0xC66868)
                .build();

        BloodPlasma = new Material.Builder(12006, gregtechId("blood_plasma"))
                .plasma()
                .color(0x9D3939)
                .build();

        Catalase = new Material.Builder(12007, gregtechId("catalase"))
                .fluid()
                .color(0xD599AE)
                .build();

        BasicFibroblastGrowthMedium = new Material.Builder(12008,
                gregtechId("basic_fibroglast_growth_medium"))
                .fluid()
                .color(0x8C52A5)
                .build().setFormula("bFGF", true);

        EpidermalGrowthFactor = new Material.Builder(12009, gregtechId("epidermal_growth_factora"))
                .fluid()
                .color(0xA05FBC)
                .build().setFormula("C257H381N73O83S7", true);

        CupriavidusNecatorBacteriaSample = new Material.Builder(12010, gregtechId("cupriavidus_necator_bacteria_sample"))
                .dust()
                .color(0x00695C)
                .build().setFormula("Bacteria", true);

        Cuproquin = new Material.Builder(12011, gregtechId("cuproquin"))
                .fluid()
                .color(0x8AA5A0)
                .build().setFormula("C18H13CuN2O", true);

        Sulfanilamide = new Material.Builder(12012, gregtechId("sulfanilamide"))
                .fluid()
                .color(0x3E2723)
                .build().setFormula("C6H8N2O2S", true);

        AcetylsulfanilylChloride = new Material.Builder(12013, gregtechId("acetylsulfanilyl_chloride"))
                .fluid()
                .color(0x6F3C2D)
                .build().setFormula("C8H8ClNO3S", true);

        ChlorosulfonicAcid = new Material.Builder(12014, gregtechId("chlorosulfonic_acid"))
                .fluid()
                .color(0xAA803D)
                .build().setFormula("HSO3Cl", true);

        AceticAnhydride = new Material.Builder(12015, gregtechId("acetic_anhydride"))
                .fluid()
                .color(0xB8B7B7)
                .build().setFormula("(CH3CO)2O", true);

        Aniline = new Material.Builder(12016, gregtechId("aniline"))
                .fluid()
                .color(0x43A047)
                .build().setFormula("C6H5NH2", true);

        AmmoniumNitrate = new Material.Builder(12017, gregtechId("ammonium_nitrate"))
                .fluid()
                .color(0x7A6BAA)
                .build().setFormula("NH4NO3", true);

        B_27_Supplement = new Material.Builder(12018, gregtechId("b_27_supplement"))
                .fluid()
                .color(0x2C572D)
                .build().setFormula("C142H230N36O44S", true);

        Glutamine = new Material.Builder(12019, gregtechId("glutamine"))
                .dust()
                .color(0xF6E5B9)
                .build().setFormula("C5H10N2O3", true);

        LinoleicAcid = new Material.Builder(12020, gregtechId("linoleic_acid"))
                .fluid()
                .color(0xFFEB3B)
                .build().setFormula("C18H32O2", true);

        Biotin = new Material.Builder(12021, gregtechId("biotin"))
                .fluid()
                .color(0x191919)
                .build().setFormula("C10H16N2O3S", true);

        Ethanolamine = new Material.Builder(12022, gregtechId("ethanolamine"))
                .fluid()
                .color(0x191919)
                .build().setFormula("HOCH2CH2NH2", true);

        VitaminA = new Material.Builder(12023, gregtechId("vitamin_a"))
                .fluid()
                .color(0x43A047)
                .build().setFormula("C20H30O", true);

        BetaIonone = new Material.Builder(12024, gregtechId("beta_ionone"))
                .fluid()
                .color(0x880E4F)
                .build().setFormula("C13H20O", true);

        PropargylChloride = new Material.Builder(12025, gregtechId("PropargylChloride"))
                .fluid()
                .color(0xFBC02D)
                .build().setFormula("HC2CH2Cl", true);

        Citral = new Material.Builder(12026, gregtechId("citral"))
                .fluid()
                .color(0xEFCD37)
                .build().setFormula("C10H16O", true);

        BetaPinene = new Material.Builder(12027, gregtechId("beta_pinene"))
                .dust()
                .color(0x44A048)
                .build().setFormula("C10H16", true);

        Turpentine = new Material.Builder(12028, gregtechId("turpentine"))
                .fluid()
                .color(0x689F38)
                .build().setFormula("C10H16", true);

        PropargylAlcohol = new Material.Builder(12029, gregtechId("propargyl_alcohol"))
                .fluid()
                .color(0xB79134)
                .build().setFormula("CHCCH2OH", true);

        Acetylene = new Material.Builder(12030, gregtechId("acetylene"))
                .fluid()
                .color(0x8BC34A)
                .build().setFormula("C2H2", true);

        CleanAmmoniaSolution = new Material.Builder(12031, gregtechId("clean_ammonia_solution"))
                .fluid()
                .color(0xB7CD9F)
                .build().setFormula("NH3(H2O)", true);

        Leucine = new Material.Builder(12032, gregtechId("leucine"))
                .dust()
                .color(0x4A5E31)
                .build().setFormula("C20H12O3", true);

        Yeast = new Material.Builder(12033, gregtechId("yeast"))
                .dust()
                .color(0xFFEB3B)
                .build().setFormula("???", true);

        BrevibacteriumFlavium = new Material.Builder(12034, gregtechId("brevibacterium_flavium"))
                .dust()
                .color(0x004D40)
                .build().setFormula("Bacteria", true);

        YEEMSolution = new Material.Builder(12035, gregtechId("yeem_solution"))
                .fluid()
                .color(0x6A1B9A)
                .build().setFormula("[(C6H14O6)(?)]r(H2O)", true);

        YeastExtractMannitolMedium = new Material.Builder(12036, gregtechId("yeast_extract_mannitol_medium"))
                .dust()
                .color(0x531E73)
                .build().setFormula("[(C6H14O6)(?)]r", true);

        YeastExtractMannitolAgarSolution = new Material.Builder(12037,
                gregtechId("yeast_extract_mannitol_agar_solution"))
                .fluid()
                .color(0x7D4C9A)
                .build().setFormula("[(C6H14O6)(?)]r", true);

        DissolvedYeastExtractMannitolMixture = new Material.Builder(12038,
                gregtechId("dissolved_yeast_extract_mannitol_mixture"))
                .fluid()
                .color(0x1565C0)
                .build().setFormula("2(H2O([(C6H14O6)(?)]r", true);

        YeastExtract = new Material.Builder(12039, gregtechId("yeast_extract"))
                .fluid()
                .color(0x00BCD4)
                .build().setFormula("Yeast", true);

        Mannitol = new Material.Builder(12040, gregtechId("mannitol"))
                .fluid()
                .color(0x4A148C)
                .build().setFormula("C6H14O6", true);

        YeastMixture = new Material.Builder(12041, gregtechId("yeast_mixture"))
                .fluid()
                .color(0x00796B)
                .build().setFormula("Yeast(C6H14O6)", true);

        WasteWater = new Material.Builder(12042, gregtechId("waste_water"))
                .fluid()
                .color(0x06383E)
                .build().setFormula("(H2O)?", true);

        NutrientRichSolution = new Material.Builder(12043, gregtechId("nutrient_rich_solution"))
                .fluid()
                .color(0x80A954)
                .build().setFormula("?", true);

        MaltExtract = new Material.Builder(12044, gregtechId("malt_extract"))
                .fluid()
                .color(0xA4A5A3)
                .build().setFormula("?", true);

        Peptone = new Material.Builder(12045, gregtechId("peptone"))
                .fluid()
                .color(0x5C6BC0)
                .build().setFormula("?", true);

        Wort = new Material.Builder(12046, gregtechId("wort"))
                .fluid()
                .color(0xA09D83)
                .build().setFormula("?", true);

        HotGristSolution = new Material.Builder(12047, gregtechId("hot_grist_solution"))
                .fluid()
                .color(0xA6A063)
                .build().setFormula("?", true);

        GristPowder = new Material.Builder(12048, gregtechId("grist_powder"))
                .dust()
                .color(0x98904A)
                .build().setFormula("?", true);

        SolidGrain = new Material.Builder(12049, gregtechId("solid_grain"))
                .dust()
                .color(0xCECAAC)
                .build().setFormula("?", true);

        Glucose = new Material.Builder(12050, gregtechId("glucose"))
                .dust()
                .color(0xECEBE4)
                .build().setFormula("C6H12O6", true);

        Nonoxynol_9 = new Material.Builder(12051, gregtechId("nonoxynol_9"))
                .fluid()
                .color(0x336635)
                .build().setFormula("C33H60O10 ", true);

        Nonoxynol_9_Solution = new Material.Builder(12052, gregtechId("nonoxynol_9_solution"))
                .fluid()
                .color(0x2F5A31)
                .build().setFormula("C33H60O10(H2O)", true);

        EthoxylatedNonylphenol = new Material.Builder(12053, gregtechId("ethoxylated_nonylphenol"))
                .fluid()
                .color(0x78AA7A)
                .build().setFormula("C15H24O(SO4)", true);

        Nonylphenol = new Material.Builder(12054, gregtechId("nonylphenol"))
                .fluid()
                .color(0x5F5351)
                .build().setFormula("C15H24O", true);

        EschericiaColi = new Material.Builder(12055, gregtechId("eschericia_coli"))
                .dust()
                .color(0x00695C)
                .build().setFormula("Bacteria", true);

        Iriditus = new Material.Builder(12056, gregtechId("iriditus"))
                .dust()
                .color(0x1976D2)
                .build().setFormula("Bacteria", true);

        Fructose = new Material.Builder(12057, gregtechId("fructose"))
                .dust()
                .color(0xDEE3E6)
                .build().setFormula("C6H12O6", true);

        SheepBlood = new Material.Builder(12058, gregtechId("sheep_blood"))
                .fluid()
                .color(0x561A1A)
                .build();

        SheepBloodPlasma = new Material.Builder(12059, gregtechId("sheep_blood_plasma"))
                .fluid()
                .color(0xBF6969)
                .build();

        SheepBloodCells = new Material.Builder(12060, gregtechId("sheep_blood_cells"))
                .fluid()
                .color(0x572424)
                .build();

        DefibernatedSheepBlood = new Material.Builder(12061, gregtechId("defibernated_sheep_blood"))
                .fluid()
                .color(0xB72A2A)
                .build();

        EdeticAcid = new Material.Builder(12062, gregtechId("edetic_acid"))
                .fluid()
                .color(0xEF9A9A)
                .build().setFormula("C10H16N2O8", true);

        PhenylEthylAlcoholBloodAgar = new Material.Builder(12063, gregtechId("phenyl_ethyl_alcohol_agar"))
                .fluid()
                .color(0x880E4F)
                .build().setFormula("(C8H10O)(?)", true);

        SolidifiedSterileDefibernatedSheepBlood = new Material.Builder(12064,
                gregtechId("solidified_sterile_defibernated_sheep_blood"))
                .dust()
                .color(0xEF9A9A)
                .build().setFormula("?", true);

        DissolvedPhenylEthylAlcoholAgar = new Material.Builder(12065,
                gregtechId("dissolved_phenyl_ethyl_alcohol_agar"))
                .fluid()
                .color(0x974B74)
                .build().setFormula("(H2O)(C8H10O)(?)", true);

        PhenylEthylAlcoholAgarSolution = new Material.Builder(12066,
                gregtechId("phenyl_ethyl_alcohol_agar_solution"))
                .fluid()
                .color(0x913867)
                .build().setFormula("(C2H2)(C8H10O)", true);

        PhenylEthylAlcohol = new Material.Builder(12067, gregtechId("phenyl_ethyl_alcohol"))
                .fluid()
                .color(0x7C1A4E)
                .build().setFormula("C8H10O", true);

        Xerizin = new Material.Builder(12068, gregtechId("xerizin"))
                .fluid()
                .color(0x673AB7)
                .build().setFormula("Bacteria", true);

        SolidMilkResidues = new Material.Builder(12069, gregtechId("solid_milk_residues"))
                .dust()
                .color(0xD0CED2)
                .build().setFormula("?", true);

        HeatedMilkSlurry = new Material.Builder(12070, gregtechId("heated_milk_slurry"))
                .fluid()
                .color(0xE5E4E6)
                .build().setFormula("?", true);

        PeptoneMixture = new Material.Builder(12071, gregtechId("peptone_mixture"))
                .fluid()
                .color(0xFDD835)
                .build().setFormula("?", true);

        AlphaLinolenicAcid = new Material.Builder(12072, gregtechId("alpha_linolenic_acid"))
                .fluid()
                .color(0xCCAE2D)
                .build().setFormula("C18H30O2", true);

        MilkOil = new Material.Builder(12073, gregtechId("milk_oil"))
                .fluid()
                .color(0xBCB9AC)
                .build().setFormula("?", true);

        HomogenizedPancreasMixture = new Material.Builder(12074, gregtechId("homogenized_pancreas_mixture"))
                .fluid()
                .color(0xFBD736)
                .build().setFormula("?", true);

        Trypsin = new Material.Builder(12075, gregtechId("trypsin"))
                .fluid()
                .color(0xCCB965)
                .build().setFormula("?", true);

        BeanSlurry = new Material.Builder(12076, gregtechId("bean_slurry"))
                .fluid()
                .color(0xC1C07D)
                .build().setFormula("?", true);

        Rhizobium = new Material.Builder(12077, gregtechId("rhizobium"))
                .dust()
                .color(0x00796B)
                .build().setFormula("?", true);

        PapaicDigestOfSoybeanMeal = new Material.Builder(12078, gregtechId("papair_digest_of_soybean_meal"))
                .dust()
                .color(0x5F5F1F)
                .build().setFormula("?", true);

        DefattedSoybeanFlour = new Material.Builder(12079, gregtechId("defatted_soybean_flour"))
                .dust()
                .color(0xF2E39D)
                .build().setFormula("?", true);

        SoybeanOil = new Material.Builder(12080, gregtechId("soybean_oil"))
                .fluid()
                .color(0x6F6F25)
                .build().setFormula("?", true);

        CrushedSoybean = new Material.Builder(12081, gregtechId("crushed_soybean"))
                .dust()
                .color(0xD6D6B1)
                .build().setFormula("?", true);

        MethyleneDiphosphoricAcid = new Material.Builder(12082, gregtechId("methylene_diphosphoric_acid"))
                .fluid()
                .color(0xE53935)
                .build().setFormula("CH3P(O)(OH)2", true);

        OrthophosphoricAcid = new Material.Builder(12083, gregtechId("orthophosphoric_acid"))
                .fluid()
                .color(0xBAAC6D)
                .build().setFormula("H3PO4", true);

        OrthophosphoricAcidSolution = new Material.Builder(12084,
                gregtechId("orthophosphoric_acid_solution"))
                .fluid()
                .color(0xA89A60)
                .build().setFormula("(H3PO4)(H2O)", true);

        PhosphoricAnihydride = new Material.Builder(12085, gregtechId("phosphoric_anihydride"))
                .fluid()
                .color(0x736B23)
                .build().setFormula("P4O10", true);

        PolyhydroxylAlkanoate = new Material.Builder(12086, gregtechId("polyhydroxylalkanoate"))
                .fluid()
                .color(0xEF5350)
                .build().setFormula("[-O-CH(CH₃)-CH₂-CO-]ₙ", true);

        YButyrolacetone = new Material.Builder(12087, gregtechId("y_butyralacetone"))
                .fluid()
                .color(0x673AB7)
                .build().setFormula("C4H6O2", true);

        PalmOil = new Material.Builder(12088, gregtechId("palm_oil"))
                .fluid()
                .color(0xFFEB3B)
                .build().setFormula("?", true);

        BetaPineneSolution = new Material.Builder(12089, gregtechId("beta_pinene_solution"))
                .fluid()
                .color(0x388E3C)
                .build().setFormula("C10H16", true);

        PhthalicAnhydride = new Material.Builder(12090, gregtechId("phthalic_anhydride"))
                .fluid()
                .dust()
                .color(0xC1C1C1)
                .build().setFormula("C8H4O3", true);

        MilkResidueSlurry = new Material.Builder(12091, gregtechId("milk_residue_slurry"))
                .fluid()
                .color(0xD0CED2)
                .build().setFormula("?", true);
  }
  
}