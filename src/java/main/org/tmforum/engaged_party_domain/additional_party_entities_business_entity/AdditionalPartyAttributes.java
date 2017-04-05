/**
* Additional Party Entities ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.eN.tUE4.cE.eO_X.pEX.s37Q.e.w-content.html">Additional Party Entities ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.additional_party_entities_business_entity ;

/**
* A person or organization that buys products and services from the ente 
* rprise or receives free offers or services. This is modeled as a Party 
*  playing the role of Party. A Party is a type of PartyRole. Partys can 
*  also be other service providers who resell the enterprises products,  
* other service providers that lease the enterprise's resources for util 
* ization by the other service provider's products and services, and so  
* forth. 
 @since SID_R16.5
*/ 

public  class AdditionalPartyAttributes  {



/**  
* Field ID
* A unique identifier. 

*/
protected String ID ;




/**  
* Field partyStatus
* The current condition of a party, such as active, inactive, prospectiv 

* e. 

*/
protected String partyStatus ;




/**  
* Field partyRank
* Degree of importance relative to other partys. 

*/
protected long partyRank ;




/**  
* Field partyQuote
*/
protected List<PartyQuote> partyQuote ;




/**  
* Field partyRole
*/
protected PartyRole partyRole ;


}