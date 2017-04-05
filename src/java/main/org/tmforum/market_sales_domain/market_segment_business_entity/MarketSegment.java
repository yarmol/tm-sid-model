/**
* Market Segment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93C8FA94B00C4-content.html">Market Segment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.market_sales_domain.market_segment_business_entity ;

/**
* A grouping of Parties, GeographicAreas, SalesChannels, and so forth. M 
* arketSegments are the target of MarketingCampaigns, ProductOfferings,  
* ProductPromotions, ProductPlacements, and ProductPrograms from both in 
* ternal and external (Competitors, and other Providers) perspective. 
 @since SID_R16.5
*/ 

public abstract class MarketSegment  {



/**  
* Field ID
* A unique identifier for the MarketSegment. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which a MarketSegment is known and distingu 

* ished from other MarketSegments.</br></br> 

*/
protected String name ;




/**  
* Field description
* A narrative that explains what the MarketSegment is. 

*/
protected String description ;




/**  
* Field marketSegmentCategory
* A classification of MarketSegments because they share common character 

* istics. For example a vertical or horizontal MarketSegment. Vertical M 

* arketSegments put a PartyRole in a single segment, while a PartyRole c 

* an exist in multiple horizontal MarketSegments</br></br> 

*/
protected String marketSegmentCategory ;




/**  
* Field marketSegmentSubCategory
*/
protected String marketSegmentSubCategory ;




/**  
* Field validFor
* The period during which the MarketSegment is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field geographicArea
*/
protected List<GeographicArea> geographicArea ;




/**  
* Field partyProfileType
*/
protected List<PartyProfileType> partyProfileType ;




/**  
* Field salesChannel
*/
protected List<SalesChannel> salesChannel ;




/**  
* Field marketSegmentCharacteristic
*/
protected List<MarketSegmentCharacteristic> marketSegmentCharacteristic ;




/**  
* Field compositeMarketSegment
*/
protected List<CompositeMarketSegment> compositeMarketSegment ;




/**  
* Field marketSegmentCharacteristicValue
*/
protected List<MarketSegmentCharacteristicValue> marketSegmentCharacteristicValue ;




/**  
* Field churnRetentionStatistic
*/
protected List<ChurnRetentionStatistic> churnRetentionStatistic ;




/**  
* Field productOffering
*/
protected List<ProductOffering> productOffering ;




/**  
* Field partyDemographic
*/
protected List<PartyDemographic> partyDemographic ;




/**  
* Field marketStatistic
*/
protected List<MarketStatistic> marketStatistic ;




/**  
* Field competitor
*/
protected List<Competitor> competitor ;




/**  
* Field competitorMarketSegmentSWOT
*/
protected List<CompetitorMarketSegmentSWOT> competitorMarketSegmentSWOT ;




/**  
* Field competitorIntelligenceMarketSegment
*/
protected List<CompetitorIntelligenceMarketSegment> competitorIntelligenceMarketSegment ;




/**  
* Field competitorProductCorrelation
*/
protected List<CompetitorProductCorrelation> competitorProductCorrelation ;




/**  
* Field marketingCampaign
*/
protected List<MarketingCampaign> marketingCampaign ;


}