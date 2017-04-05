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
* A list of ProductOfferings for sale, with prices and illustrations, fo 
* r example in book form or on the web. ProductCatalogs can be used by C 
* ustomers during a self-care ordering process and may be used across on 
* e or more DistributionChannels. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Catalog ABE::Catalog @since SID_R16.5
*/ 

public  class ProductCatalog extends Catalog {



/**  
* Field productCatalogSpecification
*/
protected ProductCatalogSpecification productCatalogSpecification ;




/**  
* Field prodCatProdOffer
*/
protected List<ProdCatProdOffer> prodCatProdOffer ;


}