/**
* Market Statistic ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9411CCDEE0153-content.html">Market Statistic ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.market_sales_domain.market_segment_abe.market_statistic_business_entity ;

/**
* A categorization of performance measures by MarketSegment. Performance 
*  is measured for the ServiceProvider and a ServiceProvider's Competito 
* rs in the market place. 
 @since SID_R16.5
*/ 

public abstract class MarketStatistic  {



/**  
* Field ID
* A unique identifier for the MarketStatistic. 

*/
protected String ID ;




/**  
* Field description
* A narrative that explains what the MarketStatistic is. 

*/
protected String description ;




/**  
* Field marketStatisticType
* A division of MarketStatistic into groups because they exhibit common  

* characteristics. For example, market penetration, churn, retention, ma 

* rket share, and so forth.</br></br> 

*/
protected String marketStatisticType ;




/**  
* Field marketStatisicClassification
* A specification of what the MarketStatistic represents, for example a  

* ProductProgram, ProductPromotion, ProductOffering, Branch, and so fort 

* h. 

*/
protected String marketStatisicClassification ;




/**  
* Field marketStatisticLevel
* Describes the place the MarketStatistic holds in a hierarchy of Market 

* Statistics. For example, director, executive, external, and so forth. 

*/
protected String marketStatisticLevel ;




/**  
* Field amount
* An number use to value the MarketStatistic, such as a percent. Mutuall 

* y exclusive with the currencyAmount attribute. 

*/
protected Quantity amount ;




/**  
* Field currencyAmount
* A current amount used to value the MarketStatistic. Mutually exclusive 

*  with the amount attribute.</br></br> 

*/
protected Money currencyAmount ;




/**  
* Field validFor
* The period during which the MarketStatistic is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field compositeMarketStatistic
*/
protected List<CompositeMarketStatistic> compositeMarketStatistic ;




/**  
* Field geographicArea
*/
protected List<GeographicArea> geographicArea ;




/**  
* Field salesChannel
*/
protected List<SalesChannel> salesChannel ;




/**  
* Field marketSegment
*/
protected List<MarketSegment> marketSegment ;




/**  
* Field productOffering
*/
protected List<ProductOffering> productOffering ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;


}