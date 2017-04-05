/**
* Entity Catalog ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_2T30.sD.uKE.eWST.v.f.f.k.uT.y.bA-content.html">Entity Catalog ABE</a> 
* The Entity Catalog ABE represents specifications and entities and thei 
* r attributes, and associations for EntityCatalogSpecification, Federat 
* edCatalogSpecification, EntityCatalog, and FederatedCatalog. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.catalog_abe.entity_catalog_business_entity ;

/**
* A relationship between Catalogs. 
 @since SID_R16.5
*/ 

public  class CatalogRelationship  {



/**  
* Field type
* A categorization of the relationship, such as supercedes, substitution 

* , dependency, exclusivity. 

*/
protected String type ;




/**  
* Field validFor
* The period of time at which a relationship between catalogs is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field catalog
*/
protected Catalog catalog ;




/**  
* Field catalog2
*/
protected Catalog catalog2 ;


}