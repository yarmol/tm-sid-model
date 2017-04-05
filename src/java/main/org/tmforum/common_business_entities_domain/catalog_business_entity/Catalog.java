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
import org.tmforum.common_business_entities_domain.catalog_abe.entity_catalog_business_entity.CatalogRelationship;
import org.tmforum.common_business_entities_domain.catalog_abe.entity_catalog_business_entity.FederatedCatalog;
import org.tmforum.common_business_entities_domain.catalog_abe.federated_catalog_business_entity.CatalogDecorator;
import org.tmforum.common_business_entities_domain.root_business_entities_abe.characteristic_business_entity.CharacteristicValue;
import org.tmforum.engaged_party_domain.party_business_entity.PartyRole;

import java.util.List;

/**
* A catalog can be defined as a collation of items and arranging them in 
*  a particular manner based on the need. In the information framework p 
* oint, it is as collection of entities. A catalog presentation can be i 
* n book form or web form. 
 @since SID_R16.5
*/ 

public abstract class Catalog  {



/**  
* Field ID
* A unique identifier for a catalog. 

*/
protected String ID ;




/**  
* Field type
* A categorization of an entry in the catalog such as web or book. 

*/
protected String type ;




/**  
* Field validFor
* The period of time during which the catalog is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field catalogSpecification
*/
protected CatalogSpecification catalogSpecification ;




/**  
* Field characteristicValue
*/
protected List<CharacteristicValue> characteristicValue ;




/**  
* Field name
* A word or phrase by which a catalog is known and distinguished from ot 

* her catalogs. 

*/
protected String name ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;




/**  
* Field catalogDecorator
*/
protected CatalogDecorator catalogDecorator ;




/**  
* Field federatedCatalog
*/
protected List<FederatedCatalog> federatedCatalog ;




/**  
* Field catalogRelationship
*/
protected List<CatalogRelationship> catalogRelationship ;




/**  
* Field catalogRelationship2
*/
protected List<CatalogRelationship> catalogRelationship2 ;




/**  
* Field version
* The version given to this catalog instance. This may include subfileds 

*  like major and minor which are separated by a period delimiter. 

*/
protected String version ;




/**  
* Field lifecycleStatus
* The condition of the catalog, such as active,testing, published 

*/
protected String lifecycleStatus ;


}