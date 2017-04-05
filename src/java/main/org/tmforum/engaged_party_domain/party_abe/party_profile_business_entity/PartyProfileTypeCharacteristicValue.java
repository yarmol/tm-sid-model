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
* A single value or range of values that can be used to define a PartyPr 
* ofileTypeCharacteristic. 
 @since SID_R16.5
*/ 

public  class PartyProfileTypeCharacteristicValue  {



/**  
* Field valueType
* A kind of value that the characteristic can take on, such as numeric,  

* text, and so forth. 

*/
protected String valueType ;




/**  
* Field isDefault
* Indicates if the value is the default value for a characteristic. 

*/
protected Boolean isDefault ;




/**  
* Field value
* A discrete value that the characteristic can take on.</br></br>Note:</ 

* br>Either value or valueFrom and/or valueTo are required 

*/
protected String value ;




/**  
* Field unitOfMeasure
* A length, surface, volume, dry measure, liquid measure, money, weight, 

*  time, and the like. Iin general, a determinate quantity or magnitude  

* of the kind designated, taken as a standard of comparison for others o 

* f the same kind, in assigning to them numerical values, as 1 foot, 1 y 

* ard, 1 mile, 1 square foot. 

*/
protected String unitOfMeasure ;




/**  
* Field fromValue
* The low range value that a characteristic can take on. 

*/
protected String fromValue ;




/**  
* Field toValue
* The upper range value that a characteristic can take on. 

*/
protected String toValue ;




/**  
* Field rangeInterval
* An indicator that specifies the inclusion or exclusion of the valueFro 

* m and valueTo attributes.</br></br>Possible values are "open", "closed 

* ", "closedBottom" and "closedTop".</br> 

*/
protected String rangeInterval ;




/**  
* Field vaildFor
* The period of time for which a value is applicable. 

*/
protected TimePeriod vaildFor ;




/**  
* Field demoCharacteristicValue
*/
protected DemoCharacteristicValue demoCharacteristicValue ;




/**  
* Field partyProfileTypeCharacteristic
*/
protected PartyProfileTypeCharacteristic partyProfileTypeCharacteristic ;




/**  
* Field partyProfileType
*/
protected List<PartyProfileType> partyProfileType ;


}