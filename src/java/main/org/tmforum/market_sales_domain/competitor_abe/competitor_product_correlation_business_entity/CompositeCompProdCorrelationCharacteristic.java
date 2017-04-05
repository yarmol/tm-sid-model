/**
* Competitor Product Correlation ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9414F49650361-content.html">Competitor Product Correlation ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.market_sales_domain.competitor_abe.competitor_product_correlation_business_entity ;

/**
* A type of CompetitorProductCorrelation that is formed by aggregating o 
* ther CompetitorProductCorrelations, which may be Composite or Atomic C 
* ompetitorProductCorrelations. 

Inheritance tree: |- 
 <a title="SID Models::Market_Sales Domain::Competitor ABE::Competitor Product Correlation ABE::CompProdCorrelationCharacteristic" href="_3E3F0EC000E9415C49070036-content.html">SID Models::Market_Sales Domain::Competitor ABE::Competitor Product Correlation ABE::CompProdCorrelationCharacteristic</a> @since SID_R16.5
*/ 

public  class CompositeCompProdCorrelationCharacteristic extends CompProdCorrelationCharacteristic {



/**  
* Field compProdCorrelationCharacteristic
*/
protected List<CompProdCorrelationCharacteristic> compProdCorrelationCharacteristic ;


}