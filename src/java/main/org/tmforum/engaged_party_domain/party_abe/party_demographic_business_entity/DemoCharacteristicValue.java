/**
* Party Demographic ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93C1905D2007F-content.html">Party Demographic ABE</a> 
* Demographics deal with the study of individuals and organizations (Par 
* ties), including their size, growth, density, and distribution, as wel 
* l as statistics regarding birth, marriage, disease, and death.  Demogr 
* aphic data is information about parties that allows decisions to be ma 
* de such as the make-up and size of a market segment, classification an 
* d ranking of customers, and so forth.  Demographics provide the key “w 
* hat” information and can be broken down into two categories:  individu 
* al demographics and organization demographics. 
* @since SID_R16.5
*/

package org.tmforum.engaged_party_domain.party_abe.party_demographic_business_entity ;

/**
* A single value or range of values that can be used to define a Demogra 
* phicCharacteristic. 
 @since SID_R16.5
*/ 

public  class DemoCharacteristicValue  {



/**  
* Field marketSegmentCharacteristicValue
*/
protected List<MarketSegmentCharacteristicValue> marketSegmentCharacteristicValue ;




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
* Field partyDemographicValue
*/
protected List<PartyDemographicValue> partyDemographicValue ;




/**  
* Field demographicCharacteristic
*/
protected DemographicCharacteristic demographicCharacteristic ;




/**  
* Field partyProfileTypeCharacteristicValue
*/
protected List<PartyProfileTypeCharacteristicValue> partyProfileTypeCharacteristicValue ;


}