/**
* Policy Framework ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93E1B4A79039D-content.html">Policy Framework ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.policy_abe.policy_framework_business_entity ;

/**
* This is an abstract class for defining two types of collection classes 
* . PolicyRule collects PolicyEvents, PolicyConditions, and PolicyAction 
* s, while PolicyGroup collects PolicyRules and PolicyGroups.Two importa 
* nt and powerful features of this arrangement are that a PolicySet defi 
* nes a common decision strategy and a common set of PolicyRoles to be u 
* sed by the PolicyGroups and the PolicyRules that inherit from it. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy" href="_3E3F0EC000E93D77E58C0262-content.html">SID Models::Common Business Entities Domain::Policy ABE::Policy Framework ABE::Policy</a> |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity @since SID_R16.5
*/ 

public abstract class PolicySet extends Policy,RootEntity {



/**  
* Field isMandatoryEvaluation
* This is a Boolean attribute that, if TRUE, signifies that evaluation ( 

* and possibly action execution) of this entity is mandatory and must be 

*  attempted. If the Mandatory property value of this entity is FALSE, t 

* hen the evaluation of this entity is considered to be "best effort" an 

* d may be ignored.</br></br>Notes:</br>Not present in the ITU or CIM sp 

* ecs. 

*/
protected Boolean isMandatoryEvaluation ;




/**  
* Field usage
* This is a free-form string attribute that recommends how this policy o 

* bject should be used.</br></br>Notes: Not present in the ITU or CIM sp 

* ecs. 

*/
protected String usage ;




/**  
* Field policySet2
*/
protected List<PolicySet> policySet2 ;




/**  
* Field policySet1
*/
protected PolicySet policySet1 ;




/**  
* Field policySetSpec
*/
protected PolicySetSpec policySetSpec ;




/**  
* Field revenueAssuranceObjective
*/
protected List<RevenueAssuranceObjective> revenueAssuranceObjective ;




/**  
* Field productPrice
*/
protected List<ProductPrice> productPrice ;




/**  
* Field productOffering
*/
protected List<ProductOffering> productOffering ;




/**  
* Field businessInteractionItemPrice
*/
protected List<BusinessInteractionItemPrice> businessInteractionItemPrice ;




/**  
* Field productPricePartyRole
*/
protected List<ProductPricePartyRole> productPricePartyRole ;




/**  
* Field entitySpecCharValueUse
*/
protected List<EntitySpecCharValueUse> entitySpecCharValueUse ;




/**  
* Field configurationSpecification2
*/
protected List<ConfigurationSpecification> configurationSpecification2 ;




/**  
* Field catalogSpecification
*/
protected List<CatalogSpecification> catalogSpecification ;




/**  
* Field revShareModelSpecNegotiableRange
*/
protected List<RevShareModelSpecNegotiableRange> revShareModelSpecNegotiableRange ;




/**  
* Field productOfferingPrice
*/
protected List<ProductOfferingPrice> productOfferingPrice ;


}