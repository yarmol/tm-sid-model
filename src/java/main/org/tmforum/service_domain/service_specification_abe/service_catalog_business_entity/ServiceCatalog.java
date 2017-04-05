/**
* Service Catalog ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_6L.i.m8A.hEE.eK.d772E.jCNG2A-content.html">Service Catalog ABE</a> 
* A collection of entities that represent the specification of ServiceCa 
* talogs and catalogs described by them that contain ServiceSpecificatio 
* ns. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_specification_abe.service_catalog_business_entity ;

import com.sun.org.apache.xml.internal.resolver.Catalog;

import java.util.List;

/**
* A ServiceCatalog is a collection of ServiceCandidates representing Ser 
* viceSpecifications.  ServiceCandidates define the underlying services  
* that support a ProductOffering.  ServiceCandidates are exposed to one  
* or more Product Catalogs to be utilized to configure one or more Produ 
* ctOfferings.  ServiceCandidates can be exposed to one or more Service  
* Catalogs to be utilized or incorporated in one or more ServiceCandidat 
* es.  A collection may consist of similar ServiceCandidates, such as a  
* collection of broadband ServiceCatalogCandidates or a collection of wi 
* reless ServiceCatalogCandidates. A Service Catalog contents can expose 
*  a collection of ServiceCandidates to be utilized internal/external to 
*  an enterprise. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Catalog ABE::Catalog @since SID_R16.5
*/ 

public  class ServiceCatalog extends Catalog {



/**  
* Field serviceCatalogSpecification
*/
protected ServiceCatalogSpecification serviceCatalogSpecification ;




/**  
* Field servicecandidate
*/
protected List<ServiceCandidate> servicecandidate ;


}