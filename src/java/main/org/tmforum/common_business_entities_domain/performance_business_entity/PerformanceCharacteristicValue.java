/**
* Performance ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9445D69320232-content.html">Performance ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_business_entity ;

/**
* A value of a CharacteristicSpecification provided for Performance that 
*  further defines what the Performance is. 
 @since SID_R16.5
*/ 

public  class PerformanceCharacteristicValue  {



/**  
* Field value
* A fact that describes a PerformanceCharacteristicValue. 

*/
protected String value ;




/**  
* Field validFor
* The period for which the characteristic value is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field performance
*/
protected Performance performance ;




/**  
* Field characteristicSpecification
*/
protected CharacteristicSpecification characteristicSpecification ;




/**  
* Field characteristicSpecValue
*/
protected CharacteristicSpecValue characteristicSpecValue ;


}