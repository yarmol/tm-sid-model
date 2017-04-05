/**
* Configuration and Profiling ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_5R.a.s0IR3E.eOHC.rP.bIP.kY.wA-content.html">Configuration and Profiling ABE</a> 
* A Configuration (also referred to as a Profile) defines how a Resource 
* , Service, or Product operates or functions. A Configuration may conta 
* in one or more parts (which is realized by using the Atomic/Composite  
* pattern, but it is represented as a single entity - ConfigurationRelat 
* ionship), and each part may contain zero or more fields. Each field ma 
* y have attributes that are statically or dynamically defined. Some of  
* these fields have fixed values, while others provide values from which 
*  a choice or choices can be made (e.g., using the EntitySpec/Entity an 
* d/or CharacteristicSpec/CharacteristicValue patterns). 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.configuration_and_profiling_business_entity ;

/**
* An element of a rule defined by a EntitySpecValueUse used to determine 
*  a where a ConfigurationSpecification should be used to configure a Pr 
* oduct, Service, or Resource. 
 @since SID_R16.5
*/ 

public  class ConfigurationSpecConstraint  {



/**  
* Field name
* A word, term, or phrase by which the ConfigurationSpecConstraint is kn 

* own and distinguished from other ConfigurationSpecConstraints. 

*/
protected String name ;




/**  
* Field validFor
* The period for which the ConfigurationSpecConstraint is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field configurationSpecification
*/
protected ConfigurationSpecification configurationSpecification ;




/**  
* Field configSpecConstraintMember
*/
protected List<ConfigSpecConstraintMember> configSpecConstraintMember ;




/**  
* Field configurationSpecification2
*/
protected List<ConfigurationSpecification> configurationSpecification2 ;




/**  
* Field entitySpecCharValueUse2
*/
protected List<EntitySpecCharValueUse> entitySpecCharValueUse2 ;


}