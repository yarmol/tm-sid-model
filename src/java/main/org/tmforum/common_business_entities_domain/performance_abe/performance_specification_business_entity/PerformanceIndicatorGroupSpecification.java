/**
* Performance Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9445D638A032C-content.html">Performance Specification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_specification_business_entity ;

/**
* A group of indicators, usually reported in the same message by the equ 
* ipment or the EMS. 
 @since SID_R16.5
*/ 

public  class PerformanceIndicatorGroupSpecification  {



/**  
* Field performanceIndicatorGroup
*/
protected List<PerformanceIndicatorGroup> performanceIndicatorGroup ;




/**  
* Field name
* A word, term, or phrase by which a PerformanceIndicatorGroupSpecificat 

* ion is known and identified. 

*/
protected String name ;




/**  
* Field performanceIndicatorSpecification
*/
protected List<PerformanceIndicatorSpecification> performanceIndicatorSpecification ;




/**  
* Field collection
*/
protected List<AdhocCollection> collection ;




/**  
* Field measurementJob
*/
protected List<MeasurementJob> measurementJob ;


}