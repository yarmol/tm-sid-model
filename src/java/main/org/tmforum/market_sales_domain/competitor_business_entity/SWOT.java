/**
* Competitor ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9410A56810361-content.html">Competitor ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.market_sales_domain.competitor_business_entity ;

/**
* A Strength, Weakness, Opportunity, Threat (SWOT) that an enterprise ha 
* s when compared to a Competitor. SWOT analysis is a formal framework o 
* f identifying and framing organizational growth opportunities. 
 @since SID_R16.5
*/ 

public  class SWOT  {



/**  
* Field swotType
* A category of organizational analysis, such as strength (S), weakness  

* (W), opportunity (O), threat (T). 

*/
protected String swotType ;




/**  
* Field competitorSWOT
*/
protected List<CompetitorSWOT> competitorSWOT ;


}