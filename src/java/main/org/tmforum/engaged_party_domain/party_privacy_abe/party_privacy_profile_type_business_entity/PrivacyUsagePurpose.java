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
* A PrivacyUsagePurpose corresponds to a type of usage of an information 
*  concerned by Privacy such as Administration, Marketing, Research, Inf 
* ormation,... 
 @since SID_R16.5
*/ 

public  class PrivacyUsagePurpose  {



/**  
* Field name
* The name of the purpose such as ADMIN, RESEARCH, INFORMATION,... 

*/
protected String name ;




/**  
* Field privacyPartyProfileTypeCharacteristic
*/
protected List<PartyPrivacyProfileTypeCharacteristic> privacyPartyProfileTypeCharacteristic ;


}