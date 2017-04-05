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
* The time of day or days during which a ServiceLevelSpecification, Serv 
* iceLevelObjective, or ServiceLevelSpecConsequence is relent or not. 
 @since SID_R16.5
*/ 

public  class ServiceLevelSpecApplicability  {



/**  
* Field unapplicableApplicableCode
* Indicator that specifies whether an instance represents applicability  

* or un-applicability. 

*/
protected String unapplicableApplicableCode ;




/**  
* Field unappAppDuration
* A period of time representing applicability or un-applicability, for e 

* xample from 8AM to 12PM.</br></br>For an instance either unappAppDurat 

* ion or unappAppDays must have a value. 

*/
protected TimePeriod unappAppDuration ;




/**  
* Field unappAppDays
* A day or days representing applicability or un-applicability, for exam 

* ple 2,3 represents Monday and Tuesday.</br></br>For an instance either 

*  unappAppDuration or unappAppDays must have a value. 

*/
protected String unappAppDays ;




/**  
* Field serviceLevelSpecConsequence
*/
protected List<ServiceLevelSpecConsequence> serviceLevelSpecConsequence ;




/**  
* Field serviceLevelObjective
*/
protected List<ServiceLevelObjective> serviceLevelObjective ;




/**  
* Field serviceLevelSpecification
*/
protected ServiceLevelSpecification serviceLevelSpecification ;




/**  
* Field serviceLevelSpecificationExpression
*/
protected List<ServiceLevelSpecExpression> serviceLevelSpecificationExpression ;


}