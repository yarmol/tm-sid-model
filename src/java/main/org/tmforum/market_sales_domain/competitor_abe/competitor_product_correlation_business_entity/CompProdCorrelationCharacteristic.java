/**
* Competitor Product Correlation ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9414F49650361-content.html">Competitor Product Correlation ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.market_sales_domain.competitor_abe.competitor_product_correlation_business_entity ;

/**
* A characteristic quality or distinctive feature of a CompetitorProduct 
* Correlation. The characteristic can be take on a discrete value, such  
* as geographic disbursement (central, national, cascading), can take on 
*  a range of values, (for example, Competitor ProductOffering revenue o 
* f $500,000 - $1,000,000), or can be derived from a formula (for exampl 
* e, number of MarketSegments in correlation = number of MarketSegments  
* related to this correlation). 
 @since SID_R16.5
*/ 

public  class CompProdCorrelationCharacteristic  {



/**  
* Field ID
* A unique identifier for the CompProdCorrelationCharacteristic. 

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
* Field compositeCompProdCorrelationCharacteristic
*/
protected List<CompositeCompProdCorrelationCharacteristic> compositeCompProdCorrelationCharacteristic ;




/**  
* Field compProdCorCharacteristicValue
*/
protected List<CompProdCorCharacteristicValue> compProdCorCharacteristicValue ;


}