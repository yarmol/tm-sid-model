/**
* Entity Identification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93F4ACF61022E-content.html">Entity Identification ABE</a> 
* A collection of entities that can be used to dynamicall specify variou 
* s identification formats for any type of entity and to represent ident 
* ification instances associated with entities. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.root_business_entities_abe.entity_identification_business_entity ;

/**
* A type of EntityIdentificationSpec that is formed by aggregating other 
*  EntityIdentificationsSpecs, which may be Composite or Atomic EntityId 
* entificationSpecs. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity Identification ABE::EntityIdentificationSpecification" href="_3E3F0EC000E93F4AD26F01E3-content.html">SID Models::Common Business Entities Domain::Root Business Entities ABE::Entity Identification ABE::EntityIdentificationSpecification</a> @since SID_R16.5
*/ 

public  class CompositeEntityIdentificationSpec extends EntityIdentificationSpecification {



/**  
* Field entityIdentificationSpecification
*/
protected List<EntityIdentificationSpecification> entityIdentificationSpecification ;


}