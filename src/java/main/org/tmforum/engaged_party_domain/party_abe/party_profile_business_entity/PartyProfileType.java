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
* Characteristics used to group Parties for the formulation and targetin 
* g of MarketingCampaigns. ProfileTypes can be based on PartyDemographic 
* s, GeographicAreas, ProductOfferings, and MarketSegments. User-defined 
*  DataPoints can also be specified. 
 @since SID_R16.5
*/ 

public  class PartyProfileType  {



/**  
* Field marketSegment
*/
protected List<MarketSegment> marketSegment ;




/**  
* Field ID
* A unique identifier for the PartyProfileType. 

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
* A narrative that explains what the PartyProfileType is. 

*/
protected String description ;




/**  
* Field partyProfileTypeCategory
* A classification that groups PartyProfileTypes together because of com 

* mon characteristics.</br></br> 

*/
protected String partyProfileTypeCategory ;




/**  
* Field validFor
* The period during which the PartyProfileType is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field geographicArea
*/
protected List<GeographicArea> geographicArea ;




/**  
* Field partyRoleType
*/
protected List<PartyRoleSpecification> partyRoleType ;




/**  
* Field partyProfileTypeCharacteristic
*/
protected List<PartyProfileTypeCharacteristic> partyProfileTypeCharacteristic ;




/**  
* Field partyProfile
*/
protected List<PartyProfile> partyProfile ;




/**  
* Field productOffering
*/
protected List<ProductOffering> productOffering ;




/**  
* Field partyProfileTypeCharacteristicValue
*/
protected List<PartyProfileTypeCharacteristicValue> partyProfileTypeCharacteristicValue ;




/**  
* Field marketingCampaign
*/
protected List<MarketingCampaign> marketingCampaign ;


}