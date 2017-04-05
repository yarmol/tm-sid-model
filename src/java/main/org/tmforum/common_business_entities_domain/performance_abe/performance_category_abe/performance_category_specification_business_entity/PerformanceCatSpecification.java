/**
* Performance Category Specification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E9446E2D1902DE-content.html">Performance Category Specification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_category_abe.performance_category_specification_business_entity ;

/**
* The invariant characteristics that define a group or set of performanc 
* e qualities that are classified together because of common characteris 
* tics. 
 @since SID_R16.5
*/ 

public abstract class PerformanceCatSpecification  {



/**  
* Field performanceCategory
*/
protected List<PerformanceCategory> performanceCategory ;




/**  
* Field ID
* A unique identifier for the PerformanceCategorySpecification. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which the PerformanceCategorySpecification  

* is known and distinguished from other PerformanceCategorySpecification 

* s. 

*/
protected String name ;




/**  
* Field description
* A narrative that explains the PerformanceCategorySpecification. 

*/
protected String description ;




/**  
* Field validFor
* The period of time for which a PerformanceCategorySpecification is app 

* licable. 

*/
protected TimePeriod validFor ;




/**  
* Field performanceCatSpecification
*/
protected List<PerformanceCatSpecification> performanceCatSpecification ;




/**  
* Field performanceCatSpecification1
*/
protected List<PerformanceCatSpecification> performanceCatSpecification1 ;




/**  
* Field characteristicSpecification
*/
protected List<CharacteristicSpecification> characteristicSpecification ;




/**  
* Field characteristicSpecValue
*/
protected List<CharacteristicSpecValue> characteristicSpecValue ;




/**  
* Field performanceSpecification
*/
protected List<PerformanceSpecification> performanceSpecification ;


}