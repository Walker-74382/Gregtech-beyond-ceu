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

public class BiologicalMaterials {

  public static void register() {

        log.infoMC('Registering Biological Materials!');

        CupriavidusNecator = new Material.Builder(12001, GTBUtil.gtb("cupriavidus_necator"))
                .dust()
                .color(0x6B8D6E)
                .build().setFormula("Bacteria", true);

        BacterialGrowthMedium = new Material.Builder(12002, GTBUtil.gtb("bacterial_growth_medium"))
                .liquid(new FluidBuilder())
                .color(0x1B5E20)
                .build().setFormula("For Bacteria", true);

        DepletedBacterialGrowthMedium = new Material.Builder(12003,
                GTBUtil.gtb("depleted_bacterial_growth_medium"))
                .liquid(new FluidBuilder())
                .color(0x376B3B)
                .build().setFormula("For Bacteria", true);

        Blood = new Material.Builder(12004, GTBUtil.gtb("blood"))
                .liquid(new FluidBuilder())
                .color(0xAA2424)
                .build();

        BloodCells = new Material.Builder(12005, GTBUtil.gtb("blood_cells"))
                .liquid(new FluidBuilder())
                .color(0xC66868)
                .build();

        BloodPlasma = new Material.Builder(12006, GTBUtil.gtb("blood_plasma"))
                .plasma()
                .color(0x9D3939)
                .build();

        Catalase = new Material.Builder(12007, GTBUtil.gtb("catalase"))
                .liquid(new FluidBuilder())
                .color(0xD599AE)
                .build();

        BasicFibroblastGrowthMedium = new Material.Builder(12008,
                GTBUtil.gtb("basic_fibroglast_growth_medium"))
                .liquid(new FluidBuilder())
                .color(0x8C52A5)
                .build().setFormula("bFGF", true);

        EpidermalGrowthFactor = new Material.Builder(12009, GTBUtil.gtb("epidermal_growth_factora"))
                .liquid(new FluidBuilder())
                .color(0xA05FBC)
                .build().setFormula("C257H381N73O83S7", true);

        CupriavidusNecatorBacteriaSample = new Material.Builder(12010, GTBUtil.gtb("cupriavidus_necator_bacteria_sample"))
                .dust()
                .color(0x00695C)
                .build().setFormula("Bacteria", true);

        Cuproquin = new Material.Builder(12011, GTBUtil.gtb("cuproquin"))
                .liquid(new FluidBuilder())
                .color(0x8AA5A0)
                .build().setFormula("C18H13CuN2O", true);

        Sulfanilamide = new Material.Builder(12012, GTBUtil.gtb("sulfanilamide"))
                .liquid(new FluidBuilder())
                .color(0x3E2723)
                .build().setFormula("C6H8N2O2S", true);

        AcetylsulfanilylChloride = new Material.Builder(12013, GTBUtil.gtb("acetylsulfanilyl_chloride"))
                .liquid(new FluidBuilder())
                .color(0x6F3C2D)
                .build().setFormula("C8H8ClNO3S", true);

        ChlorosulfonicAcid = new Material.Builder(12014, GTBUtil.gtb("chlorosulfonic_acid"))
                .liquid(new FluidBuilder())
                .color(0xAA803D)
                .build().setFormula("HSO3Cl", true);

        AceticAnhydride = new Material.Builder(12015, GTBUtil.gtb("acetic_anhydride"))
                .liquid(new FluidBuilder())
                .color(0xB8B7B7)
                .build().setFormula("(CH3CO)2O", true);

        Aniline = new Material.Builder(12016, GTBUtil.gtb("aniline"))
                .liquid(new FluidBuilder())
                .color(0x43A047)
                .build().setFormula("C6H5NH2", true);

        AmmoniumNitrate = new Material.Builder(12017, GTBUtil.gtb("ammonium_nitrate"))
                .liquid(new FluidBuilder())
                .color(0x7A6BAA)
                .build().setFormula("NH4NO3", true);

        B_27_Supplement = new Material.Builder(12018, GTBUtil.gtb("b_27_supplement"))
                .liquid(new FluidBuilder())
                .color(0x2C572D)
                .build().setFormula("C142H230N36O44S", true);

        Glutamine = new Material.Builder(12019, GTBUtil.gtb("glutamine"))
                .dust()
                .color(0xF6E5B9)
                .build().setFormula("C5H10N2O3", true);

        LinoleicAcid = new Material.Builder(12020, GTBUtil.gtb("linoleic_acid"))
                .liquid(new FluidBuilder())
                .color(0xFFEB3B)
                .build().setFormula("C18H32O2", true);

        Biotin = new Material.Builder(12021, GTBUtil.gtb("biotin"))
                .liquid(new FluidBuilder())
                .color(0x191919)
                .build().setFormula("C10H16N2O3S", true);

        Ethanolamine = new Material.Builder(12022, GTBUtil.gtb("ethanolamine"))
                .liquid(new FluidBuilder())
                .color(0x191919)
                .build().setFormula("HOCH2CH2NH2", true);

        VitaminA = new Material.Builder(12023, GTBUtil.gtb("vitamin_a"))
                .liquid(new FluidBuilder())
                .color(0x43A047)
                .build().setFormula("C20H30O", true);

        BetaIonone = new Material.Builder(12024, GTBUtil.gtb("beta_ionone"))
                .liquid(new FluidBuilder())
                .color(0x880E4F)
                .build().setFormula("C13H20O", true);

        PropargylChloride = new Material.Builder(12025, GTBUtil.gtb("PropargylChloride"))
                .liquid(new FluidBuilder())
                .color(0xFBC02D)
                .build().setFormula("HC2CH2Cl", true);

        Citral = new Material.Builder(12026, GTBUtil.gtb("citral"))
                .liquid(new FluidBuilder())
                .color(0xEFCD37)
                .build().setFormula("C10H16O", true);

        BetaPinene = new Material.Builder(12027, GTBUtil.gtb("beta_pinene"))
                .dust()
                .color(0x44A048)
                .build().setFormula("C10H16", true);

        Turpentine = new Material.Builder(12028, GTBUtil.gtb("turpentine"))
                .liquid(new FluidBuilder())
                .color(0x689F38)
                .build().setFormula("C10H16", true);

        PropargylAlcohol = new Material.Builder(12029, GTBUtil.gtb("propargyl_alcohol"))
                .liquid(new FluidBuilder())
                .color(0xB79134)
                .build().setFormula("CHCCH2OH", true);

        Acetylene = new Material.Builder(12030, GTBUtil.gtb("acetylene"))
                .liquid(new FluidBuilder())
                .color(0x8BC34A)
                .build().setFormula("C2H2", true);

        CleanAmmoniaSolution = new Material.Builder(12031, GTBUtil.gtb("clean_ammonia_solution"))
                .liquid(new FluidBuilder())
                .color(0xB7CD9F)
                .build().setFormula("NH3(H2O)", true);

        Leucine = new Material.Builder(12032, GTBUtil.gtb("leucine"))
                .dust()
                .color(0x4A5E31)
                .build().setFormula("C20H12O3", true);

        Yeast = new Material.Builder(12033, GTBUtil.gtb("yeast"))
                .dust()
                .color(0xFFEB3B)
                .build().setFormula("???", true);

        BrevibacteriumFlavium = new Material.Builder(12034, GTBUtil.gtb("brevibacterium_flavium"))
                .dust()
                .color(0x004D40)
                .build().setFormula("Bacteria", true);

        YEEMSolution = new Material.Builder(12035, GTBUtil.gtb("yeem_solution"))
                .liquid(new FluidBuilder())
                .color(0x6A1B9A)
                .build().setFormula("[(C6H14O6)(?)]r(H2O)", true);

        YeastExtractMannitolMedium = new Material.Builder(12036, GTBUtil.gtb("yeast_extract_mannitol_medium"))
                .dust()
                .color(0x531E73)
                .build().setFormula("[(C6H14O6)(?)]r", true);

        YeastExtractMannitolAgarSolution = new Material.Builder(12037,
                GTBUtil.gtb("yeast_extract_mannitol_agar_solution"))
                .liquid(new FluidBuilder())
                .color(0x7D4C9A)
                .build().setFormula("[(C6H14O6)(?)]r", true);

        DissolvedYeastExtractMannitolMixture = new Material.Builder(12038,
                GTBUtil.gtb("dissolved_yeast_extract_mannitol_mixture"))
                .liquid(new FluidBuilder())
                .color(0x1565C0)
                .build().setFormula("2(H2O([(C6H14O6)(?)]r", true);

        YeastExtract = new Material.Builder(12039, GTBUtil.gtb("yeast_extract"))
                .liquid(new FluidBuilder())
                .color(0x00BCD4)
                .build().setFormula("Yeast", true);

        Mannitol = new Material.Builder(12040, GTBUtil.gtb("mannitol"))
                .liquid(new FluidBuilder())
                .color(0x4A148C)
                .build().setFormula("C6H14O6", true);

        YeastMixture = new Material.Builder(12041, GTBUtil.gtb("yeast_mixture"))
                .liquid(new FluidBuilder())
                .color(0x00796B)
                .build().setFormula("Yeast(C6H14O6)", true);

        WasteWater = new Material.Builder(12042, GTBUtil.gtb("waste_water"))
                .liquid(new FluidBuilder())
                .color(0x06383E)
                .build().setFormula("(H2O)?", true);

        NutrientRichSolution = new Material.Builder(12043, GTBUtil.gtb("nutrient_rich_solution"))
                .liquid(new FluidBuilder())
                .color(0x80A954)
                .build().setFormula("?", true);

        MaltExtract = new Material.Builder(12044, GTBUtil.gtb("malt_extract"))
                .liquid(new FluidBuilder())
                .color(0xA4A5A3)
                .build().setFormula("?", true);

        Peptone = new Material.Builder(12045, GTBUtil.gtb("peptone"))
                .liquid(new FluidBuilder())
                .color(0x5C6BC0)
                .build().setFormula("?", true);

        Wort = new Material.Builder(12046, GTBUtil.gtb("wort"))
                .liquid(new FluidBuilder())
                .color(0xA09D83)
                .build().setFormula("?", true);

        HotGristSolution = new Material.Builder(12047, GTBUtil.gtb("hot_grist_solution"))
                .liquid(new FluidBuilder())
                .color(0xA6A063)
                .build().setFormula("?", true);

        GristPowder = new Material.Builder(12048, GTBUtil.gtb("grist_powder"))
                .dust()
                .color(0x98904A)
                .build().setFormula("?", true);

        SolidGrain = new Material.Builder(12049, GTBUtil.gtb("solid_grain"))
                .dust()
                .color(0xCECAAC)
                .build().setFormula("?", true);

        Glucose = new Material.Builder(12050, GTBUtil.gtb("glucose"))
                .dust()
                .color(0xECEBE4)
                .build().setFormula("C6H12O6", true);

        Nonoxynol_9 = new Material.Builder(12051, GTBUtil.gtb("nonoxynol_9"))
                .liquid(new FluidBuilder())
                .color(0x336635)
                .build().setFormula("C33H60O10 ", true);

        Nonoxynol_9_Solution = new Material.Builder(12052, GTBUtil.gtb("nonoxynol_9_solution"))
                .liquid(new FluidBuilder())
                .color(0x2F5A31)
                .build().setFormula("C33H60O10(H2O)", true);

        EthoxylatedNonylphenol = new Material.Builder(12053, GTBUtil.gtb("ethoxylated_nonylphenol"))
                .liquid(new FluidBuilder())
                .color(0x78AA7A)
                .build().setFormula("C15H24O(SO4)", true);

        Nonylphenol = new Material.Builder(12054, GTBUtil.gtb("nonylphenol"))
                .liquid(new FluidBuilder())
                .color(0x5F5351)
                .build().setFormula("C15H24O", true);

        EschericiaColi = new Material.Builder(12055, GTBUtil.gtb("eschericia_coli"))
                .dust()
                .color(0x00695C)
                .build().setFormula("Bacteria", true);

        Iriditus = new Material.Builder(12056, GTBUtil.gtb("iriditus"))
                .dust()
                .color(0x1976D2)
                .build().setFormula("Bacteria", true);

        Fructose = new Material.Builder(12057, GTBUtil.gtb("fructose"))
                .dust()
                .color(0xDEE3E6)
                .build().setFormula("C6H12O6", true);

        SheepBlood = new Material.Builder(12058, GTBUtil.gtb("sheep_blood"))
                .liquid(new FluidBuilder())
                .color(0x561A1A)
                .build();

        SheepBloodPlasma = new Material.Builder(12059, GTBUtil.gtb("sheep_blood_plasma"))
                .liquid(new FluidBuilder())
                .color(0xBF6969)
                .build();

        SheepBloodCells = new Material.Builder(12060, GTBUtil.gtb("sheep_blood_cells"))
                .liquid(new FluidBuilder())
                .color(0x572424)
                .build();

        DefibernatedSheepBlood = new Material.Builder(12061, GTBUtil.gtb("defibernated_sheep_blood"))
                .liquid(new FluidBuilder())
                .color(0xB72A2A)
                .build();

        EdeticAcid = new Material.Builder(12062, GTBUtil.gtb("edetic_acid"))
                .liquid(new FluidBuilder())
                .color(0xEF9A9A)
                .build().setFormula("C10H16N2O8", true);

        PhenylEthylAlcoholBloodAgar = new Material.Builder(12063, GTBUtil.gtb("phenyl_ethyl_alcohol_agar"))
                .liquid(new FluidBuilder())
                .color(0x880E4F)
                .build().setFormula("(C8H10O)(?)", true);

        SolidifiedSterileDefibernatedSheepBlood = new Material.Builder(12064,
                GTBUtil.gtb("solidified_sterile_defibernated_sheep_blood"))
                .dust()
                .color(0xEF9A9A)
                .build().setFormula("?", true);

        DissolvedPhenylEthylAlcoholAgar = new Material.Builder(12065,
                GTBUtil.gtb("dissolved_phenyl_ethyl_alcohol_agar"))
                .liquid(new FluidBuilder())
                .color(0x974B74)
                .build().setFormula("(H2O)(C8H10O)(?)", true);

        PhenylEthylAlcoholAgarSolution = new Material.Builder(12066,
                GTBUtil.gtb("phenyl_ethyl_alcohol_agar_solution"))
                .liquid(new FluidBuilder())
                .color(0x913867)
                .build().setFormula("(C2H2)(C8H10O)", true);

        PhenylEthylAlcohol = new Material.Builder(12067, GTBUtil.gtb("phenyl_ethyl_alcohol"))
                .liquid(new FluidBuilder())
                .color(0x7C1A4E)
                .build().setFormula("C8H10O", true);

        Xerizin = new Material.Builder(12068, GTBUtil.gtb("xerizin"))
                .liquid(new FluidBuilder())
                .color(0x673AB7)
                .build().setFormula("Bacteria", true);

        SolidMilkResidues = new Material.Builder(12069, GTBUtil.gtb("solid_milk_residues"))
                .dust()
                .color(0xD0CED2)
                .build().setFormula("?", true);

        HeatedMilkSlurry = new Material.Builder(12070, GTBUtil.gtb("heated_milk_slurry"))
                .liquid(new FluidBuilder())
                .color(0xE5E4E6)
                .build().setFormula("?", true);

        PeptoneMixture = new Material.Builder(12071, GTBUtil.gtb("peptone_mixture"))
                .liquid(new FluidBuilder())
                .color(0xFDD835)
                .build().setFormula("?", true);

        AlphaLinolenicAcid = new Material.Builder(12072, GTBUtil.gtb("alpha_linolenic_acid"))
                .liquid(new FluidBuilder())
                .color(0xCCAE2D)
                .build().setFormula("C18H30O2", true);

        MilkOil = new Material.Builder(12073, GTBUtil.gtb("milk_oil"))
                .liquid(new FluidBuilder())
                .color(0xBCB9AC)
                .build().setFormula("?", true);

        HomogenizedPancreasMixture = new Material.Builder(12074, GTBUtil.gtb("homogenized_pancreas_mixture"))
                .liquid(new FluidBuilder())
                .color(0xFBD736)
                .build().setFormula("?", true);

        Trypsin = new Material.Builder(12075, GTBUtil.gtb("trypsin"))
                .liquid(new FluidBuilder())
                .color(0xCCB965)
                .build().setFormula("?", true);

        BeanSlurry = new Material.Builder(12076, GTBUtil.gtb("bean_slurry"))
                .liquid(new FluidBuilder())
                .color(0xC1C07D)
                .build().setFormula("?", true);

        Rhizobium = new Material.Builder(12077, GTBUtil.gtb("rhizobium"))
                .dust()
                .color(0x00796B)
                .build().setFormula("?", true);

        PapaicDigestOfSoybeanMeal = new Material.Builder(12078, GTBUtil.gtb("papair_digest_of_soybean_meal"))
                .dust()
                .color(0x5F5F1F)
                .build().setFormula("?", true);

        DefattedSoybeanFlour = new Material.Builder(12079, GTBUtil.gtb("defatted_soybean_flour"))
                .dust()
                .color(0xF2E39D)
                .build().setFormula("?", true);

        SoybeanOil = new Material.Builder(12080, GTBUtil.gtb("soybean_oil"))
                .liquid(new FluidBuilder())
                .color(0x6F6F25)
                .build().setFormula("?", true);

        CrushedSoybean = new Material.Builder(12081, GTBUtil.gtb("crushed_soybean"))
                .dust()
                .color(0xD6D6B1)
                .build().setFormula("?", true);

        MethyleneDiphosphoricAcid = new Material.Builder(12082, GTBUtil.gtb("methylene_diphosphoric_acid"))
                .liquid(new FluidBuilder())
                .color(0xE53935)
                .build().setFormula("CH3P(O)(OH)2", true);

        OrthophosphoricAcid = new Material.Builder(12083, GTBUtil.gtb("orthophosphoric_acid"))
                .liquid(new FluidBuilder())
                .color(0xBAAC6D)
                .build().setFormula("H3PO4", true);

        OrthophosphoricAcidSolution = new Material.Builder(12084,
                GTBUtil.gtb("orthophosphoric_acid_solution"))
                .liquid(new FluidBuilder())
                .color(0xA89A60)
                .build().setFormula("(H3PO4)(H2O)", true);

        PhosphoricAnihydride = new Material.Builder(12085, GTBUtil.gtb("phosphoric_anihydride"))
                .liquid(new FluidBuilder())
                .color(0x736B23)
                .build().setFormula("P4O10", true);

        PolyhydroxylAlkanoate = new Material.Builder(12086, GTBUtil.gtb("polyhydroxylalkanoate"))
                .liquid(new FluidBuilder())
                .color(0xEF5350)
                .build().setFormula("[-O-CH(CH₃)-CH₂-CO-]ₙ", true);

        YButyrolacetone = new Material.Builder(12087, GTBUtil.gtb("y_butyralacetone"))
                .liquid(new FluidBuilder())
                .color(0x673AB7)
                .build().setFormula("C4H6O2", true);

        PalmOil = new Material.Builder(12088, GTBUtil.gtb("palm_oil"))
                .liquid(new FluidBuilder())
                .color(0xFFEB3B)
                .build().setFormula("?", true);

        BetaPineneSolution = new Material.Builder(12089, GTBUtil.gtb("beta_pinene_solution"))
                .liquid(new FluidBuilder())
                .color(0x388E3C)
                .build().setFormula("C10H16", true);

        PhthalicAnhydride = new Material.Builder(12090, GTBUtil.gtb("phthalic_anhydride"))
                .liquid(new FluidBuilder())
                .dust()
                .color(0xC1C1C1)
                .build().setFormula("C8H4O3", true);

        MilkResidueSlurry = new Material.Builder(12091, GTBUtil.gtb("milk_residue_slurry"))
                .liquid(new FluidBuilder())
                .color(0xD0CED2)
                .build().setFormula("?", true);

        Shewanella = new Material.Builder(12092(), GTBUtil.gtb("shewanella"))
                .dust()
                .color(0x568358)
                .build().setFormula("Bacteria", true);

        GeneTherapyFluid = new Material.Builder(12093(), GTBUtil.gtb("gene_therapy_fluid"))
                .liquid(new FluidBuilder())
                .color(0x234B25)
                .build().setFormula("?", true);

        GenePlasmids = new Material.Builder(12094(), GTBUtil.gtb("gene_plasmids"))
                .liquid(new FluidBuilder())
                .color(0x576959)
                .build().setFormula("?", true);

        MilkResidueSlurry = new Material.Builder(12095(), GTBUtil.gtb("milk_residues_slurry"))
                .liquid(new FluidBuilder())
                .color(0xDBDBDB).build();

        BifidobacteriumBrave = new Material.Builder(12096(), GTBUtil.gtb("bifidobacterium_brave"))
                .dust()
                .color(0x2B776E)
                .build().setFormula("Bacteria", true);

        Chitosan = new Material.Builder(12097(), GTBUtil.gtb("chitosan"))
                .liquid(new FluidBuilder())
                .color(0xFFEB3B)
                .build();

        MushroomSolution = new Material.Builder(12098(), GTBUtil.gtb("mushroom_solution"))
                .liquid(new FluidBuilder())
                .color(0x614239)
                .build();

        Chitin = new Material.Builder(12099(), GTBUtil.gtb("chitin"))
                .liquid(new FluidBuilder())
                .color(0xE3C338)
                .build();

        RapidlyReplicatingAnimalCells = new Material.Builder(12100(), GTBUtil.gtb("rapidly_replicating_animal_cells"))
                .liquid(new FluidBuilder())
                .color(0x9F87A8)
                .build().setFormula("?", true);

        MycGene = new Material.Builder(12101(), GTBUtil.gtb("myc_gene"))
                .liquid(new FluidBuilder())
                .color(0x606F61)
                .build();

        Oct4Gene = new Material.Builder(12102(), GTBUtil.gtb("oct_4_gene"))
                .liquid(new FluidBuilder())
                .color(0x485649)
                .build();

        Sox2Gene = new Material.Builder(12103(), GTBUtil.gtb("sox_2_gene"))
                .liquid(new FluidBuilder())
                .color(0x3F5140)
                .build();

        Kfl4Gene = new Material.Builder(12104(), GTBUtil.gtb("kfl_4_gene"))
                .liquid(new FluidBuilder())
                .color(0x555F55)
                .build();

        RottenSolution = new Material.Builder(12105(), GTBUtil.gtb("rotten_solution"))
                .liquid(new FluidBuilder())
                .color(0x663020)
                .build();

        HomogenizedRottenMixture = new Material.Builder(12106(), GTBUtil.gtb("homogenized_rotten_mixture"))
                .liquid(new FluidBuilder())
                .color(0x842B10)
                .build();

        Cas9 = new Material.Builder(12107(), GTBUtil.gtb("cas_9"))
                .liquid(new FluidBuilder())
                .color(0x2B3E1E)
                .build();

        AnimalCells = new Material.Builder(12108(), GTBUtil.gtb("animal_cells"))
                .liquid(new FluidBuilder())
                .color(0xC07A7A)
                .build().setFormula("?", true);
    }

}