/**
* Product Catalog ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E942F8C6CF0095-content.html">Product Catalog ABE</a> 
* A collection of entities that represent the specification of ProductCa 
* talogs and catalogs described by them that contain ProductOfferings an 
* d their associated ProductOfferingPrices. 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_offering_abe.product_catalog_business_entity ;

/**
* A ProductCatalogSpecification defines the invariant characteristics of 
*  a ProductCatalog. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Catalog ABE::CatalogSpecification @since SID_R16.5
*/ 

public  class ProductCatalogSpecification extends CatalogSpecification {



/**  
* Field geographicArea
*/
protected List<GeographicArea> geographicArea ;




/**  
* Field marketingCampaign
*/
protected List<MarketingCampaign> marketingCampaign ;




/**  
* Field salesChannel
*/
protected List<SalesChannel> salesChannel ;




/**  
* Field productCatalog
*/
protected List<ProductCatalog> productCatalog ;


}