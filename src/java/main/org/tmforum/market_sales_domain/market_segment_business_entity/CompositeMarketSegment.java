/**
* Market Segment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93C8FA94B00C4-content.html">Market Segment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.market_sales_domain.market_segment_business_entity ;

/**
* A type of MarketSegment that is formed by aggregating other MarketSegm 
* ents, which may be Composite or Atomic MarketSegments. 

Inheritance tree: |- 
 <a title="SID Models::Market_Sales Domain::Market Segment ABE::MarketSegment" href="_3E3F0EC000E93C8FA9A80096-content.html">SID Models::Market_Sales Domain::Market Segment ABE::MarketSegment</a> @since SID_R16.5
*/ 

public  class CompositeMarketSegment extends MarketSegment {



/**  
* Field marketSegment
*/
protected List<MarketSegment> marketSegment ;


}