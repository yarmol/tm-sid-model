/**
* Performance Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9445D638A032C-content.html">Performance Specification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_specification_business_entity ;

/**
* The invariant characteristics that define a measure that deterimines h 
* ow a Service and/or Resource is functioning. Each related Performance  
* instance will have the same invariant characteristics. However, the va 
* lues associated with other characteristics of the instantiated Perform 
* ance entity are specific to each instance. 
 @since SID_R16.5
*/ 

public abstract class PerformanceSpecification  {



/**  
* Field characteristicSpecification
*/
protected List<CharacteristicSpecification> characteristicSpecification ;




/**  
* Field performance
*/
protected List<Performance> performance ;




/**  
* Field ID
* A unique identifier for the PerformanceSpecification. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which the PerformanceSpecification is known 

*  and distinguished from other PerformanceSpecifications. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains the PerformanceSpecification. 

*/
protected String description ;




/**  
* Field validFor
* The period of time for which a PerformanceSpecification is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field performanceIndicatorSpecification
*/
protected List<PerformanceIndicatorSpecification> performanceIndicatorSpecification ;




/**  
* Field performanceSpecificationInterval
*/
protected List<PerformanceSpecificationInterval> performanceSpecificationInterval ;




/**  
* Field performanceSpecification
*/
protected List<PerformanceSpecification> performanceSpecification ;




/**  
* Field performanceSpecification1
*/
protected List<PerformanceSpecification> performanceSpecification1 ;




/**  
* Field performanceCatSpecification
*/
protected List<PerformanceCatSpecification> performanceCatSpecification ;




/**  
* Field characteristicSpecValue
*/
protected List<CharacteristicSpecValue> characteristicSpecValue ;




/**  
* Field performanceApplicability
*/
protected List<PerformanceApplicability> performanceApplicability ;




/**  
* Field resourceSpecification
*/
protected ResourceSpecification resourceSpecification ;




/**  
* Field performanceMetricDefinition
*/
protected List<PerformanceMetricDefinition> performanceMetricDefinition ;


}