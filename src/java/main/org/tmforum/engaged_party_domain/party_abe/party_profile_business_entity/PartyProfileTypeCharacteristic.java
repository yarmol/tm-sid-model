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
* A characteristic quality or distinctive feature of a PartyProfileType. 
*  The characteristic can be take on a discrete value, such as age, can  
* take on a range of values, (for example, investment portfolio value of 
*  $50,000 - $100,000), or can be derived from a formula (for example, n 
* umber of households = number of customer party roles). 
 @since SID_R16.5
*/ 

public abstract class PartyProfileTypeCharacteristic  {



/**  
* Field ID
* A unique identifier for the PartyProfileTypeCharacteristic. 

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
* A narrative that explains what the PartyProfileTypeCharacteristic is. 

*/
protected String description ;




/**  
* Field unique
* An indicator that specifies if a value is unique for the specification 

* .</br></br>Possible values are; "unique while value is in effect" and  

* "unique whether value is in effect or not"</br> 

*/
protected String unique ;




/**  
* Field valueType
* A kind of value that the characteristic can take on, such as numeric,  

* text, and so forth.</br></br>Note:</br>Required, if the specification  

* is not a composite 

*/
protected String valueType ;




/**  
* Field minCardinality
* The minimum number of instances a CharacteristicValue can take on. For 

*  example, zero to five phone numbers in a group calling plan, where ze 

* ro is the value for the minCardinality. 

*/
protected Integer minCardinality ;




/**  
* Field maxCardinality
* The maximum number of instances a CharacteristicValue can take on. For 

*  example, zero to five phone numbers in a group calling plan, where fi 

* ve is the value for the maxCardinality. 

*/
protected Integer maxCardinality ;




/**  
* Field extensible
* An indicator that specifies that the values for the characteristic can 

*  be extended by adding new values when instantiating a characteristic  

* for an Entity. 

*/
protected Boolean extensible ;




/**  
* Field derivationFormula
* A rule or principle represented in symbols, numbers, or letters, often 

*  in the form of an equation used to derive the value of a characterist 

* ic value.</br></br> 

*/
protected String derivationFormula ;




/**  
* Field validFor
* The period of time for which a characteristic is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field partyProfileType
*/
protected List<PartyProfileType> partyProfileType ;




/**  
* Field demographicCharacteristic
*/
protected DemographicCharacteristic demographicCharacteristic ;




/**  
* Field partyProfileTypeCharacteristicValue
*/
protected List<PartyProfileTypeCharacteristicValue> partyProfileTypeCharacteristicValue ;




/**  
* Field productOffering
*/
protected List<ProductOffering> productOffering ;




/**  
* Field compositePartyProfileTypeCharacteristic
*/
protected List<CompositePartyProfileTypeCharacteristic> compositePartyProfileTypeCharacteristic ;


}