/**
* Competitor Intelligence ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9414F495500DD-content.html">Competitor Intelligence ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.market_sales_domain.competitor_abe.competitor_intelligence_business_entity ;

/**
* A type of CompIntelCharacteristic that is formed by aggregating other  
* CompIntelCharacteristic, which may be Composite or Atomic CompIntelCha 
* racteristic. 

Inheritance tree: |- 
 <a title="SID Models::Market_Sales Domain::Competitor ABE::Competitor Intelligence ABE::CompetitorIntelCharacteristic" href="_3E3F0EC000E94152F5990182-content.html">SID Models::Market_Sales Domain::Competitor ABE::Competitor Intelligence ABE::CompetitorIntelCharacteristic</a> @since SID_R16.5
*/ 

public  class CompositeCompIntelCharacteristic extends CompetitorIntelCharacteristic {



/**  
* Field competitorIntelCharacteristic
*/
protected List<CompetitorIntelCharacteristic> competitorIntelCharacteristic ;


}