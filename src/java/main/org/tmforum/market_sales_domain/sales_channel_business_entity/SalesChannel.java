/**
* Sales Channel ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D6B8CB10073-content.html">Sales Channel ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.market_sales_domain.sales_channel_business_entity ;

/**
* A means by which a ServiceProvider makes available and sells ProductOf 
* ferings to the market. SalesChannels include DirectSalesForce, SalesAg 
* ents, TeleMarketers, and AlternateChannels. 
 @since SID_R16.5
*/ 

public  class SalesChannel  {



/**  
* Field marketSegment
*/
protected List<MarketSegment> marketSegment ;




/**  
* Field marketStatistic
*/
protected List<MarketStatistic> marketStatistic ;




/**  
* Field marketingCampaign
*/
protected List<MarketingCampaign> marketingCampaign ;




/**  
* Field productOffering
*/
protected List<ProductOffering> productOffering ;




/**  
* Field productCatalogSpecification
*/
protected List<ProductCatalogSpecification> productCatalogSpecification ;




/**  
* Field allowedProductAction
*/
protected List<AllowedProductAction> allowedProductAction ;


}