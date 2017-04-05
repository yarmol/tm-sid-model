/**
* Usage Spec ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.kX.g.wIBQBE.d-O57.wBCB.zL.fA-content.html">Usage Spec ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.usage_abe.usage_spec_business_entity ;

/**
* A value that can be assigned to a UsageSpecCharacteristic. 
 @since SID_R16.5
*/ 

public  class UsageSpecCharacteristicValue  {



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
* A discrete value that the characteristic can take on.</br></br>Notes:  

* Value or valueFrom/valueTo must be present 

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

* m and valueTo attributes.</br></br>Permitted values:</br> "open", "clo 

* sed", "closedBottom" and "closedTop".</br> 

*/
protected String rangeInterval ;




/**  
* Field vaildFor
* The period of time for which a value is applicable. 

*/
protected TimePeriod vaildFor ;




/**  
* Field usageSpecCharacteristic
*/
protected UsageSpecCharacteristic usageSpecCharacteristic ;




/**  
* Field usageCharacteristicValue
*/
protected List<UsageCharacteristicValue> usageCharacteristicValue ;




/**  
* Field usageSpecCharUse
*/
protected List<UsageSpecCharUse> usageSpecCharUse ;




/**  
* Field usageSpecCharacteristicValue
*/
protected List<UsageSpecCharacteristicValue> usageSpecCharacteristicValue ;




/**  
* Field usageSpecCharacteristicValue1
*/
protected List<UsageSpecCharacteristicValue> usageSpecCharacteristicValue1 ;


}