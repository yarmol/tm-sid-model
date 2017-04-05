/**
* Resource Catalog ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_OC.mQ8A.hFE.eK.d772E.jCNG2A-content.html">Resource Catalog ABE</a> 
* A collection of entities that represent the specification of ResourceC 
* atalogs and catalogs described by them that contain ResourceSpecificat 
* ions. 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_specification_abe.resource_catalog_business_entity ;

/**
* A ResourceCandidate is an entity that enables the ResourceSpecificatio 
* ns to a catalog. A ResourceCandidate and its ResourceSpecification may 
*  be “published” - made visible - in any number of ResourceCatalogs, or 
*  in none.  One ResourceSpecification can be composed of other Resource 
* Specifications. 
 @since SID_R16.5
*/ 

public  class ResourceCandidate  {



/**  
* Field resourceSpecification
*/
protected ResourceSpecification resourceSpecification ;




/**  
* Field ID
* A unique identifier for the ResourceCandidate. 

*/
protected String ID ;




/**  
* Field name
* The word or phrase by which a ResourceCandidate is known and distingui 

* shed from other ResourceCandidate. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains the ResourceCandidate. 

*/
protected String description ;




/**  
* Field validFor
* The period of time during which the ResourceCandidate is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field status
* The condition in which the ResourceCandidate exists such as Planned, A 

* ctive or Obsolete. 

*/
protected String status ;




/**  
* Field serviceCandidate
*/
protected List<ServiceCandidate> serviceCandidate ;




/**  
* Field productOffering
*/
protected List<ProductOffering> productOffering ;




/**  
* Field resourcecatalog
*/
protected List<ResourceCatalog> resourcecatalog ;




/**  
* Field entityCatalogItem
*/
protected List<EntityCatalogItem> entityCatalogItem ;


}