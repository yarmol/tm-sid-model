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
* Each PartyPrivacyProfileTypeCharacteristic specifies:•&nbsp;&nbsp;&nbs 
* p;&nbsp;the information concerned by the Privacy (CharacteristicSpecif 
* ication via RootEntityTypeCharUse),•&nbsp;&nbsp;&nbsp;&nbsp;and the co 
* rresponding Privacy rule (i.e. available choices for the party) using  
* PartyPrivacyProfileTypeCharValue.A PartyPrivacyProfileTypeCharacterist 
* ic has a privacyType such as “Internal Purpose”, “External Purpose”, “ 
* Internal Retention” or “External Retention”.If the privacyType is “Int 
* ernal Purpose” or “External Purpose”, then the PartyPrivacyProfileType 
* Characteristic specifies the usage purpose of the information concerne 
* d by the privacy such as Administration, Marketing, Research…Each Part 
* yPrivacyProfileTypeCharacteristic is categorized by a PrivacyCategory  
* for helping Graphical User Interface (GUI) to have a nice presentation 
*  for Privacy viewing and configuration. 

Inheritance tree: |- 
 SID Models::Engaged Party Domain::Party ABE::Party Profile ABE::PartyProfileTypeCharacteristic @since SID_R16.5
*/ 

public  class PartyPrivacyProfileTypeCharacteristic extends PartyProfileTypeCharacteristic {



/**  
* Field privacyType
* A privacyType specifies the type of Privacy rule specified for an info 

* rmation such as</br>   - “Internal Purpose” : usage of the information 

*  by the company that collects the information for a purpose,</br>   -  

* “External Purpose”: usage of the information by the company that recei 

* ved the information from another company for a purpose,</br>   - “Inte 

* rnal Retention”: rights to keep the information for the company that c 

* ollects the information,</br>   - “External Retention”: rights to keep 

*  the information for the company that  that received the information f 

* rom another company.</br> 

*/
protected String privacyType ;




/**  
* Field privacyUsagePurpose
*/
protected PrivacyUsagePurpose privacyUsagePurpose ;




/**  
* Field privacyPartyProfileType
*/
protected List<PartyPrivacyProfileType> privacyPartyProfileType ;




/**  
* Field privacyPartyProfileTypeCharValue
*/
protected List<PartyPrivacyProfileTypeCharValue> privacyPartyProfileTypeCharValue ;




/**  
* Field privacyCategory
*/
protected PrivacyCategory privacyCategory ;




/**  
* Field rootEntityTypeCharUse2
*/
protected RootEntityTypeCharUse rootEntityTypeCharUse2 ;




/**  
* Field criticityLavel
*/
protected String criticityLavel ;




/**  
* Field partyRoleSpecification
*/
protected List<PartyRoleSpecification> partyRoleSpecification ;


}