/**
* Entity Catalog ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_2T30.sD.uKE.eWST.v.f.f.k.uT.y.bA-content.html">Entity Catalog ABE</a> 
* The Entity Catalog ABE represents specifications and entities and thei 
* r attributes, and associations for EntityCatalogSpecification, Federat 
* edCatalogSpecification, EntityCatalog, and FederatedCatalog. 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.catalog_abe.entity_catalog_business_entity ;

import org.tmforum.common_business_entities_domain.catalog_business_entity.Catalog;

import java.util.List;

/**
* A collection of EntityCatalogItems. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Catalog ABE::Catalog @since SID_R16.5
*/ 

public  class EntityCatalog extends Catalog {



/**  
* Field entityCatalogItem
*/
protected List<EntityCatalogItem> entityCatalogItem ;


}