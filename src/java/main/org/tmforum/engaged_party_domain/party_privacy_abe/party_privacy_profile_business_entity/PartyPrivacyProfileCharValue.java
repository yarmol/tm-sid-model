/**
* Party Privacy Profile ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_J.s.hM.sN97E.eS59.v.h.iBG5.x.f.g-content.html">Party Privacy Profile ABE</a> 
* The Party Privacy Profile ABE contains all entities used by the Party  
* Privacy Management process for specifying the choices made by Parties  
* for their own Privacy. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_privacy_abe.party_privacy_profile_business_entity ;

/**
* Each PartyPrivacyProfileCharValue instantiates a PartyPrivacyProfileTy 
* peCharValue and specifies the chosen value. 
 @since SID_R16.5
*/ 

public  class PartyPrivacyProfileCharValue  {



/**  
* Field privacyPartyProfile
*/
protected PartyPrivacyProfile privacyPartyProfile ;




/**  
* Field value
* The value chosen by the Party. 

*/
protected String value ;




/**  
* Field validFor
* Period during which the Party's choice stays valid before going back t 

* o the default value. 

*/
protected TimePeriod validFor ;




/**  
* Field partyPrivacyProfileTypeCharValue
*/
protected PartyPrivacyProfileTypeCharValue partyPrivacyProfileTypeCharValue ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field partyPrivacyAgreement
*/
protected PartyPrivacyAgreement partyPrivacyAgreement ;


}