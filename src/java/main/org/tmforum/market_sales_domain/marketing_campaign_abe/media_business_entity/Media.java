/**
* Media ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E94149BB21022F-content.html">Media ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.market_sales_domain.marketing_campaign_abe.media_business_entity ;

/**
* A mechanism by which MarketingCampaigns, ProductPromotions, and Produc 
* tPlacements can be launched into the marketplace. It describes such me 
* chanisms as the press, radio, trade shows, internet, and so forth. It  
* is also used to advertise other provider ProductPromotions and Product 
* Placements. 
 @since SID_R16.5
*/ 

public  class Media  {



/**  
* Field marketingCampaign
*/
protected List<MarketingCampaign> marketingCampaign ;




/**  
* Field ID
* A unique identifier for the Media. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which a Media is known and distinguished fr 

* om other Media.</br></br> 

*/
protected String name ;




/**  
* Field description
* A narrative that explains what the Media is. 

*/
protected String description ;




/**  
* Field validFor
* The period during which the Media is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field productPlacement
*/
protected List<ProductPlacement> productPlacement ;




/**  
* Field productPromotion
*/
protected List<ProductPromotion> productPromotion ;


}