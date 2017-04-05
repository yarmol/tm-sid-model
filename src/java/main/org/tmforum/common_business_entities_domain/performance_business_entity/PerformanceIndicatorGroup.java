/**
* Performance ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9445D69320232-content.html">Performance ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_business_entity ;

/**
* A  group of indicators (instances), usually reported in the same messa 
* ge by the equipment or the EMS. 
 @since SID_R16.5
*/ 

public  class PerformanceIndicatorGroup  {



/**  
* Field indicator
*/
protected List<PerformanceIndicator> indicator ;




/**  
* Field name
* The name of the indicator group. 

*/
protected String name ;




/**  
* Field performanceIndicatorGroupSpecification
*/
protected PerformanceIndicatorGroupSpecification performanceIndicatorGroupSpecification ;


}