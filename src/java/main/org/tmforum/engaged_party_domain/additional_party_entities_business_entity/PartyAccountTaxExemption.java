/**
* Additional Party Entities ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.a.eN.tUE4.cE.eO_X.pEX.s37Q.e.w-content.html">Additional Party Entities ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.additional_party_entities_business_entity ;

/**
* Proof of freedom from taxes imposed by a taxing jurisdiction. 
 @since SID_R16.5
*/ 

public  class PartyAccountTaxExemption  {



/**  
* Field issuingJurisdiction
* The name of the taxing jurisdiction for which taxes are exempt. 

*/
protected String issuingJurisdiction ;




/**  
* Field certificateNumber
* The identifier of a document that shows proof of exemption from taxes  

* for the taxing jurisdiction. 

*/
protected String certificateNumber ;




/**  
* Field validFor
* The period for which the exemption is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field partyAccount
*/
protected PartyAccount partyAccount ;


}