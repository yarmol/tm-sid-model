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

public  class ConfigSpecConstraintMember  {



/**  
* Field sequence
* The order in which a ConfigSpecConstraintMember appears within a Confi 

* gurationSpecConstraint. 

*/
protected Integer sequence ;




/**  
* Field operator
* A mathematical symbol, term, or other entity that describes an operati 

* on. 

*/
protected String operator ;




/**  
* Field delimiter
* A character used to define the boundary between two separate members. 

*/
protected String delimiter ;




/**  
* Field configurationSpecConstraint
*/
protected ConfigurationSpecConstraint configurationSpecConstraint ;




/**  
* Field entitySpecCharValueUse
*/
protected EntitySpecCharValueUse entitySpecCharValueUse ;


}