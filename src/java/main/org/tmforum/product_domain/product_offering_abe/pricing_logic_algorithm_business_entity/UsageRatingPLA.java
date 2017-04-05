/**
* Pricing Logic Algorithm ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_T.r5BABP5E.d-O57.wBCB.zL.fA-content.html">Pricing Logic Algorithm ABE</a> 
* The PricingLogicAlgorithm ABE contains entities representing an instan 
* tiation of an interface specification to external rating function (wit 
* hout a modeled bahavior in SID). 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_abe.pricing_logic_algorithm_business_entity ;

/**
* PLA that rates ProductUsage events and generates type of AppliedCustom 
* erBillingProductUsageRate 

Inheritance tree: |- 
 <a title="SID Models::Product Domain::Product Offering ABE::Pricing Logic Algorithm ABE::PricingLogicAlgorithm" href="_ZJ.gD.wBP6E.d-O57.wBCB.zL.fA-content.html">SID Models::Product Domain::Product Offering ABE::Pricing Logic Algorithm ABE::PricingLogicAlgorithm</a> @since SID_R16.5
*/ 

public  class UsageRatingPLA extends PricingLogicAlgorithm {



/**  
* Field usage
*/
protected List<Usage> usage ;


}