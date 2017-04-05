/**
* Marketing Campaign ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9410A56D3037D-content.html">Marketing Campaign ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.market_sales_domain.marketing_campaign_business_entity ;

/**
* A type of MarketingCampaignCharacteristic that is formed by aggregatin 
* g other MarketingCampaignCharacteristic, which may be Composite or Ato 
* mic MarketingCampaignCharacteristic. 

Inheritance tree: |- 
 <a title="SID Models::Market_Sales Domain::Marketing Campaign ABE::MarketingCampaignCharacteristic" href="_3E3F0EC000E94149D3E2009E-content.html">SID Models::Market_Sales Domain::Marketing Campaign ABE::MarketingCampaignCharacteristic</a> @since SID_R16.5
*/ 

public  class CompositeMarketingCampaignCharacteristic extends MarketingCampaignCharacteristic {



/**  
* Field marketingCampaignCharacteristic
*/
protected List<MarketingCampaignCharacteristic> marketingCampaignCharacteristic ;


}