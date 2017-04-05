/**
* Entity Catalog ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_2T30.sD.uKE.eWST.v.f.f.k.uT.y.bA-content.html">Entity Catalog ABE</a> 
* The Entity Catalog ABE represents specifications and entities and thei 
* r attributes, and associations for EntityCatalogSpecification, Federat 
* edCatalogSpecification, EntityCatalog, and FederatedCatalog. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.catalog_abe.entity_catalog_business_entity ;

import org.tmforum.common_business_entities_domain.root_business_entities_business_entity.RootEntity;
import org.tmforum.product_domain.product_offering_abe.product_catalog_business_entity.ProdCatProdOffer;
import org.tmforum.resource_domain.resource_specification_abe.resource_catalog_business_entity.ResourceCandidate;
import org.tmforum.service_domain.service_specification_abe.service_catalog_business_entity.ServiceCandidate;

/**
* An item, such as an Entity, EntitySpecification, ProductOffering, Serv 
* iceCandidate, or ResourceCandidate that appears in a EntityCatalog. 
 @since SID_R16.5
*/ 

public  class EntityCatalogItem  {



/**  
* Field entityCatalog
*/
protected EntityCatalog entityCatalog ;




/**  
* Field rootEntity
*/
protected RootEntity rootEntity ;




/**  
* Field prodCatProdOffer
*/
protected ProdCatProdOffer prodCatProdOffer ;




/**  
* Field serviceCandidate
*/
protected ServiceCandidate serviceCandidate ;




/**  
* Field resourceCandidate
*/
protected ResourceCandidate resourceCandidate ;


}