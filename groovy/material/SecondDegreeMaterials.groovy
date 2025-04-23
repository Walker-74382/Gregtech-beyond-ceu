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

        PolyetheretherketoneWaste.setFormula("2(HF)(CH3OH)", true)

        Polyetheretherketone = new Material.Builder(10010, GTBUtil.gtb("polyetheretherketone"))
                .liquid(new FluidBuilder())
                .dust()
                .flags(GENERATE_PLATE, GENERATE_FRAME, GENERATE_ROD)
                .color(0x373737)
                .build();

        Polyetheretherketone.setFormula("[(C19H12O3)]n", true)

        PurifiedPeekMixture = new Material.Builder(10011, GTBUtil.gtb("purified_peek_mixture"))
                .liquid(new FluidBuilder())
                .color(0x5E5E5E)
                .build();
        PurifiedPeekMixture.setFormula("[(C6H6O2)(C13H8OF2)]n", true)

        CrackingCatalystPreparation = new Material.Builder(10012, GTBUtil.gtb("cracking_catalyst_preparation"))
                .dust()
                .color(0x5E5E5E)
                .build();
        CrackingCatalystPreparation.setFormula("(SiO2)(Na2LiAl2Si2(H2O)6)(AlO2)", true)

        SilicaGelBase = new Material.Builder(10013, GTBUtil.gtb("silica_gel_base"))
                .dust()
                .color(0x5E5E5E)
                .build();
        SilicaGelBase.setFormula("SiO2(HCl)(NaOH)(H2O)", true)

        Dimethylformamide = new Material.Builder(10014, GTBUtil.gtb("dimethylformamide")) // TODO DMF Tooltip
                .fluid()
                .color(0x42BDFF)
                
                .build()
                .setFormula("(CH3)2NC(O)H", true);

        Oxydianiline = new Material.Builder(10015, GTBUtil.gtb("oxydianiline"))
                .dust()
                .color(0xF0E130)
                .build()
                .setFormula("O(C6H4NH2)2", true);

        KaptonK = new Material.Builder(10016, GTBUtil.gtb("kapton_k"))
                .ingot().fluid()
                .color(0xFFCE52)
                .flags(GENERATE_PLATE, GENERATE_FOIL)
                .build()
                .setFormula("(C7H2N2O4)(O(C6H4)2)", true);

        BiphenylTetracarboxylicAcidDianhydride = new Material.Builder(10017, GTBUtil.gtb("biphenyl_tetracarboxylic_acid_dianhydride"))
                        .dust()
                        .color(0xFF7F50)
                        .build()
                        .setFormula("(C8H3O3)2", true);

        KaptonE = new Material.Builder(10018, GTBUtil.gtb("kapton_e"))
                .ingot()
                .fluid()
                .color(0xFFDF8C)
                .flags(GENERATE_PLATE, GENERATE_FOIL)
                .build()
                .setFormula("[O(C6H4NH2)2]n", true);

        DilutedAcetone = new Material.Builder(10020, GTBUtil.gtb("diluted_acetone"))
                .fluid()
                .color(0xBAD5E1).build()
                .setFormula("(C3H6O)(H2O)", true);


        Kevlar = new Material.Builder(10021, GTBUtil.gtb("kevlar"))
                .ingot().fluid()
                .color(0xF0F078)
                .flags(GENERATE_PLATE, GENERATE_FOIL)
                .build()
                .setFormula("(C6H4)2(CO)2(NH)2", true);

        KevlarConcentrate = new Material.Builder(10022, GTBUtil.gtb("kevlar_concentrate"))
                .dust()
                .fluid()
                .color(0xcfc532)
                .iconSet(SHINY)
                .build()
                .setFormula("(C6H4)2(CO)2(NH)2", true);

        PurifiedKevlarConcentrate = new Material.Builder(10023, GTBUtil.gtb("purified_kevlar_concentrate"))
                .dust()
                .fluid()
                .color(0xcfc532)
                .iconSet(SHINY)
                .build()
                .setFormula("((C6H4)2(CO)2(NH)2)+", true);

        KevlarBlend = new Material.Builder(10024, GTBUtil.gtb("kevlar_blend"))
                .dust()
                .fluid()
                .color(0xcfc532)
                .iconSet(SHINY)
                .build()
                .setFormula("(C6H4)2(CO)2(NH)2", true);

        Durene = new Material.Builder(10025, GTBUtil.gtb("durene"))
                .dust()
                .color(0x336040)
                .iconSet(FINE)
                .build()
                .setFormula("C6H2(CH3)4", true);

        PyromelliticDianhydride = new Material.Builder(10026, GTBUtil.gtb("pyromellitic_dianhydride")) // TODO
                .dust()
                .color(0xF0EAD6)
                .iconSet(ROUGH)
                .build()
                .setFormula("C6H2(C2O3)2", true);

        Bistrichloromethylbenzene = new Material.Builder(10027, GTBUtil.gtb("bistrichloromethylbenzene"))
                .fluid()
                .color(0xCF8498)
                .build()
                .setFormula("C6H4(CCl3)2", true);

        TerephthalicAcid = new Material.Builder(10028, GTBUtil.gtb("terephthalic_acid"))
                .dust()
                .color(0x5ACCDA)
                .iconSet(ROUGH)
                .build()
                .setFormula("C6H4(CO2H)2", true);

        TerephthaloylChloride = new Material.Builder(10029, GTBUtil.gtb("terephthaloyl_chloride"))
                .dust()
                .color(0xFAC4DA)
                .iconSet(SHINY)
                .build()
                .setFormula("C6H4(COCl)2", true);

        Butanediol = new Material.Builder(10030, GTBUtil.gtb("butanediol"))
                .fluid()
                .color(0xAAC4DA)
                
                .build()
                .setFormula("C4H8(OH)2", true);

        FusedColumbite = new Material.Builder(10031, GTBUtil.gtb("fused_columbite"))
                .dust()
                .color(0xB3A460)
                .build().setFormula("(Fe2O3)(NaO)Nb2O5", true);

        ColumbiteMinorOxideResidue = new Material.Builder(10032, GTBUtil.gtb("columbite_minor_oxide_residue"))
                .dust()
                .color(0x8B7B33)
                .build().setFormula("(BaO)(SnO2)(WO3)(Al2O3)", true);

        LeachedColumbite = new Material.Builder(10033, GTBUtil.gtb("leached_columbite"))
                .dust()
                .color(0x9E925E)
                .build().setFormula("(Nb2O5)9Ta2O5?", true);

        TantaliteMinorOxideResidue = new Material.Builder(10034, GTBUtil.gtb("tantalite_minor_oxide_residue"))
                .dust()
                .iconSet(ROUGH)
                .color(0xFDD835)
                .build().setFormula("(BaO)(ZrO2)(TiO2)(SiO2)", true);

        FusedTantalite = new Material.Builder(10035, GTBUtil.gtb("fused_tantalite"))
                .dust()
                .iconSet(ROUGH)
                .color(0x57382F).build().setFormula("(Fe2O3)(NaO)Ta2O5", true);

        LeachedTantalite = new Material.Builder(10036, GTBUtil.gtb("leached_tantalite"))
                .dust()
                .color(0x5A200E).build().setFormula("(Ta2O5)9Nb2O5?", true);

        AcidicLeachedPyrochlore = new Material.Builder(10037, GTBUtil.gtb("acidic_leached_pyrochlore"))
                .dust()
                .color(0x8F4630).build().setFormula("(H2SO4)Ca12Sr6Ba6?ThUNb26O78F26", true);

        LeachedPyrochlore = new Material.Builder(10038, GTBUtil.gtb("leached_pyrochlore"))
                .dust()
                .color(0x8F4630).build().setFormula("(Nb2O5)9Ta2O5?", true);


        TributylPhosphate = new Material.Builder(10039, GTBUtil.gtb("tributyl_phosphate"))
                .fluid()
                .color(0x8E422B).build().setFormula("(C4H9)3PO4", true);

        NiobiumTantalumOxide = new Material.Builder(10040, GTBUtil.gtb("niobium_tantalum_dust"))
                .dust()
                .color(0xC66262).build().setFormula("(Nb2O5)(Ta2O5)", true);
        
        NbTaFluorideMix = new Material.Builder(10041, GTBUtil.gtb("nb_ta_fluoride_mix"))
                .fluid()
                .color(0x786158).build().setFormula("(H2NbOF5)(H2TaF7)", true);

                DilutedCeriumFiltrate = new Material.Builder(10042, GTBUtil.gtb("diluted_cerium_filtrate"))
                .fluid()
                .color(0x406742).build().setFormula("Ce(H2O)?", true);
        DilutedAquaRegia = new Material.Builder(10043, GTBUtil.gtb("diluted_aqua_regia"))
                .fluid()
                .color(0xB27743).build().setFormula("(HNO3)(HCl)2", true);

        DilutedCeriumSolution = new Material.Builder(10044, GTBUtil.gtb("diluted_cerium_solution"))
                .fluid()
                .color(0x677753).build().setFormula("Ce?(H2O)2", true);

        AluminiumHydroxide = new Material.Builder(10045, GTBUtil.gtb("aluminium_hydroxide"))
                .dust()
                .color(0x2E325B).build().setFormula("Al(HO2)", true);

        WetHafniumZirconiumBlend = new Material.Builder(10046, GTBUtil.gtb("wet_hafnium_zirconium_blend"))
                .dust()
                .color(0x645C5B).build().setFormula("(HfO2)(ZrO2)(H2O)?", true);

        HafniumZirconiumSlag = new Material.Builder(10047, GTBUtil.gtb("hafnium_zirconium_blend"))
                .dust()
                .color(0x863F2A).build().setFormula("(HfO2)(ZrO2)?", true);

        RoastedHafniumZirconiumSlag = new Material.Builder(10048, GTBUtil.gtb("roasted_hafnium_zirconium_slag"))
                        .dust()
                        .color(0x5D3017).build().setFormula("(HfO2)(ZrO2)", true);

        Rhodium_II_Acetate = new Material.Builder(10049, GTBUtil.gtb("rhodium_ii_acetate"))
                .dust()
                .color(0xAB9E7F)
                .build().setFormula("Rh2(OOCCH3)4", true);

        HydrofluoricMethane = new Material.Builder(10050, GTBUtil.gtb("hydrofluoric_methane"))
                .fluid()
                .color(0xB26F8C)
                .build().setFormula("HF(CH4)", true);

        Rhodium_III_Chloride = new Material.Builder(10051, GTBUtil.gtb("rhodium_iii_chloride"))
                .dust()
                .color(0xD8AD41)
                .build().setFormula("Rh3(Cl2)", true);

        Dimethylsiloxane = new Material.Builder(10052, GTBUtil.gtb("dimethylsiloxane"))
                .fluid()
                .color(0xB1ABAD)
                .build().setFormula("Si(CH3)2O", true);

        UrethanePrePolymer = new Material.Builder(10053, GTBUtil.gtb("urethane_pre_polymer"))
                .fluid()
                .color(0xB0C5C8)
                .build().setFormula("Si(CH3)2O", true);

        TitaniumNitrate = new Material.Builder(10054, GTBUtil.gtb("titanium_nitrate"))
                .dust()
                .color(0x7E24A3).build().setFormula("Ti(NO3)4", true);

        LithiumCarbonateSolution = new Material.Builder(10055, GTBUtil.gtb("lithium_carbonate_solution"))
                .fluid()
                .color(0x2196F3).build().setFormula("Li2CO3(H2O)", true);

        LithiumPeroxideSolution = new Material.Builder(10056, GTBUtil.gtb("lithium_peroxide_solution"))
                .fluid()
                .color(0x81D4FA).build().setFormula("(H2O)Li2O2", true);

        OrthoXyleneZeoliteMixture = new Material.Builder(10057, GTBUtil.gtb("ortho_xylene_zeolite_mixture"))
                .fluid()
                .color(0x636363).build().setFormula("(NaC4Si27Al9(H2O)28O72C6H4(CH3)2", true);

        ChlorodiisopropylPhosphine = new Material.Builder(10058, GTBUtil.gtb("chlorodiisopropyl_phosphine"))
                .fluid()
                .color(0x26C6DA).build().setFormula("[(CH3)2CH]2PCl", true);

        CalcinatedSiliconDioxide = new Material.Builder(10059, GTBUtil.gtb("calcinated_silicon_dioxide"))
                .dust()
                .color(0xCEABAB).build().setFormula("(SiO2)?", true);

        CalcinatedResidues = new Material.Builder(10060, GTBUtil.gtb("calcinated_residues"))
                .dust()
                .fluid()
                .color(0x7A3926).build().setFormula("(SiO2)??", true);

        MuddyWater = new Material.Builder(10061, GTBUtil.gtb("muddy_water"))
                .fluid()
                .color(0x6D4C41).build().setFormula("(H2O)?", true);

        DilutedCaesiumSolution = new Material.Builder(10062, GTBUtil.gtb("diluted_caesium_solution"))
                .fluid()
                
                .color(0x302C2B)
                .build().setFormula("Cs(H2O)", true);

        DilutedRubidiumSolution = new Material.Builder(10063, GTBUtil.gtb("diluted_rubidium_solution"))
                .fluid()
                
                .color(0xB71C1C)
                .build().setFormula("Rb(H2O)", true);

        MagnesiumChlorideSolution = new Material.Builder(10064, GTBUtil.gtb("magnesium_chloride_solution"))
                .fluid()
                
                .color(0xBA68C8)
                .build().setFormula("(MgCl)(H2O)", true);

        StyreneButadieneSolution = new Material.Builder(10065, GTBUtil.gtb("styrene_butadiene_solution"))
                .fluid()
                .color(0xCD846D)
                .build().setFormula("(C8H8)(C4H6)(C2H6O)", true);

        TriethylAluminium = new Material.Builder(10066, GTBUtil.gtb("triethylaluminium"))
                        .fluid()
                        .color(0x4780B9)
                        .build().setFormula("Al2(C2H5)6", true);

        TrimethylAluminium = new Material.Builder(10067, GTBUtil.gtb("trimethylaluminium"))
                        .fluid()
                        .color(0x0097A7)
                        .build().setFormula("Al(CH3)3", true);

        TriarylPhosphineSolution = new Material.Builder(10068, GTBUtil.gtb("triaryl_phosphine_solution"))
                .fluid()
                .color(0xEF9A9A)
                .build().setFormula("(H5C6)3P(H2O)?", true);

        HeavyAlkaliChlorideSolution = new Material.Builder(10069, GTBUtil.gtb("heavy_alkali_chloride_solution"))
                        .fluid()
                        .color(0x8F5353)
                        .build()
                        .setFormula("RbCl(CsCl)2Cl3(H2O)2", true);

        TriarylPhosphine = new Material.Builder(10070, GTBUtil.gtb("triaryl_phosphine"))
                .fluid()
                .color(0xEF9A9A)
                .build().setFormula("(H5C6)3P", true);

        DiethylEther = new Material.Builder(10071, GTBUtil.gtb("diethyl_ether"))
                .fluid()
                .color(0xEF9A9A)
                .build().setFormula("(C2H5)2O", true);

        ArylmagnesiumHalides = new Material.Builder(10072, GTBUtil.gtb("arylmagnesium_halides"))
                .fluid()
                .color(0xEF9A9A)
                .build().setFormula("(C2H5)2O", true);

        KaminskyCatalyst = new Material.Builder(10073, GTBUtil.gtb("kaminsky_catalyst"))
                .dust()
                .color(0x675952)
                .build().setFormula("(Zr(C5H5)2Cl2(AlCH3O)", true);

        PhilipsCatalyst = new Material.Builder(10074, GTBUtil.gtb("philips_catalyst"))
                .dust()
                .color(0x6C73AD)
                .build().setFormula("(SiO2)(CrO3)", true);

        ZieglerNattaCatalyst = new Material.Builder(10075, GTBUtil.gtb("ziegler_natta_catalyst"))
                .dust()
                .color(0x7A5D9F)
                .build().setFormula("Al2(C2H5)6)(TiCl4)", true);

        NitrogenizedCaprolactam = new Material.Builder(10076, GTBUtil.gtb("nitrogenized_caprolactam"))
                .dust()
                .color(0x71777D)
                .build().setFormula("(CH2)5C(O)NH", true);

        ChromaticGlass = new Material.Builder(10077, GTBUtil.gtb("chromatic_glass"))
                .gem()
                .dust()
                .color(0xBEA0D0)
                .build().setFormula("(SiO2)*", true);

        PhosphorusSolution = new Material.Builder(10078, GTBUtil.gtb("phosphorus_solution"))
                .fluid()
                .color(0xFDD835)
                .build().setFormula("P(H2O)", true);

        Photopolymer = new Material.Builder(10079, GTBUtil.gtb("photopolymer"))
                .fluid()
                .dust()
                .flags(GENERATE_PLATE)
                .color(0xAFC896)
                .build().setFormula("(P(H2O))n", true);

        BioPlastic = new Material.Builder(10080, GTBUtil.gtb("bio_plastic"))
                .fluid()
                .dust()
                .flags(GENERATE_PLATE)
                .color(0xAFC896)
                .build().setFormula("P(H2O)", true);

        DampBromine = new Material.Builder(10081, GTBUtil.gtb("damp_bromine"))
                .fluid()
                .color(0xAFC896)
                .build().setFormula("Br(H2O)", true);

        Triphenylphosphine = new Material.Builder(10082, GTBUtil.gtb("triphenylphosphine"))
                .fluid()
                .dust()
                .color(0x333537)
                .build().setFormula("(C6H5)3P", true);

        SodiumHydroxideSolution = new Material.Builder(10083, GTBUtil.gtb("sodium_hydroxide_solution"))
                .fluid()
                .color(0x9DD6D0)
                .build().setFormula("(H2O)NaOH", true);

        PhotopolymerSolution = new Material.Builder(10084, GTBUtil.gtb("photopolymer_solution"))
                .fluid()
                .color(0x4DB6AC)
                .build().setFormula("C149H97N10O2(TiBF20)", true);

        UsedPhotopolymerSolution = new Material.Builder(10085, GTBUtil.gtb("used_photopolymer_solution"))
                .fluid()
                .color(0xCE93D8)
                .build().setFormula("C149H97N10O2(TiBF20)?", true);

        GraphiteOxide = new Material.Builder(10086, GTBUtil.gtb("graphite_oxide"))
                .dust()
                .color(0x707272)
                .build().setFormula("C(O2)", true);

        GrapheneOxide = new Material.Builder(10087, GTBUtil.gtb("graphene_oxide"))
                .dust()
                .color(0x5C5D5D)
                .build().setFormula("C(O2)", true);

        GrapheneOxidationResidues = new Material.Builder(10088, GTBUtil.gtb("graphene_oxidation_residues"))
                .dust()
                .color(0x827717)
                .build().setFormula("C(O2)", true);

        VeryHotAquaRegia = new Material.Builder(10089, GTBUtil.gtb("very_hot_aqua_regia"))
                .fluid()
                .color(0xF9A825)
                .build().setFormula("(HNO3)(HCL)2", true);

        GrapheneOxidationSolution = new Material.Builder(10090, GTBUtil.gtb("graphene_oxidation_solution"))
                .fluid()
                .color(0xA29A56)
                .build().setFormula("C(O2)", true);

        CalciumHydroxide = new Material.Builder(10091, GTBUtil.gtb("calcium_hydroxide"))
                .dust()
                .color(0x1A237E)
                .build().setFormula("Ca(OH)2", true);

        LithiumHydroxideSolution = new Material.Builder(10092, GTBUtil.gtb("lithium_hydroxide_solution"))
                .dust()
                .fluid()
                .color(0x0277BD)
                .build().setFormula("(H2O)LiOH", true);

                RhodiumSulfateSolution = new Material.Builder(10093, GTBUtil.gtb("rhodium_sulfate_solution"))
                .fluid()
                .color(0xC7C7C7)
                .build().setFormula("(RhSO4?)(H2O)", true);

        RutheniumTetroxideSolution = new Material.Builder(10094, GTBUtil.gtb("ruthenium_tetroxide_solution"))
                .fluid()
                .dust()
                .color(0xAAC0BC)
                .build().setFormula("(NaCl)2RuO4", true);

        AcidicIridiumDioxide = new Material.Builder(10095, GTBUtil.gtb("acidic_iridium_dioxide"))
                .liquid(new FluidBuilder())
                .color(0xD4CAB0)
                .build().setFormula("(HCl)2(IrO2)2", true);

        PalladiumEnrichedAmmonia = new Material.Builder(10096, GTBUtil.gtb("palladium_enriched_ammonia"))
                .liquid(new FluidBuilder())
                .color(0x7B7C7C)
                .build().setFormula("Pd(NH3)?", true);

        ReprecipitatedPalladium = new Material.Builder(10097, GTBUtil.gtb("reprecipitated_palladium"))
                .dust()
                .color(0xB1AC9E)
                .build().setFormula("Pd?(NH3)", true);

        Ethylenediamine = new Material.Builder(10098, GTBUtil.gtb("ethylenediamine"))
                .dust()
                .fluid()
                .color(0x4A148C)
                .build().setFormula("C2H4(NH2)2", true);

        Syngas = new Material.Builder(10099, GTBUtil.gtb("syngas"))
                .fluid()
                .color(0xE8D6D1)
                .build().setFormula("(H)6(CO)", true);

        CalciumSalts = new Material.Builder(10101, GTBUtil.gtb("calcium_salts"))
                .dust()
                .color(0xCBBB94)
                .build().setFormula("(CaO3)(CaS(H2O)2O4)", true);

        LithiumChlorideSolution = new Material.Builder(10102, GTBUtil.gtb("lithium_chloride_solution"))
                .fluid()
                .color(0xc293e6)
                .build().setFormula("LiCl(H2O)", true);

        RoastedSphalerite = new Material.Builder(10103, GTBUtil.gtb("roasted_sphalerite"))
                .dust()
                .color(0xAC8B5C)
                .iconSet(FINE)
                .build().setFormula("GaGeO2", true);

        WaelzOxide = new Material.Builder(10104, GTBUtil.gtb("waelz_oxide"))
                .dust()
                .color(0xB8B8B8)
                .iconSet(FINE)
                .build().setFormula("ZnGeO2", true);

        ImpureGermaniumDioxide = new Material.Builder(10105, GTBUtil.gtb("impure_germanium_dioxide"))
                .dust()
                .color(0x666666)
                .iconSet(ROUGH)
                .build().setFormula("GeO2?", true);

        ZincRichSphalerite = new Material.Builder(10106, GTBUtil.gtb("zinc_rich_sphalerite"))
                .dust()
                .color(0xABA3A3)
                .iconSet(METALLIC)
                .build().setFormula("ZnS?", true);

        PhenolFormaldehydePrecursor = new Material.Builder(10107, GTBUtil.gtb("phenol_formaldehyde_precursor"))
                .fluid()
                .color(0xE8C181)
                .build().setFormula("(C6H4OH-CH2)3", true);

        PhenolFormaldehydeOligomer = new Material.Builder(10108, GTBUtil.gtb("phenol_formaldehyde_oligomer"))
                .fluid()
                .color(0xE6B565)
                .build().setFormula("C6H5OH(CH2O)n", true);

        NovolacEpoxyResin = new Material.Builder(10109, GTBUtil.gtb("novolac_epoxy_resin"))
                .fluid()
                .color(0xA58859)
                .build().setFormula("C6H4(OH)(CH2)(OCH2CH(OH)CH2)n", true);

        MethacrylicAcid = new Material.Builder(10110, GTBUtil.gtb("methacrylic_acid"))
                .fluid()
                .color(0x71B5EC)
                .build().setFormula("C4H6O2", true);

        NovolacVinylEsterSolution = new Material.Builder(10111, GTBUtil.gtb("novolac_vinyl_ester_solution"))
                .fluid()
                .color(0xCB9338)
                .build().setFormula("[C6H3(OH)(H2O)(CH2)(OCOC(CH3)=CH2)]n", true);

        NovolacVinylEster = new Material.Builder(10112, GTBUtil.gtb("novolac_vinyl_ester"))
                .fluid()
                .color(0xDA972B)
                .build().setFormula("[C6H3(OH)(CH2)(OCOC(CH3)=CH2)]n", true);

        NovolacEpoxyVinylEster = new Material.Builder(10113, GTBUtil.gtb("novolac_epoxy_vinyl_ester"))
                .fluid()
                .color(0xB57A1C)
                .build().setFormula("[C6H3(CH2)(OCH2CH(OH)CH2OCOC(CH3)=CH2)]n", true);

        AcetoneCyanohydrin = new Material.Builder(10114, GTBUtil.gtb("acetone_cyanohydrin"))
                .fluid()
                .color(0x8790BF)
                .build().setFormula("C4H7NO", true);

        MethacrylamideSulfate = new Material.Builder(10115, GTBUtil.gtb("methacrylamide_sulfate"))
                .fluid()
                .color(0x87BBD4)
                .build().setFormula("(C4H7NO)(H2SO4)", true);

        MethylMethacrylate = new Material.Builder(10116, GTBUtil.gtb("methyl_methacrylate"))
                .fluid()
                .color(0xA7D9F1)
                .build().setFormula("C5H8O2", true);
        
        PToluenesulfonicAcid = new Material.Builder(10117, GTBUtil.gtb("p_toluenesulfonic_acid"))
                .fluid()
                .color(0x7A706C)
                .build().setFormula("C7H8O3S", true);
        
        BariumHydroxide = new Material.Builder(10118, GTBUtil.gtb("barium_hydroxide"))
                .dust()
                .color(0x95B876)
                .build().setFormula("Ba(OH)2", true);
        
        VacuumFlashedCoalTar = new Material.Builder(10119, GTBUtil.gtb("vacuum_flashed_coal_tar"))
                .fluid()
                .color(0x1F1A1A)
                .build();
        
        VacuumFlashedWoodTar = new Material.Builder(10120, GTBUtil.gtb("vacuum_flashed_wood_tar"))
                .fluid()
                .color(0x594A48)
                .build();
        
        DecokedCoalTar = new Material.Builder(10121, GTBUtil.gtb("vacuum_flashed_coal_tar"))
                .fluid()
                .color(0x0D0A09)
                .build();
        
        DecokedWoodTar = new Material.Builder(10122, GTBUtil.gtb("vacuum_flashed_wood_tar"))
                .fluid()
                .color(0x3C2C28)
                .build();




        
  }

}