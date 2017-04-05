/**
* Service Catalog ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_6L.i.m8A.hEE.eK.d772E.jCNG2A-content.html">Service Catalog ABE</a> 
* A collection of entities that represent the specification of ServiceCa 
* talogs and catalogs described by them that contain ServiceSpecificatio 
* ns. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_specification_abe.service_catalog_business_entity ;

import org.tmforum.common_business_entities_domain.base_types_business_entity.TimePeriod;
import org.tmforum.common_business_entities_domain.catalog_abe.entity_catalog_business_entity.EntityCatalogItem;
import org.tmforum.product_domain.product_offering_business_entity.ProductOffering;
import org.tmforum.resource_domain.resource_specification_abe.resource_catalog_business_entity.ResourceCandidate;
import org.tmforum.service_domain.service_abe.customer_facing_service_business_entity.CustomerFacingService;
import org.tmforum.service_domain.service_abe.resource_facing_service_business_entity.ResourceFacingService;
import org.tmforum.service_domain.service_specification_business_entity.ServiceSpecification;

import java.util.List;

/**
* A ServiceCandidate is an entity that makes a ServiceSpecification avai 
* lable to a catalog. A ServiceCandidate and its associated ServiceSpeci 
* fication may be “published” (made visible) in any number of ServiceCat 
* alogs, or in none.  One ServiceSpecification can be composed of other  
* ServiceSpecifications.  These ServiceSpecifications may also be publis 
* hed.  
 @since SID_R16.5
*/ 

public  class ServiceCandidate  {



/**  
* Field customerFacingService
*/
protected CustomerFacingService customerFacingService ;




/**  
* Field resourceFacingService
*/
protected ResourceFacingService resourceFacingService ;




/**  
* Field serviceSpecification
*/
protected ServiceSpecification serviceSpecification ;




/**  
* Field ID
* A unique identifier for the ServiceCandidate. 

*/
protected String ID ;




/**  
* Field name
* A word or phrase that a ServiceCandidate is known and distinguished fr 

* om other ServiceCandidate. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains the ServiceCandidate. 

*/
protected String description ;




/**  
* Field validFor
* The period of time during which the ServiceCandidate is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field status
* The condition at which the ServiceCandidate exists such as planned, ac 

* tive and Obsolete. 

*/
protected String status ;




/**  
* Field resourceCandidate
*/
protected List<ResourceCandidate> resourceCandidate ;




/**  
* Field productOffering2
*/
protected List<ProductOffering> productOffering2 ;




/**  
* Field servicecatalog
*/
protected List<ServiceCatalog> servicecatalog ;




/**  
* Field entityCatalogItem
*/
protected List<EntityCatalogItem> entityCatalogItem ;


}