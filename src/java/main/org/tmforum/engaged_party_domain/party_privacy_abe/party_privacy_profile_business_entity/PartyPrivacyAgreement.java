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
* null 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Agreement ABE::Agreement |- 
 SID Models::Common Business Entities Domain::Business Interaction ABE::BusinessInteraction @since SID_R16.5
*/ 

public  class PartyPrivacyAgreement extends Agreement,BusinessInteraction {



/**  
* Field partyPrivacyProfile
*/
protected List<PartyPrivacyProfile> partyPrivacyProfile ;




/**  
* Field partyPrivacyProfileCharValue
*/
protected List<PartyPrivacyProfileCharValue> partyPrivacyProfileCharValue ;


}