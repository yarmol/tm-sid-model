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
* ProdCatProdOffer characterizes the membership of a ProductOffering to  
* a ProductCatalog. 
 @since SID_R16.5
*/ 

public  class ProdCatProdOffer  {



/**  
* Field validFor
* The period during which the ProductOffering appears in the ProductCata 

* log. 

*/
protected TimePeriod validFor ;




/**  
* Field productOfferingPrice
*/
protected List<ProductOfferingPrice> productOfferingPrice ;




/**  
* Field productCatalog
*/
protected ProductCatalog productCatalog ;




/**  
* Field productOffering
*/
protected ProductOffering productOffering ;




/**  
* Field entityCatalogItem
*/
protected List<EntityCatalogItem> entityCatalogItem ;


}