/**
* Competitor Intelligence ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9414F495500DD-content.html">Competitor Intelligence ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.market_sales_domain.competitor_abe.competitor_intelligence_business_entity ;

/**
* Facts gathered about a Competitor's plans and activities. These facts  
* can be used to perform Competitor SWOT analysis in order to better und 
* erstand a Competitor. 
 @since SID_R16.5
*/ 

public  class CompetitorIntelligence  {



/**  
* Field ID
* A unique identifier for the CompetitorIntelligence. 

*/
protected String ID ;




/**  
* Field description
* A narrative that describes the CompetitorIntelligence. 

*/
protected String description ;




/**  
* Field validFor
* The period during which the CompetitorIntelligence is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field competitorIntelligenceMarketSegment
*/
protected List<CompetitorIntelligenceMarketSegment> competitorIntelligenceMarketSegment ;




/**  
* Field competitor
*/
protected Competitor competitor ;




/**  
* Field productOffering
*/
protected List<ProductOffering> productOffering ;




/**  
* Field competitorIntelCharacteristic
*/
protected List<CompetitorIntelCharacteristic> competitorIntelCharacteristic ;




/**  
* Field competitorIntelCharacteristicValue
*/
protected List<CompetitorIntelCharacteristicValue> competitorIntelCharacteristicValue ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;


}