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
import org.tmforum.common_business_entities_domain.catalog_abe.entity_catalog_business_entity.FederatedCatalogSpecification;
import org.tmforum.common_business_entities_domain.policy_abe.policy_framework_business_entity.PolicySet;
import org.tmforum.common_business_entities_domain.root_business_entities_abe.characteristic_business_entity.EntitySpecCharUse;
import org.tmforum.common_business_entities_domain.root_business_entities_business_entity.EntitySpecificationType;

import java.util.List;

/**
* A set of basic facts that defines, or specifies, what a catalog is, su 
* ch as its name, description, and so forth. 
 @since SID_R16.5
*/ 

public abstract class CatalogSpecification  {



/**  
* Field catalog
*/
protected List<Catalog> catalog ;




/**  
* Field ID
* A unique identifier for a CatalogSpecification. 

*/
protected String ID ;




/**  
* Field name
* A word or phrase by which a CatalogSpecification is known and distingu 

* ished from other CatalogSpecifications. 

*/
protected String name ;




/**  
* Field validFor
* The period during which the CatalogSpecification is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field entitySpecCharUse
*/
protected List<EntitySpecCharUse> entitySpecCharUse ;




/**  
* Field description
* A narrative that explains the catalogSpecification. 

*/
protected String description ;




/**  
* Field policySet
*/
protected List<PolicySet> policySet ;




/**  
* Field federatedCatalogSpecification
*/
protected List<FederatedCatalogSpecification> federatedCatalogSpecification ;




/**  
* Field entitySpecificationType
*/
protected List<EntitySpecificationType> entitySpecificationType ;




/**  
* Field catalogSpecificationRelationship
*/
protected List<CatalogSpecificationRelationship> catalogSpecificationRelationship ;




/**  
* Field catalogSpecificationRelationship2
*/
protected List<CatalogSpecificationRelationship> catalogSpecificationRelationship2 ;




/**  
* Field version
* The version given to this specification. This may include subfileds li 

* ke major and minor which are separated by a period delimiter. 

*/
protected String version ;




/**  
* Field lifecycleStatus
* The condition of the catalog specification, such as active, testing, p 

* ublished 

*/
protected String lifecycleStatus ;


}