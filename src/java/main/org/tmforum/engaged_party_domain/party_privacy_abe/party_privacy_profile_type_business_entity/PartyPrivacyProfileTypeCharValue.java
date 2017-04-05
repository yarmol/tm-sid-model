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
* A PartyPrivacyProfileTypeCharValue specifies a confuguration that can  
* be chosen for an information in a Privacy context.For example, the usa 
* ge of an information might Authorized or Unauthorized.       

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::Party Profile ABE::PartyProfileTypeCharacteristicValue @since SID_R16.5
*/ 

public  class PartyPrivacyProfileTypeCharValue extends PartyProfileTypeCharacteristicValue {



/**  
* Field privacyPartyProfileType
*/
protected List<PartyPrivacyProfileType> privacyPartyProfileType ;




/**  
* Field privacyPartyProfileTypeCharacteristic
*/
protected PartyPrivacyProfileTypeCharacteristic privacyPartyProfileTypeCharacteristic ;




/**  
* Field validityDuration
* The validityPeriod might be used to specify how long the choice might  

* be valid before going back to the default configuration. 

*/
protected Duration validityDuration ;




/**  
* Field partyPrivacyProfileCharValue
*/
protected List<PartyPrivacyProfileCharValue> partyPrivacyProfileCharValue ;


}