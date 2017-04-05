/**
* Competitor ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9410A56810361-content.html">Competitor ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.market_sales_domain.competitor_business_entity ;

/**
* A classification of a Competitor, such as by size, product lines offer 
* ed, and so forth. 
 @since SID_R16.5
*/ 

public  class CompetitiveTier  {



/**  
* Field size
* How big the Competitor is, such as small, medium, large, compared to o 

* ther Competitors. 

*/
protected String size ;




/**  
* Field perspective
* How the CompetitiveTier is viewed, such as vertical or horizontal. 

*/
protected String perspective ;




/**  
* Field perspectiveCharacteristic
* A feature or quality that further describes the perspective recognizab 

* le, such as consumer, business, carrier, size, usage, customer, and so 

*  forth. For example, a consumer vertical market perspective. </br></br 

* > 

*/
protected String perspectiveCharacteristic ;




/**  
* Field competitorTier
*/
protected List<CompetitorTier> competitorTier ;




/**  
* Field productLine
*/
protected List<ProductLine> productLine ;


}