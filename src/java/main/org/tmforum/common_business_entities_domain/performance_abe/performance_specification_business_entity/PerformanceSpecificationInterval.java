/**
* Performance Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9445D638A032C-content.html">Performance Specification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_specification_business_entity ;

/**
* The interval of time for represented by the PerformanceSpecification. 
 @since SID_R16.5
*/ 

public  class PerformanceSpecificationInterval  {



/**  
* Field performance
*/
protected List<Performance> performance ;




/**  
* Field ID
* A unique identifier for the PerformanceSpecificationInterval. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which the PerformanceSpecificationInterval  

* is known and distinguished from other PerformanceSpecificationInterval 

* s. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains the PerformanceSpecificationInterval. 

*/
protected String description ;




/**  
* Field interval
* A value that represents the period of time over which the PerformanceS 

* pecificaion is collected. 

*/
protected String interval ;




/**  
* Field validFor
* The period of time for which a PerformanceSpecificationInterrval is ap 

* plicable. 

*/
protected TimePeriod validFor ;




/**  
* Field performanceSpecificationInterval
*/
protected List<PerformanceSpecificationInterval> performanceSpecificationInterval ;




/**  
* Field performanceSpecificationInterval1
*/
protected List<PerformanceSpecificationInterval> performanceSpecificationInterval1 ;




/**  
* Field performanceSpecification
*/
protected List<PerformanceSpecification> performanceSpecification ;


}