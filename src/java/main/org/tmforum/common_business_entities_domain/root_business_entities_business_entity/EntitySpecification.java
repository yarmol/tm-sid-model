/**
* Root Business Entities ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93CF68FE80295-content.html">Root Business Entities ABE</a> 
* A set of common business entities that collectively serve as the found 
* ation of the business view. This set of entities enables the entities  
* in different domains of the SID Framework to be associated with each o 
* ther, providing greater overall coherence to the information framework 
* . 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.root_business_entities_business_entity ;

/**
* This is an abstract base class that is used to define the common chara 
* cteristics (attributes, constraints, and relationships) of a managed o 
* r unmanaged entity. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity" href="_3E3F0EC000E93CDA9E0C0384-content.html">SID Models::Common Business Entities Domain::Root Business Entities ABE::RootEntity</a> @since SID_R16.5
*/ 

public abstract class EntitySpecification extends RootEntity {



/**  
* Field entityIdentificationSpecification
*/
protected List<EntityIdentificationSpecification> entityIdentificationSpecification ;




/**  
* Field entitySpecCharUse
*/
protected List<EntitySpecCharUse> entitySpecCharUse ;




/**  
* Field metricDefinition
*/
protected List<MetricDefinition> metricDefinition ;




/**  
* Field entitySpecificationAttachment
*/
protected List<EntitySpecificationAttachment> entitySpecificationAttachment ;




/**  
* Field externalSystemCapability
*/
protected List<ExternalSystemCapability> externalSystemCapability ;




/**  
* Field entitySpecificationAction
*/
protected List<EntitySpecificationAction> entitySpecificationAction ;


}