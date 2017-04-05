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
* A ResourceCatalog is a collection of ResourceCandidates representing R 
* esourceSpecifications.  ResourceCandidates define the underlying resou 
* rces.  ResourceCandidates can be exposed to one or more ResourceCatalo 
* gs to be utilized to configure or incorporated in one or more ServiceC 
* andidates or ProductOfferings.   A ResourceCatalog contents can expose 
*  a collection of ResourceCandidates to be utilized internal/external t 
* o an enterprise. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Catalog ABE::Catalog @since SID_R16.5
*/ 

public  class ResourceCatalog extends Catalog {



/**  
* Field resourceCatalogSpecification
*/
protected ResourceCatalogSpecification resourceCatalogSpecification ;




/**  
* Field resourcecandidate
*/
protected List<ResourceCandidate> resourcecandidate ;


}