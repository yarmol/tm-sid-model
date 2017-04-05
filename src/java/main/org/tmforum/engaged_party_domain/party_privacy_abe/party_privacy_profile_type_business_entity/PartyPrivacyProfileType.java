/**
* Party Privacy Profile Type ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_BX5N4O2OE.eS.tB.e28.d1ETEA-content.html">Party Privacy Profile Type ABE</a> 
* The Party Privacy Profile ABE contains all entities used by the Party  
* Privacy Management process for specifying    - the information concern 
* ed by Privacy rules,   - the Privacy rules themselves. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_privacy_abe.party_privacy_profile_type_business_entity ;

/**
* A PartyPrivacyProfileType is a type of PartyProfileType.A PartyPrivacy 
* ProfileType specifies for a Party playing a type of PartyRole (PartyRo 
* leSpecification) such as Customer or User and possibly restricted to a 
*  context such as a set of ProductOfferings, all the available options  
* that the Party may choose for each information concerned by the Privac 
* y.A PartyPrivacyProfileType may specify Privacy for several informatio 
* n using PartyPrivacyProfileTypeCharacteristic. 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::Party Profile ABE::PartyProfileType @since SID_R16.5
*/ 

public  class PartyPrivacyProfileType extends PartyProfileType {



/**  
* Field privacyPartyProfileTypeCharacteristic
*/
protected List<PartyPrivacyProfileTypeCharacteristic> privacyPartyProfileTypeCharacteristic ;




/**  
* Field privacyPartyProfileTypeCharValue
*/
protected List<PartyPrivacyProfileTypeCharValue> privacyPartyProfileTypeCharValue ;




/**  
* Field privacyPartyProfile
*/
protected List<PartyPrivacyProfile> privacyPartyProfile ;




/**  
* Field partyRoleSpecification2
*/
protected List<PartyRoleSpecification> partyRoleSpecification2 ;




/**  
* Field productOffering2
*/
protected List<ProductOffering> productOffering2 ;


}