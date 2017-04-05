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
* One or more attributes (not attribute values) used to recognize (ident 
* ify) an instance of an entity. 
 @since SID_R16.5
*/ 

public abstract class EntityIdentificationSpecification  {



/**  
* Field name
* A word, term, or phrase by which the EntityIdentificationSpecification 

*  is known and distinguished from other EntityIdentificationSpecificati 

* ons. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains what the EntityIdentificationSpecification i 

* s. 

*/
protected String description ;




/**  
* Field validFor
* The period during which the entity is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field compositeEntityIdentificationSpec
*/
protected List<CompositeEntityIdentificationSpec> compositeEntityIdentificationSpec ;




/**  
* Field rootEntityType
*/
protected List<RootEntityType> rootEntityType ;




/**  
* Field entityIdentification
*/
protected List<EntityIdentification> entityIdentification ;




/**  
* Field entitySpecification
*/
protected List<EntitySpecification> entitySpecification ;


}