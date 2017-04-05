/**
* Market Statistic ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9411CCDEE0153-content.html">Market Statistic ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.market_sales_domain.market_segment_abe.market_statistic_business_entity ;

/**
* A type of MarketStatistic that is formed by aggregating other MarketSt 
* atistics, which may be Composite or Atomic MarketStatistics. 

Inheritance tree: |- 
 <a title="SID Models::Market_Sales Domain::Market Segment ABE::Market Statistic ABE::MarketStatistic" href="_3E3F0EC000E9410E928001DC-content.html">SID Models::Market_Sales Domain::Market Segment ABE::Market Statistic ABE::MarketStatistic</a> @since SID_R16.5
*/ 

public  class CompositeMarketStatistic extends MarketStatistic {



/**  
* Field marketStatistic
*/
protected List<MarketStatistic> marketStatistic ;


}