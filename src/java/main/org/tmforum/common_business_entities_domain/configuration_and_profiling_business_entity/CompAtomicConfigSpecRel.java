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
* A type of ConfgSpecRelationship that represents a group of Configurati 
* onSpecifications that are used to configure an ConfigurationSpecificat 
* ion that is made up of other ConfigurationSpecfications. For example,  
* the ConfigurationSpecification for a connection may be composed of the 
*  specification for the connection as well as the specification for con 
* nection termination points that are assigned to the connection. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Configuration and Profiling ABE::ConfigSpecRelationship" href="_5S4F.f.oR3E.eOHC.rP.bIP.kY.wA-content.html">SID Models::Common Business Entities Domain::Configuration and Profiling ABE::ConfigSpecRelationship</a> @since SID_R16.5
*/ 

public  class CompAtomicConfigSpecRel extends ConfigSpecRelationship {



/**  
* Field configSequence
* The order in which a related ConfigurationSpecification that is part o 

* f a group (composite) is to be configured. 

*/
protected Integer configSequence ;




/**  
* Field configAction
* A prescribed action that is taken for a ConfigurationSpecification tha 

* t is part of a group (composite).  For example, "assign" a connection  

* termination point to a connection. 

*/
protected String configAction ;




/**  
* Field configQuantity
* A number that represents how many of a related ConfigurationSpecificat 

* ion in a group (composite) are to be configured. 

*/
protected Integer configQuantity ;


}