/**
* Performance Category ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E944710E5803E0-content.html">Performance Category ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_category_business_entity ;

/**
* A group or set of performance qualities that are classified together b 
* ecause of common characteristics. 
 @since SID_R16.5
*/ 

public  class PerformanceCategory  {



/**  
* Field performanceNetworkAddress
*/
protected List<PerformanceNetworkAddress> performanceNetworkAddress ;




/**  
* Field performanceCatSpecification
*/
protected PerformanceCatSpecification performanceCatSpecification ;




/**  
* Field ID
* A unique identifier for a PerformanceCategory. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which the PerformanceCategory is known and  

* distinguished from other PerformanceCategories. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains a PeformanceCategory. 

*/
protected String description ;




/**  
* Field validFor
* The period of time for which a PerformanceCategory is applicable. 

*/
protected TimePeriod validFor ;




/**  
* Field performanceCategory
*/
protected List<PerformanceCategory> performanceCategory ;




/**  
* Field performanceCategory1
*/
protected List<PerformanceCategory> performanceCategory1 ;




/**  
* Field performanceCatCharacteristicValue
*/
protected List<PerformanceCatCharacteristicValue> performanceCatCharacteristicValue ;




/**  
* Field performance
*/
protected List<Performance> performance ;


}