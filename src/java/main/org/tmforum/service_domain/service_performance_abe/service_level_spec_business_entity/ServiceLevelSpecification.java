/**
* Service Level Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93EB1D7B80071-content.html">Service Level Spec ABE</a> 
* The Service Specification ABE contains entities that define the invari 
* ant characteristics and behavior of both types of Service entities. Th 
* is enables multiple instances to be derived from a single specificatio 
* n entity. In this derivation, each instance will use the invariant cha 
* racteristics and behavior defined in its associated template.This ABE  
* includes a third type of Service Specification entity: that of a Servi 
* ceLevelSpecification. This type of specification templatizes Services  
* that are bound to a Service Level Agreement. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_performance_abe.service_level_spec_business_entity ;

/**
* A pre-defined or negotiated set of service level objectives, and conse 
* quences that occur, if the objectives are not met. 
 @since SID_R16.5
*/ 

public abstract class ServiceLevelSpecification  {



/**  
* Field serviceSpecification
*/
protected List<ServiceSpecification> serviceSpecification ;




/**  
* Field validFor
* The period during which a ServiceLevelSpecicifcation is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field serviceLevelSpecApplicability
*/
protected List<ServiceLevelSpecApplicability> serviceLevelSpecApplicability ;




/**  
* Field serviceLevelObjective
*/
protected List<ServiceLevelObjective> serviceLevelObjective ;




/**  
* Field serviceLevelSpecConsequence
*/
protected List<ServiceLevelSpecConsequence> serviceLevelSpecConsequence ;




/**  
* Field serviceLevelAgreementItem
*/
protected List<ServiceLevelAgreementItem> serviceLevelAgreementItem ;




/**  
* Field productOffering
*/
protected List<ProductOffering> productOffering ;




/**  
* Field productSpecification
*/
protected List<ProductSpecification> productSpecification ;




/**  
* Field serviceLevelSpecParameter
*/
protected List<ServiceLevelSpecParameter> serviceLevelSpecParameter ;




/**  
* Field serviceLevelSpecificationExpression2
*/
protected List<ServiceLevelSpecExpression> serviceLevelSpecificationExpression2 ;




/**  
* Field partyRoleProductSpecification
*/
protected List<PartyRoleProductSpecification> partyRoleProductSpecification ;




/**  
* Field partyRoleProductOffering
*/
protected List<PartyRoleProductOffering> partyRoleProductOffering ;


}