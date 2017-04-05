/**
* Service Catalog ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_6L.i.m8A.hEE.eK.d772E.jCNG2A-content.html">Service Catalog ABE</a> 
* A collection of entities that represent the specification of ServiceCa 
* talogs and catalogs described by them that contain ServiceSpecificatio 
* ns. 
* @since SID_R16.5
*/

package org.tmforum.service_domain.service_specification_abe.service_catalog_business_entity ;

/**
* A ServiceCatalogSpecification defines attributes shared by all instanc 
* es of related ServiceCatalogs. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Catalog ABE::CatalogSpecification @since SID_R16.5
*/ 

public  class ServiceCatalogSpecification extends CatalogSpecification {



/**  
* Field serviceCatalog
*/
protected List<ServiceCatalog> serviceCatalog ;


}