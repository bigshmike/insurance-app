package com.example.insuranceapplication.entity;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "plans")
public class Plan {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "group_number") //
    private String groupNumber;

    @Column(name = "group_name") //
    private String groupName;

    @Column(name = "annual_maximum") //
    private double annualMaximum;

    @Column(name = "individual_deductible") //
    private double individualDeductible;

    @Column(name = "family_deductible") //
    private double familyDeductible;

    @Column(name = "deductible_applies_to_preventive") //
    private char deductibleAppliesToPreventive;

    @Column(name = "deductible_applies_to_basic") //
    private char deductibleAppliesToBasic;

    @Column(name = "deductible_applies_to_major") //
    private char deductibleAppliesToMajor;

    @Column(name = "ortho_maximum_coverage") //
    private String orthoMaximumCoverage;

    @Column(name = "ortho_age_limit") //
    private int orthoAgeLimit;

    @Column(name = "preventive_coverage_percentage") //
    private Integer preventiveCoveragePercentage;

    @Column(name = "basic_coverage_percentage") //
    private int basicCoveragePercentage;

    @Column(name = "major_coverage_percentage") //
    private int majorCoveragePercentage;

    @Column(name = "extraction_coverage_percentage") //
    private int extractionCoveragePercentage;

    @Column(name = "crowns_basic_or_major") //
    private char crownsBasicOrMajor;

    @Column(name = "perio_basic_or_major") //
    private char perioBasicOrMajor;

    @Column(name = "endo_basic_or_major") //
    private char endoBasicOrMajor;

    @Column(name = "d0220_basic_or_preventive") //
    private char d0220BasicOrPreventive;

    @Column(name = "d9110_basic_or_preventive") // 
    private char d9110BasicOrPreventive;

    @Column(name = "d4381_coverage_percentage") // 
    private int d4381CoveragePercentage;

    @Column(name = "implants_coverage_percentage") // 
    private int implantsCoveragePercentage;

    @Column(name = "d6058_coverage_percentage") // 
    private int d6058CoveragePercentage;

    @Column(name = "d0366_coverage_percentage") //
    private int d0366CoveragePercentage;

    @Column(name = "sealants_coverage_percentage") //
    private int sealantsCoveragePercentage;

    @Column(name = "sealants_through_age") //
    private int sealantsThroughAge;

    @Column(name = "sealants_frequency") //
    private String sealantsFrequency;

    @Column(name = "sealants_coverage_primary_incisors") //
    private char sealantsCoveragePrimaryIncisors;

    @Column(name = "sealants_coverage_primary_molars") // 
    private char sealantsCoveragePrimaryMolars;

    @Column(name = "sealants_coverage_permanent_incisors") //
    private char sealantsCoveragePermanentIncisors;

    @Column(name = "sealants_coverage_permanent_premolars") // 
    private char sealantsCoveragePermanentPremolars;

    @Column(name = "sealants_coverage_permanent_first_molars") // 
    private char sealantsCoveragePermanentFirstMolars;

    @Column(name = "sealants_coverage_permanent_second_molars") // 
    private char sealantsCoveragePermanentSecondMolars;

    @Column(name = "sealants_coverage_permanent_third_molars") //
    private char sealantsCoveragePermanentThirdMolars;

    @Column(name = "d1206_coverage_percentage") //
    private int d1206CoveragePercentage;

    @Column(name = "d1206_through_age") //
    private int d1206ThroughAge;

    @Column(name = "d1206_frequency") //
    private String d1206Frequency;

    @Column(name = "d7953_coverage_percentage") //
    private int d7953CoveragePercentage;

    @Column(name = "d7953_coverage_with_implant_only") //
    private char d7953CoverageWithImplantOnly;

    @Column(name = "d9944_coverage_percentage") //
    private int d9944CoveragePercentage;

    @Column(name = "d9944_frequency") //
    private String d9944Frequency;

    @Column(name = "d9944_coverage_for_bruxism_only") //
    private char d9944CoverageForBruxismOnly;

    @Column(name = "posterior_composites_downgraded") //
    private char posteriorCompositesDowngraded; 

    @Column(name = "d0210_frequency") //
    private String d0210Frequency;

    @Column(name = "d0330_frequency") //
    private String d0330Frequency;

    @Column(name = "d0210_d0330_frequency_shared") //
    private char d0210D0330FrequencyShared;

    @Column(name = "d0120_frequency") //
    private String d0120Frequency;

    @Column(name = "d0140_frequency") //
    private String d0140Frequency;

    @Column(name = "d0150_frequency") //
    private String d0150Frequency;

    @Column(name = "d0180_frequency") //
    private String d0180Frequency;

    @Column(name = "d0120_d0140_frequency_shared") //
    private char d0120D0140FrequencyShared;

    @Column(name = "d0150_d0140_frequency_shared") //
    private char d0150D0140FrequencyShared;

    @Column(name = "d0150_d0180_frequency_shared") //
    private char d0150D0180FrequencyShared;

    @Column(name = "d1110_frequency") //
    private String d1110Frequency;

    @Column(name = "d1120_frequency") //
    private String d1120Frequency;

    @Column(name = "d4910_frequency") //
    private String d4910Frequency;

    @Column(name = "d1110_frequency_increased_diabetes") //
    private String d1110FrequencyIncreasedDiabetes;

    @Column(name = "d1110_frequency_increased_pregnancy") //
    private String d1110FrequencyIncreasedPregnancy;

    @Column(name = "fixed_prosthetic_frequency") //
    private String fixedProstheticFrequency;

    @Column(name = "removable_prosthetic_frequency") //
    private String removableProstheticFrequency;

    @Column(name = "usual_customary_rates")
    private String usualCustomaryRates;

    @Column(name = "missing_tooth_clause")
    private char missingToothClause;

    @Column(name = "waiting_period_preventive_months") //
    private int waitingPeriodPreventiveMonths;

    @Column(name = "waiting_period_basic_months") //
    private int waitingPeriodBasicMonths;

    @Column(name = "waiting_period_major_months") //
    private int waitingPeriodMajorMonths;

    @Column(name = "d4341_frequency") //
    private String d4341Frequency;

    @Column(name = "d4342_frequency") //
    private String d4342Frequency;
    
    @OneToMany(mappedBy = "plan", cascade = CascadeType.ALL)
    private List<Subscriber> subscribers;

    @ManyToOne
    @JoinColumn(name = "insurance_company")
    private InsuranceCompany insuranceCompany;
	
	public Plan() {
		
	}

	public Plan(int id, InsuranceCompany insuranceCompany, String groupNumber, String groupName, double annualMaximum, double individualDeductible,
	        double familyDeductible, char deductibleAppliesToPreventive, char deductibleAppliesToBasic,
	        char deductibleAppliesToMajor, String orthoMaximumCoverage, int orthoAgeLimit,
	        int preventiveCoveragePercentage, int basicCoveragePercentage, int majorCoveragePercentage,
	        int extractionCoveragePercentage, char crownsBasicOrMajor, char perioBasicOrMajor, char endoBasicOrMajor,
	        char d0220BasicOrPreventive, char d9110BasicOrPreventive, int d4381CoveragePercentage,
	        int implantsCoveragePercentage, int d6058CoveragePercentage, int d0366CoveragePercentage,
	        int sealantsCoveragePercentage, int sealantsThroughAge, String sealantsFrequency,
	        char sealantsCoveragePrimaryIncisors, char sealantsCoveragePrimaryMolars,
	        char sealantsCoveragePermanentIncisors, char sealantsCoveragePermanentPremolars,
	        char sealantsCoveragePermanentFirstMolars, char sealantsCoveragePermanentSecondMolars,
	        char sealantsCoveragePermanentThirdMolars, int d1206CoveragePercentage, int d1206ThroughAge,
	        String d1206Frequency, int d7953CoveragePercentage, char d7953CoverageWithImplantOnly,
	        int d9944CoveragePercentage, String d9944Frequency, char d9944CoverageForBruxismOnly,
	        char posteriorCompositesDowngraded, String d0210Frequency, String d0330Frequency,
	        char d0210d0330FrequencyShared, String d0120Frequency, String d0140Frequency, String d0150Frequency,
	        String d0180Frequency, char d0120d0140FrequencyShared, char d0150d0140FrequencyShared,
	        char d0150d0180FrequencyShared, String d1110Frequency, String d1120Frequency, String d4910Frequency,
	        String d1110FrequencyIncreasedDiabetes, String d1110FrequencyIncreasedPregnancy,
	        String fixedProstheticFrequency, String removableProstheticFrequency, String usualCustomaryRates,
	        char missingToothClause, int waitingPeriodPreventiveMonths, int waitingPeriodBasicMonths,
	        int waitingPeriodMajorMonths, String d4341Frequency, String d4342Frequency) {
	    setId(id);
	    setInsuranceCompany(insuranceCompany);
	    setGroupNumber(groupNumber);
	    setGroupName(groupName);
	    setAnnualMaximum(annualMaximum);
	    setIndividualDeductible(individualDeductible);
	    setFamilyDeductible(familyDeductible);
	    setDeductibleAppliesToPreventive(deductibleAppliesToPreventive);
	    setDeductibleAppliesToBasic(deductibleAppliesToBasic);
	    setDeductibleAppliesToMajor(deductibleAppliesToMajor);
	    setOrthoMaximumCoverage(orthoMaximumCoverage);
	    setOrthoAgeLimit(orthoAgeLimit);
	    setPreventiveCoveragePercentage(preventiveCoveragePercentage);
	    setBasicCoveragePercentage(basicCoveragePercentage);
	    setMajorCoveragePercentage(majorCoveragePercentage);
	    setExtractionCoveragePercentage(extractionCoveragePercentage);
	    setCrownsBasicOrMajor(crownsBasicOrMajor);
	    setPerioBasicOrMajor(perioBasicOrMajor);
	    setEndoBasicOrMajor(endoBasicOrMajor);
	    setD0220BasicOrPreventive(d0220BasicOrPreventive);
	    setD9110BasicOrPreventive(d9110BasicOrPreventive);
	    setD4381CoveragePercentage(d4381CoveragePercentage);
	    setImplantsCoveragePercentage(implantsCoveragePercentage);
	    setD6058CoveragePercentage(d6058CoveragePercentage);
	    setD0366CoveragePercentage(d0366CoveragePercentage);
	    setSealantsCoveragePercentage(sealantsCoveragePercentage);
	    setSealantsThroughAge(sealantsThroughAge);
	    setSealantsFrequency(sealantsFrequency);
	    setSealantsCoveragePrimaryIncisors(sealantsCoveragePrimaryIncisors);
	    setSealantsCoveragePrimaryMolars(sealantsCoveragePrimaryMolars);
	    setSealantsCoveragePermanentIncisors(sealantsCoveragePermanentIncisors);
	    setSealantsCoveragePermanentPremolars(sealantsCoveragePermanentPremolars);
	    setSealantsCoveragePermanentFirstMolars(sealantsCoveragePermanentFirstMolars);
	    setSealantsCoveragePermanentSecondMolars(sealantsCoveragePermanentSecondMolars);
	    setSealantsCoveragePermanentThirdMolars(sealantsCoveragePermanentThirdMolars);
	    setD1206CoveragePercentage(d1206CoveragePercentage);
	    setD1206ThroughAge(d1206ThroughAge);
	    setD1206Frequency(d1206Frequency);
	    setD7953CoveragePercentage(d7953CoveragePercentage);
	    setD7953CoverageWithImplantOnly(d7953CoverageWithImplantOnly);
	    setD9944CoveragePercentage(d9944CoveragePercentage);
	    setD9944Frequency(d9944Frequency);
	    setD9944CoverageForBruxismOnly(d9944CoverageForBruxismOnly);
	    setPosteriorCompositesDowngraded(posteriorCompositesDowngraded);
	    setD0210Frequency(d0210Frequency);
	    setD0330Frequency(d0330Frequency);
	    setD0210D0330FrequencyShared(d0210d0330FrequencyShared);
	    setD0120Frequency(d0120Frequency);
	    setD0140Frequency(d0140Frequency);
	    setD0150Frequency(d0150Frequency);
	    setD0180Frequency(d0180Frequency);
	    setD0120D0140FrequencyShared(d0120d0140FrequencyShared);
	    setD0150D0140FrequencyShared(d0150d0140FrequencyShared);
	    setD0150D0180FrequencyShared(d0150d0180FrequencyShared);
	    setD1110Frequency(d1110Frequency);
	    setD1120Frequency(d1120Frequency);
	    setD4910Frequency(d4910Frequency);
	    setD1110FrequencyIncreasedDiabetes(d1110FrequencyIncreasedDiabetes);
	    setD1110FrequencyIncreasedPregnancy(d1110FrequencyIncreasedPregnancy);
	    setFixedProstheticFrequency(fixedProstheticFrequency);
	    setRemovableProstheticFrequency(removableProstheticFrequency);
	    setUsualCustomaryRates(usualCustomaryRates);
	    setMissingToothClause(missingToothClause);
	    setWaitingPeriodPreventiveMonths(waitingPeriodPreventiveMonths);
	    setWaitingPeriodBasicMonths(waitingPeriodBasicMonths);
	    setWaitingPeriodMajorMonths(waitingPeriodMajorMonths);
	    setD4341Frequency(d4341Frequency);
	    setD4342Frequency(d4342Frequency);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public double getAnnualMaximum() {
		return annualMaximum;
	}

	public void setAnnualMaximum(double annualMaximum) {
		this.annualMaximum = annualMaximum;
	}

	public double getIndividualDeductible() {
		return individualDeductible;
	}

	public void setIndividualDeductible(double individualDeductible) {
		this.individualDeductible = individualDeductible;
	}

	public double getFamilyDeductible() {
		return familyDeductible;
	}

	public void setFamilyDeductible(double familyDeductible) {
		this.familyDeductible = familyDeductible;
	}

	public char getDeductibleAppliesToPreventive() {
		return deductibleAppliesToPreventive;
	}

	public void setDeductibleAppliesToPreventive(char deductibleAppliesToPreventive) {
		this.deductibleAppliesToPreventive = deductibleAppliesToPreventive;
	}

	public char getDeductibleAppliesToBasic() {
		return deductibleAppliesToBasic;
	}

	public void setDeductibleAppliesToBasic(char deductibleAppliesToBasic) {
		this.deductibleAppliesToBasic = deductibleAppliesToBasic;
	}

	public char getDeductibleAppliesToMajor() {
		return deductibleAppliesToMajor;
	}

	public void setDeductibleAppliesToMajor(char deductibleAppliesToMajor) {
		this.deductibleAppliesToMajor = deductibleAppliesToMajor;
	}

	public String getOrthoMaximumCoverage() {
		return orthoMaximumCoverage;
	}

	public void setOrthoMaximumCoverage(String orthoMaximumCoverage) {
		this.orthoMaximumCoverage = orthoMaximumCoverage;
	}

	public int getOrthoAgeLimit() {
		return orthoAgeLimit;
	}

	public void setOrthoAgeLimit(int orthoAgeLimit) {
		this.orthoAgeLimit = orthoAgeLimit;
	}

	public Integer getPreventiveCoveragePercentage() {
		return preventiveCoveragePercentage;
	}

	public void setPreventiveCoveragePercentage(Integer preventiveCoveragePercentage) {
		this.preventiveCoveragePercentage = preventiveCoveragePercentage;
	}

	public int getBasicCoveragePercentage() {
		return basicCoveragePercentage;
	}

	public void setBasicCoveragePercentage(int basicCoveragePercentage) {
		this.basicCoveragePercentage = basicCoveragePercentage;
	}

	public int getMajorCoveragePercentage() {
		return majorCoveragePercentage;
	}

	public void setMajorCoveragePercentage(int majorCoveragePercentage) {
		this.majorCoveragePercentage = majorCoveragePercentage;
	}

	public int getExtractionCoveragePercentage() {
		return extractionCoveragePercentage;
	}

	public void setExtractionCoveragePercentage(int extractionCoveragePercentage) {
		this.extractionCoveragePercentage = extractionCoveragePercentage;
	}

	public char getCrownsBasicOrMajor() {
		return crownsBasicOrMajor;
	}

	public void setCrownsBasicOrMajor(char crownsBasicOrMajor) {
		this.crownsBasicOrMajor = crownsBasicOrMajor;
	}

	public char getPerioBasicOrMajor() {
		return perioBasicOrMajor;
	}

	public void setPerioBasicOrMajor(char perioBasicOrMajor) {
		this.perioBasicOrMajor = perioBasicOrMajor;
	}

	public char getEndoBasicOrMajor() {
		return endoBasicOrMajor;
	}

	public void setEndoBasicOrMajor(char endoBasicOrMajor) {
		this.endoBasicOrMajor = endoBasicOrMajor;
	}

	public char getD0220BasicOrPreventive() {
		return d0220BasicOrPreventive;
	}

	public void setD0220BasicOrPreventive(char d0220BasicOrPreventive) {
		this.d0220BasicOrPreventive = d0220BasicOrPreventive;
	}

	public char getD9110BasicOrPreventive() {
		return d9110BasicOrPreventive;
	}

	public void setD9110BasicOrPreventive(char d9110BasicOrPreventive) {
		this.d9110BasicOrPreventive = d9110BasicOrPreventive;
	}

	public int getD4381CoveragePercentage() {
		return d4381CoveragePercentage;
	}

	public void setD4381CoveragePercentage(int d4381CoveragePercentage) {
		this.d4381CoveragePercentage = d4381CoveragePercentage;
	}

	public int getImplantsCoveragePercentage() {
		return implantsCoveragePercentage;
	}

	public void setImplantsCoveragePercentage(int implantsCoveragePercentage) {
		this.implantsCoveragePercentage = implantsCoveragePercentage;
	}

	public int getD6058CoveragePercentage() {
		return d6058CoveragePercentage;
	}

	public void setD6058CoveragePercentage(int d6058CoveragePercentage) {
		this.d6058CoveragePercentage = d6058CoveragePercentage;
	}

	public int getD0366CoveragePercentage() {
		return d0366CoveragePercentage;
	}

	public void setD0366CoveragePercentage(int d0366CoveragePercentage) {
		this.d0366CoveragePercentage = d0366CoveragePercentage;
	}

	public int getSealantsCoveragePercentage() {
		return sealantsCoveragePercentage;
	}

	public void setSealantsCoveragePercentage(int sealantsCoveragePercentage) {
		this.sealantsCoveragePercentage = sealantsCoveragePercentage;
	}

	public int getSealantsThroughAge() {
		return sealantsThroughAge;
	}

	public void setSealantsThroughAge(int sealantsThroughAge) {
		this.sealantsThroughAge = sealantsThroughAge;
	}

	public String getSealantsFrequency() {
		return sealantsFrequency;
	}

	public void setSealantsFrequency(String sealantsFrequency) {
		this.sealantsFrequency = sealantsFrequency;
	}

	public char getSealantsCoveragePrimaryIncisors() {
		return sealantsCoveragePrimaryIncisors;
	}

	public void setSealantsCoveragePrimaryIncisors(char sealantsCoveragePrimaryIncisors) {
		this.sealantsCoveragePrimaryIncisors = sealantsCoveragePrimaryIncisors;
	}

	public char getSealantsCoveragePrimaryMolars() {
		return sealantsCoveragePrimaryMolars;
	}

	public void setSealantsCoveragePrimaryMolars(char sealantsCoveragePrimaryMolars) {
		this.sealantsCoveragePrimaryMolars = sealantsCoveragePrimaryMolars;
	}

	public char getSealantsCoveragePermanentIncisors() {
		return sealantsCoveragePermanentIncisors;
	}

	public void setSealantsCoveragePermanentIncisors(char sealantsCoveragePermanentIncisors) {
		this.sealantsCoveragePermanentIncisors = sealantsCoveragePermanentIncisors;
	}

	public char getSealantsCoveragePermanentPremolars() {
		return sealantsCoveragePermanentPremolars;
	}

	public void setSealantsCoveragePermanentPremolars(char sealantsCoveragePermanentPremolars) {
		this.sealantsCoveragePermanentPremolars = sealantsCoveragePermanentPremolars;
	}

	public char getSealantsCoveragePermanentFirstMolars() {
		return sealantsCoveragePermanentFirstMolars;
	}

	public void setSealantsCoveragePermanentFirstMolars(char sealantsCoveragePermanentFirstMolars) {
		this.sealantsCoveragePermanentFirstMolars = sealantsCoveragePermanentFirstMolars;
	}

	public char getSealantsCoveragePermanentSecondMolars() {
		return sealantsCoveragePermanentSecondMolars;
	}

	public void setSealantsCoveragePermanentSecondMolars(char sealantsCoveragePermanentSecondMolars) {
		this.sealantsCoveragePermanentSecondMolars = sealantsCoveragePermanentSecondMolars;
	}

	public char getSealantsCoveragePermanentThirdMolars() {
		return sealantsCoveragePermanentThirdMolars;
	}

	public void setSealantsCoveragePermanentThirdMolars(char sealantsCoveragePermanentThirdMolars) {
		this.sealantsCoveragePermanentThirdMolars = sealantsCoveragePermanentThirdMolars;
	}

	public int getD1206CoveragePercentage() {
		return d1206CoveragePercentage;
	}

	public void setD1206CoveragePercentage(int d1206CoveragePercentage) {
		this.d1206CoveragePercentage = d1206CoveragePercentage;
	}

	public int getD1206ThroughAge() {
		return d1206ThroughAge;
	}

	public void setD1206ThroughAge(int d1206ThroughAge) {
		this.d1206ThroughAge = d1206ThroughAge;
	}

	public String getD1206Frequency() {
		return d1206Frequency;
	}

	public void setD1206Frequency(String d1206Frequency) {
		this.d1206Frequency = d1206Frequency;
	}

	public int getD7953CoveragePercentage() {
		return d7953CoveragePercentage;
	}

	public void setD7953CoveragePercentage(int d7953CoveragePercentage) {
		this.d7953CoveragePercentage = d7953CoveragePercentage;
	}

	public char getD7953CoverageWithImplantOnly() {
		return d7953CoverageWithImplantOnly;
	}

	public void setD7953CoverageWithImplantOnly(char d7953CoverageWithImplantOnly) {
		this.d7953CoverageWithImplantOnly = d7953CoverageWithImplantOnly;
	}

	public int getD9944CoveragePercentage() {
		return d9944CoveragePercentage;
	}

	public void setD9944CoveragePercentage(int d9944CoveragePercentage) {
		this.d9944CoveragePercentage = d9944CoveragePercentage;
	}

	public String getD9944Frequency() {
		return d9944Frequency;
	}

	public void setD9944Frequency(String d9944Frequency) {
		this.d9944Frequency = d9944Frequency;
	}

	public char getD9944CoverageForBruxismOnly() {
		return d9944CoverageForBruxismOnly;
	}

	public void setD9944CoverageForBruxismOnly(char d9944CoverageForBruxismOnly) {
		this.d9944CoverageForBruxismOnly = d9944CoverageForBruxismOnly;
	}

	public char getPosteriorCompositesDowngraded() {
		return posteriorCompositesDowngraded;
	}

	public void setPosteriorCompositesDowngraded(char posteriorCompositesDowngraded) {
		this.posteriorCompositesDowngraded = posteriorCompositesDowngraded;
	}

	public String getD0210Frequency() {
		return d0210Frequency;
	}

	public void setD0210Frequency(String d0210Frequency) {
		this.d0210Frequency = d0210Frequency;
	}

	public String getD0330Frequency() {
		return d0330Frequency;
	}

	public void setD0330Frequency(String d0330Frequency) {
		this.d0330Frequency = d0330Frequency;
	}

	public char getD0210D0330FrequencyShared() {
		return d0210D0330FrequencyShared;
	}

	public void setD0210D0330FrequencyShared(char d0210d0330FrequencyShared) {
		d0210D0330FrequencyShared = d0210d0330FrequencyShared;
	}

	public String getD0120Frequency() {
		return d0120Frequency;
	}

	public void setD0120Frequency(String d0120Frequency) {
		this.d0120Frequency = d0120Frequency;
	}

	public String getD0140Frequency() {
		return d0140Frequency;
	}

	public void setD0140Frequency(String d0140Frequency) {
		this.d0140Frequency = d0140Frequency;
	}

	public String getD0150Frequency() {
		return d0150Frequency;
	}

	public void setD0150Frequency(String d0150Frequency) {
		this.d0150Frequency = d0150Frequency;
	}

	public String getD0180Frequency() {
		return d0180Frequency;
	}

	public void setD0180Frequency(String d0180Frequency) {
		this.d0180Frequency = d0180Frequency;
	}

	public char getD0120D0140FrequencyShared() {
		return d0120D0140FrequencyShared;
	}

	public void setD0120D0140FrequencyShared(char d0120d0140FrequencyShared) {
		d0120D0140FrequencyShared = d0120d0140FrequencyShared;
	}

	public char getD0150D0140FrequencyShared() {
		return d0150D0140FrequencyShared;
	}

	public void setD0150D0140FrequencyShared(char d0150d0140FrequencyShared) {
		d0150D0140FrequencyShared = d0150d0140FrequencyShared;
	}

	public char getD0150D0180FrequencyShared() {
		return d0150D0180FrequencyShared;
	}

	public void setD0150D0180FrequencyShared(char d0150d0180FrequencyShared) {
		d0150D0180FrequencyShared = d0150d0180FrequencyShared;
	}

	public String getD1110Frequency() {
		return d1110Frequency;
	}

	public void setD1110Frequency(String d1110Frequency) {
		this.d1110Frequency = d1110Frequency;
	}

	public String getD1120Frequency() {
		return d1120Frequency;
	}

	public void setD1120Frequency(String d1120Frequency) {
		this.d1120Frequency = d1120Frequency;
	}

	public String getD4910Frequency() {
		return d4910Frequency;
	}

	public void setD4910Frequency(String d4910Frequency) {
		this.d4910Frequency = d4910Frequency;
	}

	public String getD1110FrequencyIncreasedDiabetes() {
		return d1110FrequencyIncreasedDiabetes;
	}

	public void setD1110FrequencyIncreasedDiabetes(String d1110FrequencyIncreasedDiabetes) {
		this.d1110FrequencyIncreasedDiabetes = d1110FrequencyIncreasedDiabetes;
	}

	public String getD1110FrequencyIncreasedPregnancy() {
		return d1110FrequencyIncreasedPregnancy;
	}

	public void setD1110FrequencyIncreasedPregnancy(String d1110FrequencyIncreasedPregnancy) {
		this.d1110FrequencyIncreasedPregnancy = d1110FrequencyIncreasedPregnancy;
	}

	public String getFixedProstheticFrequency() {
		return fixedProstheticFrequency;
	}

	public void setFixedProstheticFrequency(String fixedProstheticFrequency) {
		this.fixedProstheticFrequency = fixedProstheticFrequency;
	}

	public String getRemovableProstheticFrequency() {
		return removableProstheticFrequency;
	}

	public void setRemovableProstheticFrequency(String removableProstheticFrequency) {
		this.removableProstheticFrequency = removableProstheticFrequency;
	}

	public String getUsualCustomaryRates() {
		return usualCustomaryRates;
	}

	public void setUsualCustomaryRates(String usualCustomaryRates) {
		this.usualCustomaryRates = usualCustomaryRates;
	}

	public char getMissingToothClause() {
		return missingToothClause;
	}

	public void setMissingToothClause(char missingToothClause) {
		this.missingToothClause = missingToothClause;
	}

	public int getWaitingPeriodPreventiveMonths() {
		return waitingPeriodPreventiveMonths;
	}

	public void setWaitingPeriodPreventiveMonths(int waitingPeriodPreventiveMonths) {
		this.waitingPeriodPreventiveMonths = waitingPeriodPreventiveMonths;
	}

	public int getWaitingPeriodBasicMonths() {
		return waitingPeriodBasicMonths;
	}

	public void setWaitingPeriodBasicMonths(int waitingPeriodBasicMonths) {
		this.waitingPeriodBasicMonths = waitingPeriodBasicMonths;
	}

	public int getWaitingPeriodMajorMonths() {
		return waitingPeriodMajorMonths;
	}

	public void setWaitingPeriodMajorMonths(int waitingPeriodMajorMonths) {
		this.waitingPeriodMajorMonths = waitingPeriodMajorMonths;
	}

	public String getD4341Frequency() {
		return d4341Frequency;
	}

	public void setD4341Frequency(String d4341Frequency) {
		this.d4341Frequency = d4341Frequency;
	}

	public String getD4342Frequency() {
		return d4342Frequency;
	}

	public void setD4342Frequency(String d4342Frequency) {
		this.d4342Frequency = d4342Frequency;
	}

	public List<Subscriber> getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(List<Subscriber> subscribers) {
		this.subscribers = subscribers;
	}

	public InsuranceCompany getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(InsuranceCompany insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	@Override
	public int hashCode() {
		return Objects.hash(annualMaximum, basicCoveragePercentage, crownsBasicOrMajor, d0120D0140FrequencyShared,
				d0120Frequency, d0140Frequency, d0150D0140FrequencyShared, d0150D0180FrequencyShared, d0150Frequency,
				d0180Frequency, d0210D0330FrequencyShared, d0210Frequency, d0220BasicOrPreventive, d0330Frequency,
				d0366CoveragePercentage, d1110Frequency, d1110FrequencyIncreasedDiabetes,
				d1110FrequencyIncreasedPregnancy, d1120Frequency, d1206CoveragePercentage, d1206Frequency,
				d1206ThroughAge, d4341Frequency, d4342Frequency, d4381CoveragePercentage, d4910Frequency,
				d6058CoveragePercentage, d7953CoveragePercentage, d7953CoverageWithImplantOnly, d9110BasicOrPreventive,
				d9944CoverageForBruxismOnly, d9944CoveragePercentage, d9944Frequency, deductibleAppliesToBasic,
				deductibleAppliesToMajor, deductibleAppliesToPreventive, endoBasicOrMajor, extractionCoveragePercentage,
				familyDeductible, fixedProstheticFrequency, groupName, groupNumber, id, implantsCoveragePercentage,
				individualDeductible, insuranceCompany, majorCoveragePercentage, missingToothClause, orthoAgeLimit,
				orthoMaximumCoverage, perioBasicOrMajor, posteriorCompositesDowngraded, preventiveCoveragePercentage,
				removableProstheticFrequency, sealantsCoveragePercentage, sealantsCoveragePermanentFirstMolars,
				sealantsCoveragePermanentIncisors, sealantsCoveragePermanentPremolars,
				sealantsCoveragePermanentSecondMolars, sealantsCoveragePermanentThirdMolars,
				sealantsCoveragePrimaryIncisors, sealantsCoveragePrimaryMolars, sealantsFrequency, sealantsThroughAge,
				subscribers, usualCustomaryRates, waitingPeriodBasicMonths, waitingPeriodMajorMonths,
				waitingPeriodPreventiveMonths);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plan other = (Plan) obj;
		return Double.doubleToLongBits(annualMaximum) == Double.doubleToLongBits(other.annualMaximum)
				&& basicCoveragePercentage == other.basicCoveragePercentage
				&& crownsBasicOrMajor == other.crownsBasicOrMajor
				&& d0120D0140FrequencyShared == other.d0120D0140FrequencyShared
				&& Objects.equals(d0120Frequency, other.d0120Frequency)
				&& Objects.equals(d0140Frequency, other.d0140Frequency)
				&& d0150D0140FrequencyShared == other.d0150D0140FrequencyShared
				&& d0150D0180FrequencyShared == other.d0150D0180FrequencyShared
				&& Objects.equals(d0150Frequency, other.d0150Frequency)
				&& Objects.equals(d0180Frequency, other.d0180Frequency)
				&& d0210D0330FrequencyShared == other.d0210D0330FrequencyShared
				&& Objects.equals(d0210Frequency, other.d0210Frequency)
				&& d0220BasicOrPreventive == other.d0220BasicOrPreventive
				&& Objects.equals(d0330Frequency, other.d0330Frequency)
				&& d0366CoveragePercentage == other.d0366CoveragePercentage
				&& Objects.equals(d1110Frequency, other.d1110Frequency)
				&& Objects.equals(d1110FrequencyIncreasedDiabetes, other.d1110FrequencyIncreasedDiabetes)
				&& Objects.equals(d1110FrequencyIncreasedPregnancy, other.d1110FrequencyIncreasedPregnancy)
				&& Objects.equals(d1120Frequency, other.d1120Frequency)
				&& d1206CoveragePercentage == other.d1206CoveragePercentage
				&& Objects.equals(d1206Frequency, other.d1206Frequency) && d1206ThroughAge == other.d1206ThroughAge
				&& Objects.equals(d4341Frequency, other.d4341Frequency)
				&& Objects.equals(d4342Frequency, other.d4342Frequency)
				&& d4381CoveragePercentage == other.d4381CoveragePercentage
				&& Objects.equals(d4910Frequency, other.d4910Frequency)
				&& d6058CoveragePercentage == other.d6058CoveragePercentage
				&& d7953CoveragePercentage == other.d7953CoveragePercentage
				&& d7953CoverageWithImplantOnly == other.d7953CoverageWithImplantOnly
				&& d9110BasicOrPreventive == other.d9110BasicOrPreventive
				&& d9944CoverageForBruxismOnly == other.d9944CoverageForBruxismOnly
				&& d9944CoveragePercentage == other.d9944CoveragePercentage
				&& Objects.equals(d9944Frequency, other.d9944Frequency)
				&& deductibleAppliesToBasic == other.deductibleAppliesToBasic
				&& deductibleAppliesToMajor == other.deductibleAppliesToMajor
				&& deductibleAppliesToPreventive == other.deductibleAppliesToPreventive
				&& endoBasicOrMajor == other.endoBasicOrMajor
				&& extractionCoveragePercentage == other.extractionCoveragePercentage
				&& Double.doubleToLongBits(familyDeductible) == Double.doubleToLongBits(other.familyDeductible)
				&& Objects.equals(fixedProstheticFrequency, other.fixedProstheticFrequency)
				&& Objects.equals(groupName, other.groupName) && Objects.equals(groupNumber, other.groupNumber)
				&& id == other.id && implantsCoveragePercentage == other.implantsCoveragePercentage
				&& Double.doubleToLongBits(individualDeductible) == Double.doubleToLongBits(other.individualDeductible)
				&& Objects.equals(insuranceCompany, other.insuranceCompany)
				&& majorCoveragePercentage == other.majorCoveragePercentage
				&& missingToothClause == other.missingToothClause && orthoAgeLimit == other.orthoAgeLimit
				&& Objects.equals(orthoMaximumCoverage, other.orthoMaximumCoverage)
				&& perioBasicOrMajor == other.perioBasicOrMajor
				&& posteriorCompositesDowngraded == other.posteriorCompositesDowngraded
				&& Objects.equals(preventiveCoveragePercentage, other.preventiveCoveragePercentage)
				&& Objects.equals(removableProstheticFrequency, other.removableProstheticFrequency)
				&& sealantsCoveragePercentage == other.sealantsCoveragePercentage
				&& sealantsCoveragePermanentFirstMolars == other.sealantsCoveragePermanentFirstMolars
				&& sealantsCoveragePermanentIncisors == other.sealantsCoveragePermanentIncisors
				&& sealantsCoveragePermanentPremolars == other.sealantsCoveragePermanentPremolars
				&& sealantsCoveragePermanentSecondMolars == other.sealantsCoveragePermanentSecondMolars
				&& sealantsCoveragePermanentThirdMolars == other.sealantsCoveragePermanentThirdMolars
				&& sealantsCoveragePrimaryIncisors == other.sealantsCoveragePrimaryIncisors
				&& sealantsCoveragePrimaryMolars == other.sealantsCoveragePrimaryMolars
				&& Objects.equals(sealantsFrequency, other.sealantsFrequency)
				&& sealantsThroughAge == other.sealantsThroughAge && Objects.equals(subscribers, other.subscribers)
				&& Objects.equals(usualCustomaryRates, other.usualCustomaryRates)
				&& waitingPeriodBasicMonths == other.waitingPeriodBasicMonths
				&& waitingPeriodMajorMonths == other.waitingPeriodMajorMonths
				&& waitingPeriodPreventiveMonths == other.waitingPeriodPreventiveMonths;
	}

	@Override
	public String toString() {
		return "Plan [id=" + id + ", groupNumber=" + groupNumber + ", groupName=" + groupName + ", annualMaximum="
				+ annualMaximum + ", individualDeductible=" + individualDeductible + ", familyDeductible="
				+ familyDeductible + ", deductibleAppliesToPreventive=" + deductibleAppliesToPreventive
				+ ", deductibleAppliesToBasic=" + deductibleAppliesToBasic + ", deductibleAppliesToMajor="
				+ deductibleAppliesToMajor + ", orthoMaximumCoverage=" + orthoMaximumCoverage + ", orthoAgeLimit="
				+ orthoAgeLimit + ", preventiveCoveragePercentage=" + preventiveCoveragePercentage
				+ ", basicCoveragePercentage=" + basicCoveragePercentage + ", majorCoveragePercentage="
				+ majorCoveragePercentage + ", extractionCoveragePercentage=" + extractionCoveragePercentage
				+ ", crownsBasicOrMajor=" + crownsBasicOrMajor + ", perioBasicOrMajor=" + perioBasicOrMajor
				+ ", endoBasicOrMajor=" + endoBasicOrMajor + ", d0220BasicOrPreventive=" + d0220BasicOrPreventive
				+ ", d9110BasicOrPreventive=" + d9110BasicOrPreventive + ", d4381CoveragePercentage="
				+ d4381CoveragePercentage + ", implantsCoveragePercentage=" + implantsCoveragePercentage
				+ ", d6058CoveragePercentage=" + d6058CoveragePercentage + ", d0366CoveragePercentage="
				+ d0366CoveragePercentage + ", sealantsCoveragePercentage=" + sealantsCoveragePercentage
				+ ", sealantsThroughAge=" + sealantsThroughAge + ", sealantsFrequency=" + sealantsFrequency
				+ ", sealantsCoveragePrimaryIncisors=" + sealantsCoveragePrimaryIncisors
				+ ", sealantsCoveragePrimaryMolars=" + sealantsCoveragePrimaryMolars
				+ ", sealantsCoveragePermanentIncisors=" + sealantsCoveragePermanentIncisors
				+ ", sealantsCoveragePermanentPremolars=" + sealantsCoveragePermanentPremolars
				+ ", sealantsCoveragePermanentFirstMolars=" + sealantsCoveragePermanentFirstMolars
				+ ", sealantsCoveragePermanentSecondMolars=" + sealantsCoveragePermanentSecondMolars
				+ ", sealantsCoveragePermanentThirdMolars=" + sealantsCoveragePermanentThirdMolars
				+ ", d1206CoveragePercentage=" + d1206CoveragePercentage + ", d1206ThroughAge=" + d1206ThroughAge
				+ ", d1206Frequency=" + d1206Frequency + ", d7953CoveragePercentage=" + d7953CoveragePercentage
				+ ", d7953CoverageWithImplantOnly=" + d7953CoverageWithImplantOnly + ", d9944CoveragePercentage="
				+ d9944CoveragePercentage + ", d9944Frequency=" + d9944Frequency + ", d9944CoverageForBruxismOnly="
				+ d9944CoverageForBruxismOnly + ", posteriorCompositesDowngraded=" + posteriorCompositesDowngraded
				+ ", d0210Frequency=" + d0210Frequency + ", d0330Frequency=" + d0330Frequency
				+ ", d0210D0330FrequencyShared=" + d0210D0330FrequencyShared + ", d0120Frequency=" + d0120Frequency
				+ ", d0140Frequency=" + d0140Frequency + ", d0150Frequency=" + d0150Frequency + ", d0180Frequency="
				+ d0180Frequency + ", d0120D0140FrequencyShared=" + d0120D0140FrequencyShared
				+ ", d0150D0140FrequencyShared=" + d0150D0140FrequencyShared + ", d0150D0180FrequencyShared="
				+ d0150D0180FrequencyShared + ", d1110Frequency=" + d1110Frequency + ", d1120Frequency="
				+ d1120Frequency + ", d4910Frequency=" + d4910Frequency + ", d1110FrequencyIncreasedDiabetes="
				+ d1110FrequencyIncreasedDiabetes + ", d1110FrequencyIncreasedPregnancy="
				+ d1110FrequencyIncreasedPregnancy + ", fixedProstheticFrequency=" + fixedProstheticFrequency
				+ ", removableProstheticFrequency=" + removableProstheticFrequency + ", usualCustomaryRates="
				+ usualCustomaryRates + ", missingToothClause=" + missingToothClause
				+ ", waitingPeriodPreventiveMonths=" + waitingPeriodPreventiveMonths + ", waitingPeriodBasicMonths="
				+ waitingPeriodBasicMonths + ", waitingPeriodMajorMonths=" + waitingPeriodMajorMonths
				+ ", d4341Frequency=" + d4341Frequency + ", d4342Frequency=" + d4342Frequency + "]";
	}
	

}
