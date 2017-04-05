/**
* Catalog ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_AP.lBEI.uCE.eGZ.s.pR.sLEOL2.w-content.html">Catalog ABE</a> 
* A generalized ABE that represents common Catalog Specification and Cat 
* alog entities, attributes, and associations shared (inherited) by comp 
* onents of the Entity, Federated, Product, Service, and Resource Catalo 
* g ABEs. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.catalog_business_entity ;

import org.tmforum.common_business_entities_domain.base_types_business_entity.TimePeriod;

/**
* A relationship between CatalogSpecifications. 
 @since SID_R16.5
*/ 

public  class CatalogSpecificationRelationship  {



/**  
* Field validFor
* The period of time at which a relationship of catalog specifications i 

* s valid. 

*/
protected TimePeriod validFor ;




/**  
* Field type
* A categorization of the relationship, such as supercedes, substitution 

* , dependency, exclusivity. 

*/
protected String type ;




/**  
* Field catalogSpecification
*/
protected CatalogSpecification catalogSpecification ;




/**  
* Field catalogSpecification2
*/
protected CatalogSpecification catalogSpecification2 ;


}