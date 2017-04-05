/**
* Market Segment ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93C8FA94B00C4-content.html">Market Segment ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.market_sales_domain.market_segment_business_entity ;

/**
* A characteristic quality or distinctive feature of a MarketSegment. Th 
* e characteristic can be take on a discrete value, such as sex, can tak 
* e on a range of values, (for example, household income of $50,000 - $1 
* 00,000), or can be derived from a formula (for example, number of hous 
* eholds = number of customer party roles). 
 @since SID_R16.5
*/ 

public abstract class MarketSegmentCharacteristic  {



/**  
* Field ID
* A unique identifier for the MarketSegmentCharacteristic. 

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
* A narrative that explains what the characteristic is. 

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

* text, and so forth. 

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
* Field geographicArea
*/
protected List<GeographicArea> geographicArea ;




/**  
* Field demographicCharacteristic
*/
protected DemographicCharacteristic demographicCharacteristic ;




/**  
* Field marketSegment
*/
protected List<MarketSegment> marketSegment ;




/**  
* Field productOffering
*/
protected List<ProductOffering> productOffering ;




/**  
* Field marketSegmentCharacteristicValue
*/
protected List<MarketSegmentCharacteristicValue> marketSegmentCharacteristicValue ;




/**  
* Field compositeMarketSegmentCharacteristic
*/
protected List<CompositeMarketSegmentCharacteristic> compositeMarketSegmentCharacteristic ;


}