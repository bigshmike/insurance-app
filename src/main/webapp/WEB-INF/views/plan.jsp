<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Plan Details</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="container-fluid">
			<h3>Breakdown of Benefits</h3>
			<div class="row">
				<h5>Plan Info</h5>
				<div class="col-3">Group Number: ${plan.groupNumber }</div>
			</div>
			<div class="row">
				<div class="col-3">Group Name: ${plan.groupName }</div>
			</div>
			<hr />
			<h3>Maximum & Deductibles</h3>
			<div class="row">
				<h5>Maximum</h5>
				<div class="col-3">Annual Maximum: $<fmt:formatNumber type="number" maxFractionDigits="2" minFractionDigits="2" value="${plan.annualMaximum }"/></div>
			</div>
			<div class="row">
				<h5>Deductibles</h5>
				<div class="row">
					<div class="col-3">Applies to Preventive:
						${plan.deductibleAppliesToPreventive }</div>
					<div class="col-3">Applies to Basic:
						${plan.deductibleAppliesToBasic }</div>
					<div class="col-3">Applies to Major:
						${plan.deductibleAppliesToMajor }</div>
				</div>
				<div class="col-3">Individual Deductible:
					$<fmt:formatNumber type="number" maxFractionDigits="2" minFractionDigits="2" value="${plan.individualDeductible }"/></div>
				<div class="col-3">Family Deductible: $<fmt:formatNumber type="number" maxFractionDigits="2" minFractionDigits="2" value="${plan.familyDeductible }"/></div>
			</div>
			<hr />
			<h3>Waiting Periods (months)</h3>
			<div class="row">
				<div class="col-3">Preventive:
					${plan.waitingPeriodPreventiveMonths }</div>
				<div class="col-3">Basic: ${plan.waitingPeriodBasicMonths }</div>
				<div class="col-3">Major: ${plan.waitingPeriodMajorMonths }</div>
			</div>
			<hr />
			<h3>Frequencies</h3>
			<div class="row">
				<h5>Diagnostic</h5>
				<div class="col-12">Periodic Oral Evaluation (D0120):
					${plan.d0120Frequency }</div>
				<div class="col-12">Limited Oral Evaluation (D0140):
					${plan.d0140Frequency }</div>
				<div class="col-12">Comprehensive Oral Evaluation (D0150):
					${plan.d0150Frequency }</div>
				<div class="col-12">Comprehensive Periodontal Evaluation
					(D0180): ${plan.d0180Frequency }</div>
				<div class="col-12">
					<br>
				</div>
				<div class="col-3">D0120 & D0140 Frequency Shared:
					${plan.d0120D0140FrequencyShared }</div>
				<div class="col-1">
					<div class="vr"></div>
				</div>
				<div class="col-3">D0150 & D0140 Frequency Shared:
					${plan.d0150D0140FrequencyShared }</div>
				<div class="col-1">
					<div class="vr"></div>
				</div>
				<div class="col-3">D0150 & D0180 Frequency Shared:
					${plan.d0150D0180FrequencyShared }</div>
				<div class="col-12">
					<br>
				</div>
				<div class="col-12">Full Mouth Series with Bitewings (D0210):
					${plan.d0210Frequency }</div>
				<div class="col-12">Panoramic Image (D0330):
					${plan.d0330Frequency }</div>
				<div class="col-12">D0210 & D0330 Frequency Shared:
					${plan.d0210D0330FrequencyShared }</div>
			</div>
			<div class="row">
				<h5>Preventive</h5>
				<div class="col-12">Adult Prophylaxis (D1110):
					${plan.d1110Frequency }</div>
				<div class="col-12">Child Prophylaxis (D1120):
					${plan.d1120Frequency }</div>
				<div class="col-12">
					<br>
				</div>
				<div class="col-12">D1110 Frequency Increased for Diabetes:
					${plan.d1110FrequencyIncreasedDiabetes }</div>
				<div class="col-12">D1110 Frequency Increased for Pregnancy:
					${plan.d1110FrequencyIncreasedPregnancy }</div>
				<div class="col-12">
					<br>
				</div>
				<div class="col-6">Fluoride Varnish (D1206):
					${plan.d1206Frequency }</div>
				<div class="col-6">Fluoride Through Age:
					${plan.d1206ThroughAge }</div>
				<div class="col-12">
					<br>
				</div>
				<div class="col-6">Sealants (D1351): ${plan.sealantsFrequency }</div>
				<div class="col-6">Sealants Through Age:
					${plan.sealantsThroughAge }</div>
			</div>
			<div class="row">
				<h5>Periodontics</h5>
				<div class="col-12">Scale and Root Plane, 4+ teeth (D4341):
					${plan.d4341Frequency }</div>
				<div class="col-12">Scale and Root Plane, 1-3 teeth (D4342):
					${plan.d4342Frequency }</div>
				<div class="col-12">Periodontal Maintenance (D4910):
					${plan.d4910Frequency }</div>
			</div>
			<div class="row">
				<h5>Prosthetics</h5>
				<div class="col-12">Removable Prosthetics:
					${plan.removableProstheticFrequency }</div>
				<div class="col-12">Fixed Prosthetics:
					${plan.fixedProstheticFrequency }</div>
			</div>
			<div class="row">
				<h5>Adjunct Services</h5>
				<div class="col-12">Occlusal Guard (D9944):
					${plan.d9944Frequency }</div>
				<div class="col-12">D9944 Covered for Bruxism Only:
					${plan.d9944CoverageForBruxismOnly }</div>
				<div class="col-12">Palliative Treatment (D9110) - Basic or Preventive: 
					${plan.d9110BasicOrPreventive }</div>
			</div>
			<hr />
			<h3>Coverage</h3>
			<div class="row">
				<div class="col-12">Preventive:
					${plan.preventiveCoveragePercentage }%</div>
				<div class="col-12">Basic: ${plan.basicCoveragePercentage }%</div>
				<div class="col-12">Major: ${plan.majorCoveragePercentage }%</div>
				<div class="col-12">Extraction:
					${plan.extractionCoveragePercentage }%</div>
				<div class="col-12">
					<br>
				</div>
				<div class="col-3">Endo Basic or Major: ${plan.endoBasicOrMajor }</div>
				<div class="col-1">
					<div class="vr"></div>
				</div>
				<div class="col-3">Perio Basic or Major: ${plan.perioBasicOrMajor }</div>
				<div class="col-1">
					<div class="vr"></div>
				</div>
				<div class="col-3">Crowns Basic or Major: ${plan.crownsBasicOrMajor }</div>
				<div class="col-12">
					<br>
				</div>
				<div class="col-12">Cone Beam CT (D0366): ${plan.d0366CoveragePercentage }%</div>
				<div class="col-12">
					<br>
				</div>
				<div class="col-12">Fluoride Varnish (D1206): ${plan.d1206CoveragePercentage }%</div>
				<div class="col-12">
					<br>
				</div>
				<div class="col-12">Sealants: ${plan.sealantsCoveragePercentage }%</div>
				<div class="col-12">Covered on Primary Incisors: ${plan.sealantsCoveragePrimaryIncisors }</div>
				<div class="col-12">Covered on Primary Molars: ${plan.sealantsCoveragePrimaryMolars }</div>
				<div class="col-12">Covered on Permanent Incisors: ${plan.sealantsCoveragePermanentIncisors }</div>
				<div class="col-12">Covered on Permanent Premolars: ${plan.sealantsCoveragePermanentPremolars }</div>
				<div class="col-12">Covered on Permanent First Molars: ${plan.sealantsCoveragePermanentFirstMolars}</div>
				<div class="col-12">Covered on Permanent Second Molars: ${plan.sealantsCoveragePermanentSecondMolars }</div>
				<div class="col-12">Covered on Permanent Third Molars: ${plan.sealantsCoveragePermanentThirdMolars }</div>
				<div class="col-12">
					<br>
				</div>
				<div class="col-12">Local Antibiotic Delivery (D4381): ${plan.d4381CoveragePercentage }%</div>
				<div class="col-12">
					<br>
				</div>
				<div class="col-12">Implants: ${plan.implantsCoveragePercentage }%</div>
				<div class="col-12">Implant Supported Crown (D6058): ${plan.d6058CoveragePercentage }%</div>
				<div class="col-12">
					<br>
				</div>
				<div class="col-12">Bone Replacement Graft for Ridge Preservation (D7953): ${plan.d7953CoveragePercentage }%</div>
				<div class="col-12">D7953 Covered with Implant Only: ${plan.d7953CoverageWithImplantOnly }</div>
				<div class="col-12">
					<br>
				</div>
				<div class="col-12">Occlusal Guard (D9944): ${plan.d9944CoveragePercentage }%</div>
			</div>
			<hr/>
			<h3>Orthodontics</h3>
			<div class="row">
				<div class="col-6">Maximum Coverage: $${plan.orthoMaximumCoverage }</div>
				<div class="col-6">Through Age: ${plan.orthoAgeLimit }</div>
			</div>
			<hr/>
			<h3>Miscellaneous</h3>
			<div class="row">
				<div class="col-12">Posterior Composites Downgraded: ${plan.posteriorCompositesDowngraded }</div>
				<div class="col-12">Usual Customary Rates: ${plan.usualCustomaryRates }</div>
				<div class="col-12">Missing Tooth Clause: ${plan.missingToothClause }</div>
			</div>
		</div>
	</div>
</body>
<footer><br></footer>
</html>
