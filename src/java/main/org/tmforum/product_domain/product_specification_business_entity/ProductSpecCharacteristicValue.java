/**
* Product Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93D6AAA5302C4-content.html">Product Specification ABE</a> 
* The Product Specification ABE contains all what represent a product sp 
* ecification as perceived by the business user and specifies what the m 
* arketing operator wants to sell at a functional level (i.e. what are t 
* he capacities, which usages are available…). 
* @since SID_R16.5
*/

package org.tmforum.product_domain.product_specification_business_entity ;

/**
* A number or text that can be assigned to a ProductSpecCharacteristic. 
 @since SID_R16.5
*/ 

public  class ProductSpecCharacteristicValue  {



/**  
* Field resourceSpecCharacteristicValue
*/
protected List<ResourceSpecCharacteristicValue> resourceSpecCharacteristicValue ;




/**  
* Field serviceSpecCharacteristicValue
*/
protected List<ServiceSpecCharacteristicValue> serviceSpecCharacteristicValue ;




/**  
* Field valueType
* A kind of value that the characteristic can take on, such as numeric,  

* text, and so forth. 

*/
protected String valueType ;




/**  
* Field defaultValue
* Indicates if the value is the default value for a characteristic. 

*/
protected Boolean defaultValue ;




/**  
* Field value
* A discrete value that the characteristic can take on.</br>Either value 

*  or valueFrom and/or valueTo are required. 

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
* Field valueFrom
* The low range value that a characteristic can take on. 

*/
protected String valueFrom ;




/**  
* Field valueTo
* The upper range value that a characteristic can take on. 

*/
protected String valueTo ;




/**  
* Field rangeInterval
* An indicator that specifies the inclusion or exclusion of the valueFro 

* m and valueTo attributes.</br></br>Possible values are "open", "closed 

* ", "closedBottom" and "closedTop".</br> 

*/
protected String rangeInterval ;




/**  
* Field validFor
* The period of time for which a value is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field productSpecCharacteristic
*/
protected ProductSpecCharacteristic productSpecCharacteristic ;




/**  
* Field productSpecCharUse
*/
protected List<ProductSpecCharUse> productSpecCharUse ;




/**  
* Field productCharacteristicValue
*/
protected List<ProductCharacteristicValue> productCharacteristicValue ;




/**  
* Field productSpecCharacteristicValue
*/
protected List<ProductSpecCharacteristicValue> productSpecCharacteristicValue ;




/**  
* Field productSpecCharacteristicValue1
*/
protected List<ProductSpecCharacteristicValue> productSpecCharacteristicValue1 ;


}