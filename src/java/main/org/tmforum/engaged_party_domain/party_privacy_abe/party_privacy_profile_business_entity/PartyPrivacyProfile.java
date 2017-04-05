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
* A PartyPrivacyProfile corresponds of the instantiation of a PartyPriva 
* cyProfileType agreed by a PartyRole.The PartyPrivacyProfile is describ 
* ed by the Privacy choices made by the Party (related PartyPrivacyProfi 
* leCharValue). 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::Party Profile ABE::PartyProfile @since SID_R16.5
*/ 

public  class PartyPrivacyProfile extends PartyProfile {



/**  
* Field partyProfileTypeCharacteristicValue
*/
protected List<PartyPrivacyProfileCharValue> partyProfileTypeCharacteristicValue ;




/**  
* Field privacyPartyProfileType
*/
protected PartyPrivacyProfileType privacyPartyProfileType ;




/**  
* Field partyRole2
*/
protected PartyRole partyRole2 ;




/**  
* Field partyPrivacyAgreement
*/
protected PartyPrivacyAgreement partyPrivacyAgreement ;


}