/**
* Performance Threshold  ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_.aT.i60I.a.rE.eC.pLZ.eR.zU7N.l.g-content.html">Performance Threshold  ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.performance_abe.performance_threshold__business_entity ;

/**
* A unique identifier for the PerformanceApplicability. 
 @since SID_R16.5
*/ 

public  class PerformanceApplicability  {



/**  
* Field ID
* A unique identifier for the PerformanceApplicability. 

*/
protected String ID ;




/**  
* Field name
* A word, term, or phrase by which an applicability is known and disting 

* uished from other PerformanceApplicabilities. 

*/
protected String name ;




/**  
* Field description
*/
protected String description ;




/**  
* Field (un)applicableCode
*/
protected String (un)applicableCode ;




/**  
* Field (un)applicableDuring
*/
protected TimePeriod (un)applicableDuring ;




/**  
* Field (un)applicableDays
* A day or days representing applicability or un-applicability.  For exa 

* mple 2, 3 represent Monday and Tuesday. 

*/
protected String (un)applicableDays ;




/**  
* Field validFor
* The period of time during which the applicability is in force. 

*/
protected TimePeriod validFor ;




/**  
* Field performanceSpecification
*/
protected List<PerformanceSpecification> performanceSpecification ;




/**  
* Field performanceThreshold
*/
protected List<PerformanceThreshold> performanceThreshold ;




/**  
* Field performanceIndicatorSpecification
*/
protected List<PerformanceIndicatorSpecification> performanceIndicatorSpecification ;


}