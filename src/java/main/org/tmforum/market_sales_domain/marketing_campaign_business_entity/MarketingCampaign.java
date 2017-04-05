/**
* Marketing Campaign ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9410A56D3037D-content.html">Marketing Campaign ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.market_sales_domain.marketing_campaign_business_entity ;

/**
* A depiction of how the launch or re-launch of a ProductOffering is or  
* will be undertaken. 
 @since SID_R16.5
*/ 

public  class MarketingCampaign  {



/**  
* Field ID
* A unique identifier for the MarketingCampaign. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which a MarketingCampaign is known and dist 

* inguished from other MarketingCampaigns. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains what the MarketingCampaign is. 

*/
protected String description ;




/**  
* Field mcType
* A categorization of a MarketingCampaign, such as new or re-launch. 

*/
protected String mcType ;




/**  
* Field validFor
* The period during which the MarketingCampaign is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field media
*/
protected List<Media> media ;




/**  
* Field marketingCampaignCharacteristic
*/
protected List<MarketingCampaignCharacteristic> marketingCampaignCharacteristic ;




/**  
* Field marketingCampaignCharacteristicValue
*/
protected List<MarketingCampaignCharacteristicValue> marketingCampaignCharacteristicValue ;




/**  
* Field marketSegment
*/
protected List<MarketSegment> marketSegment ;




/**  
* Field salesChannel
*/
protected List<SalesChannel> salesChannel ;




/**  
* Field partyProfileType
*/
protected List<PartyProfileType> partyProfileType ;




/**  
* Field partyRoleType
*/
protected List<PartyRoleSpecification> partyRoleType ;




/**  
* Field churnRetentionStatistic
*/
protected List<ChurnRetentionStatistic> churnRetentionStatistic ;




/**  
* Field productPromotion
*/
protected List<ProductPromotion> productPromotion ;




/**  
* Field productOfferingStrategy
*/
protected List<ProductOfferingStrategy> productOfferingStrategy ;




/**  
* Field productCatalogSpecification
*/
protected List<ProductCatalogSpecification> productCatalogSpecification ;


}