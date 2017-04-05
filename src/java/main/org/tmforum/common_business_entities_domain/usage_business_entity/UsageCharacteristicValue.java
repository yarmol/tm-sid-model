/**
* Usage ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E941C174B400CC-content.html">Usage ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.usage_business_entity ;

/**
* A value of a UsageSpecCharacteristic that represents a attribute value 
*  for Usage. 
 @since SID_R16.5
*/ 

public  class UsageCharacteristicValue  {



/**  
* Field value
* A fact that describes a Usage. 

*/
protected String value ;




/**  
* Field validFor
* The period for which the entity is valid. 

*/
protected TimePeriod validFor ;




/**  
* Field usage
*/
protected Usage usage ;




/**  
* Field usageSpecCharacteristic
*/
protected UsageSpecCharacteristic usageSpecCharacteristic ;




/**  
* Field usageSpecCharacteristicValue
*/
protected UsageSpecCharacteristicValue usageSpecCharacteristicValue ;




/**  
* Field usageCharacteristicValue
*/
protected UsageCharacteristicValue usageCharacteristicValue ;




/**  
* Field usageCharacteristicValue1
*/
protected List<UsageCharacteristicValue> usageCharacteristicValue1 ;




/**  
* Field usageCharacteristicSum
*/
protected List<UsageCharacteristicSum> usageCharacteristicSum ;




/**  
* Field usageCharacteristicSum2
*/
protected List<UsageCharacteristicSum> usageCharacteristicSum2 ;


}