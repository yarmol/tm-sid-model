/**
* Performance Category ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E944710E5803E0-content.html">Performance Category ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_category_business_entity ;

/**
* A value of a CharacteristicSpecification provided for PerformanceCateg 
* ory that further defines what the PerformanceCategory is. 
 @since SID_R16.5
*/ 

public  class PerformanceCatCharacteristicValue  {



/**  
* Field value
* A fact that describes a PerformanceCatCharacteristicValue. 

*/
protected String value ;




/**  
* Field validFor
* The period for which the characteristic value is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field performanceCategory
*/
protected PerformanceCategory performanceCategory ;




/**  
* Field characteristicSpecification
*/
protected CharacteristicSpecification characteristicSpecification ;


}