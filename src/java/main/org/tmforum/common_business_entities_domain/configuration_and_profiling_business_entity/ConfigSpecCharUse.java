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
* A type of EntitySpecCharUse that is used to assign a value to an expli 
* citly modeled attribute of an entity.  For example, assigning a value  
* to supportedConnectionRates for a ConnectionTerminationPoint. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Root Business Entities ABE::Characteristic ABE::EntitySpecCharUse @since SID_R16.5
*/ 

public  class ConfigSpecCharUse extends EntitySpecCharUse {



/**  
* Field charIsAnExplicitAttribute
* An indicator that specifies the use of a CharacteristicSpecification i 

* s used to assign a value to an explicitly modeled attribute of an enti 

* ty. 

*/
protected Boolean charIsAnExplicitAttribute ;


}