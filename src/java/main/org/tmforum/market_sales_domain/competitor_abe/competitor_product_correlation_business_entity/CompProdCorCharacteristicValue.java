/**
* Competitor Product Correlation ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9414F49650361-content.html">Competitor Product Correlation ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.market_sales_domain.competitor_abe.competitor_product_correlation_business_entity ;

/**
* A number or text that can be assigned to a CompProdCorrelationCharacte 
* ristic. 
 @since SID_R16.5
*/ 

public  class CompProdCorCharacteristicValue  {



/**  
* Field valueType
* A kind of value that the characteristic can take on, such as numeric,  

* text, and so forth. 

*/
protected String valueType ;




/**  
* Field default
* Indicates if the value is the default value for a characteristic. 

*/
protected Boolean default ;




/**  
* Field value
* A discrete value that the characteristic can take on. 

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
* Field compProdCorrelationCharacteristic
*/
protected CompProdCorrelationCharacteristic compProdCorrelationCharacteristic ;


}