/**
* Competitor Intelligence ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9414F495500DD-content.html">Competitor Intelligence ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.market_sales_domain.competitor_abe.competitor_intelligence_business_entity ;

/**
* A MarketSegment in which a Competitor makes ProductOfferings available 
* . 
 @since SID_R16.5
*/ 

public  class CompetitorIntelligenceMarketSegment  {



/**  
* Field plannedEntryDate
* The date on which the Competitor intends to begin making ProductOfferi 

* ngs available to a MarketSegment. 

*/
protected DateTime plannedEntryDate ;




/**  
* Field plannedSpending
* The amount of money that a Competitor intends on spending make Product 

* Offerings available in a MarketSegment. 

*/
protected Money plannedSpending ;




/**  
* Field plannedMarketCoverage
* A percent or description that describes the degree to which a Competit 

* or will/does/has extend into a MarketSegment. 

*/
protected String plannedMarketCoverage ;




/**  
* Field rank
* The degree of importance or excellence of a Competitor in a MarketSegm 

* ent relative to other Competitors in the MarketSegment. 

*/
protected Integer rank ;




/**  
* Field marketSegment
*/
protected MarketSegment marketSegment ;




/**  
* Field competitorIntelligence
*/
protected CompetitorIntelligence competitorIntelligence ;


}