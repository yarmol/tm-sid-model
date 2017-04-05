/**
* Competitor ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9410A56810361-content.html">Competitor ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.market_sales_domain.competitor_business_entity ;

/**
* A Party playing a PartyRole that offers ProductOfferings similar to th 
* e enterprise's ProductOfferings in a MarketSegment. 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::PartyRole @since SID_R16.5
*/ 

public  class Competitor extends PartyRole {



/**  
* Field ID
* A unique identifier for the Competitor. 

*/
protected String ID ;




/**  
* Field description
* A narrative that further details the strength, weakness, opportunity,  

* or threat for a Competitor in a MarketSegment. 

*/
protected String description ;




/**  
* Field dateCreated
* The date on which interest was first shown for the Competitor. 

*/
protected DateTime dateCreated ;




/**  
* Field marketSegment
*/
protected List<MarketSegment> marketSegment ;




/**  
* Field competitorSWOT
*/
protected List<CompetitorSWOT> competitorSWOT ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field competitorIntelligence
*/
protected List<CompetitorIntelligence> competitorIntelligence ;




/**  
* Field competitorTier
*/
protected List<CompetitorTier> competitorTier ;


}