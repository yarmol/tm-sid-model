/**
* Party Profile ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9410E9902021A-content.html">Party Profile ABE</a> 
* The characteristics used to group Parties that typify MarketSegments a 
* nd for the formulation and targeting of MarketingCampaigns.  A Party P 
* rofileType is used to categorize one or more PartyRoleSpecifications.  
* A PartyProflieType can be defined for one or more GeographicAreas.  Th 
* e profile can target one or more ProductOfferings and one or more Mark 
* etSegments.  PartyProfileTypes can be based on (or defined by) Demogra 
* phicCharacteristics. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.party_profile_business_entity ;

/**
* A match between a Party and a PartyProfileType. It is based on matchin 
* g PartyDemographics and other Party characteristics, such as use of a  
* product, with the characteristics of a PartyProfileType. 
 @since SID_R16.5
*/ 

public  class PartyProfile  {



/**  
* Field ID
* A unique identifier for the PartyProfile. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which the characteristic is known and disti 

* nguished from characteristics. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains what the PartyProfile is. 

*/
protected String description ;




/**  
* Field dateCreated
* The date that the PartyProfile was created. 

*/
protected DateTime dateCreated ;




/**  
* Field validFor
* The period during which the PartyProfile is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field partyProfileType
*/
protected List<PartyProfileType> partyProfileType ;




/**  
* Field partyRole
*/
protected List<PartyRole> partyRole ;




/**  
* Field party
*/
protected List<Party> party ;


}