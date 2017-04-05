/**
* Performance Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9445D638A032C-content.html">Performance Specification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_specification_business_entity ;

/**
* A parameter used in the calculation of a PerformanceIndicator. A Chara 
* cteristicSpecification can be used as a parameter or another Performan 
* ceIndicatorSpecification can be used. 
 @since SID_R16.5
*/ 

public  class PerformanceIndicatorDerivationParameter  {



/**  
* Field characteristicSpecification
*/
protected CharacteristicSpecification characteristicSpecification ;




/**  
* Field performanceIndicatorSpecification
*/
protected PerformanceIndicatorSpecification performanceIndicatorSpecification ;




/**  
* Field performanceIndicatorSpecification1
*/
protected List<PerformanceIndicatorSpecification> performanceIndicatorSpecification1 ;


}