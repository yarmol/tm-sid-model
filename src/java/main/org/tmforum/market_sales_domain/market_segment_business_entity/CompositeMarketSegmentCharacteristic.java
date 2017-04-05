/**
* Market Segment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93C8FA94B00C4-content.html">Market Segment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.market_sales_domain.market_segment_business_entity ;

/**
* A type of MarketSegmentCharacteristic that is formed by aggregating ot 
* her MarketSegmentCharacteristic, which may be Composite or Atomic Mark 
* etSegmentCharacteristic. 

Inheritance tree: |- 
 <a title="SID Models::Market_Sales Domain::Market Segment ABE::MarketSegmentCharacteristic" href="_3E3F0EC000E9410EA2C600D5-content.html">SID Models::Market_Sales Domain::Market Segment ABE::MarketSegmentCharacteristic</a> @since SID_R16.5
*/ 

public  class CompositeMarketSegmentCharacteristic extends MarketSegmentCharacteristic {



/**  
* Field marketSegmentCharacteristic
*/
protected List<MarketSegmentCharacteristic> marketSegmentCharacteristic ;


}